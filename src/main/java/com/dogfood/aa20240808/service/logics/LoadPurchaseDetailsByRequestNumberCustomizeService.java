package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.PurchaseDetailStructureStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_01111CA3E3650D568675CF6F150A301E; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6F438EE2F4232B97E278A55C9184FE76; 
import com.dogfood.aa20240808.repository.LoadPurchaseDetailsByRequestNumberCustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
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
public class LoadPurchaseDetailsByRequestNumberCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadPurchaseDetailsByRequestNumberCustomizeServiceMapper loadPurchaseDetailsByRequestNumberCustomizeServiceMapper;

    public List<PurchaseDetailStructureStructure> loadPurchaseDetailsByRequestNumber(String request_number) {
        List<PurchaseDetailStructureStructure> List = new ArrayList<>();
        PurchaseDetailStructureStructure PurchaseDetails = new PurchaseDetailStructureStructure();
        List<PurchaseDetailStructureStructure> result = new ArrayList<>();
        List<AnonymousStructure_01111CA3E3650D568675CF6F150A301E> currentLcpEachName_1 = CommonFunctionUtil.createListPage(loadPurchaseDetailsByRequestNumberCustomizeServiceMapper.getAnonymousStructure_01111CA3E3650D568675CF6F150A301E(request_number), loadPurchaseDetailsByRequestNumberCustomizeServiceMapper.countAnonymousStructure_01111CA3E3650D568675CF6F150A301E(request_number).intValue(), AnonymousStructure_6F438EE2F4232B97E278A55C9184FE76.class).list;
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            AnonymousStructure_01111CA3E3650D568675CF6F150A301E item = currentLcpEachName_1.get(index.intValue());
            PurchaseDetails.material = item.materialDetails; 
            PurchaseDetails.purchaseDetails = item.purchaseDetails; 
            PurchaseDetails.unitName = item.measuringUnit.unitName; 
            CommonFunctionUtil.add(List, CommonFunctionUtil.clone(PurchaseDetails));
        } 

        result = CommonFunctionUtil.clone(List); 
        return result;
    } 

}
