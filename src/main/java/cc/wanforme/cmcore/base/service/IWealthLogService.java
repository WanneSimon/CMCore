package cc.wanforme.cmcore.base.service;

import cc.wanforme.cmcore.base.po.WealthLog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 财产变化记录（如果两种货币都变化了，那么就是两条记录） 服务类
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
public interface IWealthLogService extends IService<WealthLog> {

}
