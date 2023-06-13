package co.com.poli.eventospoli.rest;

import co.com.poli.eventospoli.model.Empleado;
import co.com.poli.eventospoli.model.Evento;
import co.com.poli.eventospoli.service.EmpleadoService;
import co.com.poli.eventospoli.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/eventos")
public class EventoREST {


    @Autowired
    private EmpleadoService empleadoService;
    @Autowired
    private EventoService eventoService;


    // Metodos para postgres
    @PostMapping(value = "empleado/guardar")
    private ResponseEntity<Empleado> guardarEmpleado(@RequestBody Empleado empleado) {
        try {
            if (empleadoService.notExistsById(empleado.getIdentificacion())) {
                Empleado temp = empleadoService.createEmpleado(empleado);

                return ResponseEntity.created(new URI("/api/eventos/empleado/guardar" + temp.getIdentificacion())).body(temp);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @GetMapping(value = "/listempleado")
    private ResponseEntity<List<Empleado>> ListarTodasLosEmpleados() {
        return ResponseEntity.ok(empleadoService.getAllEmpleado());
    }

    @DeleteMapping(value = "/eliminarempleados")
    private ResponseEntity<Void> eliminarEmpleados(@RequestBody Empleado empleado) {
        empleadoService.getAllEmpleado();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/empleado/{id}")
    private ResponseEntity<Empleado> ListarPersonaPorId(@PathVariable String id) {
        Optional<Empleado> optionalEmpleado = empleadoService.findByIdEmpleado(id);
        if (optionalEmpleado.isPresent()) {
            return ResponseEntity.ok(optionalEmpleado.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminarempleado/{id}")
    public ResponseEntity<String> eliminarEmpleadoById(@PathVariable String id) {
        if (empleadoService.existsById(id)) {
            empleadoService.deleteById(id);
            return ResponseEntity.ok("User deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "/empleado/actualizar")
    private ResponseEntity<Empleado> actualizarEmpleado(@RequestBody Empleado empleado) {
        try {
            if (empleadoService.existsById(empleado.getIdentificacion())) {
                Empleado temp = empleadoService.createEmpleado(empleado);

                return ResponseEntity.created(new URI("/api/eventos/empleado/actualizar" + temp.getIdentificacion())).body(temp);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    // Metodos para mongo


    @PostMapping(value = "/guardar")
    private ResponseEntity<Evento> guardarEvento(@RequestBody Evento evento) {
        try {
            if (eventoService.notExistsByTitulo(evento.getTitulo())) {
                Evento temp = eventoService.createEvento(evento);

                return ResponseEntity.created(new URI("/api/eventos/guardar" + temp.getId())).body(temp);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @GetMapping(value = "/listeventos")
    private ResponseEntity<List<Evento>> ListarTodasLosEventos() {
        return ResponseEntity.ok(eventoService.getAllEventos());
    }

    @DeleteMapping(value = "/eliminareventos")
    private ResponseEntity<Void> eliminarEventos(@RequestBody Evento evento) {
        eventoService.getAllEventos();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{titulo}")
    private ResponseEntity<Evento> ListarEventoPorId(@PathVariable String titulo) {
        Optional<Evento> optionalEvento = eventoService.findByTituloEvento(titulo);
        if (optionalEvento.isPresent()) {
            return ResponseEntity.ok(optionalEvento.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminarevento/{id}")
    public ResponseEntity<String> eliminarEventoById(@PathVariable String id) {
        if (eventoService.existsById(id)) {
            eventoService.deleteById(id);
            return ResponseEntity.ok("User deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value = "/actualizar")
    private ResponseEntity<Evento> actualizarEvento(@RequestBody Evento evento) {
        try {
            if (eventoService.existsByTitulo(evento.getTitulo())) {
                Evento temp = eventoService.createEvento(evento);

                return ResponseEntity.created(new URI("/api/eventos/actualizar" + temp.getId())).body(temp);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }


}

