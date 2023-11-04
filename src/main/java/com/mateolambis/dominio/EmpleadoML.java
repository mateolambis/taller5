package com.mateolambis.dominio;

public abstract class EmpleadoML {
    public String nombreML;

    public EmpleadoML(String nombreML) {
        this.nombreML = nombreML;
    }
    public abstract double calcularNominaML();

    public String getNombreML() {
        return nombreML;
    }

    public void setNombreML(String nombreML) {
        this.nombreML = nombreML;
    }


}
