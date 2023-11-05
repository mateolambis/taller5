package com.mateoLambisGomez.dominioML;

public abstract class Empleado {
    public String nombreMateo;

    public Empleado(String nombreMateo) {
        this.nombreMateo = nombreMateo;
    }
    public abstract Long calcularNominaLambis();

    public String getNombreMateo() {
        return nombreMateo;
    }

    public void setNombreMateo(String nombreMateo) {
        this.nombreMateo = nombreMateo;
    }


}
