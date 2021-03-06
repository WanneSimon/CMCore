package cc.wanforme.cmcore.config.druid;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

/**
 * @author wanne
 * 2020年4月26日
 * 
 */
@Configuration
public class DatabaseConfiguration {

	@Value("${mybatis-plus.mapper-locations}")
	private String mapper_locations;
	
	@Value("${mybatis-plus.type-aliases-package}")
	private String type_aliases_package;
	
	@Primary
	@Bean(name = "datasource")
	@ConfigurationProperties("spring.datasource.druid.default")
	public DataSource datasource() {
		return DruidDataSourceBuilder.create().build();
	}
	
	@Primary
	@Bean(name = "transactionManager")
	public DataSourceTransactionManager transactionManager(@Qualifier("datasource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
	
	// 没有 持久层 就不要使用
	@Primary
	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(@Qualifier("datasource") DataSource masterDataSource)
			throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(masterDataSource);
		sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapper_locations));
		sessionFactory.setTypeAliasesPackage(type_aliases_package);
		return sessionFactory.getObject();
	}
	
}
