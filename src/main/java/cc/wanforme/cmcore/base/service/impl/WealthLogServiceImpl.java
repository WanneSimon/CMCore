package cc.wanforme.cmcore.base.service.impl;

import cc.wanforme.cmcore.base.po.WealthLog;
import cc.wanforme.cmcore.base.mapper.WealthLogMapper;
import cc.wanforme.cmcore.base.service.IWealthLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 财产变化记录（如果两种货币都变化了，那么就是两条记录） 服务实现类
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
@Service
public class WealthLogServiceImpl extends ServiceImpl<WealthLogMapper, WealthLog> implements IWealthLogService {

}
