package com.dogfood.aa20240808.service.impl;

import com.dogfood.aa20240808.repository.LCAPUserResUnionMapper;
import com.dogfood.aa20240808.service.UserResourceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.ArrayList;

/**
* auto generate UserResourceServiceImpl logic
* 权限下沉情况下 处理用户的资源
*
* @author sys
*/
@Service
public class UserResourceServiceImpl implements UserResourceService{


    @Resource
    private LCAPUserResUnionMapper lcapUserResUnionMapper;


    @Override
    public List<String> getUserResourceList(String userId) {
        return lcapUserResUnionMapper.getUserResourceList(userId);
    }
}
