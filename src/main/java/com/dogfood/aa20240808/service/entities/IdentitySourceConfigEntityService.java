package com.dogfood.aa20240808.service.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;
import org.springframework.core.io.FileUrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.apache.commons.lang3.StringUtils;

import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.domain.entities.IdentitySourceConfigEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.domain.structure.*;
import com.dogfood.aa20240808.repository.entities.IdentitySourceConfigEntityMapper;
import com.dogfood.aa20240808.util.SnowflakeIdWorker;
import com.dogfood.aa20240808.util.CommonFunctionUtil;
import com.dogfood.aa20240808.service.entities.AbstractService;
import com.dogfood.aa20240808.service.entities.inner.RelationInnerService;
import com.dogfood.aa20240808.service.dto.filters.*;
import com.dogfood.aa20240808.service.dto.filters.atomic.*;
import com.dogfood.aa20240808.service.dto.filters.logic.unary.*;
import com.dogfood.aa20240808.service.dto.filters.logic.binary.matching.*;
import com.dogfood.aa20240808.util.ExcelUtil;
import com.dogfood.aa20240808.context.UserContext;
/**
* auto generate IdentitySourceConfigEntityService ServiceImpl
*
* @author sys
*/
@Service
public class IdentitySourceConfigEntityService extends AbstractService {
    @Resource
    private IdentitySourceConfigEntityMapper mapper;
    @Resource
    private RelationInnerService relationInnerService;

    private Map<String, String> entityFieldNameTitleMap = new LinkedHashMap<String, String>();
    private Map<String, String> entityFieldTitleNameMap = new LinkedHashMap<String, String>();
    private Map<String, String> entityFiledColumnNameMap = new LinkedHashMap<>();

