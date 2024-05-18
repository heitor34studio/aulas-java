package br.com.alura.renthon.flix.calculos;

import br.com.alura.renthonflix.modelos.Filme;
import br.com.alura.renthonflix.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui (Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
