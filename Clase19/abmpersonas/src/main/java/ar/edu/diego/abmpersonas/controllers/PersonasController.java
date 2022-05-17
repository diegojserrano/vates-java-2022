package ar.edu.diego.abmpersonas.controllers;

import ar.edu.diego.abmpersonas.entidades.Persona;
import ar.edu.diego.abmpersonas.servicios.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/persona")
public class PersonasController {

    @Autowired
    private PersonasService gestor;

    // Para agregar o modificar una persona
    @PutMapping("/{doc}")
    public ResponseEntity guardar(@RequestBody Persona nueva) {
        // Falta validar
        if (true){ // reglas de validacion {
            gestor.guardarPersona(nueva);
            return new ResponseEntity(HttpStatus.CREATED);
        }
        else
            return new ResponseEntity("datos invalidos", HttpStatus.BAD_REQUEST);
    }

    // Para consultar una persona por documento
    @GetMapping("/{doc}")
    public ResponseEntity<Persona> consultarUna(@PathVariable int doc){
        Persona encontrada = gestor.buscarPersona(doc);
        if (encontrada != null)
            return ResponseEntity.ok(encontrada);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Para consultar todas las personas
    @GetMapping("/")
    public Collection<Persona> consultarTodas(){
        return gestor.buscarTodas();
    }

    // Para borrar una persona por documento
    @DeleteMapping("/{doc}")
    public ResponseEntity borrar(@PathVariable int doc) {
        if (gestor.buscarPersona(doc) != null) {
            gestor.borrarPersona(doc);
            return ResponseEntity.ok().build();
        }
        else
            return new ResponseEntity(HttpStatus.NOT_FOUND);
    }




}
