package br.com.alura.principal;

import br.com.alura.estudos.PessoaRecord;
import br.com.alura.renthon.flix.calculos.CalculadoraDeTempo;
import br.com.alura.renthon.flix.calculos.FiltroRecomendacao;
import br.com.alura.renthonflix.modelos.Episodio;
import br.com.alura.renthonflix.modelos.Filme;
import br.com.alura.renthonflix.modelos.Serie;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Kung Fu Panda", 2008);
        Filme meuFilme2 = new Filme("Kung Fusão", 2005);
        meuFilme.setDuracaoEmMinutos(132);
        meuFilme2.setDuracaoEmMinutos(140);

        meuFilme2.exibeFichaTecnica();
        meuFilme2.avalia(8);
        meuFilme2.avalia(7);
        meuFilme2.avalia(10);
        System.out.printf(String.format("Média de avaliações: %.2f", meuFilme2.exibeMedia()));
        System.out.println(meuFilme2.getTotalDeAvaliacao());

        Serie serie = new Serie("Dark", 2019);
        serie.setTemporadas(3);
        serie.exibeFichaTecnica();
        serie.setEpisodiosPorTemporada(8);
        serie.setMinutosPorEpisode(60);
        System.out.println("Duração para maratonar Dark: " + serie.getDuracaoEmMinutos() + " minutos.");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme2);
        calculadora.inclui(meuFilme);
        calculadora.inclui(serie);
        System.out.println("Tempo total para maratonar Dark, Kung Fusão e Kung Fu Panda: " + calculadora.getTempoTotal()
                + " minutos.");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme2);
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(1);
        filtro.filtra(episodio);

        var meuFilme3 = new Filme("BladeRunner 2049", 2017);
        meuFilme3.setDuracaoEmMinutos(180);
        meuFilme3.avalia(10);

        ArrayList<Filme> listaDeFilmes= new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        listaDeFilmes.add(meuFilme3);
        System.out.println("tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.getFirst().getNome());
        System.out.println(listaDeFilmes);

        List<Integer> listaNumsInteiros = new ArrayList<>();
        listaNumsInteiros.add(1);
        listaNumsInteiros.add(9);
        listaNumsInteiros.add(4);
        listaNumsInteiros.add(7);
        listaNumsInteiros.add(2);
        listaNumsInteiros.add(5);
        Collections.sort(listaNumsInteiros);
        System.out.println(listaNumsInteiros);

        String jsonTeste = """
            {
             "nome":"João",
             "idade":19,
             "cidade":"São Paulo"
            }
            """;
        Gson gson = new Gson();
        PessoaRecord pessoaTeste = gson.fromJson(jsonTeste, PessoaRecord.class);
        System.out.println(pessoaTeste);
    }
}
