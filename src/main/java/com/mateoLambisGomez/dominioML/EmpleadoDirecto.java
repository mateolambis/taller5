package com.mateoLambisGomez.dominioML;

public class EmpleadoDirecto extends Empleado {
    private int salarioBaseMateo;
    private double ventasDelMesMateo;

    public EmpleadoDirecto(String nombreMateo, int salarioBaseMateo) {
        super(nombreMateo);
        this.salarioBaseMateo = salarioBaseMateo;
    }


    @Override
    public Long calcularNominaLambis() {
        double salarioMateo = salarioBaseMateo - (salarioBaseMateo * 0.05) - (salarioBaseMateo * 0.065);
        if (ventasDelMesMateo < 1000000) {
            salarioMateo += ventasDelMesMateo * 0.04;
        } else {
            salarioMateo += ventasDelMesMateo * 0.035;
        }
        long salarioRedondeado = Math.round(salarioMateo);
        return salarioRedondeado;
    }

    public int getSalarioBaseMateo() {
        return salarioBaseMateo;
    }

    public double getVentasDelMesMateo() {
        return ventasDelMesMateo;
    }

    public void setVentasDelMesMateo(double ventasDelMesMateo) {
        this.ventasDelMesMateo = ventasDelMesMateo;
    }
}

