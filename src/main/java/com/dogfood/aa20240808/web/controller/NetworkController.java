package com.dogfood.aa20240808.web.controller;

import com.dogfood.aa20240808.util.NetWorkUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Network related
 *
 * @author ifcc
 */
@RestController
public class NetworkController {
    @GetMapping("/api/system/getCurrentIp")
    public ApiReturn<String> getCurrentIp(HttpServletRequest request) {
        return ApiReturn.of(NetWorkUtils.getCurrentIp(request));
    }
}