import java.util.concurrent.ThreadLocalRandom;

public class While {

    public static void lacosRepeticao() {

        // FOR - PARA - sabe a quantidade
        // While - enquanto a condição for valida, verifica a condição antes de iniciar
        // a execução.
        // Do While - Faça enquanto

        Double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = (double) Math.round(valorAleatorio());

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println(mesada);
            mesada = (double) Math.round((mesada - valorDoce));

        }

        System.out.println("Joao gastou toda sua mesada!");

     //   int num = 5,
     //           count = 1;
      //  do {
      //      num += count;
      //      System.out.println(num);
      //  } while (count <= 3);




    }

    private static double valorAleatorio() {

        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
