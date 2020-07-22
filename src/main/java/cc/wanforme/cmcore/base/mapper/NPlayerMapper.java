package cc.wanforme.cmcore.base.mapper;

import cc.wanforme.cmcore.base.po.NPlayer;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * player表，对应游戏中的玩家，一个user可以对应多个player Mapper 接口
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
public interface NPlayerMapper extends BaseMapper<NPlayer> {
	
	NPlayer selectByName(String name);
	
	List<NPlayer> selectByUserName(String username);
}
