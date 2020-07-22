package cc.wanforme.cmcore.base.mapper;

import cc.wanforme.cmcore.base.po.User;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
public interface UserMapper extends BaseMapper<User> {

	User selectByUserName(String username);
	
}
