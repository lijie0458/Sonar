/* 实体表 */
CREATE TABLE `entity1` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
PRIMARY KEY (`id`)
);


CREATE TABLE `FunctionTable` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`name` varchar(255) NULL COMMENT '功能名称',
`description` varchar(255) NULL COMMENT '功能描述',
`module_id` bigint NULL COMMENT '模块id',
`page_id` bigint NULL COMMENT '页面id',
`permission_id` bigint NULL COMMENT '权限id',
PRIMARY KEY (`id`)
);


CREATE TABLE `Page` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`name` varchar(255) NULL COMMENT '页面名称',
`module_id` bigint NULL COMMENT '关联模块id',
PRIMARY KEY (`id`)
);


CREATE TABLE `ModuleTable` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`name` varchar(255) NULL COMMENT '模块名称',
PRIMARY KEY (`id`)
);


CREATE TABLE `UserOrgMapping` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`user_id` bigint NULL COMMENT '用户id',
`org_id` bigint NULL COMMENT '组织id',
`is_leader` tinyint(1) NULL DEFAULT 0 COMMENT '是否是负责人',
PRIMARY KEY (`id`)
);


CREATE TABLE `Organisation` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`name` varchar(255) NULL COMMENT '组织名称',
`parent_id` bigint NULL DEFAULT 0 COMMENT '父级组织id',
`has_children` tinyint(1) NULL DEFAULT 0 COMMENT '是否有子组织',
PRIMARY KEY (`id`)
) COMMENT='组织表，因Organization与系统关键字冲突，因此使用Organisation
';


CREATE TABLE `AppCache` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`key` varchar(255) NULL COMMENT '健',
`value` varchar(255) NULL COMMENT '值',
`expiration` bigint NULL COMMENT '过期时间（秒）',
UNIQUE INDEX `uni_key_b14fb07`(`key`),
PRIMARY KEY (`id`)
);


CREATE TABLE `ThirdIdentity` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`open_id` varchar(255) NOT NULL COMMENT '用户三方唯一id',
`identity_id` bigint NOT NULL COMMENT '身份源表id',
`name` varchar(255) NOT NULL COMMENT '昵称',
`phone` varchar(255) NULL COMMENT '手机号',
`email` varchar(255) NULL COMMENT '邮箱',
`user_id` varchar(255) NOT NULL COMMENT '用户id',
`state` varchar(255) NOT NULL COMMENT '身份源',
UNIQUE INDEX `uni_idx_open_user_identity_id_78b7748`(`user_id`,`open_id`,`identity_id`),
PRIMARY KEY (`id`)
) COMMENT='三方身份信息表';


CREATE TABLE `AppConfig` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`login_role_id` bigint NOT NULL COMMENT '登录默认角色',
`login_identity_type` varchar(255) NOT NULL DEFAULT 'Single' COMMENT '单身份源/多身份源',
`setting_switch` tinyint(1) NOT NULL DEFAULT 0 COMMENT '身份源开关',
`login_page_config` varchar(255) NULL DEFAULT 'Default' COMMENT '登录页配置',
`customize_login_url` varchar(255) NULL COMMENT '自定义登录地址',
`show_photo_url` varchar(255) NULL COMMENT '展示图片地址',
PRIMARY KEY (`id`)
) COMMENT='应用配置表';


CREATE TABLE `IdentitySourceConfig` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`state` varchar(255) NOT NULL COMMENT '身份源',
`icon` varchar(255) NOT NULL COMMENT '身份源图标',
`name` varchar(255) NOT NULL COMMENT '身份源名称',
`app_id` varchar(255) NOT NULL COMMENT '客户端id',
`app_secret` varchar(255) NOT NULL COMMENT '客户端密钥',
`success_url` varchar(1024) NULL COMMENT '登陆成功回调地址',
`type` varchar(255) NOT NULL COMMENT '身份源类型',
`login_enable` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否开启身份源',
`center_login_url` varchar(1024) NULL COMMENT '认证中心登陆地址',
`token_url` varchar(1024) NULL COMMENT '获取token的地址',
`token_method` varchar(255) NULL COMMENT '获取token的请求方法',
`user_url` varchar(1024) NULL COMMENT '获取用户信息的地址',
`user_method` varchar(255) NULL COMMENT '获取用户的请求方式',
`center_logout_url` varchar(1024) NULL COMMENT '认证中心注销地址',
`logout_callback_url` varchar(1024) NULL COMMENT '注销后跳转的地址',
`cas_ticket_url` varchar(1024) NULL COMMENT 'cas服务端ticket校验地址',
`expire` bigint NULL DEFAULT 86400 COMMENT '过期时间',
`redirect_url` varchar(1024) NULL COMMENT '跳转回调的地址',
`agent_id` varchar(255) NULL COMMENT '客户端id',
`token_header_map` text NULL COMMENT 'token请求头',
`token_body_map` text NULL COMMENT 'token请求体',
`user_header_map` text NULL COMMENT 'user请求头',
`user_body_map` text NULL COMMENT 'user请求体',
`user_id_res` varchar(255) NULL COMMENT 'oauth的userid返回格式',
`user_name_res` varchar(255) NULL COMMENT 'oauth的userName返回格式',
`code` varchar(255) NOT NULL COMMENT '身份源的唯一标识',
`sso_url` varchar(1024) NULL COMMENT 'sso免登登录地址',
`wechat_token` varchar(255) NULL COMMENT '令牌',
`wechat_msg_method` varchar(255) NULL COMMENT '消息加解密方式',
`wechat_msg_secret` varchar(255) NULL COMMENT '消息加解密密钥',
UNIQUE INDEX `uni_idx_code_1a9a919`(`code`),
PRIMARY KEY (`id`)
) COMMENT='身份源配置表';


CREATE TABLE `schedule` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`title` varchar(255) NULL COMMENT '标题',
`content` varchar(255) NULL COMMENT '内容',
`create_date` date NULL COMMENT '创建日期',
PRIMARY KEY (`id`)
) COMMENT='日程安排';


CREATE TABLE `per_group_per_mapping` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`per_group_id` bigint NULL COMMENT '权限组id',
`per_id` bigint NULL COMMENT '权限id',
PRIMARY KEY (`id`)
) COMMENT='权限组关联权限表';


CREATE TABLE `permission_group` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`name` varchar(255) NULL COMMENT '权限组名称',
PRIMARY KEY (`id`)
) COMMENT='权限组';


CREATE TABLE `transfer_slip` (
`document_number` varchar(255) NOT NULL COMMENT '单据编号',
`inspector` bigint NULL COMMENT '验收员',
`source_document_number` varchar(255) NULL COMMENT '源单单号',
`request_date` date NULL COMMENT '申请日期',
`summary` varchar(4000) NULL COMMENT '摘要',
`attachment` varchar(4000) NULL COMMENT '附件',
`approval_status` varchar(255) NULL COMMENT '审批状态',
`shipping_clerk` bigint NULL COMMENT '发货员',
`out_warehouse` bigint NULL COMMENT '调出仓库',
`in_warehouse` bigint NULL COMMENT '调入仓库',
`created_by` varchar(255) NULL COMMENT '创建者',
PRIMARY KEY (`document_number`)
) COMMENT='调拨单详情';


CREATE TABLE `transfer_slip_details` (
`id` bigint NOT NULL,
`material_code` varchar(255) NULL COMMENT '物料编码',
`quantity` decimal(31,2) NULL COMMENT '数量',
`notes` varchar(255) NULL COMMENT '备注',
`production_material_requisition` varchar(255) NULL COMMENT '关联单号',
`out_warehouse` bigint NULL COMMENT '调出仓库',
`batch_number` bigint NULL COMMENT '调出批号',
`out_storage_location` varchar(255) NULL COMMENT '库位',
`in_warehouse` bigint NULL COMMENT '调入仓库',
`in_storage_location` varchar(255) NULL COMMENT '调入库位',
`lotNumber` varchar(255) NULL COMMENT '批号',
PRIMARY KEY (`id`)
) COMMENT='调拨单详情';


CREATE TABLE `other_return_storage_details` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`other_in_s_details_id` bigint NULL COMMENT '其他入库详情id',
`quantity` decimal(31,2) NULL COMMENT '退回数量',
`other_return_s_code` varchar(255) NULL COMMENT '其他入库退回单号',
PRIMARY KEY (`id`)
) COMMENT='其他入库退回详情';


CREATE TABLE `other_return_storage` (
`return_code` varchar(255) NOT NULL COMMENT 'returnCode',
`created_time` datetime NULL COMMENT '创建时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_time` datetime NULL COMMENT '更新时间',
`updated_by` varchar(255) NULL COMMENT '更新者',
`state` varchar(255) NULL COMMENT '状态',
`other_in_s_code` varchar(255) NULL COMMENT '其他入库单号',
PRIMARY KEY (`return_code`)
) COMMENT='其他入库退回';


CREATE TABLE `other_in_storage_details` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`other_in_s_code` varchar(255) NULL COMMENT '其他入库单号',
`material_code` varchar(255) NULL COMMENT '物料编号',
`lot_number` varchar(255) NULL COMMENT '批号',
`quantity` decimal(31,2) NULL COMMENT '数量',
`source_code` varchar(255) NULL COMMENT '源单单号',
`warehouse_id` bigint NULL COMMENT '入库仓库',
`remark` varchar(255) NULL COMMENT '备注',
`unreturn_quantity` decimal(31,2) NULL COMMENT '未退货数量',
`storage_location_id` bigint NULL COMMENT '库位',
PRIMARY KEY (`id`)
) COMMENT='其他入库详情';


CREATE TABLE `other_in_storage` (
`code` varchar(255) NOT NULL COMMENT '其他入库单号',
`created_time` datetime NULL COMMENT '创建时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_time` datetime NULL COMMENT '更新时间',
`updated_by` varchar(255) NULL COMMENT '更新者',
`user_id` varchar(255) NULL COMMENT '保管员',
`source_code` varchar(255) NULL COMMENT '源单单号',
`desc` varchar(4000) NULL COMMENT '摘要',
`state` varchar(255) NULL COMMENT '审批状态',
`apply_date` date NULL COMMENT '申请日期',
`delivery_date` date NULL COMMENT '交货日期',
`unit` varchar(255) NULL COMMENT '单位(一期暂时为空)',
`accessory` varchar(4000) NULL COMMENT '附件',
PRIMARY KEY (`code`)
) COMMENT='其他入库';


