package co.com.poli.eventospoli.repository;

import co.com.poli.eventospoli.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
