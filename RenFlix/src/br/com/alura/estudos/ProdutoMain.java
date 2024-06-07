package br.com.alura.estudos;

import java.util.ArrayList;

public class ProdutoMain {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        var pessoa1 = new Pessoa("João", 18);
        var pessoa2 = new Pessoa("Lampião", 28);
        var pessoa3 = new Pessoa("Cachorrão", 38);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println(listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.getFirst());
        System.out.println(listaDePessoas);

        ArrayList<Produto> listaDeProduto = new ArrayList<>();
        var produto = new Produto("Garrafa de água", 2.50, 1);
        var produto2 = new Produto("Óculos de Sol", 12.50, 2);
        var produto3 = new Produto("Mouse Gamer", 62.99, 1);

        listaDeProduto.add(produto);
        listaDeProduto.add(produto2);
        listaDeProduto.add(produto3);

        System.out.println("Tamanho da lista de produtos: " + listaDeProduto.size());
        System.out.println(listaDeProduto);

        var produto4 = new ProdutoPerecivel("Protetor Solar", 18.34, 3, 14092027);
        listaDeProduto.add(produto4);
        System.out.println("""
                lista de produtos atualizada 
                -------------
                """ + listaDeProduto);

    }

}
