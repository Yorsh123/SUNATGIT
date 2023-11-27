package com.electronicbulling.bulling.entity;


import java.util.List;

public class DataRuc {
    private String ruc;
    private String razonSocial;
    private String nombreComercial;
    private List<String> telefonos;
    private String tipo;
    private String estado;
    private String condicion;
    private String fechaInscripcion;
    private String sistEmsion;
    private String sistContabilidad;
    private String actExterior;
    private List<String> actEconomicas;
    private List<String> cpPago;
    private List<String> sistElectronica;
    private List<String> cpeElectronico;
    private List<String> padrones;
    private String fechaEmisorFe;
    private String fechaPle;
    private String fechaBaja;
    private String profesion;
    private String ubigeo;
    private String capital;
    private String direccion;
    private String departamento;
    private String provincia;
    private String distrito;
    private Boolean success;
    private String message;

    public DataRuc() {
    }

    public DataRuc(String ruc, String razonSocial, String nombreComercial, List<String> telefonos, String tipo, String estado, String condicion, String fechaInscripcion, String sistEmsion, String sistContabilidad, String actExterior, List<String> actEconomicas, List<String> cpPago, List<String> sistElectronica, List<String> cpeElectronico, List<String> padrones, String fechaEmisorFe, String fechaPle, String fechaBaja, String profesion, String ubigeo, String capital, String direccion, String departamento, String provincia, String distrito, Boolean success, String message) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.nombreComercial = nombreComercial;
        this.telefonos = telefonos;
        this.tipo = tipo;
        this.estado = estado;
        this.condicion = condicion;
        this.fechaInscripcion = fechaInscripcion;
        this.sistEmsion = sistEmsion;
        this.sistContabilidad = sistContabilidad;
        this.actExterior = actExterior;
        this.actEconomicas = actEconomicas;
        this.cpPago = cpPago;
        this.sistElectronica = sistElectronica;
        this.cpeElectronico = cpeElectronico;
        this.padrones = padrones;
        this.fechaEmisorFe = fechaEmisorFe;
        this.fechaPle = fechaPle;
        this.fechaBaja = fechaBaja;
        this.profesion = profesion;
        this.ubigeo = ubigeo;
        this.capital = capital;
        this.direccion = direccion;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.success = success;
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getSistEmsion() {
        return sistEmsion;
    }

    public void setSistEmsion(String sistEmsion) {
        this.sistEmsion = sistEmsion;
    }

    public String getSistContabilidad() {
        return sistContabilidad;
    }

    public void setSistContabilidad(String sistContabilidad) {
        this.sistContabilidad = sistContabilidad;
    }

    public String getActExterior() {
        return actExterior;
    }

    public void setActExterior(String actExterior) {
        this.actExterior = actExterior;
    }

    public List<String> getActEconomicas() {
        return actEconomicas;
    }

    public void setActEconomicas(List<String> actEconomicas) {
        this.actEconomicas = actEconomicas;
    }

    public List<String> getCpPago() {
        return cpPago;
    }

    public void setCpPago(List<String> cpPago) {
        this.cpPago = cpPago;
    }

    public List<String> getSistElectronica() {
        return sistElectronica;
    }

    public void setSistElectronica(List<String> sistElectronica) {
        this.sistElectronica = sistElectronica;
    }

    public List<String> getCpeElectronico() {
        return cpeElectronico;
    }

    public void setCpeElectronico(List<String> cpeElectronico) {
        this.cpeElectronico = cpeElectronico;
    }

    public List<String> getPadrones() {
        return padrones;
    }

    public void setPadrones(List<String> padrones) {
        this.padrones = padrones;
    }

    public String getFechaEmisorFe() {
        return fechaEmisorFe;
    }

    public void setFechaEmisorFe(String fechaEmisorFe) {
        this.fechaEmisorFe = fechaEmisorFe;
    }

    public String getFechaPle() {
        return fechaPle;
    }

    public void setFechaPle(String fechaPle) {
        this.fechaPle = fechaPle;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
