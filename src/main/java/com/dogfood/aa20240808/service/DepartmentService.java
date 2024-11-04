package com.dogfood.aa20240808.service;

import com.dogfood.aa20240808.web.dto.DepartmentRes;

import java.util.List;

/**
* auto generate UserRoleService logic
*
* @author sys
*/
public interface DepartmentService {
    /**
     * 根据角色名称获取其下的用户名称列表
     *
     * @param deptId 用户id
     * @return 用户名称集合
     */
    List<DepartmentRes> getSubDeptList(String deptId);

    DepartmentRes queryByDeptId(String deptId);

    List<DepartmentRes> getDepartments(String name);
}
