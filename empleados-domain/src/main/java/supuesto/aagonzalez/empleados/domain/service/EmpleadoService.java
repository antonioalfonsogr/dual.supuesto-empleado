package supuesto.aagonzalez.empleados.domain.service;

import supuesto.aagonzalez.empleados.domain.Empleado;

import java.util.List;

public interface EmpleadoService {

    Empleado insertarEmpleado(Empleado empleado);

    List<Empleado> obtenerEmpleados();

    Empleado obtenerEmpleado(Long idEmpleado);

    void actualizarEmpleado(Long idEmpleado, Empleado empleado);

    void eliminarEmpleado(Long idEmpleado);
}
