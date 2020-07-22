package cc.wanforme.cmcore.base.service.impl;

import cc.wanforme.cmcore.base.po.PreffixSuffix;
import cc.wanforme.cmcore.base.mapper.PreffixSuffixMapper;
import cc.wanforme.cmcore.base.service.IPreffixSuffixService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 玩家展示名字的前缀和后缀。默认不会保存，仅当第一次设置的时候才有 服务实现类
 * </p>
 *
 * @author wanne
 * @since 2020-07-21
 */
@Service
public class PreffixSuffixServiceImpl extends ServiceImpl<PreffixSuffixMapper, PreffixSuffix> implements IPreffixSuffixService {

}
