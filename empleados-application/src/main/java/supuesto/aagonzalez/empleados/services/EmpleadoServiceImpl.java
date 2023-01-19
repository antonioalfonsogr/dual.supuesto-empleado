package supuesto.aagonzalez.empleados.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import supuesto.aagonzalez.empleados.domain.Empleado;
import supuesto.aagonzalez.empleados.domain.repository.EmpleadoRepository;
import supuesto.aagonzalez.empleados.domain.service.EmpleadoService;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoServiceImpl(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    public Empleado insertarEmpleado(Empleado empleado) {
        return this.empleadoRepository.insertarEmpleado(empleado);
    }

    @Override
    public List<Empleado> obtenerEmpleados() {
        return this.empleadoRepository.obtenerEmpleados();
    }

    @Override
    public Empleado obtenerEmpleado(Long idEmpleado) {
        return this.empleadoRepository.obtenerEmpleado(idEmpleado).get();
    }

    @Override
    public void actualizarEmpleado(Long idEmpleado, Empleado empleado) {
        this.empleadoRepository.actualizarEmpleado(idEmpleado, empleado);
    }

    @Override
    public void eliminarEmpleado(Long idEmpleado) {
        this.empleadoRepository.eliminarEmpleado(idEmpleado);
    }
}
