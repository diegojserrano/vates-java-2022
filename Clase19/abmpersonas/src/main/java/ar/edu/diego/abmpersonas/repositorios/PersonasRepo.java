package ar.edu.diego.abmpersonas.repositorios;

import ar.edu.diego.abmpersonas.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonasRepo extends JpaRepository<Persona, Integer> {

    List<Persona> getAllByOrderByApellido();

    List<Persona> getAllByApellidoStartsWith(String apellido);

    List<Persona> getAllByEdadBetweenOrderByDocumentoDesc(int edadDesde, int edadHasta);
}
