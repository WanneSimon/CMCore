package cc.wanforme.cmcore.base.service.impl;

import cc.wanforme.cmcore.base.po.User;
import cc.wanforme.cmcore.base.mapper.UserMapper;
import cc.wanforme.cmcore.base.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Objects;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public boolean loginCheck(User user) {
		User po = this.baseMapper.selectByUserName(user.getUserName());
		return Objects.equals(po.getPwd(), user.getPwd());
	}

	@Override
	public User selectByUserName(String username) {
		return this.baseMapper.selectByUserName(username);
	}
	
}
