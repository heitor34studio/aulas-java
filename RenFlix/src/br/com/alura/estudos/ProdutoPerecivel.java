package br.com.alura.estudos;

public class ProdutoPerecivel extends Produto {
    private int dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, int dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {

        return super.toString() + "ProdutoPerecivel{" +
                "dataValidade=" + dataValidade +
                '}';
    }

}
