package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadDetailByidCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_67381CA0D7647299E0C3FDC3F30AC0E8> getAnonymousStructure_67381CA0D7647299E0C3FDC3F30AC0E8(@Param("id") List<Long> id); 

Long countAnonymousStructure_67381CA0D7647299E0C3FDC3F30AC0E8(@Param("id") List<Long> id); 


}
