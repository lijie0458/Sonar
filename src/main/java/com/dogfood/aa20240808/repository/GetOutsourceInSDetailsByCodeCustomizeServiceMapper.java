package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_919167615A5AED1D8A6E68143881444A; 
import org.apache.ibatis.annotations.Param; 

public interface GetOutsourceInSDetailsByCodeCustomizeServiceMapper {

List<AnonymousStructure_919167615A5AED1D8A6E68143881444A> getAnonymousStructure_919167615A5AED1D8A6E68143881444A(@Param("code") String code); 

Long countAnonymousStructure_919167615A5AED1D8A6E68143881444A(@Param("code") String code); 

}
