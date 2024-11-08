package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.GetOutsourceInSDetailsByCodeCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_736E7C57F08A266F85FC7252E0B7D8AC; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 根据委外加工入库单号拿到委外加工入库详情-ljl
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
public class GetOutsourceInSDetailsByCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetOutsourceInSDetailsByCodeCustomizeServiceMapper getOutsourceInSDetailsByCodeCustomizeServiceMapper;

    public AnonymousStructure_736E7C57F08A266F85FC7252E0B7D8AC getOutsourceInSDetailsByCode(String code) {
        AnonymousStructure_736E7C57F08A266F85FC7252E0B7D8AC result = new AnonymousStructure_736E7C57F08A266F85FC7252E0B7D8AC();
        result = CommonFunctionUtil.createListPage(getOutsourceInSDetailsByCodeCustomizeServiceMapper.getAnonymousStructure_919167615A5AED1D8A6E68143881444A(code), getOutsourceInSDetailsByCodeCustomizeServiceMapper.countAnonymousStructure_919167615A5AED1D8A6E68143881444A(code).intValue(), AnonymousStructure_736E7C57F08A266F85FC7252E0B7D8AC.class); 
        return result;
    } 

}
