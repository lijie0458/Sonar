package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.GlobalContext; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_412E9C147CB3C99353FD18461376E868; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73; 
import com.dogfood.aa20240808.domain.enumeration.ViewEditPermissionEnumEnum; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.GetDataViewAuthorityCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_764AC7B785EFB4D4E2801B4A25796913; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B1EF55CD3896782347B8D5E6B4D50FDD; 

/**
 * 得到数据查看权限-ljl
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
public class GetDataViewAuthorityCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetDataViewAuthorityCustomizeServiceMapper getDataViewAuthorityCustomizeServiceMapper;

    @Autowired
    private GetSubordinateDepartmentsIdInfoCustomizeService getSubordinateDepartmentsIdInfoCustomizeService;

    public List<String> getDataViewAuthority() {
        List<AnonymousStructure_764AC7B785EFB4D4E2801B4A25796913> variable1 = new ArrayList<>();
        AnonymousStructure_764AC7B785EFB4D4E2801B4A25796913 userInfo = new AnonymousStructure_764AC7B785EFB4D4E2801B4A25796913();
        List<String> dataViewAuthorityUserNameList = new ArrayList<>();
        List<AnonymousStructure_412E9C147CB3C99353FD18461376E868> getUserByDepartmentId = new ArrayList<>();
        List<Long> DepartmentAndSubordinateIdList = new ArrayList<>();
        List<Long> subordinateId = new ArrayList<>();
        List<String> result = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(getDataViewAuthorityCustomizeServiceMapper.getAnonymousStructure_764AC7B785EFB4D4E2801B4A25796913(GlobalContext.getSessionVariable().currentUser), getDataViewAuthorityCustomizeServiceMapper.countAnonymousStructure_764AC7B785EFB4D4E2801B4A25796913(GlobalContext.getSessionVariable().currentUser).intValue(), AnonymousStructure_B1EF55CD3896782347B8D5E6B4D50FDD.class).list; 
        if ((CommonFunctionUtil.length(variable1).compareTo(0L) > 0)) {
            userInfo = CommonFunctionUtil.get(variable1, 0L); 
            // 数据查看权限
            if (CommonFunctionUtil.equals(userInfo.lCAPRole.viewDataPermission, ViewEditPermissionEnumEnum.FIELD_0)) {
                CommonFunctionUtil.add(dataViewAuthorityUserNameList, GlobalContext.getSessionVariable().currentUser.userName);
            } else if (CommonFunctionUtil.equals(userInfo.lCAPRole.viewDataPermission, ViewEditPermissionEnumEnum.FIELD_1)) {
                getUserByDepartmentId = CommonFunctionUtil.createListPage(getDataViewAuthorityCustomizeServiceMapper.getAnonymousStructure_412E9C147CB3C99353FD18461376E868(userInfo), getDataViewAuthorityCustomizeServiceMapper.countAnonymousStructure_412E9C147CB3C99353FD18461376E868(userInfo).intValue(), AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73.class).list; 
                if ((CommonFunctionUtil.length(getUserByDepartmentId).compareTo(0L) > 0)) {
                    for (Long index = 0L; index < getUserByDepartmentId.size(); index++) {
                        AnonymousStructure_412E9C147CB3C99353FD18461376E868 item = getUserByDepartmentId.get(index.intValue());
                        CommonFunctionUtil.add(dataViewAuthorityUserNameList, item.lCAPUser.userName);
                    } 

                } else {
                    CommonFunctionUtil.add(dataViewAuthorityUserNameList, GlobalContext.getSessionVariable().currentUser.userName);
                } 

            } else if (CommonFunctionUtil.equals(userInfo.lCAPRole.viewDataPermission, ViewEditPermissionEnumEnum.FIELD_2)) {
                CommonFunctionUtil.add(DepartmentAndSubordinateIdList, userInfo.department.id);
                subordinateId = getSubordinateDepartmentsIdInfoCustomizeService.getSubordinateDepartmentsIdInfo(DepartmentAndSubordinateIdList); 
                if ((CommonFunctionUtil.length(subordinateId).compareTo(0L) > 0)) {
                    CommonFunctionUtil.addAll(DepartmentAndSubordinateIdList, subordinateId);
                } else {
                } 

                getUserByDepartmentId = CommonFunctionUtil.createListPage(getDataViewAuthorityCustomizeServiceMapper.getAnonymousStructure_412E9C147CB3C99353FD18461376E8681(DepartmentAndSubordinateIdList), getDataViewAuthorityCustomizeServiceMapper.countAnonymousStructure_412E9C147CB3C99353FD18461376E8681(DepartmentAndSubordinateIdList).intValue(), AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73.class).list; 
                if ((CommonFunctionUtil.length(getUserByDepartmentId).compareTo(0L) > 0)) {
                    for (Long index = 0L; index < getUserByDepartmentId.size(); index++) {
                        AnonymousStructure_412E9C147CB3C99353FD18461376E868 item = getUserByDepartmentId.get(index.intValue());
                        CommonFunctionUtil.add(dataViewAuthorityUserNameList, item.lCAPUser.userName);
                    } 

                } else {
                    CommonFunctionUtil.add(dataViewAuthorityUserNameList, GlobalContext.getSessionVariable().currentUser.userName);
                } 

            } else if (CommonFunctionUtil.equals(userInfo.lCAPRole.viewDataPermission, ViewEditPermissionEnumEnum.FIELD_3)) {
                dataViewAuthorityUserNameList = null; 
            } else {
            } 

        } else {
            dataViewAuthorityUserNameList = null; 
        } 

        result = dataViewAuthorityUserNameList; 
        return result;
    } 

}
