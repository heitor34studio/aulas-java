package br.com.alura.renthonflix.modelos;

import br.com.alura.renthon.flix.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) exibeMedia() / 2;
    }
}
