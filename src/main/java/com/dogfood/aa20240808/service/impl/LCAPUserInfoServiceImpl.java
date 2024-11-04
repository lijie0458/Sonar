package com.dogfood.aa20240808.service.impl;

import com.dogfood.aa20240808.domain.entities.LCAPUser;
import com.dogfood.aa20240808.repository.entities.LCAPUserMapper;
import com.dogfood.aa20240808.repository.LCAPUserInfoMapper;
import com.dogfood.aa20240808.service.dto.LCAPUserDTO;
import com.dogfood.aa20240808.domain.enumeration.UserSourceEnumEnum;
import com.dogfood.aa20240808.domain.enumeration.UserStatusEnumEnum;
import com.dogfood.aa20240808.service.entities.LCAPUserService;
import com.netease.cloud.nuims.user.api.IUserService;
import com.netease.cloud.nuims.user.api.bean.UserQueryDTO;
import com.netease.cloud.nuims.user.api.bean.UserResultDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
* auto generate LCAPUserInfoServiceImpl
*
* 这个类是nuims中用户领域中定义的接口的实现类
* 主要用于认证模块与用户模块交互
*
* @author sys
*/
@Component
public class LCAPUserInfoServiceImpl implements IUserService {
private final Logger logger = LoggerFactory.getLogger(LCAPUserInfoServiceImpl.class);

    /**
     * 这个mapper是generator在翻译应用的实体时生成的对应的mapper.xml
     * 所以页面上LCAPUser实体不能改名，改名之后生成的mapper文件也就变了
     */
    @Resource
    private LCAPUserMapper userMapper;

    /**
     * 这个mapper是用户下沉过程中 一些自定义的mapper实现（非由实体生成的mapper）
     */
    @Resource
    private LCAPUserInfoMapper lcapUserInfoMapper;

    @Resource
    private LCAPUserService lcapUserService;


    @Override
    public UserResultDTO getUser(UserQueryDTO queryDTO) {
        if (Objects.isNull(queryDTO)) {
            logger.warn("queryDTO is null");
            return null;
        }
        logger.info("queryDTO: {}", queryDTO);
        // userid = username + source
        LCAPUser userBy;
        String userName = queryDTO.getUserName();
        String userId = queryDTO.getUserId();
        if (StringUtils.isEmpty(userId)) {
            // 根据userid + source查询
            userBy = lcapUserInfoMapper.getByUserNameAndSource(userName, queryDTO.getSource());
        } else {
            userBy = lcapUserInfoMapper.getByUserId(userId);
        }

        if (Objects.isNull(userBy)) {
            logger.warn("查询用户不存在...");
            return null;
        }
        UserResultDTO resultDTO = new UserResultDTO();
        resultDTO.setUserName(userBy.getUserName());
        resultDTO.setDisplayName(userBy.getDisplayName());
        resultDTO.setUserId(userBy.getUserId());
        resultDTO.setSource(userBy.getSource().getCode());
        resultDTO.setStatus(userBy.getStatus().getCode());
        resultDTO.setPhone(userBy.getPhone());
        resultDTO.setPassword(userBy.getPassword());
        return resultDTO;
    }

    @Override
    public UserResultDTO addUser(UserQueryDTO queryDTO) {
        if (Objects.isNull(queryDTO)) {
            return null;
        }
        // 根据userid + source查询用户表是否存在用户
        LCAPUserDTO userDTO = new LCAPUserDTO();
        String source = queryDTO.getSource();
        String userId = queryDTO.getUserId();
        userDTO.setSource(source);
        userDTO.setUserId(userId);

        LCAPUser byUserId = lcapUserInfoMapper.getByUserNameAndSource(queryDTO.getUserName(), queryDTO.getSource());
        if (Objects.isNull(byUserId)) {
            LCAPUser userEntity = new LCAPUser();
            UserStatusEnumEnum statusEnum = UserStatusEnumEnum.FIELD_Normal;
            for (UserStatusEnumEnum anEnum : UserStatusEnumEnum.values()) {
                if (anEnum.getCode().equals(queryDTO.getStatus())) {
                    statusEnum = anEnum;
                    break;
                }
            }
            UserSourceEnumEnum sourceEnum = UserSourceEnumEnum.FIELD_Normal;
            for (UserSourceEnumEnum anEnum : UserSourceEnumEnum.values()) {
                if (anEnum.getCode().equals(queryDTO.getSource())) {
                    sourceEnum = anEnum;
                    break;
                }
            }
            userEntity.setUserName(queryDTO.getUserName());
            userEntity.setDisplayName(queryDTO.getDisplayName());
            userEntity.setUserId(queryDTO.getUserId());
            userEntity.setSource(sourceEnum);
            userEntity.setStatus(statusEnum);
            userEntity.setPhone(queryDTO.getPhone());
            userEntity.setPassword(queryDTO.getPassword());
            byUserId = lcapUserService.create(userEntity);
        }

        // 返回用户信息
        UserResultDTO resultDTO = new UserResultDTO();
        resultDTO.setSource(byUserId.getSource().getCode());
        resultDTO.setStatus(byUserId.getStatus().getCode());
        resultDTO.setUserId(byUserId.getUserId());
        resultDTO.setUserName(byUserId.getUserName());
        resultDTO.setPhone(byUserId.getPhone());
        resultDTO.setDisplayName(byUserId.getDisplayName());
        resultDTO.setPassword(byUserId.getPassword());
        return resultDTO;
    }

