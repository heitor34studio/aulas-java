import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0, nota;


        for (int i = 0; i < 3; i++){
            System.out.println("Diga sua avaliação para o filme");
            nota = leitura.nextDouble();
            media += nota;
        }

        System.out.println("Média das avaliações: " + String.format("%.1f", media/3));

    }
}
