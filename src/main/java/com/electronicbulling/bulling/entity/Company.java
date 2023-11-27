package com.electronicbulling.bulling.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "companies")
public class Company {
    private String createdAt;
    private String updatedAt;
    @Id
    private int id;
    private String sol_user;
    private String sol_pass;
    private String ruc;
    private String razon_social;
    private String direccion;
    private String certificado;
    private String logo;
    //private Token token;
    private String code;

    private Token token;

    public Company() {}

    public Company(int id, String sol_user, String sol_pass, String ruc, String razon_social, String direccion, String certificado, String logo, String code) {
        this.id = id;
        this.sol_user = sol_user;
        this.sol_pass = sol_pass;
        this.ruc = ruc;
        this.razon_social = razon_social;
        this.direccion = direccion;
        this.certificado = certificado;
        this.logo = logo;
        this.code = code;
    }

    public Company(String createdAt, String updatedAt, int id, String sol_user, String sol_pass, String ruc, String razon_social, String direccion, String certificado, String logo, Token token) {
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
        this.sol_user = sol_user;
        this.sol_pass = sol_pass;
        this.ruc = ruc;
        this.razon_social = razon_social;
        this.direccion = direccion;
        this.certificado = certificado;
        this.logo = logo;
        this.token = token;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsol_user() {
        return sol_user;
    }

    public void setsol_user(String sol_user) {
        this.sol_user = sol_user;
    }

    public String getsol_pass() {
        return sol_pass;
    }

    public void setsol_pass(String sol_pass) {
        this.sol_pass = sol_pass;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getrazon_social() {
        return razon_social;
    }

    public void setrazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getcertificado() {
        return certificado;
    }

    public void setcertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }



    @JsonProperty("createdAt")
    public String getCreatedAt() {
        return createdAt;
    }


}
