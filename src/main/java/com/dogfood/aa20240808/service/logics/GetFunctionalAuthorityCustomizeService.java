package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_7AA66D6E2A21E3101B9C2B73B7971B38; 
import com.dogfood.aa20240808.repository.GetFunctionalAuthorityCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_63A62260FC029F5392CCD931B361AF92; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.PerGroupStructureStructure; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 得到所有功能权限-ljl
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
public class GetFunctionalAuthorityCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetFunctionalAuthorityCustomizeServiceMapper getFunctionalAuthorityCustomizeServiceMapper;

    public List<PerGroupStructureStructure> getFunctionalAuthority() {
        List<AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E> variable1 = new ArrayList<>();
        List<AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5> variable2 = new ArrayList<>();
        PerGroupStructureStructure variable3 = new PerGroupStructureStructure();
        List<PerGroupStructureStructure> variable4 = new ArrayList<>();
        List<AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5> variable5 = new ArrayList<>();
        List<PerGroupStructureStructure> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(getFunctionalAuthorityCustomizeServiceMapper.getAnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E(), getFunctionalAuthorityCustomizeServiceMapper.countAnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E().intValue(), AnonymousStructure_7AA66D6E2A21E3101B9C2B73B7971B38.class).list; 
        variable2 = CommonFunctionUtil.createListPage(getFunctionalAuthorityCustomizeServiceMapper.getAnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5(), getFunctionalAuthorityCustomizeServiceMapper.countAnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5().intValue(), AnonymousStructure_63A62260FC029F5392CCD931B361AF92.class).list; 
        for (Long index = 0L; index < variable1.size(); index++) {
            AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E item = variable1.get(index.intValue());
            CommonFunctionUtil.clear(variable3.permissionList, "shallow");
            variable3.perGroup = item.permissionGroup; 
            variable5 = CommonFunctionUtil.listFilter(variable2, (item1) -> (CommonFunctionUtil.equals(item1.permissionGroup.id, item.permissionGroup.id))); 
            if ((CommonFunctionUtil.length(variable5).compareTo(0L) > 0)) {
                CommonFunctionUtil.addAll(variable3.permissionList, CommonFunctionUtil.listTransform(variable5, (item2) -> item2.lCAPPermission));
                CommonFunctionUtil.add(variable4, CommonFunctionUtil.clone(variable3));
            } else {
            } 

        } 

        result = variable4; 
        return result;
    } 

}
