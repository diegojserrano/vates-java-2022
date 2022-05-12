package ar.edu.diego.abmpersonas.repositorios;

import ar.edu.diego.abmpersonas.entidades.Persona;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.annotation.ApplicationScope;

import javax.persistence.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;



@Repository
@ApplicationScope
public class PersonasRepository {
/*
    @PersistenceContext
    private EntityManager em;

    public Collection<Persona> obtenerTodas() {
        Collection<Persona> lista = em.createQuery("select p from Persona p where p.apellido like :a").getResultList();
        em.close();
        return lista;
    }

    public Persona obtenerUna(int documento) {
        Persona encontrada = em.find(Persona.class, documento);
        em.close();
        return encontrada;
    }

    @Transactional
    public void agregar(Persona nueva) {
         em.merge(nueva);
    }

    @Transactional
    public void borrar(int documento) {
        Persona encontrada = em.find(Persona.class, documento);

        if (encontrada != null)
            em.remove(encontrada);
    }

 */
}
