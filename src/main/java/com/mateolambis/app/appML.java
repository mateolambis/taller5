package com.mateolambis.app;

import com.mateolambis.dominio.EmpleadoDirectoML;
import com.mateolambis.dominio.EmpleadoFreelancerML;
import com.mateolambis.dominio.NominaML;
import com.mateolambis.dominio.PromotorML;

public class appML {
    public static void main(String[] args) {
        NominaML nomina = new NominaML();

        EmpleadoDirectoML juan = new EmpleadoDirectoML("Juan", 4_840_000);
        EmpleadoDirectoML julian = new EmpleadoDirectoML("Julián", 2_050_000);
        EmpleadoFreelancerML johanna = new EmpleadoFreelancerML("Johanna", 71_000);
        EmpleadoDirectoML carolina = new EmpleadoDirectoML("Carolina", 980_000);
        PromotorML pedro = new PromotorML("Pedro");
        EmpleadoDirectoML david = new EmpleadoDirectoML("David", 3_975_000);
        EmpleadoFreelancerML gustavo = new EmpleadoFreelancerML("Gustavo", 42_500);

        juan.setVentasDelMesML(0);
        julian.setVentasDelMesML(45_510_000);
        johanna.setHorasTrabajadasML(89);
        carolina.setVentasDelMesML(35_989_000);
        pedro.setVolantesRepartidosML(1_200);
        pedro.setComprasConVolanteML(62);
        david.setVentasDelMesML(0);
        gustavo.setHorasTrabajadasML(65);

        nomina.agregarEmpleado(juan);
        nomina.agregarEmpleado(julian);
        nomina.agregarEmpleado(johanna);
        nomina.agregarEmpleado(carolina);
        nomina.agregarEmpleado(pedro);
        nomina.agregarEmpleado(david);
        nomina.agregarEmpleado(gustavo);

        nomina.listarEmpleados();
    }
}

