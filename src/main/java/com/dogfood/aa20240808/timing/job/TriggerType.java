package com.dogfood.aa20240808.timing.job;

public enum TriggerType {
    CRONTRIGGER("cronTrigger");
    private String type;
    TriggerType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
