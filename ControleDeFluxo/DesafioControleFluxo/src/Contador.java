import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.err.println(exception);
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
        if (parametroUm < parametroDois) {
            for (int x = 1; x <= contagem; x++) {

                System.out.println("Imprimindo o Número: " + x);

            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}
