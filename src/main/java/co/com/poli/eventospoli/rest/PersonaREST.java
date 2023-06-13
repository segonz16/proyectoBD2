package co.com.poli.eventospoli.rest;

import co.com.poli.eventospoli.model.Persona;
import co.com.poli.eventospoli.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/persona")
public class PersonaREST {
    @Autowired
    private PersonaService personaService;

    @PostMapping(value = "/guardar")
    private ResponseEntity<Persona> guardar(@RequestBody Persona persona) {
        Persona temporal = personaService.create(persona);

        try {
            return ResponseEntity.created(new URI("/api/persona/guardar" + temporal.getId())).body(temporal);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping(value = "/personas")
    private ResponseEntity<List<Persona>> ListarTodasLasPersonas() {
        return ResponseEntity.ok(personaService.getAllPersonas());
    }

    @DeleteMapping(value = "/delete")
    private ResponseEntity<Void> eliminarPersona(@RequestBody Persona persona) {
        personaService.getAllPersonas();
        return ResponseEntity.ok().build();
    }

    @GetMapping("/personas/{id}")
    private ResponseEntity<Optional<Persona>> ListarPersonaPorId(@PathVariable Long id) {
        return ResponseEntity.ok(personaService.findById(id));
//        Optional<Persona> optionalPersona = personaService.findById(id);
//        if (optionalPersona.isPresent()) {
//            return ResponseEntity.ok(optionalPersona.get());
//        } else {
//            return ResponseEntity.notFound().build();
    }

}
