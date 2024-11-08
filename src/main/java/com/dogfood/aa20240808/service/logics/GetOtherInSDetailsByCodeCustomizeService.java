package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5236282700C1FEA9424B9BB24E7CF40A; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.GetOtherInSDetailsByCodeCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 根据其他入库单号拿到委外加工入库详情-ljl
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
public class GetOtherInSDetailsByCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetOtherInSDetailsByCodeCustomizeServiceMapper getOtherInSDetailsByCodeCustomizeServiceMapper;

    public AnonymousStructure_5236282700C1FEA9424B9BB24E7CF40A getOtherInSDetailsByCode(String code) {
        AnonymousStructure_5236282700C1FEA9424B9BB24E7CF40A result = new AnonymousStructure_5236282700C1FEA9424B9BB24E7CF40A();
        result = CommonFunctionUtil.createListPage(getOtherInSDetailsByCodeCustomizeServiceMapper.getAnonymousStructure_627D60E768ACE4DD4973B62FA955F62D(code), getOtherInSDetailsByCodeCustomizeServiceMapper.countAnonymousStructure_627D60E768ACE4DD4973B62FA955F62D(code).intValue(), AnonymousStructure_5236282700C1FEA9424B9BB24E7CF40A.class); 
        return result;
    } 

}
