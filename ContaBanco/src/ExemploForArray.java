public class ExemploForArray {
    public static void exemploForArray() {

        String alunos[] = { "Felipe", "Rafaela", "Lucas" };

        for (int x = 0; x < alunos.length; x++) {

            System.out.println(alunos[x]);

        }
        // For each
        for (String aluno : alunos) {

            System.out.println(aluno);

        }

        // break quebra o laço..
        // continue ele pula a iteraçao para a próxima.

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;

            System.out.println(numero);
        }
    }
}
