import java.util.Scanner;

public class ExerciciosFor {

    public static void contagemDeNumeros() {

        // o For é melhor em situações onde as voltas são determinadas
        // RETORNA OS NÚMEROS DE 1 A 10
        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }

        // Retorna o valor da soma de todos os numeros de 1 a 100
        int soma = 0;
        for (int y = 1; y <= 100; y++) {
            soma += y;
        }
        System.out.println("valor da soma: " + soma);

        // VALOR DE FATORIAL
        int numero = 5;
        int fatorial = 1;
        for (int i = numero; i >= 1; i--) {

            fatorial *= i;
        }
        System.out.println("valor do fatorial " + fatorial);

        // PARES DE 1 A 100
        int numero1 = 0;
        for (int x = numero1; x <= 100; x++) {
            numero1++;
            String resultado = (numero1 % 2 == 0 ? numero1 + " é Par" : numero1 + " é impar.");
            System.out.println(resultado);
        }

        // Peça um número ao usuário e imprima a tabuada dele de 1 a 10.
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = inputScanner.nextInt();

        for (int x = 1; x <= 10; x++) {

            int resultado = num * x;
            System.out.println("O" + num + " x " + x + " = " + resultado);
        }

        inputScanner.close();

        // for(comeca; ate quanto; incrementação;)

        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {

            System.out.println("Contando carneirinhos: " + carneirinhos);
        }

    }

}
