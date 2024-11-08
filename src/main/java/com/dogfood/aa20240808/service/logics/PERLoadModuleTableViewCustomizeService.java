package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.PERLoadModuleTableViewCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53BF8AB25D5E58D9DF5D7A7FBC87B28D; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F827667572E224857CDA5765397B0901; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * PER-加载资源管理页面模块表格数据
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
public class PERLoadModuleTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private PERLoadModuleTableViewCustomizeServiceMapper pERLoadModuleTableViewCustomizeServiceMapper;

    public List<AnonymousStructure_53BF8AB25D5E58D9DF5D7A7FBC87B28D> pERLoadModuleTableView() {
        List<AnonymousStructure_53BF8AB25D5E58D9DF5D7A7FBC87B28D> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(pERLoadModuleTableViewCustomizeServiceMapper.getAnonymousStructure_53BF8AB25D5E58D9DF5D7A7FBC87B28D(), pERLoadModuleTableViewCustomizeServiceMapper.countAnonymousStructure_53BF8AB25D5E58D9DF5D7A7FBC87B28D().intValue(), AnonymousStructure_F827667572E224857CDA5765397B0901.class).list; 
        return result;
    } 

}
