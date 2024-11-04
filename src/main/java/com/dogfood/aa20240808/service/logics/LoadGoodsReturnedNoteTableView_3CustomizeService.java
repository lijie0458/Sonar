package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.entities.GoodsReturnedNoteEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import com.dogfood.aa20240808.repository.LoadGoodsReturnedNoteTableView_3CustomizeServiceMapper; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadGoodsReturnedNoteTableView_3CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadGoodsReturnedNoteTableView_3CustomizeServiceMapper loadGoodsReturnedNoteTableView_3CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D2D225B3C0E66306C0CD512C8C88B497 loadGoodsReturnedNoteTableView_3(Long page, Long size, String sort, String order, GoodsReturnedNoteEntity filter, TimeHorizonStructure TimeHorizon, List<String> dataViewAuthorityUserNameList) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D2D225B3C0E66306C0CD512C8C88B497 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D2D225B3C0E66306C0CD512C8C88B497();
        result = CommonFunctionUtil.createListPage(loadGoodsReturnedNoteTableView_3CustomizeServiceMapper.getAnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E(filter, dataViewAuthorityUserNameList, page, size, TimeHorizon, getTableField("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E", sort), order), loadGoodsReturnedNoteTableView_3CustomizeServiceMapper.countAnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E(filter, dataViewAuthorityUserNameList, page, size, TimeHorizon, getTableField("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E", sort), order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D2D225B3C0E66306C0CD512C8C88B497.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadGoodsReturnedNoteTableView_3CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNote.goodsReturnedNote", "`goods_returned_note`.`goods_returned_note`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNote.goodsReturnedNoteDate", "`goods_returned_note`.`goods_returned_note_date`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNote.bePutInStorage", "`goods_returned_note`.`be_put_in_storage`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNote.supplierName", "`goods_returned_note`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNote.description", "`goods_returned_note`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNote.annex", "`goods_returned_note`.`annex`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNote.warehouse", "`goods_returned_note`.`warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNote.status", "`goods_returned_note`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNote.createdBy", "`goods_returned_note`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("bePutInStorage.bePutInStorageId", "`be_put_in_storage`.`be_put_in_storage_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("bePutInStorage.bePutInStorageDate", "`be_put_in_storage`.`be_put_in_storage_date`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("bePutInStorage.orderNumber", "`be_put_in_storage`.`order_number`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("bePutInStorage.supplierName", "`be_put_in_storage`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("bePutInStorage.description", "`be_put_in_storage`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("bePutInStorage.annex", "`be_put_in_storage`.`annex`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("bePutInStorage.warehouse", "`be_put_in_storage`.`warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("bePutInStorage.createdBy", "`be_put_in_storage`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.id", "`supplier_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.createdTime", "`supplier_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.updatedTime", "`supplier_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.createdBy", "`supplier_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.updatedBy", "`supplier_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.supplier_code", "`supplier_details`.`supplier_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.supplier_name", "`supplier_details`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.credit_code", "`supplier_details`.`credit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.supplier_category", "`supplier_details`.`supplier_category`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.address", "`supplier_details`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.detailed_address", "`supplier_details`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.remark", "`supplier_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.contact_information", "`supplier_details`.`contact_information`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.bank", "`supplier_details`.`bank`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierDetails.supplier", "`supplier_details`.`supplier`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_levelTwo.id", "`warehouse_level_two`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_levelTwo.createdTime", "`warehouse_level_two`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_levelTwo.updatedTime", "`warehouse_level_two`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_levelTwo.createdBy", "`warehouse_level_two`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_levelTwo.updatedBy", "`warehouse_level_two`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_levelTwo.warehouse_code", "`warehouse_level_two`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_levelTwo.warehouse_name", "`warehouse_level_two`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_levelTwo.parent_warehouse_Id", "`warehouse_level_two`.`parent_warehouse__id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_levelTwo.address", "`warehouse_level_two`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_levelTwo.remark", "`warehouse_level_two`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_levelTwo.warehouse_manager", "`warehouse_level_two`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_levelTwo.detailedAddress", "`warehouse_level_two`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("lCAPUser.id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("lCAPUser.createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("lCAPUser.updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("lCAPUser.userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("lCAPUser.userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("lCAPUser.password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("lCAPUser.phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("lCAPUser.email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("lCAPUser.displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("lCAPUser.status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("lCAPUser.source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("lCAPUser.department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("lCAPUser.directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("lCAPUser.isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNoteDetails.id", "`goods_returned_note_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNoteDetails.goodsReturnedNote", "`goods_returned_note_details`.`goods_returned_note`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNoteDetails.bePutInStorageQuantity", "`goods_returned_note_details`.`be_put_in_storage_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNoteDetails.materialNumber", "`goods_returned_note_details`.`material_number`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNoteDetails.batchNumber", "`goods_returned_note_details`.`batch_number`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNoteDetails.bePutInStorageDetailsId", "`goods_returned_note_details`.`be_put_in_storage_details_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("materialDetails.materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("materialDetails.material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("materialDetails.category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("materialDetails.specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("materialDetails.unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("materialDetails.description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("materialDetails.is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("measuringUnit.id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("measuringUnit.createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("measuringUnit.updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("measuringUnit.createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("measuringUnit.updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("measuringUnit.unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("measuringUnit.unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNote", "`goods_returned_note_details`.`goods_returned_note`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("goodsReturnedNoteDate", "`goods_returned_note`.`goods_returned_note_date`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("bePutInStorage", "`goods_returned_note`.`be_put_in_storage`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplierName", "`goods_returned_note`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("description", "`goods_returned_note`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("annex", "`goods_returned_note`.`annex`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse", "`goods_returned_note`.`warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("status", "`goods_returned_note`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("createdBy", "`goods_returned_note`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("bePutInStorageId", "`be_put_in_storage`.`be_put_in_storage_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("bePutInStorageDate", "`be_put_in_storage`.`be_put_in_storage_date`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("orderNumber", "`be_put_in_storage`.`order_number`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("id", "`goods_returned_note_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("createdTime", "`warehouse_level_two`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("updatedTime", "`warehouse_level_two`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("updatedBy", "`warehouse_level_two`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplier_code", "`supplier_details`.`supplier_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplier_name", "`supplier_details`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("credit_code", "`supplier_details`.`credit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplier_category", "`supplier_details`.`supplier_category`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("address", "`warehouse_level_two`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("detailed_address", "`supplier_details`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("remark", "`warehouse_level_two`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("contact_information", "`supplier_details`.`contact_information`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("bank", "`supplier_details`.`bank`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("supplier", "`supplier_details`.`supplier`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_code", "`warehouse_level_two`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_name", "`warehouse_level_two`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("parent_warehouse_Id", "`warehouse_level_two`.`parent_warehouse__id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("warehouse_manager", "`warehouse_level_two`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("detailedAddress", "`warehouse_level_two`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("bePutInStorageQuantity", "`goods_returned_note_details`.`be_put_in_storage_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("materialNumber", "`goods_returned_note_details`.`material_number`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("batchNumber", "`goods_returned_note_details`.`batch_number`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("bePutInStorageDetailsId", "`goods_returned_note_details`.`be_put_in_storage_details_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E").put("unitName", "`measuring_unit`.`unit_name`");
    } 

    private String getTableField(String structureName, String propertyName) {
        if (null == structureName || null == propertyName || null == orderByParamToColumnMap.get(structureName) || "".equals(propertyName)) {
            return null;
        } 

        if (null == orderByParamToColumnMap.get(structureName).get(propertyName)) {
            throw new HttpCodeException(404, "排序参数{" + propertyName + "}不存在"); 
        } 

        return orderByParamToColumnMap.get(structureName).get(propertyName);
    } 

    private <T> T getObjectTableField(String structureName, T obj, List<String> fieldNames) {
        try {
            T cloneObj = CommonFunctionUtil.clone(obj); 
            for (String fieldRef : fieldNames) {
                String[] fieldNameSplit = fieldRef.split("\\."); 
                Field field = obj.getClass().getDeclaredField(fieldNameSplit[0]); 
                Object fieldObject = cloneObj; 
                for (int fieldIndex = 1; fieldIndex < fieldNameSplit.length; fieldIndex++) {
                    fieldObject = field.get(fieldObject); 
                    field = field.getType().getDeclaredField(fieldNameSplit[fieldIndex]); 
                } 
                field.set(fieldObject, getTableField(structureName, String.valueOf(field.get(fieldObject))));
            } 
            return cloneObj;
        } catch (Exception e) {
            throw new HttpCodeException("500", e); 
        } 
    } 


}
