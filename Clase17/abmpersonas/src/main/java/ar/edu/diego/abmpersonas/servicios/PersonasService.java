package ar.edu.diego.abmpersonas.servicios;

import ar.edu.diego.abmpersonas.entidades.Persona;
import ar.edu.diego.abmpersonas.repositorios.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;
import java.util.stream.Collectors;

@Service
@ApplicationScope
public class PersonasService {

    @Autowired
    private PersonasRepository repo;

    public PersonasService() {
        System.out.println("Nuevo PersonasService");
    }

    public void guardarPersona(Persona nueva) { repo.agregar(nueva); }

    public Persona buscarPersona(int documento) {
        return repo.obtenerUna(documento);
    }

    public Collection<Persona> buscarTodas() {
        return repo.obtenerTodas();
    }

    public void borrarPersona(int documento) {
        repo.borrar(documento);
    }

}
