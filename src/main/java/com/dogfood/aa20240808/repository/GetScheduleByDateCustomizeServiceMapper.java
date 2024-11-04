package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface GetScheduleByDateCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3F352B7D9C6EC2FC4504021A3B87F456> getAnonymousStructure_3F352B7D9C6EC2FC4504021A3B87F456(@Param("createDate") java.time.LocalDate createDate); 

Long countAnonymousStructure_3F352B7D9C6EC2FC4504021A3B87F456(@Param("createDate") java.time.LocalDate createDate); 


}
