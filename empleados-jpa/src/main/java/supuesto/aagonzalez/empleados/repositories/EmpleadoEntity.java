package supuesto.aagonzalez.empleados.repositories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empleados")
@EqualsAndHashCode()
public class EmpleadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado", unique = true, nullable = false)
    private Long idEmpleado;

    @Column(name = "nif")
    private String nif;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "iban")
    private String iban;

    @Column(name = "fecha_incorporacion")
    private LocalDate fechaIncorporacion;

    @Column(name = "id_departamento")
    private Long idDepartamento;

    @Column(name = "id_linea")
    private Long idLinea;
}
