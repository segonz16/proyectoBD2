package co.com.poli.eventospoli.repository;

import co.com.poli.eventospoli.model.Evento;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EventoRepository extends MongoRepository<Evento, String> {

    boolean existsByTitulo(String titulo);
    Optional<Evento> findByTitulo(String titulo);
}
