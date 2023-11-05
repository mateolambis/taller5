package com.mateoLambisGomez.appML;

import com.mateoLambisGomez.dominioML.EmpleadoDirecto;
import com.mateoLambisGomez.dominioML.EmpleadoFreelancer;
import com.mateoLambisGomez.dominioML.Nomina;
import com.mateoLambisGomez.dominioML.Promotor;

public class app {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();

        EmpleadoDirecto juan = new EmpleadoDirecto("Juan", 4840000);
        EmpleadoDirecto julian = new EmpleadoDirecto("Julián", 2050000);
        EmpleadoFreelancer johanna = new EmpleadoFreelancer("Johanna", 71000);
        EmpleadoDirecto carolina = new EmpleadoDirecto("Carolina", 98000);
        Promotor pedro = new Promotor("Pedro", 1200, 300, 62);
        EmpleadoDirecto david = new EmpleadoDirecto("David", 3975000);
        EmpleadoFreelancer gustavo = new EmpleadoFreelancer("Gustavo", 42500);

        juan.setVentasDelMesMateo(0);
        julian.setVentasDelMesMateo(45510000);
        johanna.setHorasTrabajadasMateo(89);
        carolina.setVentasDelMesMateo(35989000);
        pedro.setVolantesRepartidosMateo(1200);
        pedro.setComprasConVolanteMateo(62);
        david.setVentasDelMesMateo(0);
        gustavo.setHorasTrabajadasMateo(65);

        nomina.agregarEmpleadoLambis(juan);
        nomina.agregarEmpleadoLambis(julian);
        nomina.agregarEmpleadoLambis(johanna);
        nomina.agregarEmpleadoLambis(carolina);
        nomina.agregarEmpleadoLambis(pedro);
        nomina.agregarEmpleadoLambis(david);
        nomina.agregarEmpleadoLambis(gustavo);

        nomina.listarEmpleadosLambis();
    }
}

