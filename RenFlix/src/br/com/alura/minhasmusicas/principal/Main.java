package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.Musica;
import br.com.alura.minhasmusicas.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica goodbyeEveryone = new Musica();
        goodbyeEveryone.setAlbum("ikiru");
        goodbyeEveryone.setArtista("shiinamota");
        goodbyeEveryone.setTitulo("Goodbye Everyone");
        goodbyeEveryone.setDuracaoEmMinutos(3);
        goodbyeEveryone.setGenero("vocaloid");

        for (int i = 0; i < 101; i++) {
            goodbyeEveryone.curtir();
        }

        for (int i = 0; i < 101; i++) {
            goodbyeEveryone.reproduzir();
        }

        Podcast flowPodcast = new Podcast();
        flowPodcast.setDescricao("Episódio com Raffa Moreira");
        flowPodcast.setHost("Igor3K");
        flowPodcast.setDuracaoEmMinutos(121);
        flowPodcast.setTitulo("FlowPodcast");

        Classificar classificacao = new Classificar();
        classificacao.inclui(goodbyeEveryone);
        classificacao.inclui(flowPodcast);
    }
}