CREATE TABLE `outsource_return_storage_details` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`outsource_in_s_details_id` bigint NULL COMMENT '委外加工入库详情id',
`quantity` decimal(31,2) NULL COMMENT '退回数量',
`outsource_return_s_code` varchar(255) NULL COMMENT '委外加工入库退回单号',
PRIMARY KEY (`id`)
) COMMENT='委外加工入库退回详情';


CREATE TABLE `outsource_return_storage` (
`return_code` varchar(255) NOT NULL COMMENT 'returnCode',
`created_time` datetime NULL COMMENT '创建时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_time` datetime NULL COMMENT '更新时间',
`updated_by` varchar(255) NULL COMMENT '更新者',
`state` varchar(255) NULL COMMENT '状态',
`outsource_in_s_code` varchar(255) NULL COMMENT '委外加工入库单号',
PRIMARY KEY (`return_code`)
) COMMENT='委外加工入库退回';


CREATE TABLE `production_material_requisition_details` (
`id` bigint NOT NULL,
`material_code` varchar(255) NULL COMMENT '物料编码',
`quantity` decimal(31,2) NULL COMMENT '数量',
`unit_price` decimal(31,2) NULL COMMENT '单价',
`notes` varchar(255) NULL COMMENT '备注',
`production_material_requisition` varchar(255) NULL COMMENT '关联单号',
`warehouse` bigint NULL COMMENT '发货仓库/退回仓库',
`production_material_requisition_id` bigint NULL COMMENT '退货关联明细id',
`batch_number` bigint NULL COMMENT '领取批号id/退回批号',
`total_price` decimal(31,2) NULL COMMENT '总金额',
`source_number` varchar(255) NULL COMMENT '一期不使用',
`storage_location` varchar(255) NULL COMMENT '库位',
`return_quan_tity` decimal(31,2) NULL COMMENT '退货数量',
`source_number_id` bigint NULL COMMENT '关联领料单明细',
PRIMARY KEY (`id`)
) COMMENT='生产领退料详情';


CREATE TABLE `production_material_requisition` (
`document_number` varchar(255) NOT NULL COMMENT '单据编号',
`department` bigint NULL COMMENT '领料部门',
`employee` bigint NULL COMMENT '领料员',
`request_date` date NULL COMMENT '申请日期',
`summary` varchar(4000) NULL COMMENT '摘要',
`attachment` varchar(4000) NULL COMMENT '附件',
`approval_status` varchar(255) NULL COMMENT '审批状态',
`issue_return_distinction` varchar(255) NULL COMMENT '区别字段（领料/退料）',
`guardian` bigint NULL COMMENT '保管员',
`created_by` varchar(255) NULL COMMENT '创建者',
`source_document_number` varchar(255) NULL COMMENT '领料单号',
PRIMARY KEY (`document_number`)
) COMMENT='生产领退料基本信息';


CREATE TABLE `outsource_in_storage_details` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`outsource_in_s_code` varchar(255) NULL COMMENT '委外加工入库单号',
`material_code` varchar(255) NULL COMMENT '物料编号',
`lot_number` varchar(255) NULL COMMENT '批号',
`quantity` decimal(31,2) NULL COMMENT '数量',
`source_code` varchar(255) NULL COMMENT '源单单号',
`warehouse_id` bigint NULL COMMENT '入库出库',
`remark` varchar(255) NULL COMMENT '备注',
`unreturn_quantity` decimal(31,2) NULL COMMENT '未退货数量',
`storage_location_id` bigint NULL COMMENT '库位',
PRIMARY KEY (`id`)
) COMMENT='委外加工入库详情';


CREATE TABLE `outsource_in_storage` (
`code` varchar(255) NOT NULL,
`created_time` datetime NULL COMMENT '创建时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_time` datetime NULL COMMENT '更新时间',
`updated_by` varchar(255) NULL COMMENT '更新者',
`user_id` varchar(255) NULL COMMENT '保管员',
`source_code` varchar(255) NULL COMMENT '源单单号',
`desc` varchar(4000) NULL COMMENT '摘要',
`state` varchar(255) NULL COMMENT '审批状态',
`apply_date` date NULL COMMENT '申请日期',
`delivery_date` date NULL COMMENT '交货日期',
`supplier_id` bigint NULL COMMENT '加工单位(供应商)',
`accessory` varchar(4000) NULL COMMENT '附件',
PRIMARY KEY (`code`)
) COMMENT='委外加工入库';


CREATE TABLE `product_return_storage_details` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`product_in_storage_details_id` bigint NULL COMMENT '产品入库详情id',
`quantity` decimal(31,2) NULL COMMENT '退回数量',
`product_return_storage_code` varchar(255) NULL COMMENT '退回单号',
PRIMARY KEY (`id`)
) COMMENT='产品入库退回详情';


CREATE TABLE `product_return_storage` (
`product_return_code` varchar(255) NOT NULL COMMENT '退回单号',
`created_time` datetime NULL COMMENT '创建时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_time` datetime NULL COMMENT '更新时间',
`updated_by` varchar(255) NULL COMMENT '更新者',
`state` varchar(255) NULL COMMENT '状态',
`product_in_storage_num` varchar(255) NULL COMMENT '产品入库num',
PRIMARY KEY (`product_return_code`)
) COMMENT='产品入库退回';


CREATE TABLE `product_in_storage_details` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`code` varchar(255) NULL COMMENT '入库单号',
`material_code` varchar(255) NULL COMMENT '物料编号',
`lot_number` varchar(255) NULL COMMENT '批号',
`quantity` decimal(31,2) NULL COMMENT '数量',
`source_code` varchar(255) NULL COMMENT '源单单号',
`warehouse_id` bigint NULL COMMENT '入库仓库',
`remark` varchar(255) NULL COMMENT '备注',
`unreturn_quantity` decimal(31,2) NULL COMMENT '未退货数量',
`storage_location_id` bigint NULL COMMENT '库位',
PRIMARY KEY (`id`)
) COMMENT='产品入库详情';


CREATE TABLE `product_in_storage` (
`num` varchar(255) NOT NULL COMMENT '产品入库单号',
`created_time` datetime NULL COMMENT '创建时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_time` datetime NULL COMMENT '更新时间',
`updated_by` varchar(255) NULL COMMENT '更新者',
`user_id` varchar(255) NULL COMMENT '保管员',
`source_code` varchar(255) NULL COMMENT '源单单号',
`desc` varchar(255) NULL COMMENT '摘要',
`state` varchar(255) NULL COMMENT '审批状态',
`apply_date` date NULL COMMENT '申请日期',
`delivery_date` date NULL COMMENT '交货日期',
`department_id` bigint NULL COMMENT '生产车间(部门)',
`accessory` varchar(4000) NULL COMMENT '附件',
PRIMARY KEY (`num`)
) COMMENT='产品入库';


CREATE TABLE `sales_order_details` (
`id` bigint NOT NULL,
`material_code` varchar(255) NULL COMMENT '物料编号',
`quantity` decimal(31,2) NULL COMMENT '数量',
`unit_price` decimal(31,2) NULL COMMENT '单价',
`delivery_date` date NULL COMMENT '交货日期',
`notes` varchar(255) NULL COMMENT '备注',
`sales_order_number` varchar(255) NULL COMMENT '关联销售订单/发货通知单/出库单',
`warehouse` bigint NULL COMMENT '发货仓库/退回仓库',
`quantity_shipped` decimal(31,2) NULL COMMENT '发货数量',
`sales_order_details_id` bigint NULL COMMENT '关联销售单明细/出库单明细',
`batch_number` bigint NULL COMMENT '批号id（发货通知使用）/退回批号',
`outbound_quantity` decimal(31,2) NULL COMMENT '实际出库数量',
`return_quan_tity` decimal(31,2) NULL COMMENT '退货数量',
`available_quantity` decimal(31,2) NULL COMMENT '未入库数量',
PRIMARY KEY (`id`)
);


CREATE TABLE `sales_orders` (
`order_number` varchar(255) NOT NULL COMMENT '销售单号',
`customer` bigint NULL COMMENT '购货单位	',
`salesperson` bigint NULL COMMENT '业务员',
`department` bigint NULL COMMENT '部门',
`request_date` date NULL COMMENT '申请日期',
`summary` varchar(255) NULL COMMENT '摘要	',
`attachment` varchar(255) NULL COMMENT '附件	',
`approval_status` varchar(255) NULL COMMENT '审批状态',
`distinction` varchar(255) NULL COMMENT '发货通知与订单区别',
`warehouse` bigint NULL COMMENT '发货仓库',
`manu_auto` tinyint(1) NULL COMMENT '判断是下推还是手动新增的订单',
`source_number` varchar(255) NULL COMMENT '关联源单单号',
`salesman` varchar(255) NULL COMMENT '退货单业务员',
`created_by` varchar(255) NULL COMMENT '创建者',
PRIMARY KEY (`order_number`)
);


CREATE TABLE `inventory` (
`id` bigint NOT NULL,
`material_code` varchar(255) NOT NULL COMMENT '物料',
`lot_number` varchar(255) NULL COMMENT '批号',
`unit` varchar(255) NOT NULL,
`warehouse` bigint NOT NULL COMMENT '仓库',
`stock_quantity` decimal(31,2) NOT NULL COMMENT '库存数量',
`occupied_quantity` decimal(31,2) NOT NULL COMMENT '暂用数量',
`available_quantity` bigint NOT NULL COMMENT '可用数量',
`created_at` datetime NULL,
`updated_at` datetime NULL,
`location` bigint NULL COMMENT '库位',
PRIMARY KEY (`id`)
) COMMENT='库存表';


CREATE TABLE `goods_returned_note_details` (
`id` bigint NOT NULL COMMENT 'id',
`goods_returned_note` varchar(255) NULL COMMENT '退货单号',
`be_put_in_storage_quantity` decimal(31,2) NULL COMMENT '退货数量',
`material_number` varchar(255) NULL COMMENT '物料编码',
`batch_number` varchar(255) NULL COMMENT '批号',
`be_put_in_storage_details_id` bigint NULL COMMENT '关联的收货单明细',
PRIMARY KEY (`id`)
) COMMENT='退货单明细';


