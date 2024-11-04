package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadBePutInStorageByRequestOrderNumber1CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1898454AAC2206FB16DB8DA3000E5E2C> getAnonymousStructure_1898454AAC2206FB16DB8DA3000E5E2C(@Param("bePutInStorageld") String bePutInStorageld); 

Long countAnonymousStructure_1898454AAC2206FB16DB8DA3000E5E2C(@Param("bePutInStorageld") String bePutInStorageld); 


}
