public class Main {
    public static void main(String[] args) {
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        // Enquanto K for menor que INDICE
        while (K < INDICE) {
            K = K + 1; // Incrementa K
            SOMA = SOMA + K; // Adiciona K a SOMA
            System.out.println("K: " + K); // Imprime o valor de K
        }

        // Imprime o valor de SOMA
        System.out.println("O valor de SOMA é: " + SOMA);


        // a soma é 77

    }
}
