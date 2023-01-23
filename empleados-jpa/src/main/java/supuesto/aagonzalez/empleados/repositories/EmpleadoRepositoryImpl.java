package supuesto.aagonzalez.empleados.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import supuesto.aagonzalez.empleados.domain.Empleado;
import supuesto.aagonzalez.empleados.domain.repository.EmpleadoRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Repository
public class EmpleadoRepositoryImpl implements EmpleadoRepository {

    private final EmpleadoCrudRepository empleadoCrudRepository;
    private final Converter converter;

    @Autowired
    public EmpleadoRepositoryImpl(EmpleadoCrudRepository empleadoCrudRepository, Converter converter) {
        this.empleadoCrudRepository = empleadoCrudRepository;
        this.converter = converter;
    }

    @Override
    public List<Empleado> obtenerEmpleados() {
        return this.converter.toEmpleados(this.empleadoCrudRepository.findAll());
    }

    @Override
    public Optional<Empleado> obtenerEmpleado(Long idEmpleado) {
        EmpleadoEntity empleadoEntity = this.empleadoCrudRepository.findById(idEmpleado).orElseThrow();
        return Optional.of(this.converter.toEmpleado(empleadoEntity));
    }

    @Override
    public Empleado insertarEmpleado(Empleado empleado) {
        EmpleadoEntity empleadoEntity = this.converter.toEmpleadoEntity(empleado);
        empleadoEntity.setIdEmpleado(autoIncrement());
        return this.converter.toEmpleado(this.empleadoCrudRepository.save(empleadoEntity));
    }

    @Override
    public void actualizarEmpleado(Long idEmpleado, Empleado empleado) {
        EmpleadoEntity empleadoEntity = this.empleadoCrudRepository.findById(idEmpleado).orElseThrow();
        empleadoEntity.setNif(empleado.getNif());
        empleadoEntity.setNombre(empleado.getNombre());
        empleadoEntity.setApellidos(empleado.getApellidos());
        empleadoEntity.setIban(empleado.getIban());
        empleadoEntity.setFechaIncorporacion(empleado.getFechaIncorporacion());
        empleadoEntity.setIdDepartamento(empleado.getIdDepartamento());
        empleadoEntity.setIdLinea(empleado.getIdLinea());
        this.converter.toEmpleado(this.empleadoCrudRepository.save(empleadoEntity));
    }

    @Override
    public void eliminarEmpleado(Long idEmpleado) {
        EmpleadoEntity empleadoEntity = this.empleadoCrudRepository.findById(idEmpleado).orElseThrow();
        this.empleadoCrudRepository.deleteById(empleadoEntity.getIdEmpleado());
    }

    private Long autoIncrement(){
        List<EmpleadoEntity> empleados = empleadoCrudRepository.findAll();
        return empleados.isEmpty() ? 1 :
                empleados.stream().max(Comparator.comparing(EmpleadoEntity::getIdEmpleado)).get().getIdEmpleado() + 1;
    }
}

