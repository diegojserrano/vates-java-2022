package ar.edu.diego.abmpersonas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class NumerosController {

    List<Integer> lista = new ArrayList<>();

    @PutMapping("/numeros/{x}")
    public String agregar(@PathVariable int x) {
        lista.add(x);
        return "Se agrego el " + x;
    }

    @GetMapping("/numeros")
    public List<Integer> listar() {
        return lista;
    }

    @GetMapping("/numeros/{x}")
    public boolean existe(@PathVariable int x) {
        return lista.contains(x);
    }
}
