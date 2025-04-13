public class Tamanho {

    public static void tamanho(String[] args) {
        // IF OU ELSE OU SWITCH CASE
        String tamanho = "M";

        switch (tamanho) {
            case "P": {
                System.out.println("Pequeno");
                break; //sem o break ele pega a resposta do debaixo tambem.
            }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }
    }

}
