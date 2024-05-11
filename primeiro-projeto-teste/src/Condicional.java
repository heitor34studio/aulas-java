import java.util.Scanner;

public class Condicional {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = leitura.nextInt();
        System.out.println("Digite sua idade:");
        String elo = "radiante";
        boolean maioridade;

        if (idade >= 18){
            System.out.println("Você é maior de idade.");
            maioridade = true;
        } else {
            System.out.println("Você é menor de idade.");
            maioridade = false;
        }

        if (elo.equals("radiante") || maioridade) {
            System.out.println("Você é ou radiante, ou adulto.");
        }

        System.out.println("Digite que dia da semana é hoje:");
        String nomeDia = leitura.nextLine();
        int descontoPorcentagem;

        switch (nomeDia) {
            case "domingo":
                descontoPorcentagem = 10;
                break;
            case "segunda-feira":
                descontoPorcentagem = 20;
                break;
            case "terça-feira":
                descontoPorcentagem = 30;
                break;
            case "quarta-feira":
                descontoPorcentagem = 40;
                break;
            case "quinta-feira":
                descontoPorcentagem = 50;
                break;
            case "sexta-feira":
                descontoPorcentagem = 25;
                break;
            case "sábado":
                descontoPorcentagem = 90;
                break;
            default:
                descontoPorcentagem = 0;
                break;
        }

        System.out.println("O desconto de hoje é " + descontoPorcentagem + "%");

    }

}
