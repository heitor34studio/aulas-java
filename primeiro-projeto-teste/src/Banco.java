import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double saldo = 0;
        int opcao = 0;
        System.out.println("Insira seu nome:");
        String nome = leitura.nextLine();
        System.out.println(String.format("""
        ------------********************------------**********************------------
        Dados iniciais do cliente:
        
        Nome:           %s
        Tipo Conta:     Corrente
        Saldo inicial:  %.2f
        ------------********************------------**********************------------
        """, nome, saldo));
        String menu = """
        Operações:
        
        1- Consultar Saldo
        2- Receber Valor
        3- Transferir Valor
        4- Sair
        
        Digite a opção desejada:
        """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1) {
                System.out.println("Seu saldo é de " + saldo);
            } else if (opcao == 2) {
                System.out.println("Insira o valor a receber:");
                double valor = leitura.nextDouble();
                saldo += valor;
            } else if (opcao == 3) {
                System.out.println("Insira o valor a transferir:");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldo -= valor;
                }
            } else if (opcao != 4) {
                System.out.println("Opção inexistente.");
            }

        }

        System.out.println(" Até logo, " + nome + ".");

    }
}
