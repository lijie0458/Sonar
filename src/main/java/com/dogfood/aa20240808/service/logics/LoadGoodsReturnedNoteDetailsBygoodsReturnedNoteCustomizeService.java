package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadGoodsReturnedNoteDetailsBygoodsReturnedNoteCustomizeServiceMapper; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.BePutInStorageStructureStructure; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadGoodsReturnedNoteDetailsBygoodsReturnedNoteCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadGoodsReturnedNoteDetailsBygoodsReturnedNoteCustomizeServiceMapper loadGoodsReturnedNoteDetailsBygoodsReturnedNoteCustomizeServiceMapper;
    public List<BePutInStorageStructureStructure> loadGoodsReturnedNoteDetailsBygoodsReturnedNote(String order_number) {
        BePutInStorageStructureStructure GoodsReturnedNoteDetails = new BePutInStorageStructureStructure();
        List<BePutInStorageStructureStructure> result = new ArrayList<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6657CD3B9E0C841818A0548291FF597D> currentLcpEachName_1 = CommonFunctionUtil.createListPage(loadGoodsReturnedNoteDetailsBygoodsReturnedNoteCustomizeServiceMapper.getAnonymousStructure_6657CD3B9E0C841818A0548291FF597D(order_number), loadGoodsReturnedNoteDetailsBygoodsReturnedNoteCustomizeServiceMapper.countAnonymousStructure_6657CD3B9E0C841818A0548291FF597D(order_number).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_BCF0AB3D6AD89AA85017EDC5EEC762C3.class).list;
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6657CD3B9E0C841818A0548291FF597D item = currentLcpEachName_1.get(index.intValue());
            GoodsReturnedNoteDetails.goodsReturnedNoteDetails = item.goodsReturnedNoteDetails; 
            GoodsReturnedNoteDetails.material = item.materialDetails; 
            GoodsReturnedNoteDetails.unitName = item.measuringUnit.unitName; 
            GoodsReturnedNoteDetails.bePutInStorageDetails = item.bePutInStorageDetails; 
            CommonFunctionUtil.add(result, CommonFunctionUtil.clone(GoodsReturnedNoteDetails));
        } 

        return result;
    } 


}
