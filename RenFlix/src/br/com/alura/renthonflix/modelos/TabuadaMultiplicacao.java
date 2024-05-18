package br.com.alura.renthonflix.modelos;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int num) {
        int i;
        for (i = 0; i <= 10; i++) {
            System.out.printf("%d*%d= " + num * i, num, i);
        }
    }
}
