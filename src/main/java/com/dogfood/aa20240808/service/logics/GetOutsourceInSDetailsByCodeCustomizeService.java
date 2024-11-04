package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.GetOutsourceInSDetailsByCodeCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetOutsourceInSDetailsByCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetOutsourceInSDetailsByCodeCustomizeServiceMapper getOutsourceInSDetailsByCodeCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_736E7C57F08A266F85FC7252E0B7D8AC getOutsourceInSDetailsByCode(String code) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_736E7C57F08A266F85FC7252E0B7D8AC result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_736E7C57F08A266F85FC7252E0B7D8AC();
        result = CommonFunctionUtil.createListPage(getOutsourceInSDetailsByCodeCustomizeServiceMapper.getAnonymousStructure_919167615A5AED1D8A6E68143881444A(code), getOutsourceInSDetailsByCodeCustomizeServiceMapper.countAnonymousStructure_919167615A5AED1D8A6E68143881444A(code).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_736E7C57F08A266F85FC7252E0B7D8AC.class); 
        return result;
    } 


}
