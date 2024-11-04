package com.dogfood.aa20240808.repository;

import com.dogfood.aa20240808.domain.entities.LCAPUser;
import com.dogfood.aa20240808.domain.entities.LCAPUserDeptMapping;
import com.dogfood.aa20240808.web.dto.UserListResDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* auto generate LCAPLoadUserRoleMappingTableViewCustomizeService Mapper
*
* @author sys
*/
public interface UserDeptMappingMapper {

    LCAPUserDeptMapping selectLeader(@Param("userId") String userId);

    LCAPUserDeptMapping selectLeaderByDeptId(@Param("deptId") String deptId);

    List<LCAPUserDeptMapping> selectByUserId(@Param("userId") String userId);

    List<LCAPUser> getUserByDept(@Param("deptId")String deptId,@Param("onlyLeader") Boolean onlyLeader);

    LCAPUser getUserByUserId(@Param("userId")String userId);

}
