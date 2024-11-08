package com.dogfood.aa20240808.service.logics.authlogic; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.http.HttpRequest; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class AkSkAuthAuthLogicForCallInterfaceService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    public HttpRequest auth(HttpRequest<String> request) {
        String ak = "";
        String sk = "";
        String timestamp = "";
        String signature = "";
        // 调用外部接口使用的默认鉴权方式，主要功能是向调用外部接口的 header 中设置ak、timestamp、signature参数。使用前请看注释或者在文档中心搜索“鉴权方式”。
        // ak默认为Codewave，用户可自行修改。
        ak = "Codewave"; 
        CommonFunctionUtil.mapPut(request.headers, "ak", ak);
        // sk默认为Codewave，用户可自行修改。
        sk = "Codewave"; 
        // timestamp默认为当前时间，用户可自行修改。
        timestamp = CommonFunctionUtil.toString(CommonFunctionUtil.currDateTime()); 
        CommonFunctionUtil.mapPut(request.headers, "timestamp", timestamp);
        // 请先对（ak+sk+timestamp）加密再赋值给signature，加密算法可通过引入依赖库完成
        signature = (ak + (sk + timestamp)); 
        CommonFunctionUtil.mapPut(request.headers, "signature", signature);
        return request;
    } 

}