    public IdentitySourceConfigEntityService() {
        entityFieldNameTitleMap.put("id", "主键");
        entityFieldTitleNameMap.put("主键", "id");
        entityFiledColumnNameMap.put("id", "id");
        entityFieldNameTitleMap.put("createdTime", "创建时间");
        entityFieldTitleNameMap.put("创建时间", "createdTime");
        entityFiledColumnNameMap.put("createdTime", "created_time");
        entityFieldNameTitleMap.put("updatedTime", "更新时间");
        entityFieldTitleNameMap.put("更新时间", "updatedTime");
        entityFiledColumnNameMap.put("updatedTime", "updated_time");
        entityFieldNameTitleMap.put("createdBy", "创建者");
        entityFieldTitleNameMap.put("创建者", "createdBy");
        entityFiledColumnNameMap.put("createdBy", "created_by");
        entityFieldNameTitleMap.put("updatedBy", "更新者");
        entityFieldTitleNameMap.put("更新者", "updatedBy");
        entityFiledColumnNameMap.put("updatedBy", "updated_by");
        entityFieldNameTitleMap.put("state", "身份源");
        entityFieldTitleNameMap.put("身份源", "state");
        entityFiledColumnNameMap.put("state", "state");
        entityFieldNameTitleMap.put("icon", "身份源图标");
        entityFieldTitleNameMap.put("身份源图标", "icon");
        entityFiledColumnNameMap.put("icon", "icon");
        entityFieldNameTitleMap.put("name", "身份源名称");
        entityFieldTitleNameMap.put("身份源名称", "name");
        entityFiledColumnNameMap.put("name", "name");
        entityFieldNameTitleMap.put("appId", "客户端id");
        entityFieldTitleNameMap.put("客户端id", "appId");
        entityFiledColumnNameMap.put("appId", "app_id");
        entityFieldNameTitleMap.put("appSecret", "客户端密钥");
        entityFieldTitleNameMap.put("客户端密钥", "appSecret");
        entityFiledColumnNameMap.put("appSecret", "app_secret");
        entityFieldNameTitleMap.put("successUrl", "登陆成功回调地址");
        entityFieldTitleNameMap.put("登陆成功回调地址", "successUrl");
        entityFiledColumnNameMap.put("successUrl", "success_url");
        entityFieldNameTitleMap.put("type", "身份源类型");
        entityFieldTitleNameMap.put("身份源类型", "type");
        entityFiledColumnNameMap.put("type", "type");
        entityFieldNameTitleMap.put("loginEnable", "是否开启身份源");
        entityFieldTitleNameMap.put("是否开启身份源", "loginEnable");
        entityFiledColumnNameMap.put("loginEnable", "login_enable");
        entityFieldNameTitleMap.put("centerLoginUrl", "认证中心登陆地址");
        entityFieldTitleNameMap.put("认证中心登陆地址", "centerLoginUrl");
        entityFiledColumnNameMap.put("centerLoginUrl", "center_login_url");
        entityFieldNameTitleMap.put("tokenUrl", "获取token的地址");
        entityFieldTitleNameMap.put("获取token的地址", "tokenUrl");
        entityFiledColumnNameMap.put("tokenUrl", "token_url");
        entityFieldNameTitleMap.put("tokenMethod", "获取token的请求方法");
        entityFieldTitleNameMap.put("获取token的请求方法", "tokenMethod");
        entityFiledColumnNameMap.put("tokenMethod", "token_method");
        entityFieldNameTitleMap.put("userUrl", "获取用户信息的地址");
        entityFieldTitleNameMap.put("获取用户信息的地址", "userUrl");
        entityFiledColumnNameMap.put("userUrl", "user_url");
        entityFieldNameTitleMap.put("userMethod", "获取用户的请求方式");
        entityFieldTitleNameMap.put("获取用户的请求方式", "userMethod");
        entityFiledColumnNameMap.put("userMethod", "user_method");
        entityFieldNameTitleMap.put("centerLogoutUrl", "认证中心注销地址");
        entityFieldTitleNameMap.put("认证中心注销地址", "centerLogoutUrl");
        entityFiledColumnNameMap.put("centerLogoutUrl", "center_logout_url");
        entityFieldNameTitleMap.put("logoutCallbackUrl", "注销后跳转的地址");
        entityFieldTitleNameMap.put("注销后跳转的地址", "logoutCallbackUrl");
        entityFiledColumnNameMap.put("logoutCallbackUrl", "logout_callback_url");
        entityFieldNameTitleMap.put("casTicketUrl", "cas服务端ticket校验地址");
        entityFieldTitleNameMap.put("cas服务端ticket校验地址", "casTicketUrl");
        entityFiledColumnNameMap.put("casTicketUrl", "cas_ticket_url");
        entityFieldNameTitleMap.put("expire", "过期时间");
        entityFieldTitleNameMap.put("过期时间", "expire");
        entityFiledColumnNameMap.put("expire", "expire");
        entityFieldNameTitleMap.put("redirectUrl", "跳转回调的地址");
        entityFieldTitleNameMap.put("跳转回调的地址", "redirectUrl");
        entityFiledColumnNameMap.put("redirectUrl", "redirect_url");
        entityFieldNameTitleMap.put("agentId", "客户端id");
        entityFieldTitleNameMap.put("客户端id", "agentId");
        entityFiledColumnNameMap.put("agentId", "agent_id");
        entityFieldNameTitleMap.put("tokenHeaderMap", "token请求头");
        entityFieldTitleNameMap.put("token请求头", "tokenHeaderMap");
        entityFiledColumnNameMap.put("tokenHeaderMap", "token_header_map");
        entityFieldNameTitleMap.put("tokenBodyMap", "token请求体");
        entityFieldTitleNameMap.put("token请求体", "tokenBodyMap");
        entityFiledColumnNameMap.put("tokenBodyMap", "token_body_map");
        entityFieldNameTitleMap.put("userHeaderMap", "user请求头");
        entityFieldTitleNameMap.put("user请求头", "userHeaderMap");
        entityFiledColumnNameMap.put("userHeaderMap", "user_header_map");
        entityFieldNameTitleMap.put("userBodyMap", "user请求体");
        entityFieldTitleNameMap.put("user请求体", "userBodyMap");
        entityFiledColumnNameMap.put("userBodyMap", "user_body_map");
        entityFieldNameTitleMap.put("userIdRes", "oauth的userid返回格式");
        entityFieldTitleNameMap.put("oauth的userid返回格式", "userIdRes");
        entityFiledColumnNameMap.put("userIdRes", "user_id_res");
        entityFieldNameTitleMap.put("userNameRes", "oauth的userName返回格式");
        entityFieldTitleNameMap.put("oauth的userName返回格式", "userNameRes");
        entityFiledColumnNameMap.put("userNameRes", "user_name_res");
        entityFieldNameTitleMap.put("code", "身份源的唯一标识");
        entityFieldTitleNameMap.put("身份源的唯一标识", "code");
        entityFiledColumnNameMap.put("code", "code");
        entityFieldNameTitleMap.put("ssoUrl", "sso免登登录地址");
        entityFieldTitleNameMap.put("sso免登登录地址", "ssoUrl");
        entityFiledColumnNameMap.put("ssoUrl", "sso_url");
        entityFieldNameTitleMap.put("wechatToken", "令牌");
        entityFieldTitleNameMap.put("令牌", "wechatToken");
        entityFiledColumnNameMap.put("wechatToken", "wechat_token");
        entityFieldNameTitleMap.put("wechatMsgMethod", "消息加解密方式");
        entityFieldTitleNameMap.put("消息加解密方式", "wechatMsgMethod");
        entityFiledColumnNameMap.put("wechatMsgMethod", "wechat_msg_method");
        entityFieldNameTitleMap.put("wechatMsgSecret", "消息加解密密钥");
        entityFieldTitleNameMap.put("消息加解密密钥", "wechatMsgSecret");
        entityFiledColumnNameMap.put("wechatMsgSecret", "wechat_msg_secret");
    }

