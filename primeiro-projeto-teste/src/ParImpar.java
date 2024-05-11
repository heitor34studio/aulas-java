import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escolhe um número inteiro:");
        int numero = leitura.nextInt();
        if (numero%2 == 0) {
            System.out.println("Este número é par");
        } else {
            System.out.println("Este número é ímpar");
        }
    }
}
