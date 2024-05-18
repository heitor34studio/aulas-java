package br.com.alura.renthonflix.modelos;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar * 5;
    }
}
