package ar.edu.diego.abmpersonas.servicios;

import ar.edu.diego.abmpersonas.entidades.Persona;
import ar.edu.diego.abmpersonas.repositorios.PersonasRepo;
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
    private PersonasRepo repo;

    public PersonasService() {
        System.out.println("Nuevo PersonasService.......");
    }

    public void guardarPersona(Persona nueva) { repo.save(nueva);



    }

    public Persona buscarPersona(int documento) {
        return repo.findById(documento).orElse(null);
    }

    public Collection<Persona> buscarTodas() {
        //return repo.getAllByApellidoStartsWith("L");
        return repo.getAllByEdadBetweenOrderByDocumentoDesc(30, 40);
    }

    public void borrarPersona(int documento) {
        repo.deleteById(documento);
    }

}