CREATE TABLE `goods_returned_note` (
`goods_returned_note` varchar(255) NOT NULL COMMENT '退货单订单号',
`goods_returned_note_date` date NULL COMMENT '退货日期',
`be_put_in_storage` varchar(255) NULL COMMENT '入库订单号',
`supplier_name` varchar(255) NULL COMMENT '供应商',
`description` varchar(255) NULL COMMENT '说明',
`annex` varchar(4000) NULL COMMENT '附件',
`warehouse` bigint NULL COMMENT '仓库',
`status` varchar(255) NULL COMMENT '状态',
`created_by` varchar(255) NULL COMMENT '创建者',
PRIMARY KEY (`goods_returned_note`)
) COMMENT='退货入库基本信息';


CREATE TABLE `be_put_in_storage` (
`be_put_in_storage_id` varchar(255) NOT NULL COMMENT '入库订单号',
`be_put_in_storage_date` date NULL COMMENT '入库日期',
`order_number` varchar(255) NULL COMMENT '收货订单号',
`supplier_name` varchar(255) NULL COMMENT '供应商',
`description` varchar(255) NULL COMMENT '说明',
`annex` varchar(4000) NULL COMMENT '附件',
`warehouse` bigint NULL COMMENT '仓库',
`created_by` varchar(255) NULL COMMENT '创建者',
PRIMARY KEY (`be_put_in_storage_id`)
) COMMENT='外购入库基本信息';


CREATE TABLE `be_put_in_storage_details` (
`id` bigint NOT NULL COMMENT 'id',
`be_put_in_storage_id` varchar(255) NULL COMMENT '入库单号',
`be_put_in_storage_quantity` bigint NULL COMMENT '入库数量',
`material_number` varchar(255) NULL COMMENT '物料编码',
`receivable_quantity` bigint NULL COMMENT '应收数量',
`batch_number` varchar(255) NULL COMMENT '批号',
`receiving_details_id` bigint NULL COMMENT '收货单明细Id',
PRIMARY KEY (`id`)
) COMMENT='外购入库明细';


CREATE TABLE `receiving_details` (
`id` bigint NOT NULL COMMENT 'id',
`receipt_number` varchar(255) NULL COMMENT '收货单号',
`received_quantity` bigint NULL COMMENT '本次收货数量',
`material_number` varchar(255) NULL COMMENT '物料编码',
`order_detail_id` bigint NULL COMMENT '关联明细Id',
`receivable_quantity` decimal(31,2) NULL COMMENT '应收数量',
PRIMARY KEY (`id`)
);


CREATE TABLE `receiving_notifications` (
`notification_id` varchar(255) NOT NULL COMMENT '收货单号',
`notification_date` date NULL COMMENT '收货日期',
`notification_sender` varchar(255) NULL COMMENT '收货员',
`order_number` varchar(255) NULL COMMENT '订单号',
`supplier_name` varchar(255) NULL COMMENT '供应商',
`description` varchar(255) NULL COMMENT '说明',
`annex` varchar(4000) NULL COMMENT '附件',
PRIMARY KEY (`notification_id`)
);


CREATE TABLE `purchase_order_detail` (
`id` bigint NOT NULL,
`material_code` varchar(255) NULL COMMENT '物料编号',
`order_quantity` decimal(31,2) NULL COMMENT '订单数量',
`price_including_tax` decimal NULL COMMENT '单价（含税）',
`tax_rate` decimal NULL COMMENT '税率',
`related_order_number` varchar(255) NULL COMMENT '关联订单号',
`purchase_details_id` bigint NULL COMMENT '采购申请明细Id',
PRIMARY KEY (`id`)
);


CREATE TABLE `purchase_order` (
`purchaser` varchar(255) NULL COMMENT '采购员',
`order_number` varchar(255) NOT NULL COMMENT '订单号',
`supplier` bigint NULL COMMENT '供应商',
`order_date` date NULL COMMENT '订单日期',
`required_date` date NULL COMMENT '需到货日期',
`approval_status` varchar(255) NULL COMMENT '审批状态',
`execution_status` varchar(255) NULL COMMENT '执行状态',
`description` varchar(255) NULL COMMENT '说明',
`remarks` varchar(255) NULL COMMENT '附件',
`list_puchase_details` text NULL COMMENT '订单下包含的申请单详情',
`manu_auto` tinyint(1) NULL COMMENT '下推还是手动新增的订单',
`created_by` varchar(255) NULL COMMENT '创建者',
`purchase_details_id_list` text NULL COMMENT '采购申请明细订单号',
PRIMARY KEY (`order_number`)
) COMMENT='采购订单';


CREATE TABLE `material_details` (
`material_code` varchar(255) NOT NULL COMMENT '物料编号',
`material_name` varchar(255) NOT NULL COMMENT '物料名称',
`category_id` bigint NOT NULL COMMENT '物料分类',
`specification` varchar(255) NULL COMMENT '规格型号',
`unit` bigint NOT NULL COMMENT '单位',
`description` varchar(255) NULL,
`is_batch_enabled` tinyint(1) NOT NULL DEFAULT 1,
PRIMARY KEY (`material_code`)
);


CREATE TABLE `purchase_details` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`request_quantity` decimal(31,2) NOT NULL COMMENT '申请数量',
`expected_delivery_date` date NOT NULL COMMENT '期望到货日期',
`related_request_number` varchar(255) NULL COMMENT '关联申请单号',
`material_code` varchar(255) NULL COMMENT '物料编码',
`down_quantity` decimal(31,2) NULL DEFAULT 0 COMMENT '已下推数量',
`this_quantity` decimal(31,2) NULL COMMENT '本次下推数量',
`order_status` varchar(255) NULL DEFAULT '2' COMMENT '下单状态',
PRIMARY KEY (`id`)
) COMMENT='采购明细';


CREATE TABLE `department` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`department__name` varchar(255) NULL COMMENT '部门名称',
`parent_id` bigint NULL COMMENT '上级部门id',
PRIMARY KEY (`id`)
) COMMENT='部门实体';


CREATE TABLE `purchase_request` (
`title` varchar(255) NULL COMMENT '标题',
`request_number` varchar(255) NOT NULL COMMENT '单号',
`department` bigint NULL COMMENT '部门',
`request_reason` varchar(4000) NULL COMMENT '申请原因',
`annex` mediumtext NULL COMMENT '附件',
`created_by` varchar(255) NULL COMMENT '创建者',
`approval_status` varchar(255) NULL COMMENT '审批状态',
`application_date` date NULL COMMENT '申请日期',
PRIMARY KEY (`request_number`)
);


CREATE TABLE `storage_location` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`location_code` varchar(255) NULL COMMENT '库位编码',
`location_name` varchar(255) NULL COMMENT '库位名称',
`warehouse_codetwo_id` bigint NULL COMMENT '所属二级仓库Id',
`description` varchar(255) NULL COMMENT '描述',
PRIMARY KEY (`id`)
) COMMENT='库位';


CREATE TABLE `warehouse_level_two` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`warehouse_code` varchar(255) NULL COMMENT '二级仓库编码',
`warehouse_name` varchar(255) NULL COMMENT '二级仓库名称',
`parent_warehouse__id` bigint NULL COMMENT '关联一级仓库',
`address` varchar(255) NULL COMMENT '地址',
`remark` varchar(255) NULL COMMENT '备注',
`warehouse_manager` bigint NULL COMMENT '仓库管理员',
`detailed_address` varchar(255) NULL COMMENT '详细地址',
PRIMARY KEY (`id`)
) COMMENT='二级仓库';


CREATE TABLE `warehouse_level` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`warehouse_code` varchar(255) NULL COMMENT '仓库编码',
`warehouse_name` varchar(255) NULL COMMENT '仓库名称',
`warehouse_manager` bigint NULL COMMENT '仓库管理员',
PRIMARY KEY (`id`)
) COMMENT='一级仓库';


CREATE TABLE `material` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`category_name` varchar(255) NULL COMMENT '物料分类',
`category_code` varchar(255) NULL COMMENT '分类编码',
`parent_category_id` bigint NULL COMMENT '上级分类',
PRIMARY KEY (`id`)
) COMMENT='物料分类实体';


CREATE TABLE `supplier_details` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`supplier_code` varchar(255) NULL COMMENT '供应商编码',
`supplier_name` varchar(255) NULL COMMENT '供应商名称',
`credit_code` varchar(255) NULL COMMENT '统一社会信用代码',
`supplier_category` varchar(255) NULL COMMENT '供应商分类',
`address` varchar(255) NULL COMMENT '地址',
`detailed_address` varchar(255) NULL COMMENT '详细地址',
`remark` varchar(255) NULL COMMENT '备注',
`contact_information` text NULL COMMENT '联系人信息',
`bank` text NULL COMMENT '开户银行',
`supplier` bigint NULL COMMENT '关联分类',
PRIMARY KEY (`id`)
) COMMENT='供应商详情';


CREATE TABLE `supplier` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`supplier_type` varchar(255) NULL COMMENT '供应商分类',
`category_code` varchar(255) NULL COMMENT '分类编码',
`parent_category` bigint NULL COMMENT '上级分类',
PRIMARY KEY (`id`)
) COMMENT='供应商分类实体';


CREATE TABLE `customer_management` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`customer_code` varchar(255) NULL COMMENT '客户编码',
`customer_name` varchar(255) NULL COMMENT '客户名称',
`link_man` varchar(255) NULL COMMENT '联系人',
`contact_number` varchar(255) NULL COMMENT '联系电话',
`address` varchar(255) NULL COMMENT '联系地址',
`detailed_address` varchar(255) NULL COMMENT '详细地址',
PRIMARY KEY (`id`)
) COMMENT='客户管理';


CREATE TABLE `measuring_unit` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`unit_code` varchar(255) NULL COMMENT '单位编码',
`unit_name` varchar(255) NULL COMMENT '单位名称',
PRIMARY KEY (`id`)
) COMMENT='计量单位实体';


CREATE TABLE `lcap_logic_view_mapping_a6d592` (
`id` bigint NOT NULL COMMENT '主键',
`logic_identifier` varchar(255) NOT NULL COMMENT '/api/logic1:GET',
`resource_name` varchar(255) NOT NULL COMMENT '/dashboard/button1',
`resource_type` varchar(255) NOT NULL COMMENT '页面-page 组件-component 逻辑-logic',
`group` bigint NOT NULL COMMENT '值一样的为同一组',
`change_time` bigint NULL COMMENT '创建时间',
PRIMARY KEY (`id`)
) COMMENT='记录应用全局逻辑与页面资源的关联关系';


