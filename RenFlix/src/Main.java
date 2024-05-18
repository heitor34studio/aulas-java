import br.com.alura.renthon.flix.calculos.CalculadoraDeTempo;
import br.com.alura.renthon.flix.calculos.FiltroRecomendacao;
import br.com.alura.renthonflix.modelos.Episodio;
import br.com.alura.renthonflix.modelos.Filme;
import br.com.alura.renthonflix.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        Filme meuFilme2 = new Filme();
        meuFilme.setNome("Kung Fu Panda");
        meuFilme.setAnoDeLancamento(2008);
        meuFilme.setDuracaoEmMinutos(132);
        meuFilme2.setNome("Kung Fusão");
        meuFilme2.setAnoDeLancamento(2005);
        meuFilme2.setDuracaoEmMinutos(140);

        meuFilme2.exibeFichaTecnica();
        meuFilme2.avalia(8);
        meuFilme2.avalia(7);
        meuFilme2.avalia(10);
        System.out.printf(String.format("Média de avaliações: %.2f", meuFilme2.exibeMedia()));
        System.out.println(meuFilme2.getTotalDeAvaliacao());

        Serie serie = new Serie();
        serie.setNome("Dark");
        serie.setAnoDeLancamento(2019);
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
    }
}
