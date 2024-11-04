package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.repository.LoadBePutInStorageByRequestOrderNumber1CustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.BePutInStorageStructureStructure; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadBePutInStorageByRequestOrderNumber1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadBePutInStorageByRequestOrderNumber1CustomizeServiceMapper loadBePutInStorageByRequestOrderNumber1CustomizeServiceMapper;
    @Autowired
    private LoadTotalQuantity1CustomizeService loadTotalQuantity1CustomizeService;
    public List<BePutInStorageStructureStructure> loadBePutInStorageByRequestOrderNumber1(String bePutInStorageld) {
        BePutInStorageStructureStructure BePutInStorage = new BePutInStorageStructureStructure();
        List<BePutInStorageStructureStructure> result = new ArrayList<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1898454AAC2206FB16DB8DA3000E5E2C> currentLcpEachName_1 = CommonFunctionUtil.createListPage(loadBePutInStorageByRequestOrderNumber1CustomizeServiceMapper.getAnonymousStructure_1898454AAC2206FB16DB8DA3000E5E2C(bePutInStorageld), loadBePutInStorageByRequestOrderNumber1CustomizeServiceMapper.countAnonymousStructure_1898454AAC2206FB16DB8DA3000E5E2C(bePutInStorageld).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3A525CE3893F34064E58B58321DD1B26.class).list;
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1898454AAC2206FB16DB8DA3000E5E2C item = currentLcpEachName_1.get(index.intValue());
            BePutInStorage.cumulativeStorage = loadTotalQuantity1CustomizeService.loadTotalQuantity1(item.receivingDetails.id, item.receivingDetails.materialNumber); 
            BePutInStorage.material = item.materialDetails; 
            BePutInStorage.receivingDetails = item.receivingDetails; 
            BePutInStorage.unitName = item.measuringUnit.unitName; 
            BePutInStorage.bePutInStorageDetails = item.bePutInStorageDetails; 
            CommonFunctionUtil.add(result, CommonFunctionUtil.clone(BePutInStorage));
        } 

        return result;
    } 


}
