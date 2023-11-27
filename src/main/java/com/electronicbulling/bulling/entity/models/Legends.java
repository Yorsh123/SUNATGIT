package com.electronicbulling.bulling.entity.models;

public class Legends {

    private String code;
    private String value;

    public Legends(){
        this.code = "1000";
        this.value = "SON CIENTO DIECIOCHO CON 00/100 SOLES";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
