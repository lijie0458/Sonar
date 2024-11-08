package com.dogfood.aa20240808.repository; 

import java.time.LocalDate; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3F352B7D9C6EC2FC4504021A3B87F456; 
import org.apache.ibatis.annotations.Param; 

public interface GetScheduleByDateCustomizeServiceMapper {

List<AnonymousStructure_3F352B7D9C6EC2FC4504021A3B87F456> getAnonymousStructure_3F352B7D9C6EC2FC4504021A3B87F456(@Param("createDate") LocalDate createDate); 

Long countAnonymousStructure_3F352B7D9C6EC2FC4504021A3B87F456(@Param("createDate") LocalDate createDate); 

}
