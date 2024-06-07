package br.com.alura.principal;

import br.com.alura.renthonflix.modelos.Filme;
import br.com.alura.renthonflix.modelos.Serie;
import br.com.alura.renthonflix.modelos.Titulo;

import java.util.*;

public class MainComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Kung Fu Panda", 2008);
        meuFilme.avalia(10);
        Filme meuFilme2 = new Filme("Kung Fusão", 2005);
        meuFilme2.avalia(9);
        Serie serie = new Serie("Dark", 2019);
        serie.avalia(10);
        var meuFilme3 = new Filme("BladeRunner 2049", 2017);

        List<Titulo> listaDeTitulos = new LinkedList<>();
        listaDeTitulos.add(meuFilme);
        listaDeTitulos.add(meuFilme2);
        listaDeTitulos.add(meuFilme3);
        listaDeTitulos.add(serie);

        // modo OG:
        for (Titulo item: listaDeTitulos) {
            if(item instanceof Filme filme){
                System.out.println(filme.getClassificacao());
            }
            System.out.println(item.getNome());
        }


        /* modo novo:
        listaDeTitulos.forEach(item -> System.out.println(item.getNome()));

         modo ultra pequeno xs
        listaDeTitulos.forEach(System.out::println);
        */

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Capitão América");
        buscaPorArtista.add("Ant-man");
        buscaPorArtista.add("007");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados por nome:");
        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);
        listaDeTitulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(listaDeTitulos);

        List<br.com.alura.estudos.Titulo> listaTitulosDesenhos = new ArrayList<>();
        listaTitulosDesenhos.add(new br.com.alura.estudos.Titulo("João e o pé de feijão"));
        listaTitulosDesenhos.add(new br.com.alura.estudos.Titulo("Chapeuzinho vermelho"));
        listaTitulosDesenhos.add(new br.com.alura.estudos.Titulo("Branca de neve e os 7 anoes"));
        Collections.sort(listaTitulosDesenhos);
        for (br.com.alura.estudos.Titulo titulo : listaTitulosDesenhos) {
            System.out.println(titulo.nome);
        }

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("a");
        listaPolimorfica.add("zz");
        listaPolimorfica.add("d");
        listaPolimorfica.add("c");

        System.out.println("listaArray: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("a");
        listaPolimorfica.add("wwa");
        listaPolimorfica.add("ass");
        listaPolimorfica.add("3wsa");

        System.out.println("listaLinked: " + listaPolimorfica);


    }
}
