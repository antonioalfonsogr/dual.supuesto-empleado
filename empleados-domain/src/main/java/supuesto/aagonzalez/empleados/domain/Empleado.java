package supuesto.aagonzalez.empleados.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Empleado {

    private Long idEmpleado;

    private String nif;

    private String nombre;

    private String apellidos;

    private String iban;

    private LocalDate fechaIncorporacion;

    private Long idDepartamento;

    private Long idLinea;

}
 