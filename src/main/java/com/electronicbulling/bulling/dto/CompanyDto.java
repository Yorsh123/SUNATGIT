package com.electronicbulling.bulling.dto;

public class CompanyDto {

    private int id;
    private String sol_user;
    private String sol_pass;
    private String ruc;
    private String razon_social;
    private String direccion;
    private String certificado;
    private String logo;
    private String token;
    public CompanyDto(){}

    public CompanyDto(int id,String sol_user, String sol_pass, String ruc, String razon_social, String direccion, String certificado, String logo, String token) {
        this.sol_user = sol_user;
        this.sol_pass = sol_pass;
        this.ruc = ruc;
        this.razon_social = razon_social;
        this.direccion = direccion;
        this.certificado = certificado;
        this.logo = logo;
        this.token = token;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSol_user() {
        return sol_user;
    }

    public void setSol_user(String sol_user) {
        this.sol_user = sol_user;
    }

    public String getSol_pass() {
        return sol_pass;
    }

    public void setSol_pass(String sol_pass) {
        this.sol_pass = sol_pass;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
