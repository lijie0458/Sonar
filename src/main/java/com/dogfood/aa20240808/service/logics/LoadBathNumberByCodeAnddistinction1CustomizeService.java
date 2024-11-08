package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadBathNumberByCodeAnddistinction1CustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 点击编辑和下推订单时查询批号列表
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
public class LoadBathNumberByCodeAnddistinction1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadBathNumberByCodeAnddistinction1CustomizeServiceMapper loadBathNumberByCodeAnddistinction1CustomizeServiceMapper;

    public AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B loadBathNumberByCodeAnddistinction1(String Code, Long warehouse, Long distinction) {
        AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B result = new AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B();
        result = CommonFunctionUtil.createListPage(loadBathNumberByCodeAnddistinction1CustomizeServiceMapper.getAnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344(distinction, warehouse, Code), loadBathNumberByCodeAnddistinction1CustomizeServiceMapper.countAnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344(distinction, warehouse, Code).intValue(), AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B.class); 
        return result;
    } 

}
