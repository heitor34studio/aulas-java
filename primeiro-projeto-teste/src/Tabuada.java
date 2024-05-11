import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira um número inteiro:");
        int numero = leitura.nextInt();
        for (int i = 0; i < 10; i++){
            System.out.println(numero + "*" + (i+1) + "= " + numero*(i+1));
        }
    }
}
