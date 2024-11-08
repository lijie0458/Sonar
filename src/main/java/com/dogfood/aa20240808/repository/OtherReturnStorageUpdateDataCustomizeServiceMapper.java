package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F2A18FEA2AB31F66360F783F068A12BE; 
import org.apache.ibatis.annotations.Param; 

public interface OtherReturnStorageUpdateDataCustomizeServiceMapper {

List<AnonymousStructure_F2A18FEA2AB31F66360F783F068A12BE> getAnonymousStructure_F2A18FEA2AB31F66360F783F068A12BE(@Param("otherReturnCode") String otherReturnCode); 

Long countAnonymousStructure_F2A18FEA2AB31F66360F783F068A12BE(@Param("otherReturnCode") String otherReturnCode); 

}
