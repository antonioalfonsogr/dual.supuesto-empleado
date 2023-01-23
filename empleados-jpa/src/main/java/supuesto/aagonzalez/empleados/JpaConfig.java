package supuesto.aagonzalez.empleados;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "supuesto.aagonzalez.empleados")

//@EntityScan(basePackages = "supuesto.aagonzalez.empleados")
public class JpaConfig {

}
