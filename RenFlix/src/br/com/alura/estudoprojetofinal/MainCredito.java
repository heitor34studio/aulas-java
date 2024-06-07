package br.com.alura.estudoprojetofinal;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainCredito {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do cartão:");
        double limite = leitura.nextInt();
        leitura.nextLine();  // Consumir a nova linha pendente
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int continuar = 1;
        while (continuar == 1) {
            System.out.println("Digite a descrição da compra:");
            String nome = leitura.nextLine();
            System.out.println("Digite o valor da compra:");
            double valor = leitura.nextDouble();
            leitura.nextLine();  // Consumir a nova linha pendente
            Compras listaDeCompras = new Compras(nome,valor);

            if (cartao.lancaCompra(listaDeCompras)) {
                System.out.println("""
                    Compra realizada!
                    Digite 0 para sair ou 1 para continuar:
                """);
                continuar = leitura.nextInt();
                leitura.nextLine();  // Consumir a nova linha pendente
                if (continuar != 1) {

                    System.out.println("""
                        ******************
                        COMPRAS REALIZADAS

                    """);
                    Collections.sort(cartao.compras);
                    for ( Compras compras : cartao.compras ) {
                        System.out.println(compras);
                    }
                }
            } else {
                System.out.println("""
                    Saldo insuficiente!
                    ******************
                    COMPRAS REALIZADAS

                """);
                Collections.sort(cartao.compras);
                for ( Compras compras : cartao.compras ) {
                    System.out.println(compras);
                }
                continuar = 0;
            }
        }
    }
}
