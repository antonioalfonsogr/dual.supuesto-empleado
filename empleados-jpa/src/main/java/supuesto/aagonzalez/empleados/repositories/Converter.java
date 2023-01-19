package supuesto.aagonzalez.empleados.repositories;

import org.springframework.stereotype.Component;
import supuesto.aagonzalez.empleados.domain.Empleado;

import java.util.ArrayList;
import java.util.List;

@Component
public class Converter {

    // EMPLEADOS

    public Empleado toEmpleado(EmpleadoEntity empleadoEntity) {

        Empleado empleado = new Empleado();

        empleado.setIdEmpleado(empleadoEntity.getIdEmpleado());
        empleado.setNif(empleadoEntity.getNif());
        empleado.setNombre(empleadoEntity.getNombre());
        empleado.setApellidos(empleadoEntity.getApellidos());
        empleado.setIban(empleadoEntity.getIban());
        empleado.setFechaIncorporacion(empleadoEntity.getFechaIncorporacion());
        empleado.setIdDepartamento(empleadoEntity.getIdDepartamento());
        empleado.setIdLinea(empleadoEntity.getIdLinea());

        return empleado;
    }

    public EmpleadoEntity toEmpleadoEntity(Empleado empleado) {

        EmpleadoEntity empleadoEntity = new EmpleadoEntity();

        empleadoEntity.setIdEmpleado(empleado.getIdEmpleado());
        empleadoEntity.setNif(empleado.getNif());
        empleadoEntity.setNombre(empleado.getNombre());
        empleadoEntity.setApellidos(empleado.getApellidos());
        empleadoEntity.setIban(empleado.getIban());
        empleadoEntity.setFechaIncorporacion(empleado.getFechaIncorporacion());
        empleadoEntity.setIdDepartamento(empleado.getIdDepartamento());
        empleadoEntity.setIdLinea(empleado.getIdLinea());

        return empleadoEntity;
    }

    public List<Empleado> toEmpleados(List<EmpleadoEntity> all) {
        List<Empleado> empleadoList = new ArrayList<>();
        for (EmpleadoEntity c : all) {
            empleadoList.add(toEmpleado(c));
        }
        return empleadoList;
    }

    public List<EmpleadoEntity> toEmpleadosEntities(List<Empleado> all) {
        List<EmpleadoEntity> empleadoEntityList = new ArrayList<>();
        for (Empleado c : all) {
            empleadoEntityList.add(toEmpleadoEntity(c));
        }
        return empleadoEntityList;
    }

}
