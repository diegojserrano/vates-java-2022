package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonasPU");
        EntityManager em = emf.createEntityManager();

        Persona encontrada = em.find(Persona.class, 94780362);
        System.out.println(encontrada);

        em.createQuery("select p from Persona p where apellido like 'P%' and edad > 50")
                .getResultStream()
                .forEach(System.out::println);

        Persona nueva = new Persona(11111,"nn", "aa", 22);

        em.merge(nueva);

    }
}
