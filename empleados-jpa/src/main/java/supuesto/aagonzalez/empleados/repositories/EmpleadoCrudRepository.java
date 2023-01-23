package supuesto.aagonzalez.empleados.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpleadoCrudRepository extends MongoRepository<EmpleadoEntity, Long> {
}
