package supuesto.aagonzalez.empleados;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "supuesto.aagonzalez.empleados")
@EntityScan(basePackages = "supuesto.aagonzalez.empleados")
public class JpaConfig {

}
