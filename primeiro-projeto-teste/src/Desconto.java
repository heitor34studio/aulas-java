public class Desconto {

    public static void main(String[] args){

        double precoOriginal = 34.75;
        double percentualDesconto = 30;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double precoFinal = precoOriginal - valorDesconto;
        String mensagem = (String.format("O preço original %.2f com desconto de 30 ficou: %.2f.", precoOriginal, precoFinal));
        System.out.println(mensagem);

    }

}
