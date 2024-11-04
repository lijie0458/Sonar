package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface ProductReturnStorageUpdateDataCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3DDDBD014D56BE7B460F5D710BCE1FDF> getAnonymousStructure_3DDDBD014D56BE7B460F5D710BCE1FDF(@Param("productReturnCode") String productReturnCode); 

Long countAnonymousStructure_3DDDBD014D56BE7B460F5D710BCE1FDF(@Param("productReturnCode") String productReturnCode); 


}
