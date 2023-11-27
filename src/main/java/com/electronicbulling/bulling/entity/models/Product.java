package com.electronicbulling.bulling.entity.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("products")
public class Product {
    private String codProduct;
    private String unidad;
    private String descripcion;
    private int cantidad;
    private int mtoValorUnitario;
    private int mtoValorVenta;
    private int mtoBaseIgv;
    private int porcentajeIgv;
    private int igv;
    private int tipAfeIgv;
    private int totalImpuestos;
    private int mtoPrecioUnitario;

    public Product(){
        this.codProduct = "P001";
        this.unidad = "NIU";
        this.mtoBaseIgv = 100;
        this.porcentajeIgv = 18;
        this.igv = 18;
        this.tipAfeIgv = 10;
        this.totalImpuestos = 18;
    }

    public Product(String codProduct, String unidad, String descripcion, int cantidad, int mtoValorUnitario, int mtoValorVenta, int mtoBaseIgv, int porcentajeIgv, int igv, int tipAfeIgv, int totalImpuestos, int mtoPrecioUnitario) {
        this.codProduct = codProduct;
        this.unidad = unidad;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.mtoValorUnitario = mtoValorUnitario;
        this.mtoValorVenta = mtoValorVenta;
        this.mtoBaseIgv = mtoBaseIgv;
        this.porcentajeIgv = porcentajeIgv;
        this.igv = igv;
        this.tipAfeIgv = tipAfeIgv;
        this.totalImpuestos = totalImpuestos;
        this.mtoPrecioUnitario = mtoPrecioUnitario;
    }

    public String getCodProduct() {
        return codProduct;
    }

    public void setCodProduct(String codProduct) {
        this.codProduct = codProduct;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMtoValorUnitario() {
        return mtoValorUnitario;
    }

    public void setMtoValorUnitario(int mtoValorUnitario) {
        this.mtoValorUnitario = mtoValorUnitario;
    }

    public int getMtoValorVenta() {
        return mtoValorVenta;
    }

    public void setMtoValorVenta(int mtoValorVenta) {
        this.mtoValorVenta = mtoValorVenta;
    }

    public int getMtoBaseIgv() {
        return mtoBaseIgv;
    }

    public void setMtoBaseIgv(int mtoBaseIgv) {
        this.mtoBaseIgv = mtoBaseIgv;
    }

    public int getPorcentajeIgv() {
        return porcentajeIgv;
    }

    public void setPorcentajeIgv(int porcentajeIgv) {
        this.porcentajeIgv = porcentajeIgv;
    }

    public int getIgv() {
        return igv;
    }

    public void setIgv(int igv) {
        this.igv = igv;
    }

    public int getTipAfeIgv() {
        return tipAfeIgv;
    }

    public void setTipAfeIgv(int tipAfeIgv) {
        this.tipAfeIgv = tipAfeIgv;
    }

    public int getTotalImpuestos() {
        return totalImpuestos;
    }

    public void setTotalImpuestos(int totalImpuestos) {
        this.totalImpuestos = totalImpuestos;
    }

    public int getMtoPrecioUnitario() {
        return mtoPrecioUnitario;
    }

    public void setMtoPrecioUnitario(int mtoPrecioUnitario) {
        this.mtoPrecioUnitario = mtoPrecioUnitario;
    }
}
