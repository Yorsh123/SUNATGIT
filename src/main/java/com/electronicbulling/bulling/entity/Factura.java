package com.electronicbulling.bulling.entity;


import com.electronicbulling.bulling.entity.models.Client;
import com.electronicbulling.bulling.entity.models.FormaPago;
import com.electronicbulling.bulling.entity.models.Legends;
import com.electronicbulling.bulling.entity.models.Product;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("facturas")
public class Factura {
    private String ublVersion;
    private String tipoOperacion;
    private String tipoDoc;
    private String serie;
    private String correlativo;
    private String fechaEmision;
    private FormaPago formaPago;
    private String tipoMoneda;
    private Client client;
    private Company company;
    private int mtoOperGravadas;
    private int mtoIGV;
    private String valorVenta;
    private String totalImpuestos;
    private String subTotal;
    private int mtoImpVenta;
    private Product details;
    private Legends legends;

    public Factura (){
        this.ublVersion =  "2.1";
        this.tipoOperacion = "0101";
        this.tipoDoc = "03";
        this.serie ="B001";
        this.correlativo = "1";
        this.fechaEmision = new Date().toString();
        this.tipoMoneda = "PEN";
        this.mtoOperGravadas = 100;
        this.mtoIGV = 18;
        this.mtoImpVenta = 118;
        this.legends = new Legends();
    }

    public Factura(String ublVersion, String tipoOperacion, String tipoDoc, String serie, String correlativo, String fechaEmision, FormaPago formaPago, String tipoMoneda, Client client, Company company, int mtoOperGravadas, int mtoIGV, String valorVenta, String totalImpuestos, String subTotal, int mtoImpVenta, Product details) {
        this.ublVersion = ublVersion;
        this.tipoOperacion = tipoOperacion;
        this.tipoDoc = tipoDoc;
        this.serie = serie;
        this.correlativo = correlativo;
        this.fechaEmision = fechaEmision;
        this.formaPago = formaPago;
        this.tipoMoneda = tipoMoneda;
        this.client = client;
        this.company = company;
        this.mtoOperGravadas = mtoOperGravadas;
        this.mtoIGV = mtoIGV;
        this.valorVenta = valorVenta;
        this.totalImpuestos = totalImpuestos;
        this.subTotal = subTotal;
        this.mtoImpVenta = mtoImpVenta;
        this.details = details;
    }

    public String getUblVersion() {
        return ublVersion;
    }

    public void setUblVersion(String ublVersion) {
        this.ublVersion = ublVersion;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getMtoOperGravadas() {
        return mtoOperGravadas;
    }

    public void setMtoOperGravadas(int mtoOperGravadas) {
        this.mtoOperGravadas = mtoOperGravadas;
    }

    public int getMtoIGV() {
        return mtoIGV;
    }

    public void setMtoIGV(int mtoIGV) {
        this.mtoIGV = mtoIGV;
    }

    public String getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(String valorVenta) {
        this.valorVenta = valorVenta;
    }

    public String getTotalImpuestos() {
        return totalImpuestos;
    }

    public void setTotalImpuestos(String totalImpuestos) {
        this.totalImpuestos = totalImpuestos;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    public int getMtoImpVenta() {
        return mtoImpVenta;
    }

    public void setMtoImpVenta(int mtoImpVenta) {
        this.mtoImpVenta = mtoImpVenta;
    }

    public Product getDetails() {
        return details;
    }

    public void setDetails(Product details) {
        this.details = details;
    }

    public Legends getLegends() {
        return legends;
    }

    public void setLegends(Legends legends) {
        this.legends = legends;
    }
}
