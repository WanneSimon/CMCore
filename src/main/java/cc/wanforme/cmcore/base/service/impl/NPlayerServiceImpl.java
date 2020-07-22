package cc.wanforme.cmcore.base.service.impl;

import cc.wanforme.cmcore.base.po.NPlayer;
import cc.wanforme.cmcore.base.mapper.NPlayerMapper;
import cc.wanforme.cmcore.base.service.INPlayerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * <p>
 * player表，对应游戏中的玩家，一个user可以对应多个player 服务实现类
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
@Service
public class NPlayerServiceImpl extends ServiceImpl<NPlayerMapper, NPlayer> implements INPlayerService {

	@Override
	public NPlayer selectByName(String name) {
		return this.baseMapper.selectByName(name);
	}

	@Override
	public List<NPlayer> selectByUserName(String username) {
		return this.baseMapper.selectByUserName(username);
	}

	
}
