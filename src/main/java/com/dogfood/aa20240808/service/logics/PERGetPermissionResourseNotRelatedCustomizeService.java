package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92; 
import java.util.List; 
import com.dogfood.aa20240808.repository.PERGetPermissionResourseNotRelatedCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.LCAPPermissionAndResourceStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LogicCallUtils; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_EA050579F163467B7D2FD3E8C15362AF; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * PER-获取权限未关联的资源
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
public class PERGetPermissionResourseNotRelatedCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private PERGetPermissionResourseRelatedCustomizeService pERGetPermissionResourseRelatedCustomizeService;

    @Autowired
    private PERGetPermissionResourseNotRelatedCustomizeServiceMapper pERGetPermissionResourseNotRelatedCustomizeServiceMapper;

    public List<LCAPPermissionAndResourceStructure> pERGetPermissionResourseNotRelated(Long permissionId) {
        List<AnonymousStructure_EA050579F163467B7D2FD3E8C15362AF> variable1 = new ArrayList<>();
        List<LCAPPermissionAndResourceStructure> variable2 = new ArrayList<>();
        List<Long> relatedList = new ArrayList<>();
        List<LCAPPermissionAndResourceStructure> result = new ArrayList<>();
        if ((CommonFunctionUtil.notEquals(permissionId, null))) {
            variable2 = pERGetPermissionResourseRelatedCustomizeService.pERGetPermissionResourseRelated(permissionId); 
            if ((CommonFunctionUtil.length(variable2).compareTo(0L) > 0)) {
                relatedList = CommonFunctionUtil.listTransform(variable2, (item) -> item.value); 
            } else {
            } 

            variable1 = CommonFunctionUtil.createListPage(pERGetPermissionResourseNotRelatedCustomizeServiceMapper.getAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF(relatedList), pERGetPermissionResourseNotRelatedCustomizeServiceMapper.countAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF(relatedList).intValue(), AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92.class).list; 
            result = CommonFunctionUtil.listTransform(variable1, (item) -> CommonFunctionUtil.newWithInitiation(new LCAPPermissionAndResourceStructure(), _bean1 -> {
    _bean1.text = new StringBuilder().append(CommonFunctionUtil.toString(item.lCAPResource.description)).append(CommonFunctionUtil.toString(item.lCAPResource.name)).toString(); 
    _bean1.value = item.lCAPResource.id; 
} )); 
        } else {
            LCAP_LOGGER.error(CommonFunctionUtil.toString("传入参数permissionId为null"));
            LCAP_LOGGER.info("abort!"); 
            LogicCallUtils.abort(); 
        } 

        return result;
    } 

}