    @Override
    public UserResultDTO updateUser(UserQueryDTO queryDTO) {
        return null;
    }

    @Override
    public UserResultDTO deleteUser(UserQueryDTO queryDTO) {
        return null;
    }

    @Override
    public UserResultDTO batchAddUser(List<UserQueryDTO> userList) {
        return null;
    }

    @Override
    public List<UserResultDTO> batchGetUser(UserQueryDTO queryDTO) {
        return null;
    }

    @Override
    public UserResultDTO batchUpdateUser(List<UserQueryDTO> userList) {
        return null;
    }

    @Override
    public UserResultDTO batchDeleteUser(List<UserQueryDTO> userList) {
        return null;
    }

    @Override
    public UserResultDTO getByUserNameAndSource(String userName, String source) {
        if (StringUtils.isEmpty(userName) && StringUtils.isEmpty(source)) {
            return null;
        }
        LCAPUser byUserId = lcapUserInfoMapper.getByUserNameAndSource(userName, source);
        UserResultDTO resultDTO = new UserResultDTO();
        resultDTO.setStatus(byUserId.getStatus().getCode());
        resultDTO.setSource(byUserId.getSource().getCode());
        resultDTO.setDisplayName(byUserId.getDisplayName());
        resultDTO.setUserName(byUserId.getUserName());
        resultDTO.setUserId(byUserId.getUserId());
        resultDTO.setPhone(byUserId.getPhone());
        resultDTO.setPassword(byUserId.getPassword());
        return resultDTO;
    }

    @Override
    public List<UserResultDTO> fuzzyQueryUser(UserQueryDTO user) {
        if (Objects.isNull(user)) {
            return new ArrayList<>();
        }
        LCAPUser userEntity = new LCAPUser();
        UserSourceEnumEnum sourceEnum = UserSourceEnumEnum.FIELD_Normal;
        for (UserSourceEnumEnum anEnum : UserSourceEnumEnum.values()) {
            if (anEnum.getCode().equals(user.getSource())) {
                sourceEnum = anEnum;
                break;
            }
        }
        UserStatusEnumEnum statusEnum = UserStatusEnumEnum.FIELD_Normal;
        for (UserStatusEnumEnum anEnum : UserStatusEnumEnum.values()) {
            if (anEnum.getCode().equals(user.getStatus())) {
                statusEnum = anEnum;
                break;
            }
        }
        userEntity.setUserName(user.getUserName());
        userEntity.setUserId(user.getUserId());
        userEntity.setStatus(statusEnum);
        userEntity.setSource(sourceEnum);
        List<LCAPUser> users = lcapUserInfoMapper.fuzzyQuery(userEntity);

        if (!CollectionUtils.isEmpty(users)) {
            List<UserResultDTO> result = new ArrayList<>();
            for (LCAPUser lcapUser : users) {
                UserResultDTO resultDTO = new UserResultDTO();
                resultDTO.setUserId(lcapUser.getUserId());
                resultDTO.setUserName(lcapUser.getUserName());
                resultDTO.setPhone(lcapUser.getPhone());
                resultDTO.setSource(lcapUser.getSource().getCode());
                resultDTO.setStatus(lcapUser.getStatus().getCode());
                resultDTO.setDisplayName(lcapUser.getDisplayName());
                resultDTO.setPassword(lcapUser.getPassword());
                result.add(resultDTO);
            }
            return result;
        }
        logger.warn("fuzzyQueryUser 查询条件：{} 未查询到数据", user);
        return new ArrayList<>();
    }
}
