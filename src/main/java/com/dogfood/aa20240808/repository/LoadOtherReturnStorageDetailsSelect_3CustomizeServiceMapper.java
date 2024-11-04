package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadOtherReturnStorageDetailsSelect_3CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FC0F89FED0E9FC4B60DAAE9347527401> getAnonymousStructure_FC0F89FED0E9FC4B60DAAE9347527401(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("isUpdate") Boolean isUpdate); 

Long countAnonymousStructure_FC0F89FED0E9FC4B60DAAE9347527401(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("isUpdate") Boolean isUpdate); 


}
