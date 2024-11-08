package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_BABCF7760687FB3B8C712ACCC6B064BC; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LogicOrderDataByCodeCustomizeServiceMapper; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9FE930414F5E9743D02790CBA595E403; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E44A4781B83C1C51CA039A205A9C8C25; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF21B87E62234B67E6B30D199A60032F; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 查询当前编码是否创建订单
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
public class LogicOrderDataByCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LogicOrderDataByCodeCustomizeServiceMapper logicOrderDataByCodeCustomizeServiceMapper;

    public Boolean logicOrderDataByCode(List<String> param1) {
        AnonymousStructure_BABCF7760687FB3B8C712ACCC6B064BC variable1 = new AnonymousStructure_BABCF7760687FB3B8C712ACCC6B064BC();
        AnonymousStructure_E44A4781B83C1C51CA039A205A9C8C25 variable2 = new AnonymousStructure_E44A4781B83C1C51CA039A205A9C8C25();
        AnonymousStructure_CF21B87E62234B67E6B30D199A60032F variable3 = new AnonymousStructure_CF21B87E62234B67E6B30D199A60032F();
        AnonymousStructure_9FE930414F5E9743D02790CBA595E403 variable4 = new AnonymousStructure_9FE930414F5E9743D02790CBA595E403();
        Boolean result = false;
        variable1 = CommonFunctionUtil.createListPage(logicOrderDataByCodeCustomizeServiceMapper.getAnonymousStructure_AA0E468AE7191E1C9D02F3EB3B53D972(param1), logicOrderDataByCodeCustomizeServiceMapper.countAnonymousStructure_AA0E468AE7191E1C9D02F3EB3B53D972(param1).intValue(), AnonymousStructure_BABCF7760687FB3B8C712ACCC6B064BC.class); 
        variable2 = CommonFunctionUtil.createListPage(logicOrderDataByCodeCustomizeServiceMapper.getAnonymousStructure_380F2457BC27DB7CA6D436A5E1BA6EAA(param1), logicOrderDataByCodeCustomizeServiceMapper.countAnonymousStructure_380F2457BC27DB7CA6D436A5E1BA6EAA(param1).intValue(), AnonymousStructure_E44A4781B83C1C51CA039A205A9C8C25.class); 
        variable3 = CommonFunctionUtil.createListPage(logicOrderDataByCodeCustomizeServiceMapper.getAnonymousStructure_69E8F2ADC4F37B347387A82FBADB3788(param1), logicOrderDataByCodeCustomizeServiceMapper.countAnonymousStructure_69E8F2ADC4F37B347387A82FBADB3788(param1).intValue(), AnonymousStructure_CF21B87E62234B67E6B30D199A60032F.class); 
        variable4 = CommonFunctionUtil.createListPage(logicOrderDataByCodeCustomizeServiceMapper.getAnonymousStructure_EC270C00E4349160B6B0C122490BDB1B(param1), logicOrderDataByCodeCustomizeServiceMapper.countAnonymousStructure_EC270C00E4349160B6B0C122490BDB1B(param1).intValue(), AnonymousStructure_9FE930414F5E9743D02790CBA595E403.class); 
        if (((CommonFunctionUtil.equals(variable1.total, 0L)) && ((CommonFunctionUtil.equals(variable2.total, 0L)) && ((CommonFunctionUtil.equals(variable3.total, 0L)) && (CommonFunctionUtil.equals(variable4.total, 0L)))))) {
            result = true; 
        } else {
        } 

        return result;
    } 

}
