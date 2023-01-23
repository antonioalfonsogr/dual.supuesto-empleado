package supuesto.aagonzalez.empleados.repositories;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "empleados")
@EqualsAndHashCode()
public class  EmpleadoEntity {


    @Id
    private Long idEmpleado;

    private String nif;

    private String nombre;

    private String apellidos;

    private String iban;

    private LocalDate fechaIncorporacion;

    private Long idDepartamento;

    private Long idLinea;
}
