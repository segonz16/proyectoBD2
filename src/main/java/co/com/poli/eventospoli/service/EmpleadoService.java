package co.com.poli.eventospoli.service;

import co.com.poli.eventospoli.model.Empleado;
import co.com.poli.eventospoli.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {


    @Autowired
    private EmpleadoRepository empleadoRepository;

    public Empleado createEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public List<Empleado> getAllEmpleado() {
        return empleadoRepository.findAll();
    }

    public void deleteEmpleado(Empleado persona) {
        empleadoRepository.delete(persona);
    }

    public Optional<Empleado> findByIdEmpleado(String id) {
        return empleadoRepository.findById(id);
    }


    public boolean existsById(String id) {
        return empleadoRepository.existsById(id);
    }
    public boolean notExistsById(String id) {
        return !empleadoRepository.existsById(id);
    }

    public void deleteById(String id) {
        empleadoRepository.deleteById(id);
    }






}
