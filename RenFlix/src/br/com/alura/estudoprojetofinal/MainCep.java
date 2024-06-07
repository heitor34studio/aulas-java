package br.com.alura.estudoprojetofinal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        System.out.println("Digite um cep para pesquisar sem tracinho (Ex: 03557100):");
        String busca = leitura.next();

        try {
            ConsultaCep consultaCep = new ConsultaCep();
            Cep novoCep = consultaCep.buscaEndereco(busca);
            System.out.println(novoCep);
            FileWriter escrita = new FileWriter("endereco.json");
            escrita.write(gson.toJson(novoCep));
            escrita.close();

            System.out.println("deu boa");

        } catch ( RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
