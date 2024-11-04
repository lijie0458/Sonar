package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.AllPendingReviewQuantityStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.GetAllPendingReviewQuantityInfoCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetAllPendingReviewQuantityInfoCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetAllPendingReviewQuantityInfoCustomizeServiceMapper getAllPendingReviewQuantityInfoCustomizeServiceMapper;
    public AllPendingReviewQuantityStructure getAllPendingReviewQuantityInfo(List<String> dataViewAuthority) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F saleOutWarehouseQuantity = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6A48B173E615AB3DAB8116D4322374C8 productInStorageQuantity = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6A48B173E615AB3DAB8116D4322374C8();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CFD50F605260F493CE058FD3BD746735 outsourceInStorageQuantity = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CFD50F605260F493CE058FD3BD746735();
        AllPendingReviewQuantityStructure total = new AllPendingReviewQuantityStructure();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A outsourceOutStorageQuantity = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A productionQuantity = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_950B930A01B608CCA173536BB93CD694 otherInStorageQuantity = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_950B930A01B608CCA173536BB93CD694();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A otherOutStorageQuantity = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F saleOrderQuantity = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B purchaseOrderQuantity = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B();
        AllPendingReviewQuantityStructure result = new AllPendingReviewQuantityStructure();
        saleOutWarehouseQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_19AE6979770076098EC91325F1B403C2(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_19AE6979770076098EC91325F1B403C2(dataViewAuthority).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F.class); 
        if ((saleOutWarehouseQuantity.total.compareTo(0L) > 0)) {
            total.saleOutWarehouseQuantity = saleOutWarehouseQuantity.total; 
        } else {
            total.saleOutWarehouseQuantity = 0L; 
        } 

        productInStorageQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_B061947A9149609D07E92A50DDC32508(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_B061947A9149609D07E92A50DDC32508(dataViewAuthority).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6A48B173E615AB3DAB8116D4322374C8.class); 
        if ((productInStorageQuantity.total.compareTo(0L) > 0)) {
            total.productInStorageQuantity = productInStorageQuantity.total; 
        } else {
            total.productInStorageQuantity = 0L; 
        } 

        outsourceInStorageQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_6FC111F7C7EC90E00099159DA034D7FF(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_6FC111F7C7EC90E00099159DA034D7FF(dataViewAuthority).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CFD50F605260F493CE058FD3BD746735.class); 
        if ((outsourceInStorageQuantity.total.compareTo(0L) > 0)) {
            total.outsourceInStorageQuantity = outsourceInStorageQuantity.total; 
        } else {
            total.outsourceInStorageQuantity = 0L; 
        } 

        outsourceOutStorageQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6(dataViewAuthority).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A.class); 
        if ((outsourceOutStorageQuantity.total.compareTo(0L) > 0)) {
            total.outsourceOutStorageQuantity = outsourceOutStorageQuantity.total; 
        } else {
            total.outsourceOutStorageQuantity = 0L; 
        } 

        productionQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E61(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E61(dataViewAuthority).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A.class); 
        if ((productionQuantity.total.compareTo(0L) > 0)) {
            total.productionQuantity = productionQuantity.total; 
        } else {
            total.productionQuantity = 0L; 
        } 

        otherInStorageQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119(dataViewAuthority).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_950B930A01B608CCA173536BB93CD694.class); 
        if ((otherInStorageQuantity.total.compareTo(0L) > 0)) {
            total.otherInStorageQuantity = otherInStorageQuantity.total; 
        } else {
            total.otherInStorageQuantity = 0L; 
        } 

        otherOutStorageQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E62(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E62(dataViewAuthority).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A.class); 
        if ((otherOutStorageQuantity.total.compareTo(0L) > 0)) {
            total.otherOutStorageQuantity = otherOutStorageQuantity.total; 
        } else {
            total.otherOutStorageQuantity = 0L; 
        } 

        total.inOutTotalQuantity = (total.saleOutWarehouseQuantity + (total.productInStorageQuantity + (total.outsourceInStorageQuantity + (total.outsourceOutStorageQuantity + (total.productionQuantity + (total.otherInStorageQuantity + total.otherOutStorageQuantity)))))); 
        saleOrderQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_19AE6979770076098EC91325F1B403C21(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_19AE6979770076098EC91325F1B403C21(dataViewAuthority).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F.class); 
        if ((saleOrderQuantity.total.compareTo(0L) > 0)) {
            total.saleOrderQuantity = saleOrderQuantity.total; 
        } else {
            total.saleOrderQuantity = 0L; 
        } 

        purchaseOrderQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073(dataViewAuthority).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B.class); 
        if ((purchaseOrderQuantity.total.compareTo(0L) > 0)) {
            total.purchaseOrderQuantity = purchaseOrderQuantity.total; 
        } else {
            total.purchaseOrderQuantity = 0L; 
        } 

        result = total; 
        return result;
    } 


}
