package co.com.poli.eventospoli.service;

import co.com.poli.eventospoli.model.Evento;
import co.com.poli.eventospoli.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {


    @Autowired
    private EventoRepository eventoRepository;

    public Evento createEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    public List<Evento> getAllEventos() {
        return eventoRepository.findAll();
    }

    public void deleteEvento(Evento evento) {
        eventoRepository.delete(evento);
    }

    public Optional<Evento> findByTituloEvento(String titulo) {
        return eventoRepository.findByTitulo(titulo);
    }

    public boolean existsById(String id) {
        return eventoRepository.existsById(id);
    }


    public boolean notExistsByTitulo(String titulo) {
        return !eventoRepository.existsByTitulo(titulo);
    }

    public void deleteById(String id) {
        eventoRepository.deleteById(id);
    }

    public boolean existsByTitulo(String titulo) {
        return eventoRepository.existsByTitulo(titulo);
    }


}
