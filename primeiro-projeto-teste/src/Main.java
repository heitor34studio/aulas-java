public class Main {

    public static void main(String[] args) {

        System.out.println("Esse é o 34Movies.");
        System.out.println("Filme: GeK");

        int anoDeLancamento = 2024;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //comentário teste!
        double media = (9.8 + 6.3 + notaDoFilme) / 3;
        System.out.println(media);
        String sinopse = """
            King Kong e Godzilla em uma batalha épica contra um macaco vermelho,
             um Godzilla de gelo, com ajuda de uma mariposa gigante
             Ano de Lançamento: 
            """ + anoDeLancamento;
        System.out.println("Sinopse do filme: " + sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}