package cc.wanforme.cmcore.base.service.impl;

import cc.wanforme.cmcore.base.po.Permission;
import cc.wanforme.cmcore.base.mapper.PermissionMapper;
import cc.wanforme.cmcore.base.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
