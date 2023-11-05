package com.mateoLambisGomez.dominioML;

public class Vendedor extends EmpleadoDirecto{
    private long ventasDelMesMateo;

    public Vendedor(String nombreMateo, double salarioMateo, long ventasDelMesMateo) {
        super(nombreMateo, (int) salarioMateo);
        this.ventasDelMesMateo = ventasDelMesMateo;
    }

    @Override
    public Long calcularNominaLambis() {
        return getSalarioBaseMateo() + calcularComisionLambis();
    }

    public long calcularComisionLambis(){
        long comision = 0;
        if (getSalarioBaseMateo() < 999999){
            comision = (long) ((ventasDelMesMateo * 0.04));
        } else {
            comision = (long) ((ventasDelMesMateo * 0.035));
        }
        return comision;
    }

    public double getVentasDelMesMateo() {
        return ventasDelMesMateo;
    }

    public void setVentasDelMesMateo(long ventasDelMesMateo) {
        this.ventasDelMesMateo = ventasDelMesMateo;
    }
}
