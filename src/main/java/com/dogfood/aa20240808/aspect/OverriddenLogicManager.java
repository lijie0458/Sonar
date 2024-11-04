package com.dogfood.aa20240808.aspect;

import com.dogfood.aa20240808.service.logics.*;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Resource;
import java.util.List;

/**
 * 复写逻辑的帮助类
 */
@Service
public class OverriddenLogicManager {
    Logger log = LoggerFactory.getLogger(OverriddenLogicManager.class);

    public Object execute(String className, String methodName, Object... args) {
        log.info("OverriddenLogicManager execute: className={},methodName={}", className, methodName);
        return null;
    }
}