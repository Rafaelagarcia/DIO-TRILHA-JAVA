import java.util.Scanner;

public class ContaTerminal {
    public static void concat() {

        String mensagem;
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("\nPor favor, digite o Nome do Cliente: ");
        String nomeCliente = inputScanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = inputScanner.nextInt();

        System.out.println("Por favor, digite a Agência: ");
        String agencia = inputScanner.next();

        System.out.println("Por favor, digite o Saldo: ");
        double saldo = inputScanner.nextDouble();

        inputScanner.close();

        mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é a ")
                .concat(agencia)
                .concat(", conta " + numero)
                .concat(" e seu saldo " + saldo)
                .concat(" já está disponível para saque!");

        System.out.println(mensagem);

    }
}
