package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_627D60E768ACE4DD4973B62FA955F62D; 
import org.apache.ibatis.annotations.Param; 

public interface GetOtherInSDetailsByCodeCustomizeServiceMapper {

List<AnonymousStructure_627D60E768ACE4DD4973B62FA955F62D> getAnonymousStructure_627D60E768ACE4DD4973B62FA955F62D(@Param("code") String code); 

Long countAnonymousStructure_627D60E768ACE4DD4973B62FA955F62D(@Param("code") String code); 

}
