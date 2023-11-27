package com.electronicbulling.bulling.entity.models;

public class FormaPago {
    private String moneda;
    private String tipo;
    public FormaPago() {
        this.moneda = "PEN";
        this.tipo = "Contado";
    }

    public FormaPago(String moneda, String tipo) {
        this.moneda = moneda;
        this.tipo = tipo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
