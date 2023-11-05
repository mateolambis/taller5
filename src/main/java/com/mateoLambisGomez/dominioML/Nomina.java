package com.mateoLambisGomez.dominioML;
import java.util.ArrayList;
import java.util.List;
public class Nomina {
    private List<Empleado> empleadosMateo;

    public Nomina() {
        empleadosMateo = new ArrayList<>();
    }


    public void agregarEmpleadoLambis(Empleado empleado) {
        empleadosMateo.add(empleado);
    }

    public void listarEmpleadosLambis() {
        for (Empleado empleado : empleadosMateo) {
            System.out.println(empleado.getNombreMateo() + " - Tipo: " + empleado.getClass().getSimpleName() + " - Salario: " + empleado.calcularNominaLambis());
        }
    }

}
