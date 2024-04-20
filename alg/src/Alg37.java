import java.util.Scanner;

public class Alg37 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int number, i = 1, pares = 0, impares = 0;
        Scanner input = new Scanner(System.in);

        while (i <= 10) {
            System.out.println("Entre com um número para ser verificado!");
            number = input.nextInt();

            if (number != 0) {
                if ((number % 2) == 0) {
                    pares++;
                } else {
                    impares++;
                }
            } else {
                System.out.println("O número 0(ZERO) será desconsiderado!!");
            }
            i++;

        }
        System.out.println();
        System.out.println("O número de números pares é: " + pares);
        System.out.println("O número de números impares é: " + impares);
    }
}
