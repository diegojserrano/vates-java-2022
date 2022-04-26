package com.prueba.abmpersonas;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// Para que esta clase posea endpoints
// Tiene que estar anotadada con @RestController
@RestController
public class HolaController {

    @GetMapping("/hola")
    public String saludar() {
        return "Hola mundo!!";
    }

    @GetMapping("/hola/{nombre}")
    public String saludarA(@PathVariable("nombre") String nombre ) {
        return "Hola " + nombre + "!!";
    }



}
