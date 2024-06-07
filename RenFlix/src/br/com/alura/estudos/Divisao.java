package br.com.alura.estudos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        try {
            System.out.println("insira um número inteiro:");
            var num1 = leitura.nextInt();
            leitura.nextLine();
            System.out.println("insira outro número inteiro para dividir o primeiro:");
            var num2 = leitura.nextInt();
            leitura.nextLine();
            System.out.println(num1/num2);
        } catch (ArithmeticException e) {
            System.out.println("Erro divisor 0: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro número invalido: " + e.getMessage());
        }

    }
}
