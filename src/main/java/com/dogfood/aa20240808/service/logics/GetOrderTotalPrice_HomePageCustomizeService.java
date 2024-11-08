package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.GetOrderTotalPrice_HomePageCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF21B87E62234B67E6B30D199A60032F; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_69E8F2ADC4F37B347387A82FBADB3788; 
import java.math.BigDecimal; 

/**
 * 得到订单销售总金额-首页-ljl
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
public class GetOrderTotalPrice_HomePageCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetOrderTotalPrice_HomePageCustomizeServiceMapper getOrderTotalPrice_HomePageCustomizeServiceMapper;

    public BigDecimal getOrderTotalPrice_HomePage() {
        List<AnonymousStructure_69E8F2ADC4F37B347387A82FBADB3788> variable1 = new ArrayList<>();
        BigDecimal totalPrice = new BigDecimal("0");
        BigDecimal result = new BigDecimal("0");
        variable1 = CommonFunctionUtil.createListPage(getOrderTotalPrice_HomePageCustomizeServiceMapper.getAnonymousStructure_69E8F2ADC4F37B347387A82FBADB3788(), getOrderTotalPrice_HomePageCustomizeServiceMapper.countAnonymousStructure_69E8F2ADC4F37B347387A82FBADB3788().intValue(), AnonymousStructure_CF21B87E62234B67E6B30D199A60032F.class).list; 
        if ((CommonFunctionUtil.length(variable1).compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.size(); index++) {
                AnonymousStructure_69E8F2ADC4F37B347387A82FBADB3788 item = variable1.get(index.intValue());
                if (CommonFunctionUtil.hasValue(item.salesOrderDetails.unitPrice, item.salesOrderDetails.quantity)) {
                    totalPrice = (totalPrice.add((item.salesOrderDetails.unitPrice.multiply(item.salesOrderDetails.quantity)))); 
                } else {
                } 

            } 

            result = totalPrice; 
        } else {
            result = BigDecimal.valueOf(0L); 
        } 

        return result;
    } 

}
