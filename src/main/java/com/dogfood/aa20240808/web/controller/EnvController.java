package com.dogfood.aa20240808.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.system.configuration.NaslConfigurationComponent;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * Get app properties
 *
 * @author ifcc
 */
@RestController
public class EnvController {
    @Autowired
    private NaslConfigurationComponent naslConfigurationComponent;

   @GetMapping("/api/system/getCustomConfigV2/{configKey}")
   public ApiReturn<String> getCustomConfigV2(@PathVariable("configKey") String configKey, @RequestParam(value = "group", required = false) String group) {
        return ApiReturn.of(naslConfigurationComponent.getUnPrivateCustomConfig(group, configKey));
   }

    @Deprecated
    @GetMapping("/api/system/getCustomConfig/{configKey}")
    public String getCustomConfig(@PathVariable("configKey") String configKey, @RequestParam(value = "group", required = false) String group) {
        return naslConfigurationComponent.getUnPrivateCustomConfig(group, configKey);
    }
}
