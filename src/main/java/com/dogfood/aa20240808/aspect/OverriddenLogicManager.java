package com.dogfood.aa20240808.aspect; 

import org.springframework.stereotype.Service; 
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 

/**
 * Overridden Help Class
 */
@Service
public class OverriddenLogicManager {

    private final Logger log = LoggerFactory.getLogger(OverriddenLogicManager.class);

    public Object execute(String className, String methodName, Object... args) {
        log.info("OverriddenLogicManager execute: className={},methodName={}", className, methodName);
        return null;

    } 

}
