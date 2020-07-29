package cc.wanforme.cmcore.base.service;

import cc.wanforme.cmcore.base.po.User;

import java.io.UnsupportedEncodingException;

import org.apache.tomcat.util.security.MD5Encoder;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
public interface IUserService extends IService<User> {
	
	User selectByUserName(String username);
	
	/**登录检查，只需要用户名和密码*/
	boolean loginCheck(User user);
	
	/** 密码加密*/
	default String encodePassword(String password) {
		try {
			return MD5Encoder.encode(password.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			return MD5Encoder.encode(password.getBytes());
		}
	};
	
}
