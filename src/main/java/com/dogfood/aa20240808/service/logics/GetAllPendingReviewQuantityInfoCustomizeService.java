package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CFD50F605260F493CE058FD3BD746735; 
import com.dogfood.aa20240808.domain.structure.AllPendingReviewQuantityStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6A48B173E615AB3DAB8116D4322374C8; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_15236DED8CD807484AC741CD838A113B; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_950B930A01B608CCA173536BB93CD694; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.GetAllPendingReviewQuantityInfoCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 得到所有待审核数量信息-首页-ljl
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
public class GetAllPendingReviewQuantityInfoCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetAllPendingReviewQuantityInfoCustomizeServiceMapper getAllPendingReviewQuantityInfoCustomizeServiceMapper;

    public AllPendingReviewQuantityStructure getAllPendingReviewQuantityInfo(List<String> dataViewAuthority) {
        AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F saleOutWarehouseQuantity = new AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F();
        AnonymousStructure_6A48B173E615AB3DAB8116D4322374C8 productInStorageQuantity = new AnonymousStructure_6A48B173E615AB3DAB8116D4322374C8();
        AnonymousStructure_CFD50F605260F493CE058FD3BD746735 outsourceInStorageQuantity = new AnonymousStructure_CFD50F605260F493CE058FD3BD746735();
        AllPendingReviewQuantityStructure total = new AllPendingReviewQuantityStructure();
        AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A outsourceOutStorageQuantity = new AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A();
        AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A productionQuantity = new AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A();
        AnonymousStructure_950B930A01B608CCA173536BB93CD694 otherInStorageQuantity = new AnonymousStructure_950B930A01B608CCA173536BB93CD694();
        AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A otherOutStorageQuantity = new AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A();
        AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F saleOrderQuantity = new AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F();
        AnonymousStructure_15236DED8CD807484AC741CD838A113B purchaseOrderQuantity = new AnonymousStructure_15236DED8CD807484AC741CD838A113B();
        AllPendingReviewQuantityStructure result = new AllPendingReviewQuantityStructure();
        // 销售出库待审核数量
        saleOutWarehouseQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_19AE6979770076098EC91325F1B403C2(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_19AE6979770076098EC91325F1B403C2(dataViewAuthority).intValue(), AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F.class); 
        if ((saleOutWarehouseQuantity.total.compareTo(0L) > 0)) {
            total.saleOutWarehouseQuantity = saleOutWarehouseQuantity.total; 
        } else {
            total.saleOutWarehouseQuantity = 0L; 
        } 

        // 产品入库待审核数量
        productInStorageQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_B061947A9149609D07E92A50DDC32508(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_B061947A9149609D07E92A50DDC32508(dataViewAuthority).intValue(), AnonymousStructure_6A48B173E615AB3DAB8116D4322374C8.class); 
        if ((productInStorageQuantity.total.compareTo(0L) > 0)) {
            total.productInStorageQuantity = productInStorageQuantity.total; 
        } else {
            total.productInStorageQuantity = 0L; 
        } 

        // 委外加工入库待审核数量
        outsourceInStorageQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_6FC111F7C7EC90E00099159DA034D7FF(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_6FC111F7C7EC90E00099159DA034D7FF(dataViewAuthority).intValue(), AnonymousStructure_CFD50F605260F493CE058FD3BD746735.class); 
        if ((outsourceInStorageQuantity.total.compareTo(0L) > 0)) {
            total.outsourceInStorageQuantity = outsourceInStorageQuantity.total; 
        } else {
            total.outsourceInStorageQuantity = 0L; 
        } 

        // 委外加工出库待审核数量
        outsourceOutStorageQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6(dataViewAuthority).intValue(), AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A.class); 
        if ((outsourceOutStorageQuantity.total.compareTo(0L) > 0)) {
            total.outsourceOutStorageQuantity = outsourceOutStorageQuantity.total; 
        } else {
            total.outsourceOutStorageQuantity = 0L; 
        } 

        // 生产领料待审核数量
        productionQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E61(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E61(dataViewAuthority).intValue(), AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A.class); 
        if ((productionQuantity.total.compareTo(0L) > 0)) {
            total.productionQuantity = productionQuantity.total; 
        } else {
            total.productionQuantity = 0L; 
        } 

        // 其他入库待审核数量
        otherInStorageQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119(dataViewAuthority).intValue(), AnonymousStructure_950B930A01B608CCA173536BB93CD694.class); 
        if ((otherInStorageQuantity.total.compareTo(0L) > 0)) {
            total.otherInStorageQuantity = otherInStorageQuantity.total; 
        } else {
            total.otherInStorageQuantity = 0L; 
        } 

        // 其他出库待审核数量
        otherOutStorageQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E62(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E62(dataViewAuthority).intValue(), AnonymousStructure_14674722B95CA8C649EB3355ECF3BA6A.class); 
        if ((otherOutStorageQuantity.total.compareTo(0L) > 0)) {
            total.otherOutStorageQuantity = otherOutStorageQuantity.total; 
        } else {
            total.otherOutStorageQuantity = 0L; 
        } 

        total.inOutTotalQuantity = (total.saleOutWarehouseQuantity + (total.productInStorageQuantity + (total.outsourceInStorageQuantity + (total.outsourceOutStorageQuantity + (total.productionQuantity + (total.otherInStorageQuantity + total.otherOutStorageQuantity)))))); 
        // 销售订单待审核数量
        saleOrderQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_19AE6979770076098EC91325F1B403C21(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_19AE6979770076098EC91325F1B403C21(dataViewAuthority).intValue(), AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F.class); 
        if ((saleOrderQuantity.total.compareTo(0L) > 0)) {
            total.saleOrderQuantity = saleOrderQuantity.total; 
        } else {
            total.saleOrderQuantity = 0L; 
        } 

        // 采购订单待审核数量
        purchaseOrderQuantity = CommonFunctionUtil.createListPage(getAllPendingReviewQuantityInfoCustomizeServiceMapper.getAnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073(dataViewAuthority), getAllPendingReviewQuantityInfoCustomizeServiceMapper.countAnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073(dataViewAuthority).intValue(), AnonymousStructure_15236DED8CD807484AC741CD838A113B.class); 
        if ((purchaseOrderQuantity.total.compareTo(0L) > 0)) {
            total.purchaseOrderQuantity = purchaseOrderQuantity.total; 
        } else {
            total.purchaseOrderQuantity = 0L; 
        } 

        result = total; 
        return result;
    } 

}
