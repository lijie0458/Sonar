package com.dogfood.aa20240808.repository;

import com.dogfood.aa20240808.domain.entities.LCAPUser;
import com.dogfood.aa20240808.service.dto.LCAPUserDTO;
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
public interface LCAPUserInfoMapper {
    int count(@Param("user") LCAPUserDTO user);

    List<LCAPUser> fuzzyQuery(@Param("user") LCAPUser user);

    LCAPUser getByUserNameAndSource(@Param("userName") String userName, @Param("source") String source);

    LCAPUser getByUserId(@Param("userId") String userId);

    List<LCAPUser> pageQuery(@Param("size")Integer limit,
                             @Param("page")Integer offset,
                             @Param("name") String name);

    Long pageQueryCount(@Param("name") String name);
}
