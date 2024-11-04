package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadBePutInStorageByRequestOrderNumberCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F> getAnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F(@Param("ReceivingNotificationsId") String ReceivingNotificationsId); 

Long countAnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F(@Param("ReceivingNotificationsId") String ReceivingNotificationsId); 


}
