package com.mateolambis.dominio;
import java.util.ArrayList;
import java.util.List;
public class NominaML {
    private List<EmpleadoML> empleadosML;

    public NominaML() {
        empleadosML = new ArrayList<>();
    }

    public void agregarEmpleado(EmpleadoML empleadoML) {
        empleadosML.add(empleadoML);
    }

    public void listarEmpleados() {
        for (EmpleadoML empleadoML : empleadosML) {
            System.out.println(empleadoML.getNombreML() + " - Tipo: " + empleadoML.getClass().getSimpleName() + " - Salario: " + empleadoML.calcularNominaML());
        }
    }

}
