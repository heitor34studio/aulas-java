import java.util.Scanner;

public class EstudosCarrosMain {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        EstudosCarros carro = new EstudosCarros();
        System.out.println("Insira o modelo do carro:");
        String modelo = leitura.nextLine();
        carro.setModelo(modelo);
        System.out.println("Insira o preço médio dele em 2020, depois em 2021, e por fim 2023:");
        double preco2020 = leitura.nextDouble();
        carro.setPrecoMedio2020(preco2020);
        double preco2021 = leitura.nextDouble();
        carro.setPrecoMedio2021(preco2021);
        double preco2023 = leitura.nextDouble();
        carro.setPrecoMedio2023(preco2023);
        carro.calcularEExibirPreco();
    }
}
