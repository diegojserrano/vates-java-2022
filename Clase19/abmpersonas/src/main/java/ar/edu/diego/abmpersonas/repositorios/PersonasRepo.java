package ar.edu.diego.abmpersonas.repositorios;

import ar.edu.diego.abmpersonas.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonasRepo extends JpaRepository<Persona, Integer> {

    List<Persona> getAllByOrderByApellido();

    List<Persona> getAllByApellidoStartsWith(String apellido);

    List<Persona> getAllByEdadBetweenOrderByDocumentoDesc(int edadDesde, int edadHasta);

    @Query("select count(p) from Persona p where p.apellido like :apellido" )
    public int cantidad(@Param("apellido") String apellido);

}
