package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1D2DC7F55959D3D5C236424A345BEABF; 
import org.apache.ibatis.annotations.Param; 

public interface UpdateInventoryByTransferSlip1CustomizeServiceMapper {

List<AnonymousStructure_1D2DC7F55959D3D5C236424A345BEABF> getAnonymousStructure_1D2DC7F55959D3D5C236424A345BEABF(@Param("documentNumber") String documentNumber); 

}
