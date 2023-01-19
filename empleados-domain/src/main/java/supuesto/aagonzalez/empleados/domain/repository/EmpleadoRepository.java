package supuesto.aagonzalez.empleados.domain.repository;

import supuesto.aagonzalez.empleados.domain.Empleado;

import java.util.List;
import java.util.Optional;

public interface EmpleadoRepository {

    List<Empleado> obtenerEmpleados();

    Optional<Empleado> obtenerEmpleado(Long idEmpleado);

    Empleado insertarEmpleado(Empleado empleado);

    void actualizarEmpleado(Long idEmpleado, Empleado empleado);

    void eliminarEmpleado(Long idEmpleado);

}

