package cc.wanforme.cmcore.base.mapper;

import cc.wanforme.cmcore.base.po.WealthLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 财产变化记录（如果两种货币都变化了，那么就是两条记录） Mapper 接口
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
public interface WealthLogMapper extends BaseMapper<WealthLog> {

}
