package cc.wanforme.cmcore.base.mapper;

import cc.wanforme.cmcore.base.po.PlayerLoginLog;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
public interface PlayerLoginLogMapper extends BaseMapper<PlayerLoginLog> {

	List<PlayerLoginLog> selectByPlayerName(
			@Param("name")String name, @Param("start")int start, @Param("count")int count);
	
	List<PlayerLoginLog> selectByUserName(
			@Param("username")String username, @Param("start")int start, @Param("count")int count);
}
