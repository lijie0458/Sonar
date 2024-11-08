package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A0B03992F694D9DC0DBA09379A608DAA; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_EA050579F163467B7D2FD3E8C15362AF; 
import org.apache.ibatis.annotations.Param; 

public interface GetResOriginalDateOrSelectedDateByPerIdCustomizeServiceMapper {

List<AnonymousStructure_A0B03992F694D9DC0DBA09379A608DAA> getAnonymousStructure_A0B03992F694D9DC0DBA09379A608DAA(@Param("perId") Long perId); 

Long countAnonymousStructure_A0B03992F694D9DC0DBA09379A608DAA(@Param("perId") Long perId); 

List<AnonymousStructure_EA050579F163467B7D2FD3E8C15362AF> getAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF(@Param("variable2") List<Long> variable2); 

Long countAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF(@Param("variable2") List<Long> variable2); 

List<AnonymousStructure_EA050579F163467B7D2FD3E8C15362AF> getAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF1(@Param("variable2") List<Long> variable2); 

Long countAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF1(@Param("variable2") List<Long> variable2); 

}
