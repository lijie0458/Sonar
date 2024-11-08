package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.PERGetAllRoleCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_70791B893F53C2EFB9E501591763B020; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6; 

/**
 * PER-获取所有角色
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
public class PERGetAllRoleCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private PERGetAllRoleCustomizeServiceMapper pERGetAllRoleCustomizeServiceMapper;

    public List<AnonymousStructure_70791B893F53C2EFB9E501591763B020> pERGetAllRole() {
        List<AnonymousStructure_70791B893F53C2EFB9E501591763B020> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(pERGetAllRoleCustomizeServiceMapper.getAnonymousStructure_70791B893F53C2EFB9E501591763B020(), pERGetAllRoleCustomizeServiceMapper.countAnonymousStructure_70791B893F53C2EFB9E501591763B020().intValue(), AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6.class).list; 
        return result;
    } 

}
