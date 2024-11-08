package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.PERGetPermissionResourseRelatedCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.LCAPPermissionAndResourceStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LogicCallUtils; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D311DE41A09BA2BAA8FFB4565AF17770; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53CA2F6F6A03F8C3D4CDE3AA6CF7AE9C; 

/**
 * PER-获取权限关联的资源
 * 
 * @author sys
 * 
 * @date 2024-11-8 10:18
 * 
 * @version 1.0
 * 
 * @BelongsProject mybatis审计日志
 * 
 * @BelongsPackage src/main/java/com/dogfood/aa20240808/service/logics
 */
@Service
public class PERGetPermissionResourseRelatedCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private PERGetPermissionResourseRelatedCustomizeServiceMapper pERGetPermissionResourseRelatedCustomizeServiceMapper;

    public List<LCAPPermissionAndResourceStructure> pERGetPermissionResourseRelated(Long permissionId) {
        List<AnonymousStructure_53CA2F6F6A03F8C3D4CDE3AA6CF7AE9C> variable1 = new ArrayList<>();
        List<LCAPPermissionAndResourceStructure> result = new ArrayList<>();
        if ((CommonFunctionUtil.notEquals(permissionId, null))) {
            variable1 = CommonFunctionUtil.createListPage(pERGetPermissionResourseRelatedCustomizeServiceMapper.getAnonymousStructure_53CA2F6F6A03F8C3D4CDE3AA6CF7AE9C(permissionId), pERGetPermissionResourseRelatedCustomizeServiceMapper.countAnonymousStructure_53CA2F6F6A03F8C3D4CDE3AA6CF7AE9C(permissionId).intValue(), AnonymousStructure_D311DE41A09BA2BAA8FFB4565AF17770.class).list; 
            if ((CommonFunctionUtil.length(variable1).compareTo(0L) > 0)) {
                result = CommonFunctionUtil.listTransform(variable1, (item) -> CommonFunctionUtil.newWithInitiation(new LCAPPermissionAndResourceStructure(), _bean1 -> {
    _bean1.value = item.lCAPResource.id; 
    _bean1.text = new StringBuilder().append(CommonFunctionUtil.toString(item.lCAPResource.description)).append(CommonFunctionUtil.toString(item.lCAPResource.name)).toString(); 
} )); 
            } else {
                result = CommonFunctionUtil.newWithInitiation(new ArrayList<LCAPPermissionAndResourceStructure>(), _list1 -> {}); 
            } 

        } else {
            LCAP_LOGGER.error(CommonFunctionUtil.toString("传入参数permissionId为null"));
            LCAP_LOGGER.info("abort!"); 
            LogicCallUtils.abort(); 
        } 

        return result;
    } 

}
