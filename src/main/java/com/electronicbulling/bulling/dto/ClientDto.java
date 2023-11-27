package com.electronicbulling.bulling.dto;

public class ClientDto {
    private String numDoc;
    private String rznSocial;

    public ClientDto(String numDoc, String rznSocial) {
        this.numDoc = numDoc;
        this.rznSocial = rznSocial;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getRznSocial() {
        return rznSocial;
    }

    public void setRznSocial(String rznSocial) {
        this.rznSocial = rznSocial;
    }
}
