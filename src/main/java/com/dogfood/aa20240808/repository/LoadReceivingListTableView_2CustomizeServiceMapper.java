package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.entities.ReceivingNotificationsEntity; 
import org.apache.ibatis.annotations.Param; 

public interface LoadReceivingListTableView_2CustomizeServiceMapper {

List<AnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F> getAnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F(@Param("filter") ReceivingNotificationsEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon); 

Long countAnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F(@Param("filter") ReceivingNotificationsEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon); 

}
