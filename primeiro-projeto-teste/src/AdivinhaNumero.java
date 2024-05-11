import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int tentativas = 0;
        boolean venceu = false;

        System.out.println("Um número inteiro entre 1 e 100 foi gerado, e você tem 5 chances para acertá-lo. Qual seu" +
                " primeiro chute?");
        while (tentativas < 5) {
            int chute = leitura.nextInt();
            tentativas++;
            if (chute == numeroSecreto) {
                venceu = true;
                break;
            }
            if (chute > numeroSecreto){
                System.out.println("O número secreto é menor que o que você chutou.");
            }else{
                System.out.println("O número secreto é maior que o que você chutou.");
            }
        }

        if (venceu) {
            System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas!");
        }else{
            System.out.println("Suas tentativas acabaram... o número era " + numeroSecreto);
        }

    }
}