    /**
    * auto gen create method
    **/
    @Transactional(rollbackFor = Exception.class)
    public IdentitySourceConfigEntity create(IdentitySourceConfigEntity entity) {
        if (null == entity) {
            throw new HttpCodeException(400, "create param is required");
        }
        // fill default value
        entity.setId(SnowflakeIdWorker.getInstance().nextId());
        entity.setCreatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
        entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
        UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
        String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
        entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
        entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
        entity.setState(getOrDefault(entity.getState(), null));
        entity.setIcon(getOrDefault(entity.getIcon(), ""));
        entity.setName(getOrDefault(entity.getName(), ""));
        entity.setAppId(getOrDefault(entity.getAppId(), ""));
        entity.setAppSecret(getOrDefault(entity.getAppSecret(), ""));
        entity.setType(getOrDefault(entity.getType(), null));
        entity.setLoginEnable(getOrDefault(entity.getLoginEnable(), false));
        entity.setExpire(getOrDefault(entity.getExpire(), 86400L));
        entity.setCode(getOrDefault(entity.getCode(), ""));
        entity.setWechatMsgSecret(getOrDefault(entity.getWechatMsgSecret(), ""));
        paramValidate(entity);
        mapper.insert(entity);
        return entity;
    }

    /**
    * auto gen batch create method
    **/
    @Transactional(rollbackFor = Exception.class)
    public List<IdentitySourceConfigEntity> batchCreate(List<IdentitySourceConfigEntity> entities) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }

        UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
        String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();

        // fill default value
        List<IdentitySourceConfigEntity> batchList = new ArrayList<>(100);
        for (IdentitySourceConfigEntity entity : entities) {
            entity.setId(SnowflakeIdWorker.getInstance().nextId());
            entity.setCreatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
            entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
            entity.setState(getOrDefault(entity.getState(), null));
            entity.setIcon(getOrDefault(entity.getIcon(), ""));
            entity.setName(getOrDefault(entity.getName(), ""));
            entity.setAppId(getOrDefault(entity.getAppId(), ""));
            entity.setAppSecret(getOrDefault(entity.getAppSecret(), ""));
            entity.setType(getOrDefault(entity.getType(), null));
            entity.setLoginEnable(getOrDefault(entity.getLoginEnable(), false));
            entity.setExpire(getOrDefault(entity.getExpire(), 86400L));
            entity.setCode(getOrDefault(entity.getCode(), ""));
            entity.setWechatMsgSecret(getOrDefault(entity.getWechatMsgSecret(), ""));
            paramValidate(entity);
            if (batchList.size() >= 100) {
                mapper.batchInsert(batchList);
                batchList.clear();
            }
            batchList.add(entity);
        }
        if (batchList.size() >= 0) {
            mapper.batchInsert(batchList);
        }
        return entities;
    }

    /**
    * auto gen update method
    **/
    @Transactional
    public IdentitySourceConfigEntity update(IdentitySourceConfigEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "IdentitySourceConfigEntity");
        }
        if ( entity.getId() == null ) { 
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
        }

        // updateFields为null时，默认全量更新
        if (null != updateFields && updateFields.size() == 1 &&  updateFields.contains("id")) {
            return entity;
        } else {
            UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
            String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
            entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
            int rows = mapper.update(entity, updateFields);
            if (rows <= 0) {
                throw new HttpCodeException(404, ErrorCodeEnum.DATA_NOT_EXIST.code, entity.getClass().getName());
            }

            return get(entity.getId());
        }
    }

    /**
    * auto gen batchUpdate method
    **/
    @Transactional(rollbackFor = Exception.class)
    public List<IdentitySourceConfigEntity> batchUpdate(List<IdentitySourceConfigEntity> entities, List<String> updateFields) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }
        // updateFields为null时，默认全量更新
        List<IdentitySourceConfigEntity> updateEntities = new ArrayList<>(entities.size());
        for (IdentitySourceConfigEntity entity : entities) {
            updateEntities.add(update(entity, updateFields));
        }

        return updateEntities;
    }

    /**
    * auto gen delete method
    **/
    @Transactional(rollbackFor = Exception.class)
    public long delete( Long id ) { 
        if ( id == null ) { 
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
        }
        IdentitySourceConfigEntity entity = mapper.selectOne( id ); 

        if (null == entity) {
            return 0;
        }
        relationInnerService.onDelete(entity);
        return mapper.delete( id ); 
    }

    /**
    * auto gen batch delete method
    **/
    @Transactional(rollbackFor = Exception.class)
    public long batchDelete(List<Long> ids) {
        if (null == ids || ids.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }

        AbstractQueryFilter inQueryFilter = new InQueryFilter()
            .left(new ColumnQueryFilter("IdentitySourceConfig", "IdentitySourceConfig", "id", "id"))
            .right(new ListLiteralQueryFilter(ids));
        CommonFunctionUtil.preHandleQueryExpression(inQueryFilter, entityFiledColumnNameMap);
        List<IdentitySourceConfigEntity>  entities = mapper.selectList(inQueryFilter);
        for (IdentitySourceConfigEntity entity : entities) {
            relationInnerService.onDelete(entity);
        }

        return mapper.batchDelete(ids);
    }

    /**
     * auto gen get method
     **/
    public IdentitySourceConfigEntity get( Long id ) { 
        if ( id == null ) { 
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
        }

        IdentitySourceConfigEntity entity = mapper.selectOne( id ); 

        return entity;
    }

    /**
    * auto gen list method
    **/
    public List<IdentitySourceConfigEntity> list(AbstractQueryFilter queryFilter) {
        if (null == queryFilter) {
            queryFilter = new UnaryExpressionFilter();
        }
        CommonFunctionUtil.preHandleQueryExpression(queryFilter, entityFiledColumnNameMap);
        return mapper.selectList(queryFilter);
    }

    /**
    * auto gen count method
    **/
    public long count(AbstractQueryFilter queryFilter) {
        if (null == queryFilter) {
            queryFilter = new UnaryExpressionFilter();
        }
        CommonFunctionUtil.preHandleQueryExpression(queryFilter, entityFiledColumnNameMap);
        return mapper.count(queryFilter);
    }

    /**
    * auto gen importFile method
    **/
    @Transactional(rollbackFor = Exception.class)
    public String importFile(MultipartFile file) {
        String type;
        String[] items = file.getOriginalFilename().split("\\.");
        if (items.length > 1) {
            type = items[items.length - 1];
            if (!"xls".equalsIgnoreCase(type) && !"xlsx".equalsIgnoreCase(type)) {
                return "不支持的文件类型";
            }
        } else {
            return "不支持的文件类型";
        }

        try {
            List<IdentitySourceConfigEntity> data = ExcelUtil.read(file.getInputStream(), type, IdentitySourceConfigEntity.class, entityFieldTitleNameMap);
            batchCreate(data);
            return "ok";
        } catch (Exception e) {
            throw new HttpCodeException(500, e);
        }
    }

    /**
    * auto gen export method
    **/
    public ResponseEntity<org.springframework.core.io.Resource> export(AbstractQueryFilter queryFilter, String fields, HttpServletRequest request) {
        try {
            Map<String, String> exportFieldMap = entityFieldNameTitleMap;
            if (fields != null && !"".equals(fields.trim())) {
                for (String filedName : fields.split(",")) {
                    exportFieldMap = new LinkedHashMap<String, String>();
                    exportFieldMap.put(filedName, entityFieldNameTitleMap.get(filedName));
                }
            }

            List<IdentitySourceConfigEntity> data = list(queryFilter);
            String storeFilePath = ExcelUtil.write(data, IdentitySourceConfigEntity.class, exportFieldMap);
            org.springframework.core.io.Resource resource = null;
            String contentType = null;
            resource = new FileUrlResource(storeFilePath);
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
            if (contentType == null) {
                contentType = "application/octet-stream";
            }
            return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + IdentitySourceConfigEntity.class.getSimpleName() + ".xlsx\"")
                .body(resource);
        } catch (Exception e) {
            throw new HttpCodeException(500, e);
        }
    }

    /**
    * auto gen createOrUpdate method
    **/
    @Transactional(rollbackFor = Exception.class)
    public IdentitySourceConfigEntity createOrUpdate(IdentitySourceConfigEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, IdentitySourceConfigEntity.class);
        }

        if ( entity.getId() == null ) { 
            // insert
            entity = create(entity);
        }  else {
            IdentitySourceConfigEntity existEntity = mapper.selectOne(entity.getId()); 
            if (null == existEntity) {
                // insert
                entity.setCreatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
                entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
                UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
                String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
                entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
                entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
                entity.setState(getOrDefault(entity.getState(), null));
                entity.setIcon(getOrDefault(entity.getIcon(), ""));
                entity.setName(getOrDefault(entity.getName(), ""));
                entity.setAppId(getOrDefault(entity.getAppId(), ""));
                entity.setAppSecret(getOrDefault(entity.getAppSecret(), ""));
                entity.setType(getOrDefault(entity.getType(), null));
                entity.setLoginEnable(getOrDefault(entity.getLoginEnable(), false));
                entity.setExpire(getOrDefault(entity.getExpire(), 86400L));
                entity.setCode(getOrDefault(entity.getCode(), ""));
                entity.setWechatMsgSecret(getOrDefault(entity.getWechatMsgSecret(), ""));
                paramValidate(entity);
                mapper.createOrUpdate(entity);
            } else {
                // updateFields为null时，默认全量更新
                entity = update(entity, updateFields);
            }
        }
        return entity;
    }

    /**
    * auto gen updateBy method
    **/
    @Transactional(rollbackFor = Exception.class)
    public long updateBy(IdentitySourceConfigEntity entity, List<String> updateFields, AbstractQueryFilter filter) {

        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, IdentitySourceConfigEntity.class);
        }

        // updateFields为null时，默认全量更新
        if (null == filter) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, AbstractQueryFilter.class);
        }

        if (null != updateFields && updateFields.size() == 1 &&  updateFields.contains("id")) {
            return 0;
        } else {
            UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
            String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
            CommonFunctionUtil.preHandleQueryExpression(filter, entityFiledColumnNameMap);
            entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
            entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
            return mapper.updateBy(entity, updateFields, filter);
        }
    }

    /**
    * auto gen deleteBy method
    **/
    @Transactional(rollbackFor = Exception.class)
    public long deleteBy(AbstractQueryFilter filter) {
        if (null == filter) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, AbstractQueryFilter.class);
        }

        CommonFunctionUtil.preHandleQueryExpression(filter, entityFiledColumnNameMap);
        return mapper.deleteBy(filter);
    }
}