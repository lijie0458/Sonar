package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439; 
import org.apache.ibatis.annotations.Param; 

public interface LoadPurchaseRequestDetailsTableViewCustomizeServiceMapper {

List<AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439> getAnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439(@Param("filter") MaterialDetailsEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439(@Param("filter") MaterialDetailsEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

}
