import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número: ");
        int number = scanner.nextInt();

        int a = 0;
        int b = 1;
        boolean pertence = false;

        System.out.print("Sequência de Fibonacci: " + a + " " + b);

        while (a <= number) {
            if (a == number) {
                pertence = true;

            }

            int temp = a;
            a = b;
            b = temp + b;
            if (a <= number) {
                System.out.print(" " + a);

            }
        }

            if (pertence) {
                System.out.println("O número " + number + " pertence à sequencia de F ");
            } else {
                System.out.println("O número " + number + " não pertence à sequência de F");
            }

            scanner.close();

    }

}
