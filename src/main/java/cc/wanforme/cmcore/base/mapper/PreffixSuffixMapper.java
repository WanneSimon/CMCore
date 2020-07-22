package cc.wanforme.cmcore.base.mapper;

import cc.wanforme.cmcore.base.po.PreffixSuffix;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 玩家展示名字的前缀和后缀。默认不会保存，仅当第一次设置的时候才有 Mapper 接口
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
public interface PreffixSuffixMapper extends BaseMapper<PreffixSuffix> {

}
