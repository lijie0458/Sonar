package com.dogfood.aa20240808.service;

import com.dogfood.aa20240808.web.dto.UserListResDTO;

import java.util.List;

/**
* auto generate UserRoleService logic
*
* @author sys
*/
public interface UserDepartmentService {
    /**
     * 根据用户查询直属主管，可指定层级（1～3级）
     *
     * @param userId 用户id
     * @return 用户名称集合
     */
    UserListResDTO getUserLevelNthUpDirectManager(String userId, Long level);


    /**
     * 根据用户查询部门主管，可指定层级（1～3级）
     *
     * @param userId 用户id
     * @return 用户名称集合
     */
    UserListResDTO getUserLevelNthUpDeptManager(String userId, Long level);

    /**
     * 根据当前用户，获取部门上级，向下获取
     */
    UserListResDTO getUserLevelNthDeptManager(String userId, Long level);

    List<UserListResDTO> getDeptUsers(String deptId,Boolean managerOnly);

    List<UserListResDTO> getUsersByUserName(String userName);
}
