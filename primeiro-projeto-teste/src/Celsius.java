public class Celsius {

    public static void main(String[] args){
        double celsius = 25.6;
        int fahrenheit = (int) ((celsius * 1.8) + 32);
        String mensagem = (String.format("A temperatura em Celsius agora é de: %.1f. E em Fahrenheit é: %d", celsius, fahrenheit));
        System.out.println(mensagem);
    }

}
