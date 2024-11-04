package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.entities.GoodsReturnedNoteEntity; 
import org.apache.ibatis.annotations.Param; 

public interface LoadGoodsReturnedNoteTableView_3CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E> getAnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E(@Param("filter") GoodsReturnedNoteEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E(@Param("filter") GoodsReturnedNoteEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 


}
