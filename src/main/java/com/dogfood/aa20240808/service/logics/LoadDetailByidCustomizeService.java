package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_610B5923CAECBB6E97D73C0B0B29A1EC; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadDetailByidCustomizeServiceMapper; 

/**
 * 根据退货单中选择的数据查询详情信息
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
public class LoadDetailByidCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadDetailByidCustomizeServiceMapper loadDetailByidCustomizeServiceMapper;

    public AnonymousStructure_610B5923CAECBB6E97D73C0B0B29A1EC loadDetailByid(List<Long> id) {
        AnonymousStructure_610B5923CAECBB6E97D73C0B0B29A1EC result = new AnonymousStructure_610B5923CAECBB6E97D73C0B0B29A1EC();
        result = CommonFunctionUtil.createListPage(loadDetailByidCustomizeServiceMapper.getAnonymousStructure_67381CA0D7647299E0C3FDC3F30AC0E8(id), loadDetailByidCustomizeServiceMapper.countAnonymousStructure_67381CA0D7647299E0C3FDC3F30AC0E8(id).intValue(), AnonymousStructure_610B5923CAECBB6E97D73C0B0B29A1EC.class); 
        return result;
    } 

}
