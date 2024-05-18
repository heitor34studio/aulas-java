package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.Audio;

public class Classificar {
    public void inclui(Audio audio){
        if(audio.getClassificacao() > 5){
            System.out.println("Pessoal está curtindo " + audio.getTitulo() + "!!");
        } else{
            System.out.println(audio.getTitulo() + " não é  tão conhecido...");
        }
    }

}
