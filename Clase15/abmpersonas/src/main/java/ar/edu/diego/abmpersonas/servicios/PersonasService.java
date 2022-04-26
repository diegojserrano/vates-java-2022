package ar.edu.diego.abmpersonas.servicios;

import ar.edu.diego.abmpersonas.entidades.Persona;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PersonasService {

    private Map<Integer, Persona> personas;

    public PersonasService() {
        personas = new TreeMap<>();
        personas.put(1, new Persona(1,"Juan",23));
        personas.put(2, new Persona(2,"Ana",20));

    }

    public void guardarPersona(Persona nueva) {
        //if (!personas.containsKey(nueva.getDocumento()))
        personas.put(nueva.getDocumento(), nueva);
    }

    public Persona buscarPersona(int documento) {
        return personas.get(documento);
    }

    public Collection<Persona> buscarTodas() {
        return personas.values();
    }

    public void borrarPersona(int documento) {
        personas.remove(documento);
    }

}
