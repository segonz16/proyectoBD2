package co.com.poli.eventospoli.repository;

import co.com.poli.eventospoli.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, String> {

    boolean existsById(String id);
    void deleteById(String identificacion);
}
