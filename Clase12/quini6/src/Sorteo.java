import java.util.*;
import java.util.stream.Collectors;

public class Sorteo {

    private Set<Integer> sorteados;
    private Map<Integer, Apuesta> apuestas;

    public Sorteo() {
        sorteados = new TreeSet<>();
        apuestas = new HashMap<>();
    }

    public boolean agregarApuesta(Apuesta nueva) {
        return apuestas.put(nueva.getBoleta(), nueva) == null;
    }

    public boolean agregarSorteado(int sorteado) {
        return sorteados.add(sorteado);
    }

    public Set<Apuesta> ganadoras() {
        return apuestas.values().stream()
                .filter(ap -> ap.esGanadora(this.sorteados))
                .collect(Collectors.toSet());


        /*Set<Apuesta> salida = new HashSet<>();
        for(Apuesta ap: apuestas.values()) {
            if (ap.esGanadora(this.sorteados))
                salida.add(ap);
        }

        return salida;*/
    }

    @Override
    public String toString() {
        return sorteados.toString();
    }
}
