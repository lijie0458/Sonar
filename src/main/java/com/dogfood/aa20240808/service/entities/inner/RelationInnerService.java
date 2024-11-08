package com.dogfood.aa20240808.service.entities.inner;

import java.util.*;
import java.beans.PropertyDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;

import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.repository.*;
import com.dogfood.aa20240808.repository.entities.AppConfigEntityMapper;
import com.dogfood.aa20240808.repository.entities.BePutInStorageDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.BePutInStorageEntityMapper;
import com.dogfood.aa20240808.repository.entities.GoodsReturnedNoteDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.GoodsReturnedNoteEntityMapper;
import com.dogfood.aa20240808.repository.entities.InventoryEntityMapper;
import com.dogfood.aa20240808.repository.entities.LCAPPerResMappingMapper;
import com.dogfood.aa20240808.repository.entities.LCAPRolePerMappingMapper;
import com.dogfood.aa20240808.repository.entities.LCAPUserDeptMappingMapper;
import com.dogfood.aa20240808.repository.entities.LCAPUserMapper;
import com.dogfood.aa20240808.repository.entities.LCAPUserRoleMappingMapper;
import com.dogfood.aa20240808.repository.entities.MaterialDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.OtherInStorageDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.OtherInStorageEntityMapper;
import com.dogfood.aa20240808.repository.entities.OtherReturnStorageDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.OtherReturnStorageEntityMapper;
import com.dogfood.aa20240808.repository.entities.OutsourceInStorageDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.OutsourceInStorageEntityMapper;
import com.dogfood.aa20240808.repository.entities.OutsourceReturnStorageDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.OutsourceReturnStorageEntityMapper;
import com.dogfood.aa20240808.repository.entities.PerGroupPerMappingEntityMapper;
import com.dogfood.aa20240808.repository.entities.ProductInStorageDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.ProductInStorageEntityMapper;
import com.dogfood.aa20240808.repository.entities.ProductReturnStorageDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.ProductReturnStorageEntityMapper;
import com.dogfood.aa20240808.repository.entities.ProductionMaterialRequisitionDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.ProductionMaterialRequisitionEntityMapper;
import com.dogfood.aa20240808.repository.entities.PurchaseDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.PurchaseOrderDetailEntityMapper;
import com.dogfood.aa20240808.repository.entities.PurchaseOrderEntityMapper;
import com.dogfood.aa20240808.repository.entities.PurchaseRequestEntityMapper;
import com.dogfood.aa20240808.repository.entities.ReceivingDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.ReceivingNotificationsEntityMapper;
import com.dogfood.aa20240808.repository.entities.SalesOrderDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.SalesOrdersEntityMapper;
import com.dogfood.aa20240808.repository.entities.Storage_locationEntityMapper;
import com.dogfood.aa20240808.repository.entities.SupplierDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.ThirdIdentityEntityMapper;
import com.dogfood.aa20240808.repository.entities.TransferSlipDetailsEntityMapper;
import com.dogfood.aa20240808.repository.entities.TransferSlipEntityMapper;
import com.dogfood.aa20240808.repository.entities.Warehouse_levelEntityMapper;
import com.dogfood.aa20240808.repository.entities.Warehouse_levelTwoEntityMapper;
import com.dogfood.aa20240808.util.SpringUtils;

/**
* auto generate RelationInnerService
*
* @author sys
*/
@Service
public class RelationInnerService {
    private Map<String, List<RelationPayload>> relationMap = new HashMap<>();
    private static Logger LOGGER = LoggerFactory.getLogger(RelationInnerService.class);

