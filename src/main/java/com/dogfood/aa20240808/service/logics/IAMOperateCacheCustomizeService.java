package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.GlobalContext; 
import java.util.HashMap; 
import java.util.ArrayList; 
import java.util.LinkedHashMap; 
import com.dogfood.aa20240808.domain.entities.AppCacheEntity; 
import com.dogfood.aa20240808.repository.IAMOperateCacheCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.service.dto.filters.atomic.ColumnQueryFilter; 
import java.util.Arrays; 
import com.dogfood.aa20240808.service.dto.filters.logic.binary.compare.EqualQueryFilter; 
import java.util.Map; 
import com.dogfood.aa20240808.service.entities.AppCacheEntityService; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.service.dto.filters.atomic.IdentifierQueryFilter; 
import org.springframework.util.ReflectionUtils; 
import com.dogfood.aa20240808.service.dto.filters.atomic.ColumnQueryFilter.Property; 

@Service
public class IAMOperateCacheCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private IAMOperateCacheCustomizeServiceMapper iAMOperateCacheCustomizeServiceMapper;
    @Autowired
    private AppCacheEntityService appCacheEntityService;
    public String iAMOperateCache(String key, Boolean write, String value) {
        if (GlobalContext.notHandleValidation()) {
            if (write == null) {
                write = false; 
            } 

            if (value == null) {
                value = null; 
            } 

        } 

        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_34E3E39EB45447A8EA8054133B60899D> cacheList = new ArrayList<>();
        AppCacheEntity cache = new AppCacheEntity();
        Long l = 0L;
        String result = "";
        if ((CommonFunctionUtil.equals(key, null))) {
            return result;
        } else {
        } 

        l = CommonFunctionUtil.convert(CommonFunctionUtil.currDateTime("global"), Long.class); 
        cacheList = CommonFunctionUtil.createListPage(iAMOperateCacheCustomizeServiceMapper.getAnonymousStructure_34E3E39EB45447A8EA8054133B60899D(key), iAMOperateCacheCustomizeServiceMapper.countAnonymousStructure_34E3E39EB45447A8EA8054133B60899D(key).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8B4F256A990FDC613135B3C5CDC12FF3.class).list; 
        if (write) {
            if ((CommonFunctionUtil.notEquals(CommonFunctionUtil.length(cacheList), 0L))) {
                cache = CommonFunctionUtil.listHead(cacheList).appCache; 
                cache.expiration = l; 
                appCacheEntityService.update(cache, Arrays.asList("expiration", "value"));
                result = value; 
                return result;
            } else {
                cache.key = key; 
                cache.value = value; 
                cache.expiration = l; 

                appCacheEntityService.create(cache);
                result = value; 
                return result;
            } 

        } else {
            if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(cacheList), 0L))) {
                result = null; 
                return result;
            } else {
                cache = CommonFunctionUtil.listHead(cacheList).appCache; 
                if ((l.compareTo(cache.expiration) > 0)) {
                    result = cache.value; 
                } else {
                    LCAP_LOGGER.info(CommonFunctionUtil.toString(new StringBuilder().append(CommonFunctionUtil.toString("当前缓存已过期：")).append(CommonFunctionUtil.toString(key)).toString()));
                    appCacheEntityService.deleteBy(new EqualQueryFilter().left(new ColumnQueryFilter("", "", "key", "key", new ColumnQueryFilter.Property("", "key"))).right(new IdentifierQueryFilter("key", key)));
                    result = null; 
                    return result;
                } 

            } 

        } 

        return result;
    } 

    public Map<String, Object> IAMOperateCacheValidateDefaultValue(Object ext) throws Exception {
        Map<String, Object> elements = new HashMap<>();
        try {
            Field write = ReflectionUtils.findField(ext.getClass(), "write");
            if (write != null) {
                ReflectionUtils.makeAccessible(write);
                if (ReflectionUtils.getField(write, ext) == null) {
                    ReflectionUtils.setField(write, ext, false);
                } 

                elements.put("write", write.get(ext));
            } 

            Field value = ReflectionUtils.findField(ext.getClass(), "value");
            if (value != null) {
                ReflectionUtils.makeAccessible(value);
                if (ReflectionUtils.getField(value, ext) == null) {
                    ReflectionUtils.setField(value, ext, null);
                } 

                elements.put("value", value.get(ext));
            } 

        } catch (Exception e) {
            LCAP_LOGGER.error("validate rule set default value error", e);
            throw e; 
        } 
        return elements;
    } 

    public Map<String, Object> IAMOperateCacheValidateRestDefaultValue(String key, Boolean write, String value) throws Exception {
        Map<String, Object> elements = new LinkedHashMap<>();
        try {
            elements.put("key", key);
            if (write == null) {
                write = false; 
            } 

            elements.put("write", write);
            if (value == null) {
                value = null; 
            } 

            elements.put("value", value);
        } catch (Exception e) {
            LCAP_LOGGER.error("validate rule set rest default value error", e);
            throw e; 
        } 
        return elements;
    } 


}