CREATE TABLE `lcap_user_a6d592` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`user_id` varchar(255) NOT NULL COMMENT '第三方登录方式唯一id；普通登录使用userName+source作为userId',
`user_name` varchar(255) NOT NULL COMMENT '普通登录用户名，类似账号的概念',
`password` varchar(255) NULL COMMENT '普通登录密码，密码建议加密存储。第三方登录不会存储密码',
`phone` varchar(255) NULL COMMENT '手机号',
`email` varchar(255) NULL COMMENT '邮箱',
`display_name` varchar(255) NULL COMMENT '展示的名称',
`status` varchar(255) NULL DEFAULT 'Normal' COMMENT '状态，标识当前用户的状态是什么',
`source` varchar(255) NOT NULL DEFAULT 'Normal' COMMENT '当前条用户数据来自哪个用户源，如普通登录、微信登录',
`department__id` bigint NULL COMMENT '组织id',
`direct_leader_id` varchar(255) NULL COMMENT '上级领导',
`is_first_login` tinyint(1) NULL DEFAULT 1 COMMENT '用于判断是否管理员第一次登录',
PRIMARY KEY (`id`)
) COMMENT='制品应用的用户实体。
1 实体名称不允许改动
2 默认生成的字段不允许改动
3 可新增自定义字段（避免设置为非空且无默认值）';


CREATE TABLE `lcap_role_per_mapping_a6d592` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`role_id` bigint NOT NULL COMMENT '角色唯一ID',
`permission_id` bigint NOT NULL COMMENT '权限唯一ID',
PRIMARY KEY (`id`)
) COMMENT='角色权限关联实体。新增角色一般需要新增角色对应的权限。默认生成的字段不允许改动，可新增自定义字段。';


CREATE TABLE `lcap_per_res_mapping_a6d592` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`permission_id` bigint NOT NULL COMMENT '权限唯一ID',
`resource_id` bigint NOT NULL COMMENT '资源唯一ID',
PRIMARY KEY (`id`)
) COMMENT='权限与资源的关联实体。一组权限会包含若干资源路径，权限对应角色。为角色绑定移除资源需操作该表。默认字段不允许改动，可新增字段。';


CREATE TABLE `lcap_user_role_mapping_a6d592` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`user_id` varchar(255) NOT NULL COMMENT '用户唯一ID',
`role_id` bigint NOT NULL COMMENT '角色唯一ID',
`user_name` varchar(255) NULL COMMENT '用户名',
`source` varchar(255) NULL COMMENT '用户来源',
UNIQUE INDEX `uid_rid_uniqueidx_449989a`(`user_id`,`role_id`),
PRIMARY KEY (`id`)
) COMMENT='用户与角色关联实体。操作该表可完成为角色添加成员、移除角色成员等。默认生成的字段不允许改动，可新增自定义字段。';


CREATE TABLE `lcap_role_a6d592` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`uuid` varchar(255) NULL COMMENT '唯一标识',
`name` varchar(255) NOT NULL COMMENT '角色名',
`description` varchar(255) NULL COMMENT '角色描述',
`role_status` tinyint(1) NULL DEFAULT 1 COMMENT '角色状态，可配置true启用，false禁用。',
`editable` tinyint(1) NULL DEFAULT 1 COMMENT '系统字段，请勿修改。web新增为可编辑true，ide新增为不可编辑false。',
`view_data_permission` varchar(255) NULL COMMENT '查看数据权限',
`edit_data_permission` varchar(255) NULL COMMENT '编辑数据权限',
PRIMARY KEY (`id`)
) COMMENT='用户与角色关联实体。操作该表可完成为角色添加成员、移除角色成员等。默认生成的字段不允许改动，可新增自定义字段。';


CREATE TABLE `lcap_permission_a6d592` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`uuid` varchar(255) NULL COMMENT '唯一标识',
`name` varchar(255) NOT NULL COMMENT '权限名称',
`description` varchar(255) NULL COMMENT '权限描述',
PRIMARY KEY (`id`)
) COMMENT='权限实体。新增角色的同时要一般需要绑定角色对应的权限。默认生成的字段不允许改动，可新增自定义字段。';


CREATE TABLE `lcap_resource_a6d592` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`uuid` varchar(255) NULL COMMENT '唯一标识',
`name` varchar(255) NOT NULL COMMENT '资源路径，如/test/api',
`description` varchar(255) NULL COMMENT '资源描述',
`type` varchar(255) NULL COMMENT '资源类型',
`client_type` varchar(255) NULL COMMENT '端标识',
PRIMARY KEY (`id`)
) COMMENT='资源实体。该表的数据是新建组件后，系统自动上报的。name字段对应资源路径。默认生成的字段不允许改动，可新增自定义字段。';


CREATE TABLE `lcap_user_dept_mapping_a6d592` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`user_id` varchar(255) NULL COMMENT '用户ID',
`dept_id` varchar(255) NULL COMMENT '部门标识',
`is_dept_leader` bigint NULL DEFAULT 0 COMMENT '是否是部门主管',
PRIMARY KEY (`id`)
) COMMENT='用户与部门关联实体。操作该表可完成为部门添加用户、移除部门用户等。默认生成的字段不允许改动，可新增自定义字段。';


CREATE TABLE `lcap_department_a6d592` (
`id` bigint NOT NULL COMMENT '主键',
`created_time` datetime NULL COMMENT '创建时间',
`updated_time` datetime NULL COMMENT '更新时间',
`created_by` varchar(255) NULL COMMENT '创建者',
`updated_by` varchar(255) NULL COMMENT '更新者',
`name` varchar(255) NULL COMMENT '部门名称',
`dept_id` varchar(255) NULL COMMENT '部门标识',
`parent_dept_id` varchar(255) NULL COMMENT '父部门标识',
UNIQUE INDEX `deptIdIndex_8ac4b54`(`dept_id`),
PRIMARY KEY (`id`)
) COMMENT='部门实体。新增部门的同时一般需要指定上一级部门。默认生成的字段不允许改动，可新增自定义字段。';


