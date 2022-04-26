package ar.edu.diego.abmpersonas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public String saludar() {
        return "Hola!!!";
    }

    @GetMapping("/saludo/{nombre}")
    public String saludarA(@PathVariable String nombre) {
        return "Hola " + nombre + "!!!";
    }


    @GetMapping("/saludo/{nombre}/{apellido}")
    public String saludarA(@PathVariable String nombre, @PathVariable String apellido) {
        return "Buen día señor " + apellido + ", " + nombre + "!!!";
    }

    @GetMapping("/saludo/")
    public String saludarB(@RequestParam(defaultValue = "") String nombre, @RequestParam(defaultValue = "") String apellido) {
        return "Buen día señor " + apellido + ", " + nombre + "!!!";
    }


}
