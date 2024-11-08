package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B; 
import com.dogfood.aa20240808.domain.entities.TransferSlipEntity; 
import org.apache.ibatis.annotations.Param; 

public interface LoadTransferSlipTableView_1CustomizeServiceMapper {

List<AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B> getAnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B(@Param("filter") TransferSlipEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B(@Param("filter") TransferSlipEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 

}