/* 流程默认表 */
CREATE TABLE `PA6D592C_FLW_RU_BATCH` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`TYPE_` varchar(64) NOT NULL,
`SEARCH_KEY_` varchar(255) NULL,
`SEARCH_KEY2_` varchar(255) NULL,
`CREATE_TIME_` datetime NOT NULL,
`COMPLETE_TIME_` datetime NULL,
`STATUS_` varchar(255) NULL,
`BATCH_DOC_ID_` varchar(64) NULL,
`TENANT_ID_` varchar(255) NULL,
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_FLW_RU_BATCH_PART` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`BATCH_ID_` varchar(64) NULL,
`TYPE_` varchar(64) NOT NULL,
`SCOPE_ID_` varchar(64) NULL,
`SUB_SCOPE_ID_` varchar(64) NULL,
`SCOPE_TYPE_` varchar(64) NULL,
`SEARCH_KEY_` varchar(255) NULL,
`SEARCH_KEY2_` varchar(255) NULL,
`CREATE_TIME_` datetime NOT NULL,
`COMPLETE_TIME_` datetime NULL,
`STATUS_` varchar(255) NULL,
`RESULT_DOC_ID_` varchar(64) NULL,
`TENANT_ID_` varchar(255) NULL,
INDEX `PA6D592C_IDX_BATCH_PART`(`BATCH_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RU_HISTORY_JOB` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`LOCK_EXP_TIME_` timestamp NULL DEFAULT NULL,
`LOCK_OWNER_` varchar(255) NULL,
`RETRIES_` int NULL,
`EXCEPTION_STACK_ID_` varchar(64) NULL,
`EXCEPTION_MSG_` varchar(4000) NULL,
`HANDLER_TYPE_` varchar(255) NULL,
`HANDLER_CFG_` varchar(4000) NULL,
`CUSTOM_VALUES_ID_` varchar(64) NULL,
`ADV_HANDLER_CFG_ID_` varchar(64) NULL,
`CREATE_TIME_` timestamp NULL DEFAULT NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`TENANT_ID_` varchar(255) NULL,
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RU_ENTITYLINK` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`CREATE_TIME_` datetime NULL,
`LINK_TYPE_` varchar(255) NULL,
`SCOPE_ID_` varchar(255) NULL,
`SUB_SCOPE_ID_` varchar(255) NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`SCOPE_DEFINITION_ID_` varchar(255) NULL,
`PARENT_ELEMENT_ID_` varchar(255) NULL,
`REF_SCOPE_ID_` varchar(255) NULL,
`REF_SCOPE_TYPE_` varchar(255) NULL,
`REF_SCOPE_DEFINITION_ID_` varchar(255) NULL,
`ROOT_SCOPE_ID_` varchar(255) NULL,
`ROOT_SCOPE_TYPE_` varchar(255) NULL,
`HIERARCHY_TYPE_` varchar(255) NULL,
INDEX `PA6D592C_IDX_ENT_SCOPE`(`SCOPE_ID_`,`SCOPE_TYPE_`,`LINK_TYPE_`),
INDEX `PA6D592C_IDX_ENT_REF_SCOPE`(`REF_SCOPE_ID_`,`REF_SCOPE_TYPE_`,`LINK_TYPE_`),
INDEX `PA6D592C_IDX_ENT_ROOT_SCOPE`(`ROOT_SCOPE_ID_`,`ROOT_SCOPE_TYPE_`,`LINK_TYPE_`),
INDEX `PA6D592C_IDX_ENT_SCOPE_DEF`(`SCOPE_DEFINITION_ID_`,`SCOPE_TYPE_`,`LINK_TYPE_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RU_ACTINST` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL DEFAULT 1,
`PROC_DEF_ID_` varchar(64) NOT NULL,
`PROC_INST_ID_` varchar(64) NOT NULL,
`EXECUTION_ID_` varchar(64) NOT NULL,
`ACT_ID_` varchar(255) NOT NULL,
`TASK_ID_` varchar(64) NULL,
`CALL_PROC_INST_ID_` varchar(64) NULL,
`ACT_NAME_` varchar(255) NULL,
`ACT_TYPE_` varchar(255) NOT NULL,
`ASSIGNEE_` varchar(255) NULL,
`START_TIME_` datetime NOT NULL,
`END_TIME_` datetime NULL,
`DURATION_` bigint(20) NULL,
`TRANSACTION_ORDER_` int NULL,
`DELETE_REASON_` varchar(4000) NULL,
`TENANT_ID_` varchar(255) NULL,
INDEX `PA6D592C_IDX_ACTI_START`(`START_TIME_`),
INDEX `PA6D592C_IDX_ACTI_END`(`END_TIME_`),
INDEX `PA6D592C_IDX_ACTI_PROC`(`PROC_INST_ID_`),
INDEX `PA6D592C_IDX_ACTI_PROC_ACT`(`PROC_INST_ID_`,`ACT_ID_`),
INDEX `PA6D592C_IDX_ACTI_EXEC`(`EXECUTION_ID_`),
INDEX `PA6D592C_IDX_ACTI_EXEC_ACT`(`EXECUTION_ID_`,`ACT_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RE_PROCDEF` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`CATEGORY_` varchar(255) NULL,
`NAME_` varchar(255) NULL,
`KEY_` varchar(255) NOT NULL,
`VERSION_` int NOT NULL,
`DEPLOYMENT_ID_` varchar(64) NULL,
`RESOURCE_NAME_` varchar(3000) NULL,
`DGRM_RESOURCE_NAME_` varchar(3000) NULL,
`DESCRIPTION_` varchar(3000) NULL,
`HAS_START_FORM_KEY_` tinyint(1) NULL,
`HAS_GRAPHICAL_NOTATION_` tinyint(1) NULL,
`SUSPENSION_STATE_` int NULL,
`TENANT_ID_` varchar(255) NULL,
`ENGINE_VERSION_` varchar(255) NULL,
`DERIVED_FROM_` varchar(64) NULL,
`DERIVED_FROM_ROOT_` varchar(64) NULL,
`DERIVED_VERSION_` int NOT NULL DEFAULT 0,
`CONFIG_` varchar(4000) NULL,
UNIQUE INDEX `PA6D592C_ACT_UNIQ_PROCDEF`(`KEY_`,`VERSION_`,`DERIVED_VERSION_`,`TENANT_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RU_EXECUTION` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`PROC_INST_ID_` varchar(64) NULL,
`BUSINESS_KEY_` varchar(255) NULL,
`PARENT_ID_` varchar(64) NULL,
`PROC_DEF_ID_` varchar(64) NULL,
`SUPER_EXEC_` varchar(64) NULL,
`ROOT_PROC_INST_ID_` varchar(64) NULL,
`ACT_ID_` varchar(255) NULL,
`IS_ACTIVE_` tinyint(1) NULL,
`IS_CONCURRENT_` tinyint(1) NULL,
`IS_SCOPE_` tinyint(1) NULL,
`IS_EVENT_SCOPE_` tinyint(1) NULL,
`IS_MI_ROOT_` tinyint(1) NULL,
`SUSPENSION_STATE_` int NULL,
`CACHED_ENT_STATE_` int NULL,
`TENANT_ID_` varchar(255) NULL,
`NAME_` varchar(255) NULL,
`START_ACT_ID_` varchar(255) NULL,
`START_TIME_` datetime NULL,
`START_USER_ID_` varchar(255) NULL,
`LOCK_TIME_` timestamp NULL DEFAULT NULL,
`LOCK_OWNER_` varchar(255) NULL,
`IS_COUNT_ENABLED_` tinyint(1) NULL,
`EVT_SUBSCR_COUNT_` int NULL,
`TASK_COUNT_` int NULL,
`JOB_COUNT_` int NULL,
`TIMER_JOB_COUNT_` int NULL,
`SUSP_JOB_COUNT_` int NULL,
`DEADLETTER_JOB_COUNT_` int NULL,
`EXTERNAL_WORKER_JOB_COUNT_` int NULL,
`VAR_COUNT_` int NULL,
`ID_LINK_COUNT_` int NULL,
`CALLBACK_ID_` varchar(255) NULL,
`CALLBACK_TYPE_` varchar(255) NULL,
`REFERENCE_ID_` varchar(255) NULL,
`REFERENCE_TYPE_` varchar(255) NULL,
`PROPAGATED_STAGE_INST_ID_` varchar(255) NULL,
INDEX `PA6D592C_IDX_EXEC_BUSKEY`(`BUSINESS_KEY_`),
INDEX `PA6D592C_IDX_EXEC_ROOT`(`ROOT_PROC_INST_ID_`),
INDEX `PA6D592C_IDX_EXE_PROCINST`(`PROC_INST_ID_`),
INDEX `PA6D592C_IDX_EXE_PARENT`(`PARENT_ID_`),
INDEX `PA6D592C_IDX_EXE_SUPER`(`SUPER_EXEC_`),
INDEX `PA6D592C_IDX_EXE_PROCDEF`(`PROC_DEF_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RU_EVENT_SUBSCR` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`EVENT_TYPE_` varchar(255) NOT NULL,
`EVENT_NAME_` varchar(255) NULL,
`EXECUTION_ID_` varchar(64) NULL,
`PROC_INST_ID_` varchar(64) NULL,
`ACTIVITY_ID_` varchar(64) NULL,
`CONFIGURATION_` varchar(255) NULL,
`CREATED_` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
`PROC_DEF_ID_` varchar(64) NULL,
`SUB_SCOPE_ID_` varchar(64) NULL,
`SCOPE_ID_` varchar(64) NULL,
`SCOPE_DEFINITION_ID_` varchar(64) NULL,
`SCOPE_TYPE_` varchar(64) NULL,
`TENANT_ID_` varchar(255) NULL,
INDEX `PA6D592C_IDX_EVENT_CONFIG`(`CONFIGURATION_`),
INDEX `PA6D592C_IDX_EVENT_EXEC`(`EXECUTION_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RU_TASK` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`EXECUTION_ID_` varchar(64) NULL,
`PROC_INST_ID_` varchar(64) NULL,
`PROC_DEF_ID_` varchar(64) NULL,
`TASK_DEF_ID_` varchar(64) NULL,
`SCOPE_ID_` varchar(255) NULL,
`SUB_SCOPE_ID_` varchar(255) NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`SCOPE_DEFINITION_ID_` varchar(255) NULL,
`PROPAGATED_STAGE_INST_ID_` varchar(255) NULL,
`NAME_` varchar(255) NULL,
`PARENT_TASK_ID_` varchar(64) NULL,
`DESCRIPTION_` varchar(4000) NULL,
`TASK_DEF_KEY_` varchar(255) NULL,
`OWNER_` varchar(255) NULL,
`ASSIGNEE_` varchar(255) NULL,
`DELEGATION_` varchar(64) NULL,
`PRIORITY_` int NULL,
`CREATE_TIME_` timestamp NULL DEFAULT NULL,
`DUE_DATE_` datetime NULL,
`CATEGORY_` varchar(255) NULL,
`SUSPENSION_STATE_` int NULL,
`TENANT_ID_` varchar(255) NULL,
`FORM_KEY_` varchar(255) NULL,
`CLAIM_TIME_` datetime NULL,
`IS_COUNT_ENABLED_` tinyint(1) NULL,
`VAR_COUNT_` int NULL,
`ID_LINK_COUNT_` int NULL,
`SUB_TASK_COUNT_` int NULL,
INDEX `PA6D592C_IDX_RU_TASK_CREATE`(`CREATE_TIME_`),
INDEX `PA6D592C_IDX_RU_TASK_SCOPE`(`SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_RU_TASK_SUB`(`SUB_SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_RU_TASK_DEF`(`SCOPE_DEFINITION_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_RU_TASK_EXE`(`EXECUTION_ID_`),
INDEX `PA6D592C_IDX_RU_TASK_INST`(`PROC_INST_ID_`),
INDEX `PA6D592C_IDX_RU_TASK_PROCDEF`(`PROC_DEF_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RU_IDENTITYLINK` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`GROUP_ID_` varchar(255) NULL,
`TYPE_` varchar(255) NULL,
`USER_ID_` varchar(255) NULL,
`TASK_ID_` varchar(64) NULL,
`PROC_INST_ID_` varchar(64) NULL,
`PROC_DEF_ID_` varchar(64) NULL,
`SCOPE_ID_` varchar(255) NULL,
`SUB_SCOPE_ID_` varchar(255) NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`SCOPE_DEFINITION_ID_` varchar(255) NULL,
INDEX `PA6D592C_IDX_IDENT_USER`(`USER_ID_`),
INDEX `PA6D592C_IDX_IDENT_GROUP`(`GROUP_ID_`),
INDEX `PA6D592C_IDX_IDENT_SCOPE`(`SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_IDENT_SUB_SCOPE`(`SUB_SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_IDENT_SCOPE_DEF`(`SCOPE_DEFINITION_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_ATHRZ_PROCEDEF`(`PROC_DEF_ID_`),
INDEX `PA6D592C_IDX_TSKASS_TASK`(`TASK_ID_`),
INDEX `PA6D592C_IDX_IDL_PROCINST`(`PROC_INST_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RE_DEPLOYMENT` (
`ID_` varchar(64) NOT NULL,
`NAME_` varchar(255) NULL,
`CATEGORY_` varchar(255) NULL,
`KEY_` varchar(255) NULL,
`TENANT_ID_` varchar(255) NULL,
`DEPLOY_TIME_` timestamp NULL DEFAULT NULL,
`DERIVED_FROM_` varchar(64) NULL,
`DERIVED_FROM_ROOT_` varchar(64) NULL,
`PARENT_DEPLOYMENT_ID_` varchar(255) NULL,
`ENGINE_VERSION_` varchar(255) NULL,
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_HI_VARINST` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL DEFAULT 1,
`PROC_INST_ID_` varchar(64) NULL,
`EXECUTION_ID_` varchar(64) NULL,
`TASK_ID_` varchar(64) NULL,
`NAME_` varchar(255) NOT NULL,
`VAR_TYPE_` varchar(100) NULL,
`SCOPE_ID_` varchar(255) NULL,
`SUB_SCOPE_ID_` varchar(255) NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`BYTEARRAY_ID_` varchar(64) NULL,
`DOUBLE_` double NULL,
`LONG_` bigint(20) NULL,
`TEXT_` varchar(4000) NULL,
`TEXT2_` varchar(4000) NULL,
`CREATE_TIME_` datetime NULL,
`LAST_UPDATED_TIME_` datetime NULL,
INDEX `PA6D592C_IDX_VAR_NAME_TYPE`(`NAME_`,`VAR_TYPE_`),
INDEX `PA6D592C_IDX_VAR_SCOPE`(`SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_VAR_SUB_SCOPE`(`SUB_SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_VAR_PROC_INST`(`PROC_INST_ID_`),
INDEX `PA6D592C_IDX_VAR_TASK_ID`(`TASK_ID_`),
INDEX `PA6D592C_IDX_VAR_EXE`(`EXECUTION_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_HI_TSK_LOG` (
`ID_` bigint(20) NOT NULL AUTO_INCREMENT,
`TYPE_` varchar(64) NULL,
`TASK_ID_` varchar(64) NOT NULL,
`TIME_STAMP_` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
`USER_ID_` varchar(255) NULL,
`DATA_` varchar(4000) NULL,
`EXECUTION_ID_` varchar(64) NULL,
`PROC_INST_ID_` varchar(64) NULL,
`PROC_DEF_ID_` varchar(64) NULL,
`SCOPE_ID_` varchar(255) NULL,
`SCOPE_DEFINITION_ID_` varchar(255) NULL,
`SUB_SCOPE_ID_` varchar(255) NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`TENANT_ID_` varchar(255) NULL,
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_HI_TASKINST` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL DEFAULT 1,
`PROC_DEF_ID_` varchar(64) NULL,
`TASK_DEF_ID_` varchar(64) NULL,
`TASK_DEF_KEY_` varchar(255) NULL,
`PROC_INST_ID_` varchar(64) NULL,
`EXECUTION_ID_` varchar(64) NULL,
`SCOPE_ID_` varchar(255) NULL,
`SUB_SCOPE_ID_` varchar(255) NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`SCOPE_DEFINITION_ID_` varchar(255) NULL,
`PROPAGATED_STAGE_INST_ID_` varchar(255) NULL,
`NAME_` varchar(255) NULL,
`PARENT_TASK_ID_` varchar(64) NULL,
`DESCRIPTION_` varchar(4000) NULL,
`OWNER_` varchar(255) NULL,
`ASSIGNEE_` varchar(255) NULL,
`START_TIME_` datetime NOT NULL,
`CLAIM_TIME_` datetime NULL,
`END_TIME_` datetime NULL,
`DURATION_` bigint(20) NULL,
`DELETE_REASON_` varchar(4000) NULL,
`PRIORITY_` int NULL,
`DUE_DATE_` datetime NULL,
`FORM_KEY_` varchar(255) NULL,
`CATEGORY_` varchar(255) NULL,
`TENANT_ID_` varchar(255) NULL,
`LAST_UPDATED_TIME_` datetime NULL,
INDEX `PA6D592C_IDX_TASK_SCOPE`(`SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_TASK_SUB_SCOPE`(`SUB_SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_TASK_SCOPE_DEF`(`SCOPE_DEFINITION_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_TASK_PROC_INST`(`PROC_INST_ID_`),
INDEX `PA6D592C_IDX_TASK_START`(`START_TIME_`),
INDEX `PA6D592C_IDX_TASK_END`(`END_TIME_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_HI_PROCINST` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL DEFAULT 1,
`PROC_INST_ID_` varchar(64) NOT NULL,
`BUSINESS_KEY_` varchar(255) NULL,
`PROC_DEF_ID_` varchar(64) NOT NULL,
`START_TIME_` datetime NOT NULL,
`END_TIME_` datetime NULL,
`DURATION_` bigint(20) NULL,
`START_USER_ID_` varchar(255) NULL,
`START_ACT_ID_` varchar(255) NULL,
`END_ACT_ID_` varchar(255) NULL,
`SUPER_PROCESS_INSTANCE_ID_` varchar(64) NULL,
`DELETE_REASON_` varchar(4000) NULL,
`TENANT_ID_` varchar(255) NULL,
`NAME_` varchar(255) NULL,
`CALLBACK_ID_` varchar(255) NULL,
`CALLBACK_TYPE_` varchar(255) NULL,
`REFERENCE_ID_` varchar(255) NULL,
`REFERENCE_TYPE_` varchar(255) NULL,
`PROPAGATED_STAGE_INST_ID_` varchar(255) NULL,
UNIQUE INDEX `PA6D592C_UNIQUE_PROC_INST_ID_`(`PROC_INST_ID_`),
INDEX `PA6D592C_IDX_HI_PRO_END`(`END_TIME_`),
INDEX `PA6D592C_IDX_HI_PRO_BUSKEY`(`BUSINESS_KEY_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_HI_IDENTITYLINK` (
`ID_` varchar(64) NOT NULL,
`GROUP_ID_` varchar(255) NULL,
`TYPE_` varchar(255) NULL,
`USER_ID_` varchar(255) NULL,
`TASK_ID_` varchar(64) NULL,
`CREATE_TIME_` datetime NULL,
`PROC_INST_ID_` varchar(64) NULL,
`SCOPE_ID_` varchar(255) NULL,
`SUB_SCOPE_ID_` varchar(255) NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`SCOPE_DEFINITION_ID_` varchar(255) NULL,
INDEX `PA6D592C_IDX_HI_IDENT_USER`(`USER_ID_`),
INDEX `PA6D592C_IDX_HI_IDENT_SCOPE`(`SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_HI_IDENT_SUB`(`SUB_SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_HI_IDENT_DEF`(`SCOPE_DEFINITION_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_HI_IDENT_TASK`(`TASK_ID_`),
INDEX `PA6D592C_IDX_HI_IDENT_INST`(`PROC_INST_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_HI_ENTITYLINK` (
`ID_` varchar(64) NOT NULL,
`LINK_TYPE_` varchar(255) NULL,
`CREATE_TIME_` datetime NULL,
`SCOPE_ID_` varchar(255) NULL,
`SUB_SCOPE_ID_` varchar(255) NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`SCOPE_DEFINITION_ID_` varchar(255) NULL,
`PARENT_ELEMENT_ID_` varchar(255) NULL,
`REF_SCOPE_ID_` varchar(255) NULL,
`REF_SCOPE_TYPE_` varchar(255) NULL,
`REF_SCOPE_DEFINITION_ID_` varchar(255) NULL,
`ROOT_SCOPE_ID_` varchar(255) NULL,
`ROOT_SCOPE_TYPE_` varchar(255) NULL,
`HIERARCHY_TYPE_` varchar(255) NULL,
INDEX `PA6D592C_IDX_HI_ENT_SCOPE`(`SCOPE_ID_`,`SCOPE_TYPE_`,`LINK_TYPE_`),
INDEX `PA6D592C_IDX_HI_ENT_REF`(`REF_SCOPE_ID_`,`REF_SCOPE_TYPE_`,`LINK_TYPE_`),
INDEX `PA6D592C_IDX_HI_ENT_ROOT`(`ROOT_SCOPE_ID_`,`ROOT_SCOPE_TYPE_`,`LINK_TYPE_`),
INDEX `PA6D592C_IDX_HI_ENT_DEF`(`SCOPE_DEFINITION_ID_`,`SCOPE_TYPE_`,`LINK_TYPE_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_HI_DETAIL` (
`ID_` varchar(64) NOT NULL,
`TYPE_` varchar(255) NOT NULL,
`PROC_INST_ID_` varchar(64) NULL,
`EXECUTION_ID_` varchar(64) NULL,
`TASK_ID_` varchar(64) NULL,
`ACT_INST_ID_` varchar(64) NULL,
`NAME_` varchar(255) NOT NULL,
`VAR_TYPE_` varchar(255) NULL,
`REV_` int NULL,
`TIME_` datetime NOT NULL,
`BYTEARRAY_ID_` varchar(64) NULL,
`DOUBLE_` double NULL,
`LONG_` bigint(20) NULL,
`TEXT_` varchar(4000) NULL,
`TEXT2_` varchar(4000) NULL,
INDEX `PA6D592C_IDX_DETAIL_PROC`(`PROC_INST_ID_`),
INDEX `PA6D592C_IDX_DETAIL_ACT`(`ACT_INST_ID_`),
INDEX `PA6D592C_IDX_DETAIL_TIME`(`TIME_`),
INDEX `PA6D592C_IDX_DETAIL_NAME`(`NAME_`),
INDEX `PA6D592C_IDX_DETAIL_TASK`(`TASK_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_HI_COMMENT` (
`ID_` varchar(64) NOT NULL,
`TYPE_` varchar(255) NULL,
`TIME_` datetime NOT NULL,
`USER_ID_` varchar(255) NULL,
`TASK_ID_` varchar(64) NULL,
`PROC_INST_ID_` varchar(64) NULL,
`ACTION_` varchar(255) NULL,
`MESSAGE_` varchar(4000) NULL,
`FULL_MSG_` longblob NULL,
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_HI_ATTACHMENT` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`USER_ID_` varchar(255) NULL,
`NAME_` varchar(255) NULL,
`DESCRIPTION_` varchar(4000) NULL,
`TYPE_` varchar(255) NULL,
`TASK_ID_` varchar(64) NULL,
`PROC_INST_ID_` varchar(64) NULL,
`URL_` varchar(4000) NULL,
`CONTENT_ID_` varchar(64) NULL,
`TIME_` datetime NULL,
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_HI_ACTINST` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL DEFAULT 1,
`PROC_DEF_ID_` varchar(64) NOT NULL,
`PROC_INST_ID_` varchar(64) NOT NULL,
`EXECUTION_ID_` varchar(64) NOT NULL,
`ACT_ID_` varchar(255) NOT NULL,
`TASK_ID_` varchar(64) NULL,
`CALL_PROC_INST_ID_` varchar(64) NULL,
`ACT_NAME_` varchar(255) NULL,
`ACT_TYPE_` varchar(255) NOT NULL,
`ASSIGNEE_` varchar(255) NULL,
`START_TIME_` datetime NOT NULL,
`END_TIME_` datetime NULL,
`TRANSACTION_ORDER_` int NULL,
`DURATION_` bigint(20) NULL,
`DELETE_REASON_` varchar(4000) NULL,
`TENANT_ID_` varchar(255) NULL,
INDEX `PA6D592C_IDX_ACT_INST_START`(`START_TIME_`),
INDEX `PA6D592C_IDX_ACT_INST_END`(`END_TIME_`),
INDEX `PA6D592C_IDX_ACT_INST_PROC`(`PROC_INST_ID_`,`ACT_ID_`),
INDEX `PA6D592C_IDX_ACT_INST_EXEC`(`EXECUTION_ID_`,`ACT_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_GE_PROPERTY` (
`NAME_` varchar(64) NOT NULL,
`VALUE_` varchar(300) NULL,
`REV_` int NULL,
PRIMARY KEY (`NAME_`)
);


CREATE TABLE `PA6D592C_ACT_GE_BYTEARRAY` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`NAME_` varchar(255) NULL,
`DEPLOYMENT_ID_` varchar(64) NULL,
`BYTES_` longblob NULL,
`GENERATED_` tinyint(1) NULL,
INDEX `PA6D592C_IDX_BYTEARR_DEPL`(`DEPLOYMENT_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_PROCDEF_INFO` (
`ID_` varchar(64) NOT NULL,
`PROC_DEF_ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`INFO_JSON_ID_` varchar(64) NULL,
UNIQUE INDEX `PA6D592C_UNIQ_INFO_PROCDEF`(`PROC_DEF_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RU_JOB` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`CATEGORY_` varchar(255) NULL,
`TYPE_` varchar(255) NOT NULL,
`LOCK_EXP_TIME_` timestamp NULL DEFAULT NULL,
`LOCK_OWNER_` varchar(255) NULL,
`EXCLUSIVE_` tinyint(1) NULL,
`EXECUTION_ID_` varchar(64) NULL,
`PROCESS_INSTANCE_ID_` varchar(64) NULL,
`PROC_DEF_ID_` varchar(64) NULL,
`ELEMENT_ID_` varchar(255) NULL,
`ELEMENT_NAME_` varchar(255) NULL,
`SCOPE_ID_` varchar(255) NULL,
`SUB_SCOPE_ID_` varchar(255) NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`SCOPE_DEFINITION_ID_` varchar(255) NULL,
`CORRELATION_ID_` varchar(255) NULL,
`RETRIES_` int NULL,
`EXCEPTION_STACK_ID_` varchar(64) NULL,
`EXCEPTION_MSG_` varchar(4000) NULL,
`DUEDATE_` timestamp NULL DEFAULT NULL,
`REPEAT_` varchar(255) NULL,
`HANDLER_TYPE_` varchar(255) NULL,
`HANDLER_CFG_` varchar(4000) NULL,
`CUSTOM_VALUES_ID_` varchar(64) NULL,
`CREATE_TIME_` timestamp NULL DEFAULT NULL,
`TENANT_ID_` varchar(255) NULL,
INDEX `PA6D592C_IDX_JOB_STACK_ID`(`EXCEPTION_STACK_ID_`),
INDEX `PA6D592C_IDX_JOB_CUSTOM`(`CUSTOM_VALUES_ID_`),
INDEX `PA6D592C_IDX_JOB_CORRE_ID`(`CORRELATION_ID_`),
INDEX `PA6D592C_IDX_JOB_SCOPE`(`SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_JOB_SUB_SCOPE`(`SUB_SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_JOB_SCOPE_DEF`(`SCOPE_DEFINITION_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_JOB_EXECUTION`(`EXECUTION_ID_`),
INDEX `PA6D592C_IDX_JOB_PRO_INST`(`PROCESS_INSTANCE_ID_`),
INDEX `PA6D592C_IDX_JOB_PROC_DEF`(`PROC_DEF_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RU_DEADLETTER_JOB` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`CATEGORY_` varchar(255) NULL,
`TYPE_` varchar(255) NOT NULL,
`EXCLUSIVE_` tinyint(1) NULL,
`EXECUTION_ID_` varchar(64) NULL,
`PROCESS_INSTANCE_ID_` varchar(64) NULL,
`PROC_DEF_ID_` varchar(64) NULL,
`ELEMENT_ID_` varchar(255) NULL,
`ELEMENT_NAME_` varchar(255) NULL,
`SCOPE_ID_` varchar(255) NULL,
`SUB_SCOPE_ID_` varchar(255) NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`SCOPE_DEFINITION_ID_` varchar(255) NULL,
`CORRELATION_ID_` varchar(255) NULL,
`EXCEPTION_STACK_ID_` varchar(64) NULL,
`EXCEPTION_MSG_` varchar(4000) NULL,
`DUEDATE_` timestamp NULL DEFAULT NULL,
`REPEAT_` varchar(255) NULL,
`HANDLER_TYPE_` varchar(255) NULL,
`HANDLER_CFG_` varchar(4000) NULL,
`CUSTOM_VALUES_ID_` varchar(64) NULL,
`CREATE_TIME_` timestamp NULL DEFAULT NULL,
`TENANT_ID_` varchar(255) NULL,
INDEX `PA6D592C_IDX_DEAD_STACK_ID`(`EXCEPTION_STACK_ID_`),
INDEX `PA6D592C_IDX_DEAD_VALUES_ID`(`CUSTOM_VALUES_ID_`),
INDEX `PA6D592C_IDX_DEAD_CORREL_ID`(`CORRELATION_ID_`),
INDEX `PA6D592C_IDX_DJOB_SCOPE`(`SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_DJOB_SUB_SCOPE`(`SUB_SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_DJOB_SCOPE_DEF`(`SCOPE_DEFINITION_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_DEAD_EXECUTION`(`EXECUTION_ID_`),
INDEX `PA6D592C_IDX_DEAD_INSTANCE`(`PROCESS_INSTANCE_ID_`),
INDEX `PA6D592C_IDX_DEAD_PROC_DEF`(`PROC_DEF_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RE_MODEL` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`NAME_` varchar(255) NULL,
`KEY_` varchar(255) NULL,
`CATEGORY_` varchar(255) NULL,
`CREATE_TIME_` timestamp NULL DEFAULT NULL,
`LAST_UPDATE_TIME_` timestamp NULL DEFAULT NULL,
`VERSION_` int NULL,
`META_INFO_` varchar(4000) NULL,
`DEPLOYMENT_ID_` varchar(64) NULL,
`EDITOR_SOURCE_VALUE_ID_` varchar(64) NULL,
`EDITOR_SOURCE_EXTRA_VALUE_ID_` varchar(64) NULL,
`TENANT_ID_` varchar(255) NULL,
INDEX `PA6D592C_IDX_MODEL_SOURCE`(`EDITOR_SOURCE_VALUE_ID_`),
INDEX `PA6D592C_IDX_MODEL_EXTRA`(`EDITOR_SOURCE_EXTRA_VALUE_ID_`),
INDEX `PA6D592C_IDX_MODEL_DEPLOY`(`DEPLOYMENT_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RU_VARIABLE` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`TYPE_` varchar(255) NOT NULL,
`NAME_` varchar(255) NOT NULL,
`EXECUTION_ID_` varchar(64) NULL,
`PROC_INST_ID_` varchar(64) NULL,
`TASK_ID_` varchar(64) NULL,
`SCOPE_ID_` varchar(255) NULL,
`SUB_SCOPE_ID_` varchar(255) NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`BYTEARRAY_ID_` varchar(64) NULL,
`DOUBLE_` double NULL,
`LONG_` bigint(20) NULL,
`TEXT_` varchar(4000) NULL,
`TEXT2_` varchar(4000) NULL,
INDEX `PA6D592C_IDX_RU_VAR_SCOPE`(`SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_RU_VAR_SUB`(`SUB_SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_RU_VAR_BYTE`(`BYTEARRAY_ID_`),
INDEX `PA6D592C_IDX_RU_VAR_TASK`(`TASK_ID_`),
INDEX `PA6D592C_IDX_RU_VAR_EXE`(`EXECUTION_ID_`),
INDEX `PA6D592C_IDX_RU_VAR_PROC`(`PROC_INST_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RU_EXTERNAL_JOB` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`CATEGORY_` varchar(255) NULL,
`TYPE_` varchar(255) NOT NULL,
`LOCK_EXP_TIME_` timestamp NULL DEFAULT NULL,
`LOCK_OWNER_` varchar(255) NULL,
`EXCLUSIVE_` tinyint(1) NULL,
`EXECUTION_ID_` varchar(64) NULL,
`PROCESS_INSTANCE_ID_` varchar(64) NULL,
`PROC_DEF_ID_` varchar(64) NULL,
`ELEMENT_ID_` varchar(255) NULL,
`ELEMENT_NAME_` varchar(255) NULL,
`SCOPE_ID_` varchar(255) NULL,
`SUB_SCOPE_ID_` varchar(255) NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`SCOPE_DEFINITION_ID_` varchar(255) NULL,
`CORRELATION_ID_` varchar(255) NULL,
`RETRIES_` int NULL,
`EXCEPTION_STACK_ID_` varchar(64) NULL,
`EXCEPTION_MSG_` varchar(4000) NULL,
`DUEDATE_` timestamp NULL DEFAULT NULL,
`REPEAT_` varchar(255) NULL,
`HANDLER_TYPE_` varchar(255) NULL,
`HANDLER_CFG_` varchar(4000) NULL,
`CUSTOM_VALUES_ID_` varchar(64) NULL,
`CREATE_TIME_` timestamp NULL DEFAULT NULL,
`TENANT_ID_` varchar(255) NULL,
INDEX `PA6D592C_IDX_EJOB_STACK_ID`(`EXCEPTION_STACK_ID_`),
INDEX `PA6D592C_IDX_EJOB_VALUES_ID`(`CUSTOM_VALUES_ID_`),
INDEX `PA6D592C_IDX_EJOB_CORRE_ID`(`CORRELATION_ID_`),
INDEX `PA6D592C_IDX_EJOB_SCOPE`(`SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_EJOB_SUB_SCOPE`(`SUB_SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_EJOB_SCOPE_DEF`(`SCOPE_DEFINITION_ID_`,`SCOPE_TYPE_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RU_SUSPENDED_JOB` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`CATEGORY_` varchar(255) NULL,
`TYPE_` varchar(255) NOT NULL,
`EXCLUSIVE_` tinyint(1) NULL,
`EXECUTION_ID_` varchar(64) NULL,
`PROCESS_INSTANCE_ID_` varchar(64) NULL,
`PROC_DEF_ID_` varchar(64) NULL,
`ELEMENT_ID_` varchar(255) NULL,
`ELEMENT_NAME_` varchar(255) NULL,
`SCOPE_ID_` varchar(255) NULL,
`SUB_SCOPE_ID_` varchar(255) NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`SCOPE_DEFINITION_ID_` varchar(255) NULL,
`CORRELATION_ID_` varchar(255) NULL,
`RETRIES_` int NULL,
`EXCEPTION_STACK_ID_` varchar(64) NULL,
`EXCEPTION_MSG_` varchar(4000) NULL,
`DUEDATE_` timestamp NULL DEFAULT NULL,
`REPEAT_` varchar(255) NULL,
`HANDLER_TYPE_` varchar(255) NULL,
`HANDLER_CFG_` varchar(4000) NULL,
`CUSTOM_VALUES_ID_` varchar(64) NULL,
`CREATE_TIME_` timestamp NULL DEFAULT NULL,
`TENANT_ID_` varchar(255) NULL,
INDEX `PA6D592C_IDX_SJOB_STACK_ID`(`EXCEPTION_STACK_ID_`),
INDEX `PA6D592C_IDX_SJOB_VALUES_ID`(`CUSTOM_VALUES_ID_`),
INDEX `PA6D592C_IDX_SJOB_CORRE_ID`(`CORRELATION_ID_`),
INDEX `PA6D592C_IDX_SJOB_SCOPE`(`SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_SJOB_SUB_SCOPE`(`SUB_SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_SJOB_SCOPE_DEF`(`SCOPE_DEFINITION_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_SJOB_EXECUTION`(`EXECUTION_ID_`),
INDEX `PA6D592C_IDX_SJOB_INST_ID`(`PROCESS_INSTANCE_ID_`),
INDEX `PA6D592C_IDX_SJOB_PROC_DEF`(`PROC_DEF_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_RU_TIMER_JOB` (
`ID_` varchar(64) NOT NULL,
`REV_` int NULL,
`CATEGORY_` varchar(255) NULL,
`TYPE_` varchar(255) NOT NULL,
`LOCK_EXP_TIME_` timestamp NULL DEFAULT NULL,
`LOCK_OWNER_` varchar(255) NULL,
`EXCLUSIVE_` tinyint(1) NULL,
`EXECUTION_ID_` varchar(64) NULL,
`PROCESS_INSTANCE_ID_` varchar(64) NULL,
`PROC_DEF_ID_` varchar(64) NULL,
`ELEMENT_ID_` varchar(255) NULL,
`ELEMENT_NAME_` varchar(255) NULL,
`SCOPE_ID_` varchar(255) NULL,
`SUB_SCOPE_ID_` varchar(255) NULL,
`SCOPE_TYPE_` varchar(255) NULL,
`SCOPE_DEFINITION_ID_` varchar(255) NULL,
`CORRELATION_ID_` varchar(255) NULL,
`RETRIES_` int NULL,
`EXCEPTION_STACK_ID_` varchar(64) NULL,
`EXCEPTION_MSG_` varchar(4000) NULL,
`DUEDATE_` timestamp NULL DEFAULT NULL,
`REPEAT_` varchar(255) NULL,
`HANDLER_TYPE_` varchar(255) NULL,
`HANDLER_CFG_` varchar(4000) NULL,
`CUSTOM_VALUES_ID_` varchar(64) NULL,
`CREATE_TIME_` timestamp NULL DEFAULT NULL,
`TENANT_ID_` varchar(255) NULL,
INDEX `PA6D592C_IDX_TJOB_STACK_ID`(`EXCEPTION_STACK_ID_`),
INDEX `PA6D592C_IDX_TJOB_VALUES_ID`(`CUSTOM_VALUES_ID_`),
INDEX `PA6D592C_IDX_TJOB_CORRE_ID`(`CORRELATION_ID_`),
INDEX `PA6D592C_IDX_TJOB_SCOPE`(`SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_TJOB_SUB_SCOPE`(`SUB_SCOPE_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_TJOB_SCOPE_DEF`(`SCOPE_DEFINITION_ID_`,`SCOPE_TYPE_`),
INDEX `PA6D592C_IDX_TJOB_EXECUTION`(`EXECUTION_ID_`),
INDEX `PA6D592C_IDX_TJOB_PROC_INST`(`PROCESS_INSTANCE_ID_`),
INDEX `PA6D592C_IDX_TJOB_PROC_DEF`(`PROC_DEF_ID_`),
PRIMARY KEY (`ID_`)
);


CREATE TABLE `PA6D592C_ACT_EVT_LOG` (
`LOG_NR_` bigint(20) NOT NULL AUTO_INCREMENT,
`TYPE_` varchar(64) NULL,
`PROC_DEF_ID_` varchar(64) NULL,
`PROC_INST_ID_` varchar(64) NULL,
`EXECUTION_ID_` varchar(64) NULL,
`TASK_ID_` varchar(64) NULL,
`TIME_STAMP_` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
`USER_ID_` varchar(255) NULL,
`DATA_` longblob NULL,
`LOCK_OWNER_` varchar(255) NULL,
`LOCK_TIME_` timestamp NULL DEFAULT NULL,
`IS_PROCESSED_` tinyint(1) NULL DEFAULT 0,
PRIMARY KEY (`LOG_NR_`)
);


/* 定时任务默认表 */
CREATE TABLE `NA6D592C_JOB_DETAILS` (
`SCHED_NAME` varchar(120) NOT NULL,
`JOB_NAME` varchar(200) NOT NULL,
`JOB_GROUP` varchar(200) NOT NULL,
`DESCRIPTION` varchar(250) NULL,
`JOB_CLASS_NAME` varchar(250) NOT NULL,
`IS_DURABLE` varchar(1) NOT NULL,
`IS_NONCONCURRENT` varchar(1) NOT NULL,
`IS_UPDATE_DATA` varchar(1) NOT NULL,
`REQUESTS_RECOVERY` varchar(1) NOT NULL,
`JOB_DATA` blob NULL,
PRIMARY KEY (`JOB_GROUP`,`SCHED_NAME`,`JOB_NAME`)
);


CREATE TABLE `NA6D592C_TRIGGERS` (
`SCHED_NAME` varchar(120) NOT NULL,
`TRIGGER_NAME` varchar(200) NOT NULL,
`TRIGGER_GROUP` varchar(200) NOT NULL,
`JOB_NAME` varchar(200) NOT NULL,
`JOB_GROUP` varchar(200) NOT NULL,
`DESCRIPTION` varchar(250) NULL,
`NEXT_FIRE_TIME` bigint(13) NULL,
`PREV_FIRE_TIME` bigint(13) NULL,
`PRIORITY` int NULL,
`TRIGGER_STATE` varchar(16) NOT NULL,
`TRIGGER_TYPE` varchar(8) NOT NULL,
`START_TIME` bigint(13) NOT NULL DEFAULT 0,
`END_TIME` bigint(13) NULL,
`CALENDAR_NAME` varchar(200) NULL,
`MISFIRE_INSTR` smallint(2) NULL,
`JOB_DATA` blob NULL,
PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
);


CREATE TABLE `NA6D592C_SIMPLE_TRIGGERS` (
`SCHED_NAME` varchar(120) NOT NULL,
`TRIGGER_NAME` varchar(200) NOT NULL,
`TRIGGER_GROUP` varchar(200) NOT NULL,
`REPEAT_COUNT` bigint(7) NOT NULL DEFAULT 0,
`REPEAT_INTERVAL` bigint(12) NOT NULL DEFAULT 0,
`TIMES_TRIGGERED` bigint(10) NOT NULL DEFAULT 0,
PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
);


CREATE TABLE `NA6D592C_CRON_TRIGGERS` (
`SCHED_NAME` varchar(120) NOT NULL,
`TRIGGER_NAME` varchar(200) NOT NULL,
`TRIGGER_GROUP` varchar(200) NOT NULL,
`CRON_EXPRESSION` varchar(200) NOT NULL,
`TIME_ZONE_ID` varchar(80) NULL,
PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
);


CREATE TABLE `NA6D592C_SIMPROP_TRIGGERS` (
`SCHED_NAME` varchar(120) NOT NULL,
`TRIGGER_NAME` varchar(200) NOT NULL,
`TRIGGER_GROUP` varchar(200) NOT NULL,
`STR_PROP_1` varchar(512) NULL,
`STR_PROP_2` varchar(512) NULL,
`STR_PROP_3` varchar(512) NULL,
`INT_PROP_1` int NULL,
`INT_PROP_2` int NULL,
`LONG_PROP_1` bigint(20) NULL,
`LONG_PROP_2` bigint(20) NULL,
`DEC_PROP_1` decimal(13,4) NULL,
`DEC_PROP_2` decimal(13,4) NULL,
`BOOL_PROP_1` varchar(1) NULL,
`BOOL_PROP_2` varchar(1) NULL,
PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
);


CREATE TABLE `NA6D592C_BLOB_TRIGGERS` (
`SCHED_NAME` varchar(120) NOT NULL,
`TRIGGER_NAME` varchar(200) NOT NULL,
`TRIGGER_GROUP` varchar(200) NOT NULL,
`BLOB_DATA` blob NULL,
PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
);


CREATE TABLE `NA6D592C_CALENDARS` (
`SCHED_NAME` varchar(120) NOT NULL,
`CALENDAR_NAME` varchar(200) NOT NULL,
`CALENDAR` blob NULL,
PRIMARY KEY (`SCHED_NAME`,`CALENDAR_NAME`)
);


CREATE TABLE `NA6D592C_PAUSED_TRIGGER_GRPS` (
`SCHED_NAME` varchar(120) NOT NULL,
`TRIGGER_GROUP` varchar(200) NOT NULL,
PRIMARY KEY (`SCHED_NAME`,`TRIGGER_GROUP`)
);


CREATE TABLE `NA6D592C_FIRED_TRIGGERS` (
`SCHED_NAME` varchar(120) NOT NULL,
`ENTRY_ID` varchar(95) NOT NULL,
`TRIGGER_NAME` varchar(200) NOT NULL,
`TRIGGER_GROUP` varchar(200) NOT NULL,
`INSTANCE_NAME` varchar(200) NOT NULL,
`FIRED_TIME` bigint(13) NOT NULL DEFAULT 0,
`SCHED_TIME` bigint(13) NOT NULL DEFAULT 0,
`PRIORITY` int NOT NULL DEFAULT 0,
`STATE` varchar(16) NOT NULL,
`JOB_NAME` varchar(200) NULL,
`JOB_GROUP` varchar(200) NULL,
`IS_NONCONCURRENT` varchar(1) NULL,
`REQUESTS_RECOVERY` varchar(1) NULL,
PRIMARY KEY (`ENTRY_ID`,`SCHED_NAME`)
);


CREATE TABLE `NA6D592C_SCHEDULER_STATE` (
`SCHED_NAME` varchar(120) NOT NULL,
`INSTANCE_NAME` varchar(200) NOT NULL,
`LAST_CHECKIN_TIME` bigint(13) NOT NULL DEFAULT 0,
`CHECKIN_INTERVAL` bigint(13) NOT NULL DEFAULT 0,
PRIMARY KEY (`INSTANCE_NAME`,`SCHED_NAME`)
);


CREATE TABLE `NA6D592C_LOCKS` (
`SCHED_NAME` varchar(120) NOT NULL,
`LOCK_NAME` varchar(40) NOT NULL,
PRIMARY KEY (`LOCK_NAME`,`SCHED_NAME`)
);


