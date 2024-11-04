package com.dogfood.aa20240808.service.impl;

import com.dogfood.aa20240808.domain.entities.LCAPRole;
import com.dogfood.aa20240808.domain.entities.LCAPUserRoleMapping;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.atomic.StringLiteralQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.atomic.ColumnQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.logic.binary.compare.EqualQueryFilter;
import com.dogfood.aa20240808.service.entities.LCAPRoleService;
import com.dogfood.aa20240808.service.entities.LCAPUserRoleMappingService;
import com.dogfood.aa20240808.repository.LCAPUserResUnionMapper;
import com.dogfood.aa20240808.service.UserRoleService;
import com.dogfood.aa20240808.web.dto.RoleListReqDTO;
import com.dogfood.aa20240808.web.dto.RoleListResDTO;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Collections;
/**
* auto generate UserRoleServiceImpl logic
* 权限下沉情况下 处理角色下用户逻辑
*
* @author sys
*/
@Service
public class UserRoleServiceImpl implements UserRoleService{

    private Logger log = LoggerFactory.getLogger(UserRoleServiceImpl.class);
    @Resource
    private LCAPUserRoleMappingService lcapUserRoleMappingService;

    @Resource
    private LCAPRoleService lcapRoleService;

    @Resource
    private LCAPUserResUnionMapper lcapUserResUnionMapper;

    @Override
    public List<String> getUserListByRoleName(String roleName) {
        if (Objects.isNull(roleName)) {
            log.warn("查询角色下用户，角色名为空");
            return new ArrayList<>();
        }
        List<LCAPUserRoleMapping> userRoleMappings = lcapUserRoleMappingService.list(null);
        if (CollectionUtils.isEmpty(userRoleMappings)) {
            log.warn("查询用户角色映射关系为空");
            return new ArrayList<>();
        }

        AbstractQueryFilter queryFilter = new EqualQueryFilter()
            .left(new ColumnQueryFilter(null, null, "name", "name"))
            .right(new StringLiteralQueryFilter(roleName));
        // 因为同一个应用下角色不能重名，所以可以根据角色名取出唯一值
        Optional<LCAPRole> first = lcapRoleService.list(queryFilter).stream().findFirst();
        if (!first.isPresent()) {
            log.warn("查询 {} 角色结果为空", roleName);
            return new ArrayList<>();
        }
        Long id = first.get().getId();
        return userRoleMappings.stream().filter(x -> Objects.equals(x.getRoleId(), id)).map(LCAPUserRoleMapping::getUserName).distinct().collect(Collectors.toList());
    }

    @Override
    public List<RoleListResDTO> getRoleList(RoleListReqDTO reqDTO) {
        String nameFilter = StringUtils.isEmpty(reqDTO.getRoleName()) ? "": reqDTO.getRoleName();
        if(Objects.isNull(reqDTO.getLimit())){
            reqDTO.setLimit(2000);
        }
        if(Objects.isNull(reqDTO.getOffset())){
            reqDTO.setOffset(0);
        }
        List<LCAPRole> lcapRoles = lcapUserResUnionMapper.pageQueryRole(reqDTO.getLimit(),reqDTO.getOffset(),nameFilter);
        return lcapRoles.stream().map(x -> {
            RoleListResDTO roleListResDTO = new RoleListResDTO();
            roleListResDTO.setRoleName(x.getName());
            roleListResDTO.setEnv("");
            roleListResDTO.setRoleId(x.getUuid());
            return roleListResDTO;
         }).collect(Collectors.toList());
    }
}
