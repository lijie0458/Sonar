package com.dogfood.aa20240808.web.dto;

public class DepartmentDTO {
    /**
     * 查询哪个环境
     */
    private String appEnv;

    /**
     * 应用登录状态的token
     */
    private String token;

    /**
     * 部门名称
     */
    private String name;

    public String getAppEnv() {
        return appEnv;
    }

    public void setAppEnv(String appEnv) {
        this.appEnv = appEnv;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
