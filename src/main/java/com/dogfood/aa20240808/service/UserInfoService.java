package com.dogfood.aa20240808.service;

import com.dogfood.aa20240808.web.dto.UserListReqDTO;
import com.dogfood.aa20240808.web.dto.UserListResDTO;
import java.util.List;

/**
* auto generate UserInfoService
* 给ide提供一个全局系统逻辑来获取用户列表，可以兼容用户下沉和非下沉场景
*
* @author sys
*/
public interface UserInfoService {
    List<UserListResDTO> getUserListFromAppOrNuims(UserListReqDTO reqDTO);
}
