package clases;

import java.util.List;
import Interface.Empleado;

public interface EmpleadoService {
    void registrarEmpleado(Empleado empleado);
    List<Empleado> listarEmpleados();
    void bajarEmpleado(String id);
    double calcularIgss(Empleado empleado);
    double calcularIrtra(Empleado empleado);
    void agregarBono(Empleado empleado, double bono);
    void agregarDescuento(Empleado empleado, double descuento);
}


