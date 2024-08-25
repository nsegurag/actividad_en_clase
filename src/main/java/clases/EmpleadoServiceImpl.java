package clases;

import java.util.ArrayList;
import java.util.List;
import Interface.Empleado;

public class EmpleadoServiceImpl implements EmpleadoService {
    private List<Empleado> empleados = new ArrayList<>();

    @Override
    public void registrarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public List<Empleado> listarEmpleados() {
        return empleados;
    }

    @Override
    public void bajarEmpleado(String id) {
        empleados.removeIf(e -> e.getId().equals(id));
    }

    @Override
    public double calcularIgss(Empleado empleado) {
        empleado.setIgss(empleado.getSalarioBase() * 0.0483);
        return empleado.getIgss();
    }

    @Override
    public double calcularIrtra(Empleado empleado) {
        empleado.setIrtra(empleado.getSalarioBase() * 0.01);
        return empleado.getIrtra();
    }

    @Override
    public void agregarBono(Empleado empleado, double bono) {
        empleado.setSalarioBase(empleado.getSalarioBase() + bono);
    }

    @Override
    public void agregarDescuento(Empleado empleado, double descuento) {
        empleado.setDeducciones(empleado.getDeducciones() + descuento);
    }
}
