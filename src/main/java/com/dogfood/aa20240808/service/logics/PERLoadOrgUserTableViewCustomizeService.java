package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4949638EA1EA3533FFEA3179FEC0328D; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.PERLoadOrgUserTableViewCustomizeServiceMapper; 

/**
 * PER-加载组织管理页面用户表格数据
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
public class PERLoadOrgUserTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private PERLoadOrgUserTableViewCustomizeServiceMapper pERLoadOrgUserTableViewCustomizeServiceMapper;

    public AnonymousStructure_4949638EA1EA3533FFEA3179FEC0328D pERLoadOrgUserTableView(Long orgId, Long page, Long size) {
        AnonymousStructure_4949638EA1EA3533FFEA3179FEC0328D result = new AnonymousStructure_4949638EA1EA3533FFEA3179FEC0328D();
        result = CommonFunctionUtil.createListPage(pERLoadOrgUserTableViewCustomizeServiceMapper.getAnonymousStructure_767B64E0A8935388CB3E9BF139E6586D(page, size, orgId), pERLoadOrgUserTableViewCustomizeServiceMapper.countAnonymousStructure_767B64E0A8935388CB3E9BF139E6586D(page, size, orgId).intValue(), AnonymousStructure_4949638EA1EA3533FFEA3179FEC0328D.class); 
        for (Long index = 0L; index < result.list.size(); index++) {
            AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D item = result.list.get(index.intValue());
            item.lCAPUser.email = null; 
            item.lCAPUser.password = null; 
            item.lCAPUser.phone = null; 

        } 

        return result;
    } 

}