    public RelationInnerService() {
        relationMap.put("CustomerManagementEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", SalesOrdersEntityMapper.class, "customer", "protect")
        )));
        relationMap.put("LCAPUser", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", TransferSlipEntityMapper.class, "inspector", "protect"),
        new RelationPayload("id", TransferSlipEntityMapper.class, "shippingClerk", "protect"),
        new RelationPayload("id", TransferSlipEntityMapper.class, "employee", "protect"),
        new RelationPayload("id", TransferSlipEntityMapper.class, "guardian", "protect"),
        new RelationPayload("id", TransferSlipEntityMapper.class, "salesperson", "protect"),
        new RelationPayload("id", TransferSlipEntityMapper.class, "warehouse_manager", "protect"),
        new RelationPayload("id", TransferSlipEntityMapper.class, "warehouse_manager", "protect"),
        new RelationPayload("userId", ThirdIdentityEntityMapper.class, "userId", "cascade"),
        new RelationPayload("userId", ThirdIdentityEntityMapper.class, "userId", "protect"),
        new RelationPayload("userId", ThirdIdentityEntityMapper.class, "userId", "protect"),
        new RelationPayload("userId", ThirdIdentityEntityMapper.class, "userId", "protect"),
        new RelationPayload("userId", ThirdIdentityEntityMapper.class, "userId", "cascade"),
        new RelationPayload("userId", ThirdIdentityEntityMapper.class, "userId", "cascade")
        )));
        relationMap.put("PurchaseRequestEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("requestNumber", PurchaseDetailsEntityMapper.class, "related_request_number", "cascade")
        )));
        relationMap.put("IdentitySourceConfigEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", ThirdIdentityEntityMapper.class, "identityId", "cascade")
        )));
        relationMap.put("PurchaseOrderEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("orderNumber", BePutInStorageEntityMapper.class, "orderNumber", "protect"),
        new RelationPayload("orderNumber", BePutInStorageEntityMapper.class, "orderNumber", "protect"),
        new RelationPayload("orderNumber", BePutInStorageEntityMapper.class, "relatedOrderNumber", "cascade")
        )));
        relationMap.put("LCAPDepartment", new ArrayList<>(Arrays.asList(
        new RelationPayload("deptId", LCAPUserDeptMappingMapper.class, "deptId", "cascade")
        )));
        relationMap.put("ProductReturnStorageEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("productReturnCode", ProductReturnStorageDetailsEntityMapper.class, "productReturnStorageCode", "protect")
        )));
        relationMap.put("SupplierEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", SupplierDetailsEntityMapper.class, "supplier", "cascade")
        )));
        relationMap.put("BePutInStorageEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("bePutInStorageId", GoodsReturnedNoteEntityMapper.class, "bePutInStorage", "protect"),
        new RelationPayload("bePutInStorageId", GoodsReturnedNoteEntityMapper.class, "bePutInStorageId", "protect")
        )));
        relationMap.put("Warehouse_levelEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", Warehouse_levelTwoEntityMapper.class, "parent_warehouse_Id", "protect")
        )));
        relationMap.put("ProductionMaterialRequisitionEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("documentNumber", TransferSlipDetailsEntityMapper.class, "productionMaterialRequisition", "cascade"),
        new RelationPayload("documentNumber", TransferSlipDetailsEntityMapper.class, "productionMaterialRequisition", "cascade")
        )));
        relationMap.put("OutsourceInStorageEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("code", OutsourceReturnStorageEntityMapper.class, "outsourceInSCode", "protect"),
        new RelationPayload("code", OutsourceReturnStorageEntityMapper.class, "outsourceInSCode", "protect")
        )));
        relationMap.put("PurchaseOrderDetailEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", ReceivingDetailsEntityMapper.class, "orderDetailId", "protect")
        )));
        relationMap.put("PurchaseDetailsEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", PurchaseOrderDetailEntityMapper.class, "purchaseDetailsId", "protect")
        )));
        relationMap.put("Warehouse_levelTwoEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", TransferSlipDetailsEntityMapper.class, "outWarehouse", "protect"),
        new RelationPayload("id", TransferSlipDetailsEntityMapper.class, "inWarehouse", "protect"),
        new RelationPayload("id", TransferSlipDetailsEntityMapper.class, "warehouseId", "protect"),
        new RelationPayload("id", TransferSlipDetailsEntityMapper.class, "warehouseId", "protect"),
        new RelationPayload("id", TransferSlipDetailsEntityMapper.class, "warehouseId", "protect"),
        new RelationPayload("id", TransferSlipDetailsEntityMapper.class, "warehouse", "protect"),
        new RelationPayload("id", TransferSlipDetailsEntityMapper.class, "warehouse", "protect"),
        new RelationPayload("id", TransferSlipDetailsEntityMapper.class, "warehouse", "protect"),
        new RelationPayload("id", TransferSlipDetailsEntityMapper.class, "warehouse_codetwo_id", "protect")
        )));
        relationMap.put("MaterialEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", MaterialDetailsEntityMapper.class, "category_id", "cascade")
        )));
        relationMap.put("BePutInStorageDetailsEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", GoodsReturnedNoteDetailsEntityMapper.class, "bePutInStorageDetailsId", "protect")
        )));
        relationMap.put("GoodsReturnedNoteEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("goodsReturnedNote", GoodsReturnedNoteDetailsEntityMapper.class, "goodsReturnedNote", "protect")
        )));
        relationMap.put("SalesOrdersEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("orderNumber", SalesOrderDetailsEntityMapper.class, "salesOrderNumber", "cascade")
        )));
        relationMap.put("MaterialDetailsEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("materialCode", TransferSlipDetailsEntityMapper.class, "materialCode", "protect"),
        new RelationPayload("materialCode", TransferSlipDetailsEntityMapper.class, "materialCode", "protect"),
        new RelationPayload("materialCode", TransferSlipDetailsEntityMapper.class, "materialCode", "protect"),
        new RelationPayload("materialCode", TransferSlipDetailsEntityMapper.class, "materialCode", "protect"),
        new RelationPayload("materialCode", TransferSlipDetailsEntityMapper.class, "materialCode", "protect"),
        new RelationPayload("materialCode", TransferSlipDetailsEntityMapper.class, "materialCode", "protect"),
        new RelationPayload("materialCode", TransferSlipDetailsEntityMapper.class, "materialCode", "protect"),
        new RelationPayload("materialCode", TransferSlipDetailsEntityMapper.class, "materialNumber", "protect"),
        new RelationPayload("materialCode", TransferSlipDetailsEntityMapper.class, "materialNumber", "protect"),
        new RelationPayload("materialCode", TransferSlipDetailsEntityMapper.class, "materialNumber", "protect"),
        new RelationPayload("materialCode", TransferSlipDetailsEntityMapper.class, "material_code", "protect"),
        new RelationPayload("materialCode", TransferSlipDetailsEntityMapper.class, "material_code", "protect")
        )));
        relationMap.put("DepartmentEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", ProductionMaterialRequisitionEntityMapper.class, "department", "protect"),
        new RelationPayload("id", ProductionMaterialRequisitionEntityMapper.class, "departmentId", "protect"),
        new RelationPayload("id", ProductionMaterialRequisitionEntityMapper.class, "department", "protect"),
        new RelationPayload("id", ProductionMaterialRequisitionEntityMapper.class, "department", "protect"),
        new RelationPayload("id", ProductionMaterialRequisitionEntityMapper.class, "department_Id", "protect")
        )));
        relationMap.put("PermissionGroupEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", PerGroupPerMappingEntityMapper.class, "perGroupId", "protect")
        )));
        relationMap.put("ProductInStorageEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("num", ProductReturnStorageEntityMapper.class, "productInStorageNum", "protect"),
        new RelationPayload("num", ProductReturnStorageEntityMapper.class, "code", "protect")
        )));
        relationMap.put("LCAPRole", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", AppConfigEntityMapper.class, "loginRoleId", "protect"),
        new RelationPayload("id", AppConfigEntityMapper.class, "roleId", "cascade"),
        new RelationPayload("id", AppConfigEntityMapper.class, "roleId", "cascade")
        )));
        relationMap.put("Storage_locationEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", OtherInStorageDetailsEntityMapper.class, "storageLocationId", "protect"),
        new RelationPayload("id", OtherInStorageDetailsEntityMapper.class, "storageLocationId", "protect"),
        new RelationPayload("id", OtherInStorageDetailsEntityMapper.class, "storageLocationId", "protect")
        )));
        relationMap.put("ProductInStorageDetailsEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", ProductReturnStorageDetailsEntityMapper.class, "productInStorageDetailsId", "protect")
        )));
        relationMap.put("MeasuringUnitEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", MaterialDetailsEntityMapper.class, "unit", "protect")
        )));
        relationMap.put("OutsourceInStorageDetailsEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", OutsourceReturnStorageDetailsEntityMapper.class, "outsourceInSDetailsId", "protect")
        )));
        relationMap.put("SupplierDetailsEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("supplier_name", GoodsReturnedNoteEntityMapper.class, "supplierName", "protect"),
        new RelationPayload("supplier_name", GoodsReturnedNoteEntityMapper.class, "supplierName", "protect"),
        new RelationPayload("id", OutsourceInStorageEntityMapper.class, "supplierId", "protect"),
        new RelationPayload("id", OutsourceInStorageEntityMapper.class, "supplier", "protect")
        )));
        relationMap.put("OtherReturnStorageEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("returnCode", OtherReturnStorageDetailsEntityMapper.class, "otherReturnSCode", "protect")
        )));
        relationMap.put("LCAPResource", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", LCAPPerResMappingMapper.class, "resourceId", "cascade")
        )));
        relationMap.put("LCAPPermission", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", PerGroupPerMappingEntityMapper.class, "perId", "protect"),
        new RelationPayload("id", PerGroupPerMappingEntityMapper.class, "permissionId", "cascade"),
        new RelationPayload("id", PerGroupPerMappingEntityMapper.class, "permissionId", "cascade")
        )));
        relationMap.put("OutsourceReturnStorageEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("returnCode", OutsourceReturnStorageDetailsEntityMapper.class, "outsourceReturnSCode", "protect")
        )));
        relationMap.put("OtherInStorageDetailsEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("id", OtherReturnStorageDetailsEntityMapper.class, "otherInSDetailsId", "protect")
        )));
        relationMap.put("OtherInStorageEntity", new ArrayList<>(Arrays.asList(
        new RelationPayload("code", OtherReturnStorageEntityMapper.class, "otherInSCode", "protect"),
        new RelationPayload("code", OtherReturnStorageEntityMapper.class, "otherInSCode", "protect")
        )));
    }

    @Transactional(rollbackFor = Exception.class)
    public void onDelete(Object entity) {
        try {
            if (relationMap.containsKey(entity.getClass().getSimpleName())) {
                for (RelationPayload relationPayload : relationMap.get(entity.getClass().getSimpleName())) {
                    String beRefProperty = relationPayload.getBeRefProperty();
                    PropertyDescriptor propertyDescriptor = BeanUtils.getPropertyDescriptor(entity.getClass(), beRefProperty);
                    Object propertyVal = propertyDescriptor.getReadMethod().invoke(entity);

                    Class<ReferenceHandleMapper> refEntityMapperClass = (Class<ReferenceHandleMapper>) relationPayload.getRefEntityMapperClass();
                    String refProperty = relationPayload.getRefProperty();
                    ReferenceHandleMapper refEntityMapper = SpringUtils.getBean(refEntityMapperClass);

                    String delRule = relationPayload.getDelRule();
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