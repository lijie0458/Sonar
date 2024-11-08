package com.dogfood.aa20240808.web.controller.logics; 

import org.springframework.web.bind.annotation.RestController; 
import com.netease.lowcode.extension.excel.ExcelParser; 
import com.netease.lowcode.extension.excel.dto.ExcelParseResult; 
import com.dogfood.aa20240808.web.validation.Validation; 
import com.dogfood.aa20240808.web.controller.logics.dto.Excel_parserParseAllSheetControllerDto; 
import com.dogfood.aa20240808.web.ApiReturn; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.RequestBody; 
import com.dogfood.aa20240808.web.validation.ValidationRuleGroup; 

@RestController
public class Excel_parserParseAllSheetController {

    @Validation(value = { @ValidationRuleGroup(value = "8919607c-4d63-4edf-bd8c-da7cc7aaa2d3",rules = { }),@ValidationRuleGroup(value = "1a02e601-d7ef-4a8f-aebe-e2dd22f5ecb1",rules = { }),@ValidationRuleGroup(value = "384a9339-0d83-4a3f-813f-fc748a223fe0",rules = { }),@ValidationRuleGroup(value = "ed3dd8a0-c6f8-419f-8dca-48b1825427b3",rules = { }),@ValidationRuleGroup(value = "ebed191938b144a4bba2befc2807123c",rules = { }),@ValidationRuleGroup(value = "80655f17-279f-4d1c-9d4c-08a1475d5836",rules = { }),@ValidationRuleGroup(value = "9624801a9f75435e8c13bb218afe3f4f",rules = { }),@ValidationRuleGroup(value = "b13c69ca-d26b-4e96-b759-80986646a1dd",rules = { }),@ValidationRuleGroup(value = "a508ce30-58bc-4967-aa26-1cc7b72532ef",rules = { }),@ValidationRuleGroup(value = "ff47b123-7298-464e-9a39-e8068b9a52ec",rules = { }),@ValidationRuleGroup(value = "da625510-481a-4342-86c9-6ad284ba02e4",rules = { }),@ValidationRuleGroup(value = "6bc378646c9748bea2414bccdf70f357",rules = { }),@ValidationRuleGroup(value = "4f6ccde1-b2e0-460f-8bd9-181301542dbe",rules = { })})
    @PostMapping("/api/excel_parser/parseAllSheet")
    public ApiReturn<ExcelParseResult> parseAllSheet(@RequestBody Excel_parserParseAllSheetControllerDto body) throws Exception {
        return ApiReturn.of(ExcelParser.parseAllSheet(body.getPath(), body.getRect(), body.getColumnFieldMap(), body.getRow(), body.getTypeArgumentClass(0)));
    } 

}
