package com.mateolambis.dominio;

public class EmpleadoDirectoML extends EmpleadoML {
    private int salarioBaseML;
    private double ventasDelMesML;

    public EmpleadoDirectoML(String nombreML, int salarioBaseML) {
        super(nombreML);
        this.salarioBaseML = salarioBaseML;
    }


    @Override
    public double calcularNominaML() {
        double salarioML = salarioBaseML - (salarioBaseML * 0.05) - (salarioBaseML * 0.065);
        if (ventasDelMesML < 1000000) {
            salarioML += ventasDelMesML * 0.04;
        } else {
            salarioML += ventasDelMesML * 0.035;
        }
        long salarioRedondeado = Math.round(salarioML);
        return salarioRedondeado;
    }

    public int getSalarioBaseML() {
        return salarioBaseML;
    }

    public double getVentasDelMesML() {
        return ventasDelMesML;
    }

    public void setVentasDelMesML(double ventasDelMesML) {
        this.ventasDelMesML = ventasDelMesML;
    }
}

