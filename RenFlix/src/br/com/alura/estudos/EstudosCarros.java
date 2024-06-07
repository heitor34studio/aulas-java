package br.com.alura.estudos;

public class EstudosCarros {
    //classe carro
    private String modelo;
    private double precoMedio2020 = 0;
    private double precoMedio2021 = 0;
    private double precoMedio2023 = 0;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecoMedio2020() {
        return precoMedio2020;
    }

    public void setPrecoMedio2020(double precoMedio2020) {
        this.precoMedio2020 = precoMedio2020;
    }

    public double getPrecoMedio2021() {
        return precoMedio2021;
    }

    public void setPrecoMedio2021(double precoMedio2021) {
        this.precoMedio2021 = precoMedio2021;
    }

    public double getPrecoMedio2023() {
        return precoMedio2023;
    }

    public void setPrecoMedio2023(double precoMedio2023) {
        this.precoMedio2023 = precoMedio2023;
    }

    public void calcularEExibirPreco() {
        if(precoMedio2020 > precoMedio2021) {
            if (precoMedio2020 > precoMedio2023) {
                if (precoMedio2023 > precoMedio2021) {
                    System.out.printf("O preço médio de 2020: %.2f é o maior! Então vem %.2f de 2023, e o menor é o de" +
                            " 2021: %.2f.", precoMedio2020, precoMedio2023, precoMedio2021);
                } else {
                    System.out.printf("O preço médio de 2020: %.2f é o maior! Então vem %.2f de 2021, e o menor é o de" +
                            " 2023: %.2f.", precoMedio2020, precoMedio2021, precoMedio2023);
                }
            } else {
                System.out.printf("O preço médio de 2023: %.2f é o maior! Então vem %.2f de 2020, e o menor é o de" +
                        " 2021: %.2f.", precoMedio2023, precoMedio2020, precoMedio2021);
            }
        } else {
            if (precoMedio2021 > precoMedio2023) {
                if (precoMedio2023 > precoMedio2020) {
                    System.out.printf("O preço médio de 2021: %.2f é o maior! Então vem %.2f de 2023, e o menor é o de" +
                            " 2020: %.2f.", precoMedio2021, precoMedio2023, precoMedio2021);
                } else {
                    System.out.printf("O preço médio de 2021: %.2f é o maior! Então vem %.2f de 2020, e o menor é o de" +
                            " 2023: %.2f.", precoMedio2021, precoMedio2020, precoMedio2023);
                }
            } else {
                System.out.printf("O preço médio de 2023: %.2f é o maior! Então vem %.2f de 2021, e o menor é o de" +
                        " 2020: %.2f.", precoMedio2023, precoMedio2021, precoMedio2020);
            }
        }
        System.out.println();
    }
}
