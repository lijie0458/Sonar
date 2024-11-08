package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_96B800EA1E75C8827BC9F842B609AA02; 
import org.apache.ibatis.annotations.Param; 

public interface LoadAddGoodsReturnedNoteUpdateSelect_3CustomizeServiceMapper {

List<AnonymousStructure_96B800EA1E75C8827BC9F842B609AA02> getAnonymousStructure_96B800EA1E75C8827BC9F842B609AA02(@Param("BeputlnStorageId") String BeputlnStorageId, @Param("BePulnStorageDetailsIdList") List<Long> BePulnStorageDetailsIdList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

Long countAnonymousStructure_96B800EA1E75C8827BC9F842B609AA02(@Param("BeputlnStorageId") String BeputlnStorageId, @Param("BePulnStorageDetailsIdList") List<Long> BePulnStorageDetailsIdList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

List<AnonymousStructure_96B800EA1E75C8827BC9F842B609AA02> getAnonymousStructure_96B800EA1E75C8827BC9F842B609AA021(@Param("BeputlnStorageId") String BeputlnStorageId, @Param("BePulnStorageDetailsIdList") List<Long> BePulnStorageDetailsIdList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

Long countAnonymousStructure_96B800EA1E75C8827BC9F842B609AA021(@Param("BeputlnStorageId") String BeputlnStorageId, @Param("BePulnStorageDetailsIdList") List<Long> BePulnStorageDetailsIdList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

List<AnonymousStructure_96B800EA1E75C8827BC9F842B609AA02> getAnonymousStructure_96B800EA1E75C8827BC9F842B609AA022(@Param("BeputlnStorageId") String BeputlnStorageId, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("List") List<Long> List); 

Long countAnonymousStructure_96B800EA1E75C8827BC9F842B609AA022(@Param("BeputlnStorageId") String BeputlnStorageId, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("List") List<Long> List); 

}
