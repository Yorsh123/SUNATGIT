package com.electronicbulling.bulling.entity.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("clients")
public class Client {

    @Id
    private int id;
    private String tipoDoc;
    private String numDoc;
    private String rznSocial;

    public Client(){
    }

    public Client(int id, String tipoDoc, String numDoc, String rznSocial) {
        this.id = id;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.rznSocial = rznSocial;
    }

    public Client(String tipoDoc, String numDoc, String rznSocial) {
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.rznSocial = rznSocial;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
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
