package com.dogfood.aa20240808.repository;

import com.dogfood.aa20240808.domain.entities.LCAPDepartment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * auto generate LCAPUserInfoMapper
 * 定义制品应用操作下沉的用户表的方法
 * LCAPUserMapper 是由实体生成对
 * LCAPUserInfoMapper 这个类是ftl模版生成的
 *
 * @author sys
 */
public interface DepartmentMapper {
    LCAPDepartment queryByDeptId(@Param("deptId") String deptId);
    List<LCAPDepartment> queryByParentDeptId(@Param("deptId") String deptId);
    List<LCAPDepartment> queryList();
}
