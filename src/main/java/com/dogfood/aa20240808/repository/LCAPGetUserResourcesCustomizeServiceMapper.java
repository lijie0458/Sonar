package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B202841ADEE061731D68863F55003B0E; 
import org.apache.ibatis.annotations.Param; 

public interface LCAPGetUserResourcesCustomizeServiceMapper {

List<AnonymousStructure_B202841ADEE061731D68863F55003B0E> getAnonymousStructure_B202841ADEE061731D68863F55003B0E(@Param("userId") String userId); 

Long countAnonymousStructure_B202841ADEE061731D68863F55003B0E(@Param("userId") String userId); 

}
