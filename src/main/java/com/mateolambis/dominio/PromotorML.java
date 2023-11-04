package com.mateolambis.dominio;

public class PromotorML extends EmpleadoML {
    private int volantesRepartidosML;
    private int comprasConVolanteML;

    public PromotorML(String nombreML) {
        super(nombreML);
    }

    public void setVolantesRepartidosML(int volantesRepartidosML) {
        this.volantesRepartidosML = volantesRepartidosML;
    }

    public void setComprasConVolanteML(int comprasConVolanteML) {
        this.comprasConVolanteML = comprasConVolanteML;
    }

    @Override
    public double calcularNominaML() {
        return volantesRepartidosML * 15_000 + comprasConVolanteML * 15_000;
    }
}

