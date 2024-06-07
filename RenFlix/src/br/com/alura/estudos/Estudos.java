package br.com.alura.estudos;

public class Estudos {
    //classe pessoa

    void olaMundo() {
        System.out.println("Olá, mundo!");
    }
    //classe calculadora

    double retornaDouble (double numero) {
        return numero*2;
    }
    //classe música
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    double exibeMedia () {
        return avaliacao / numAvaliacoes;
    }

    void exibeFichaTecnica () {
        double media = exibeMedia();
        System.out.printf("""
                Título: %s,
                Artista: %s,
                Ano de Lançamento: %d,
                Avaliação: %f
                Total de avaliações: %d
                %n""", titulo, artista, anoLancamento, media, numAvaliacoes);
    }

    void avalia (double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    //classe carro
    int ano;
    String cor;
    String modelo;

    int calculaIdade() {
        return 2024-ano;
    }

    void exibeFichaTecnicaCarro () {
        int idade = calculaIdade();
        System.out.printf("""
                    Ano de fabricação do carro: %d,
                    Cor do carro: %s,
                    Modelo do carro: %s,
                    Idade do carro:  %d
                """, ano, cor, modelo, idade);
    }

    //ContaBancaria
    private int numeroConta;
    private double saldo;
    public String publico;

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //classe livro
    private String titulo1;
    private String autor;

    public String getTitulo1() {
        return titulo1;
    }

    public void setTitulo1(String titulo1) {
        this.titulo1 = titulo1;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.printf("""
                Título do livro: %s,
                Autor do livro: %s 
                """,titulo1, autor);
    }

}
