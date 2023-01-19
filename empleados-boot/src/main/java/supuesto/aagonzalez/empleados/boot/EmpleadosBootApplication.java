package supuesto.aagonzalez.empleados.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "supuesto.aagonzalez.empleados")
@SpringBootApplication
public class EmpleadosBootApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(EmpleadosBootApplication.class, args);
    }

}
