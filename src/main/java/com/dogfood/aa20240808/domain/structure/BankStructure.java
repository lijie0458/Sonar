package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class BankStructure {

    @Label("存储银行账号")
    public String bank_account;
    @Label("存储账户名称")
    public String account_name;
    @Label("开户银行")
    public String bank_name;
    public String getBank_account() {
        return bank_account;
    } 

    public void setBank_account(String bank_account) {
        this.bank_account = bank_account; 
    } 

    public String getAccount_name() {
        return account_name;
    } 

    public void setAccount_name(String account_name) {
        this.account_name = account_name; 
    } 

    public String getBank_name() {
        return bank_name;
    } 

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name; 
    } 


}
