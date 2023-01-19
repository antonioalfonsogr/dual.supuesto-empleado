package supuesto.aagonzalez.empleados.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import supuesto.aagonzalez.empleados.domain.Empleado;
import supuesto.aagonzalez.empleados.domain.service.EmpleadoService;

import java.util.List;

@RestController
@RequestMapping("empleados")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    @Autowired
    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping(value = "")
    public List<Empleado> obtenerEmpleados() {
        return empleadoService.obtenerEmpleados();
    }

    @PostMapping(value = "")
    public Empleado insertarEmpleado(@RequestBody Empleado empleado) {
        return this.empleadoService.insertarEmpleado(empleado);
    }

    @GetMapping(value = "/{id}")
    public Empleado obtenerEmpleado(@PathVariable Long id) {
        return this.empleadoService.obtenerEmpleado(id);
    }

    @PutMapping(value = "/{id}")
    public void actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado empleado) {
        this.empleadoService.actualizarEmpleado(id, empleado);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminarEmpleado(@PathVariable Long id) {
        this.empleadoService.eliminarEmpleado(id);
    }
}
