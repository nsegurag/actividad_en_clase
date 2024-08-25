package clases;

import Interface.Empleado;

public class Main {
    public static void main(String[] args) {
        EmpleadoService empleadoService = new EmpleadoServiceImpl();

        Empleado emp1 = new Empleado("001", "Juan Perez", "Desarrollador", 5000, "2024-01-15", "IT");
        Empleado emp2 = new Empleado("002", "Ana Gomez", "Analista", 4000, "2023-05-20", "Finanzas");

        empleadoService.registrarEmpleado(emp1);
        empleadoService.registrarEmpleado(emp2);

        empleadoService.agregarBono(emp1, 500);
        empleadoService.agregarDescuento(emp2, 200);

        System.out.println("Lista de empleados:");
        for (Empleado e : empleadoService.listarEmpleados()) {
            System.out.println("ID: " + e.getId() + ", Nombre: " + e.getNombre() + ", Salario: " + e.getSalarioBase());
        }

        System.out.println("Cálculo IGSS de Juan Perez: " + empleadoService.calcularIgss(emp1));
        System.out.println("Cálculo IRTRA de Ana Gomez: " + empleadoService.calcularIrtra(emp2));

        empleadoService.bajarEmpleado("001");

        System.out.println("Lista de empleados después de dar de baja a Juan Perez:");
        for (Empleado e : empleadoService.listarEmpleados()) {
            System.out.println("ID: " + e.getId() + ", Nombre: " + e.getNombre());
        }
    }
}

