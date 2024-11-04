package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.GlobalContext; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.enumeration.ViewEditPermissionEnumEnum; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.GetDataEditAuthorityCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetDataEditAuthorityCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetDataEditAuthorityCustomizeServiceMapper getDataEditAuthorityCustomizeServiceMapper;
    @Autowired
    private GetSubordinateDepartmentsIdInfoCustomizeService getSubordinateDepartmentsIdInfoCustomizeService;
    public List<String> getDataEditAuthority() {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_764AC7B785EFB4D4E2801B4A25796913> variable1 = new ArrayList<>();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_764AC7B785EFB4D4E2801B4A25796913 userInfo = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_764AC7B785EFB4D4E2801B4A25796913();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_412E9C147CB3C99353FD18461376E868> getUserByDepartmentId = new ArrayList<>();
        List<Long> DepartmentAndSubordinateIdList = new ArrayList<>();
        List<Long> subordinateId = new ArrayList<>();
        List<String> dataEditAuthorityUserNameList = new ArrayList<>();
        List<String> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(getDataEditAuthorityCustomizeServiceMapper.getAnonymousStructure_764AC7B785EFB4D4E2801B4A25796913(GlobalContext.getSessionVariable().currentUser), getDataEditAuthorityCustomizeServiceMapper.countAnonymousStructure_764AC7B785EFB4D4E2801B4A25796913(GlobalContext.getSessionVariable().currentUser).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B1EF55CD3896782347B8D5E6B4D50FDD.class).list; 
        if ((CommonFunctionUtil.length(variable1).compareTo(0L) > 0)) {
            userInfo = CommonFunctionUtil.get(variable1, 0L); 
            if (CommonFunctionUtil.equals(userInfo.lCAPRole.editDataPermission, ViewEditPermissionEnumEnum.FIELD_0)) {
                CommonFunctionUtil.add(dataEditAuthorityUserNameList, GlobalContext.getSessionVariable().currentUser.userName);
            } else if (CommonFunctionUtil.equals(userInfo.lCAPRole.editDataPermission, ViewEditPermissionEnumEnum.FIELD_1)) {
                getUserByDepartmentId = CommonFunctionUtil.createListPage(getDataEditAuthorityCustomizeServiceMapper.getAnonymousStructure_412E9C147CB3C99353FD18461376E868(userInfo), getDataEditAuthorityCustomizeServiceMapper.countAnonymousStructure_412E9C147CB3C99353FD18461376E868(userInfo).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73.class).list; 
                if ((CommonFunctionUtil.length(getUserByDepartmentId).compareTo(0L) > 0)) {
                    for (Long index = 0L; index < getUserByDepartmentId.size(); index++) {
                        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_412E9C147CB3C99353FD18461376E868 item = getUserByDepartmentId.get(index.intValue());
                        CommonFunctionUtil.add(dataEditAuthorityUserNameList, item.lCAPUser.userName);
                    } 

                } else {
                    CommonFunctionUtil.add(dataEditAuthorityUserNameList, GlobalContext.getSessionVariable().currentUser.userName);
                } 

            } else if (CommonFunctionUtil.equals(userInfo.lCAPRole.editDataPermission, ViewEditPermissionEnumEnum.FIELD_2)) {
                CommonFunctionUtil.add(DepartmentAndSubordinateIdList, userInfo.department.id);
                subordinateId = getSubordinateDepartmentsIdInfoCustomizeService.getSubordinateDepartmentsIdInfo(DepartmentAndSubordinateIdList); 
                if ((CommonFunctionUtil.length(subordinateId).compareTo(0L) > 0)) {
                    CommonFunctionUtil.clear(DepartmentAndSubordinateIdList);
                    CommonFunctionUtil.addAll(DepartmentAndSubordinateIdList, subordinateId);
                } else {
                } 

                getUserByDepartmentId = CommonFunctionUtil.createListPage(getDataEditAuthorityCustomizeServiceMapper.getAnonymousStructure_412E9C147CB3C99353FD18461376E8681(DepartmentAndSubordinateIdList), getDataEditAuthorityCustomizeServiceMapper.countAnonymousStructure_412E9C147CB3C99353FD18461376E8681(DepartmentAndSubordinateIdList).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73.class).list; 
                if ((CommonFunctionUtil.length(getUserByDepartmentId).compareTo(0L) > 0)) {
                    for (Long index = 0L; index < getUserByDepartmentId.size(); index++) {
                        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_412E9C147CB3C99353FD18461376E868 item = getUserByDepartmentId.get(index.intValue());
                        CommonFunctionUtil.add(dataEditAuthorityUserNameList, item.lCAPUser.userName);
                    } 

                } else {
                    CommonFunctionUtil.add(dataEditAuthorityUserNameList, GlobalContext.getSessionVariable().currentUser.userName);
                } 

            } else if (CommonFunctionUtil.equals(userInfo.lCAPRole.editDataPermission, ViewEditPermissionEnumEnum.FIELD_3)) {
                dataEditAuthorityUserNameList = null; 
            } else {
            } 

        } else {
            dataEditAuthorityUserNameList = null; 
        } 

        result = dataEditAuthorityUserNameList; 
        return result;
    } 


}
