package cc.wanforme.cmcore;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cc.wanforme.nukkit.spring.NukkitApplicationLauncher;

@SpringBootApplication
@MapperScan(basePackages = "cc.wanforme.cmcore.base.mapper")
public class CMCoreApplication extends NukkitApplicationLauncher{
	private static final Logger log = LoggerFactory.getLogger(CMCoreApplication.class);
	
	public static void main(String[] args) {
		log.info("<<<<<<<<<<<<<<<< starting ! >>>>>>>>>>>>>>>");
		launchNukkit(CMCoreApplication.class, args);
		log.info("\n<<<<<<<<<<<<<<<<\tweb server started\t>>>>>>>>>>>>>>>");
	}

}
