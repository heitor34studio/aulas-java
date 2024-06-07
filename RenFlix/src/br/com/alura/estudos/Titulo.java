package br.com.alura.estudos;

public class Titulo implements Comparable<Titulo>{
    public String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroNome) {
        return this.nome.compareTo(outroNome.nome);
    }
}
