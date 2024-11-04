package com.dogfood.aa20240808.service.entities.inner;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.time.LocalDateTime;
import javax.annotation.Resource;
import java.beans.PropertyDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;

import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.domain.*;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.repository.*;
import com.dogfood.aa20240808.util.SpringUtils;

/**
* auto generate RelationInnerService
*
* @author sys
*/
@Service
public class RelationInnerService {
    private Map<String, List<Object[]>> relationMap = new HashMap<>();
    private static Logger LOGGER = LoggerFactory.getLogger(RelationInnerService.class);
    private static final int INDEX_BEREF_PROPERTY = 0;
    private static final int INDEX_REF_ENTITY_MAPPER_CLASS = 1;
    private static final int INDEX_REF_PROPERTY = 2;
    private static final int INDEX_DEL_RULE = 3;

    public RelationInnerService() {
        relationMap.put("OutsourceReturnStorageEntity", new ArrayList<>());
        relationMap.get("OutsourceReturnStorageEntity").add(new Object[]{
            "returnCode",
            com.dogfood.aa20240808.repository.entities.OutsourceReturnStorageDetailsEntityMapper.class,
            "outsourceReturnSCode",
            "protect"
            });
        relationMap.put("LCAPUser", new ArrayList<>());
        relationMap.get("LCAPUser").add(new Object[]{
            "userId",
            com.dogfood.aa20240808.repository.entities.ThirdIdentityEntityMapper.class,
            "userId",
            "cascade"
            });
        relationMap.get("LCAPUser").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.TransferSlipEntityMapper.class,
            "inspector",
            "protect"
            });
        relationMap.get("LCAPUser").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.TransferSlipEntityMapper.class,
            "shippingClerk",
            "protect"
            });
        relationMap.get("LCAPUser").add(new Object[]{
            "userId",
            com.dogfood.aa20240808.repository.entities.OtherInStorageEntityMapper.class,
            "userId",
            "protect"
            });
        relationMap.get("LCAPUser").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.ProductionMaterialRequisitionEntityMapper.class,
            "employee",
            "protect"
            });
        relationMap.get("LCAPUser").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.ProductionMaterialRequisitionEntityMapper.class,
            "guardian",
            "protect"
            });
        relationMap.get("LCAPUser").add(new Object[]{
            "userId",
            com.dogfood.aa20240808.repository.entities.OutsourceInStorageEntityMapper.class,
            "userId",
            "protect"
            });
        relationMap.get("LCAPUser").add(new Object[]{
            "userId",
            com.dogfood.aa20240808.repository.entities.ProductInStorageEntityMapper.class,
            "userId",
            "protect"
            });
        relationMap.get("LCAPUser").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.SalesOrdersEntityMapper.class,
            "salesperson",
            "protect"
            });
        relationMap.get("LCAPUser").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.Warehouse_levelTwoEntityMapper.class,
            "warehouse_manager",
            "protect"
            });
        relationMap.get("LCAPUser").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.Warehouse_levelEntityMapper.class,
            "warehouse_manager",
            "protect"
            });
        relationMap.get("LCAPUser").add(new Object[]{
            "userId",
            com.dogfood.aa20240808.repository.entities.LCAPUserRoleMappingMapper.class,
            "userId",
            "cascade"
            });
        relationMap.get("LCAPUser").add(new Object[]{
            "userId",
            com.dogfood.aa20240808.repository.entities.LCAPUserDeptMappingMapper.class,
            "userId",
            "cascade"
            });
        relationMap.put("MaterialDetailsEntity", new ArrayList<>());
        relationMap.get("MaterialDetailsEntity").add(new Object[]{
            "materialCode",
            com.dogfood.aa20240808.repository.entities.TransferSlipDetailsEntityMapper.class,
            "materialCode",
            "protect"
            });
        relationMap.get("MaterialDetailsEntity").add(new Object[]{
            "materialCode",
            com.dogfood.aa20240808.repository.entities.OtherInStorageDetailsEntityMapper.class,
            "materialCode",
            "protect"
            });
        relationMap.get("MaterialDetailsEntity").add(new Object[]{
            "materialCode",
            com.dogfood.aa20240808.repository.entities.ProductionMaterialRequisitionDetailsEntityMapper.class,
            "materialCode",
            "protect"
            });
        relationMap.get("MaterialDetailsEntity").add(new Object[]{
            "materialCode",
            com.dogfood.aa20240808.repository.entities.OutsourceInStorageDetailsEntityMapper.class,
            "materialCode",
            "protect"
            });
        relationMap.get("MaterialDetailsEntity").add(new Object[]{
            "materialCode",
            com.dogfood.aa20240808.repository.entities.ProductInStorageDetailsEntityMapper.class,
            "materialCode",
            "protect"
            });
        relationMap.get("MaterialDetailsEntity").add(new Object[]{
            "materialCode",
            com.dogfood.aa20240808.repository.entities.SalesOrderDetailsEntityMapper.class,
            "materialCode",
            "protect"
            });
        relationMap.get("MaterialDetailsEntity").add(new Object[]{
            "materialCode",
            com.dogfood.aa20240808.repository.entities.InventoryEntityMapper.class,
            "materialCode",
            "protect"
            });
        relationMap.get("MaterialDetailsEntity").add(new Object[]{
            "materialCode",
            com.dogfood.aa20240808.repository.entities.GoodsReturnedNoteDetailsEntityMapper.class,
            "materialNumber",
            "protect"
            });
        relationMap.get("MaterialDetailsEntity").add(new Object[]{
            "materialCode",
            com.dogfood.aa20240808.repository.entities.BePutInStorageDetailsEntityMapper.class,
            "materialNumber",
            "protect"
            });
        relationMap.get("MaterialDetailsEntity").add(new Object[]{
            "materialCode",
            com.dogfood.aa20240808.repository.entities.ReceivingDetailsEntityMapper.class,
            "materialNumber",
            "protect"
            });
        relationMap.get("MaterialDetailsEntity").add(new Object[]{
            "materialCode",
            com.dogfood.aa20240808.repository.entities.PurchaseOrderDetailEntityMapper.class,
            "material_code",
            "protect"
            });
        relationMap.get("MaterialDetailsEntity").add(new Object[]{
            "materialCode",
            com.dogfood.aa20240808.repository.entities.PurchaseDetailsEntityMapper.class,
            "material_code",
            "protect"
            });
        relationMap.put("PermissionGroupEntity", new ArrayList<>());
        relationMap.get("PermissionGroupEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.PerGroupPerMappingEntityMapper.class,
            "perGroupId",
            "protect"
            });
        relationMap.put("SupplierDetailsEntity", new ArrayList<>());
        relationMap.get("SupplierDetailsEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.OutsourceInStorageEntityMapper.class,
            "supplierId",
            "protect"
            });
        relationMap.get("SupplierDetailsEntity").add(new Object[]{
            "supplier_name",
            com.dogfood.aa20240808.repository.entities.GoodsReturnedNoteEntityMapper.class,
            "supplierName",
            "protect"
            });
        relationMap.get("SupplierDetailsEntity").add(new Object[]{
            "supplier_name",
            com.dogfood.aa20240808.repository.entities.BePutInStorageEntityMapper.class,
            "supplierName",
            "protect"
            });
        relationMap.get("SupplierDetailsEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.PurchaseOrderEntityMapper.class,
            "supplier",
            "protect"
            });
        relationMap.put("CustomerManagementEntity", new ArrayList<>());
        relationMap.get("CustomerManagementEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.SalesOrdersEntityMapper.class,
            "customer",
            "protect"
            });
        relationMap.put("LCAPDepartment", new ArrayList<>());
        relationMap.get("LCAPDepartment").add(new Object[]{
            "deptId",
            com.dogfood.aa20240808.repository.entities.LCAPUserDeptMappingMapper.class,
            "deptId",
            "cascade"
            });
        relationMap.put("SalesOrdersEntity", new ArrayList<>());
        relationMap.get("SalesOrdersEntity").add(new Object[]{
            "orderNumber",
            com.dogfood.aa20240808.repository.entities.SalesOrderDetailsEntityMapper.class,
            "salesOrderNumber",
            "cascade"
            });
        relationMap.put("DepartmentEntity", new ArrayList<>());
        relationMap.get("DepartmentEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.ProductionMaterialRequisitionEntityMapper.class,
            "department",
            "protect"
            });
        relationMap.get("DepartmentEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.ProductInStorageEntityMapper.class,
            "departmentId",
            "protect"
            });
        relationMap.get("DepartmentEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.SalesOrdersEntityMapper.class,
            "department",
            "protect"
            });
        relationMap.get("DepartmentEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.PurchaseRequestEntityMapper.class,
            "department",
            "protect"
            });
        relationMap.get("DepartmentEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.LCAPUserMapper.class,
            "department_Id",
            "protect"
            });
        relationMap.put("GoodsReturnedNoteEntity", new ArrayList<>());
        relationMap.get("GoodsReturnedNoteEntity").add(new Object[]{
            "goodsReturnedNote",
            com.dogfood.aa20240808.repository.entities.GoodsReturnedNoteDetailsEntityMapper.class,
            "goodsReturnedNote",
            "protect"
            });
        relationMap.put("BePutInStorageEntity", new ArrayList<>());
        relationMap.get("BePutInStorageEntity").add(new Object[]{
            "bePutInStorageId",
            com.dogfood.aa20240808.repository.entities.GoodsReturnedNoteEntityMapper.class,
            "bePutInStorage",
            "protect"
            });
        relationMap.get("BePutInStorageEntity").add(new Object[]{
            "bePutInStorageId",
            com.dogfood.aa20240808.repository.entities.BePutInStorageDetailsEntityMapper.class,
            "bePutInStorageId",
            "protect"
            });
        relationMap.put("ProductInStorageDetailsEntity", new ArrayList<>());
        relationMap.get("ProductInStorageDetailsEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.ProductReturnStorageDetailsEntityMapper.class,
            "productInStorageDetailsId",
            "protect"
            });
        relationMap.put("PurchaseOrderDetailEntity", new ArrayList<>());
        relationMap.get("PurchaseOrderDetailEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.ReceivingDetailsEntityMapper.class,
            "orderDetailId",
            "protect"
            });
        relationMap.put("Warehouse_levelTwoEntity", new ArrayList<>());
        relationMap.get("Warehouse_levelTwoEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.TransferSlipDetailsEntityMapper.class,
            "outWarehouse",
            "protect"
            });
        relationMap.get("Warehouse_levelTwoEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.TransferSlipDetailsEntityMapper.class,
            "inWarehouse",
            "protect"
            });
        relationMap.get("Warehouse_levelTwoEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.OtherInStorageDetailsEntityMapper.class,
            "warehouseId",
            "protect"
            });
        relationMap.get("Warehouse_levelTwoEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.OutsourceInStorageDetailsEntityMapper.class,
            "warehouseId",
            "protect"
            });
        relationMap.get("Warehouse_levelTwoEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.ProductInStorageDetailsEntityMapper.class,
            "warehouseId",
            "protect"
            });
        relationMap.get("Warehouse_levelTwoEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.InventoryEntityMapper.class,
            "warehouse",
            "protect"
            });
        relationMap.get("Warehouse_levelTwoEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.GoodsReturnedNoteEntityMapper.class,
            "warehouse",
            "protect"
            });
        relationMap.get("Warehouse_levelTwoEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.BePutInStorageEntityMapper.class,
            "warehouse",
            "protect"
            });
        relationMap.get("Warehouse_levelTwoEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.Storage_locationEntityMapper.class,
            "warehouse_codetwo_id",
            "protect"
            });
        relationMap.put("ProductionMaterialRequisitionEntity", new ArrayList<>());
        relationMap.get("ProductionMaterialRequisitionEntity").add(new Object[]{
            "documentNumber",
            com.dogfood.aa20240808.repository.entities.TransferSlipDetailsEntityMapper.class,
            "productionMaterialRequisition",
            "cascade"
            });
        relationMap.get("ProductionMaterialRequisitionEntity").add(new Object[]{
            "documentNumber",
            com.dogfood.aa20240808.repository.entities.ProductionMaterialRequisitionDetailsEntityMapper.class,
            "productionMaterialRequisition",
            "cascade"
            });
        relationMap.put("SupplierEntity", new ArrayList<>());
        relationMap.get("SupplierEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.SupplierDetailsEntityMapper.class,
            "supplier",
            "cascade"
            });
        relationMap.put("OutsourceInStorageEntity", new ArrayList<>());
        relationMap.get("OutsourceInStorageEntity").add(new Object[]{
            "code",
            com.dogfood.aa20240808.repository.entities.OutsourceReturnStorageEntityMapper.class,
            "outsourceInSCode",
            "protect"
            });
        relationMap.get("OutsourceInStorageEntity").add(new Object[]{
            "code",
            com.dogfood.aa20240808.repository.entities.OutsourceInStorageDetailsEntityMapper.class,
            "outsourceInSCode",
            "protect"
            });
        relationMap.put("OtherInStorageEntity", new ArrayList<>());
        relationMap.get("OtherInStorageEntity").add(new Object[]{
            "code",
            com.dogfood.aa20240808.repository.entities.OtherReturnStorageEntityMapper.class,
            "otherInSCode",
            "protect"
            });
        relationMap.get("OtherInStorageEntity").add(new Object[]{
            "code",
            com.dogfood.aa20240808.repository.entities.OtherInStorageDetailsEntityMapper.class,
            "otherInSCode",
            "protect"
            });
        relationMap.put("OtherInStorageDetailsEntity", new ArrayList<>());
        relationMap.get("OtherInStorageDetailsEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.OtherReturnStorageDetailsEntityMapper.class,
            "otherInSDetailsId",
            "protect"
            });
        relationMap.put("Warehouse_levelEntity", new ArrayList<>());
        relationMap.get("Warehouse_levelEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.Warehouse_levelTwoEntityMapper.class,
            "parent_warehouse_Id",
            "protect"
            });
        relationMap.put("IdentitySourceConfigEntity", new ArrayList<>());
        relationMap.get("IdentitySourceConfigEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.ThirdIdentityEntityMapper.class,
            "identityId",
            "cascade"
            });
        relationMap.put("Storage_locationEntity", new ArrayList<>());
        relationMap.get("Storage_locationEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.OtherInStorageDetailsEntityMapper.class,
            "storageLocationId",
            "protect"
            });
        relationMap.get("Storage_locationEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.OutsourceInStorageDetailsEntityMapper.class,
            "storageLocationId",
            "protect"
            });
        relationMap.get("Storage_locationEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.ProductInStorageDetailsEntityMapper.class,
            "storageLocationId",
            "protect"
            });
        relationMap.put("LCAPRole", new ArrayList<>());
        relationMap.get("LCAPRole").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.AppConfigEntityMapper.class,
            "loginRoleId",
            "protect"
            });
        relationMap.get("LCAPRole").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.LCAPRolePerMappingMapper.class,
            "roleId",
            "cascade"
            });
        relationMap.get("LCAPRole").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.LCAPUserRoleMappingMapper.class,
            "roleId",
            "cascade"
            });
        relationMap.put("ProductReturnStorageEntity", new ArrayList<>());
        relationMap.get("ProductReturnStorageEntity").add(new Object[]{
            "productReturnCode",
            com.dogfood.aa20240808.repository.entities.ProductReturnStorageDetailsEntityMapper.class,
            "productReturnStorageCode",
            "protect"
            });
        relationMap.put("MaterialEntity", new ArrayList<>());
        relationMap.get("MaterialEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.MaterialDetailsEntityMapper.class,
            "category_id",
            "cascade"
            });
        relationMap.put("OtherReturnStorageEntity", new ArrayList<>());
        relationMap.get("OtherReturnStorageEntity").add(new Object[]{
            "returnCode",
            com.dogfood.aa20240808.repository.entities.OtherReturnStorageDetailsEntityMapper.class,
            "otherReturnSCode",
            "protect"
            });
        relationMap.put("BePutInStorageDetailsEntity", new ArrayList<>());
        relationMap.get("BePutInStorageDetailsEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.GoodsReturnedNoteDetailsEntityMapper.class,
            "bePutInStorageDetailsId",
            "protect"
            });
        relationMap.put("LCAPResource", new ArrayList<>());
        relationMap.get("LCAPResource").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.LCAPPerResMappingMapper.class,
            "resourceId",
            "cascade"
            });
        relationMap.put("MeasuringUnitEntity", new ArrayList<>());
        relationMap.get("MeasuringUnitEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.MaterialDetailsEntityMapper.class,
            "unit",
            "protect"
            });
        relationMap.put("LCAPPermission", new ArrayList<>());
        relationMap.get("LCAPPermission").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.PerGroupPerMappingEntityMapper.class,
            "perId",
            "protect"
            });
        relationMap.get("LCAPPermission").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.LCAPRolePerMappingMapper.class,
            "permissionId",
            "cascade"
            });
        relationMap.get("LCAPPermission").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.LCAPPerResMappingMapper.class,
            "permissionId",
            "cascade"
            });
        relationMap.put("OutsourceInStorageDetailsEntity", new ArrayList<>());
        relationMap.get("OutsourceInStorageDetailsEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.OutsourceReturnStorageDetailsEntityMapper.class,
            "outsourceInSDetailsId",
            "protect"
            });
        relationMap.put("PurchaseOrderEntity", new ArrayList<>());
        relationMap.get("PurchaseOrderEntity").add(new Object[]{
            "orderNumber",
            com.dogfood.aa20240808.repository.entities.BePutInStorageEntityMapper.class,
            "orderNumber",
            "protect"
            });
        relationMap.get("PurchaseOrderEntity").add(new Object[]{
            "orderNumber",
            com.dogfood.aa20240808.repository.entities.ReceivingNotificationsEntityMapper.class,
            "orderNumber",
            "protect"
            });
        relationMap.get("PurchaseOrderEntity").add(new Object[]{
            "orderNumber",
            com.dogfood.aa20240808.repository.entities.PurchaseOrderDetailEntityMapper.class,
            "relatedOrderNumber",
            "cascade"
            });
        relationMap.put("PurchaseRequestEntity", new ArrayList<>());
        relationMap.get("PurchaseRequestEntity").add(new Object[]{
            "requestNumber",
            com.dogfood.aa20240808.repository.entities.PurchaseDetailsEntityMapper.class,
            "related_request_number",
            "cascade"
            });
        relationMap.put("ProductInStorageEntity", new ArrayList<>());
        relationMap.get("ProductInStorageEntity").add(new Object[]{
            "num",
            com.dogfood.aa20240808.repository.entities.ProductReturnStorageEntityMapper.class,
            "productInStorageNum",
            "protect"
            });
        relationMap.get("ProductInStorageEntity").add(new Object[]{
            "num",
            com.dogfood.aa20240808.repository.entities.ProductInStorageDetailsEntityMapper.class,
            "code",
            "protect"
            });
        relationMap.put("PurchaseDetailsEntity", new ArrayList<>());
        relationMap.get("PurchaseDetailsEntity").add(new Object[]{
            "id",
            com.dogfood.aa20240808.repository.entities.PurchaseOrderDetailEntityMapper.class,
            "purchaseDetailsId",
            "protect"
            });
    }

    @Transactional(rollbackFor = Exception.class)
    public void onDelete(Object entity) {
        try {
            if (relationMap.containsKey(entity.getClass().getSimpleName())) {
                for (Object[] relationPayload : relationMap.get(entity.getClass().getSimpleName())) {
                    String beRefProperty = (String)relationPayload[INDEX_BEREF_PROPERTY];
                    PropertyDescriptor propertyDescriptor = BeanUtils.getPropertyDescriptor(entity.getClass(), beRefProperty);
                    Object propertyVal = propertyDescriptor.getReadMethod().invoke(entity);

                    Class<ReferenceHandleMapper> refEntityMapperClass = (Class<ReferenceHandleMapper>) relationPayload[INDEX_REF_ENTITY_MAPPER_CLASS];
                    String refProperty = (String)relationPayload[INDEX_REF_PROPERTY];
                    ReferenceHandleMapper refEntityMapper = SpringUtils.getBean(refEntityMapperClass);

                    String delRule = (String) relationPayload[INDEX_DEL_RULE];
                    if ("cascade".equals(delRule)) {
                        LOGGER.info("cascade delete entity: {}, property {} = {}",
                            entity.getClass().getSimpleName(), refProperty, propertyVal);
                        refEntityMapper.deleteReference(refProperty, propertyVal);
                    } else if ("protect".equals(delRule)) {
                        Long affect = refEntityMapper.existReference(refProperty, propertyVal);
                        if (affect != null && affect > 0) {
                            throw new HttpCodeException(400, ErrorCodeEnum.RELATION_PROTECT.code);
                        }
                    }
                }
            }
        } catch (HttpCodeException ex) {
            throw ex;
        } catch(Exception e) {
            throw new HttpCodeException(400, "error: " + e.getMessage());
        }
    }
}