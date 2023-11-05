package com.mateoLambisGomez.dominioML;

public class Promotor extends Empleado {
    private int volantesRepartidosMateo;
    private long valorVolanteMateo;
    private int comprasConVolanteMateo;


    public Promotor(String nombreMateo, int volantesRepartidosMateo, long valorVolanteMateo, int comprasConVolanteMateo) {
        super(nombreMateo);
        this.volantesRepartidosMateo = volantesRepartidosMateo;
        this.valorVolanteMateo = valorVolanteMateo;
        this.comprasConVolanteMateo = comprasConVolanteMateo;
    }

    @Override
    public Long calcularNominaLambis() {
        return (long) (volantesRepartidosMateo * valorVolanteMateo) + (comprasConVolanteMateo * 15_000);
    }

    public int getVolantesRepartidosMateo() {
        return volantesRepartidosMateo;
    }

    public long getValorVolanteMateo() {
        return valorVolanteMateo;
    }

    public int getComprasConVolanteMateo() {
        return comprasConVolanteMateo;
    }

    public void setVolantesRepartidosMateo(int volantesRepartidosMateo) {
        this.volantesRepartidosMateo = volantesRepartidosMateo;
    }

    public void setComprasConVolanteMateo(int comprasConVolanteMateo) {
        this.comprasConVolanteMateo = comprasConVolanteMateo;
    }


}

