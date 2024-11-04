package com.dogfood.aa20240808.service.impl;
import com.dogfood.aa20240808.domain.entities.LCAPDepartment;
import com.dogfood.aa20240808.repository.DepartmentMapper;
import com.dogfood.aa20240808.repository.entities.LCAPDepartmentMapper;
import com.dogfood.aa20240808.service.DepartmentService;
import com.dogfood.aa20240808.web.dto.DepartmentRes;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.atomic.ColumnQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.atomic.ListLiteralQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.logic.binary.matching.LikeQueryFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;
import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Collections;

/**
* auto generate UserRoleServiceImpl logic
* 权限下沉情况下 处理角色下用户逻辑
*
* @author sys
*/
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private Logger log = LoggerFactory.getLogger(DepartmentServiceImpl.class);
    @Resource
    private LCAPDepartmentMapper lcapDepartmentMapper;
    @Resource
    private DepartmentMapper departmentMapper;
    @Override
    public List<DepartmentRes> getSubDeptList(String deptId) {
        log.info("query dept deptId {}",deptId);
         List<LCAPDepartment> customList = departmentMapper.queryByParentDeptId(deptId);
         return customList.stream().map(x -> {
               DepartmentRes department = new DepartmentRes();
               department.setName(x.name);
               department.setDeptId(x.deptId);
               department.setParentDeptId(x.parentDeptId);
               return department;
         }).collect(Collectors.toList());
    }

    @Override
    public DepartmentRes queryByDeptId(String deptId) {
         LCAPDepartment dept = departmentMapper.queryByDeptId(deptId);
         DepartmentRes department = new DepartmentRes();
         department.setName(dept.getName());
         department.setDeptId(dept.getDeptId());
         department.setParentDeptId(dept.getParentDeptId());
         return department;
    }

    @Override
    public List<DepartmentRes> getDepartments(String name) {
        AbstractQueryFilter inQueryFilter = new LikeQueryFilter();
        if (StringUtils.isNotBlank(name)) {
            inQueryFilter.left(new ColumnQueryFilter("LCAPDepartment", null, "name", "name"))
                    .right(new ListLiteralQueryFilter(name));
            List<LCAPDepartment> list = lcapDepartmentMapper.selectList(inQueryFilter);
            return list.stream().map(x -> {
                DepartmentRes department = new DepartmentRes();
                department.setName(x.name);
                department.setDeptId(x.deptId);
                department.setParentDeptId(x.parentDeptId);
                return department;
            }).collect(Collectors.toList());
        } else {
            List<LCAPDepartment> list = departmentMapper.queryList();
            return list.stream().map(x -> {
                DepartmentRes department = new DepartmentRes();
                department.setName(x.name);
                department.setDeptId(x.deptId);
                department.setParentDeptId(x.parentDeptId);
                return department;
            }).collect(Collectors.toList());
        }
    }
}