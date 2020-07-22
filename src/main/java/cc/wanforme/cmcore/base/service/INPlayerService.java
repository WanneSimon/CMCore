package cc.wanforme.cmcore.base.service;

import cc.wanforme.cmcore.base.po.NPlayer;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * player表，对应游戏中的玩家，一个user可以对应多个player 服务类
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
public interface INPlayerService extends IService<NPlayer> {
	
	NPlayer selectByName(String name);
	
	List<NPlayer> selectByUserName(String username);
}
