package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadDetailByidCustomizeServiceMapper; 

@Service
public class LoadDetailByidCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadDetailByidCustomizeServiceMapper loadDetailByidCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_610B5923CAECBB6E97D73C0B0B29A1EC loadDetailByid(List<Long> id) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_610B5923CAECBB6E97D73C0B0B29A1EC result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_610B5923CAECBB6E97D73C0B0B29A1EC();
        result = CommonFunctionUtil.createListPage(loadDetailByidCustomizeServiceMapper.getAnonymousStructure_67381CA0D7647299E0C3FDC3F30AC0E8(id), loadDetailByidCustomizeServiceMapper.countAnonymousStructure_67381CA0D7647299E0C3FDC3F30AC0E8(id).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_610B5923CAECBB6E97D73C0B0B29A1EC.class); 
        return result;
    } 


}
