import java.util.Scanner;

public class Alg14 {
    public static void main(String[] args) {

        float number;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out
                .println("Olá usuário, para saber se um número é par ou ímpar, favor inserir o mesmo abaixo: ");
        number = input.nextFloat();

        if (number == 0) {
            System.out.println("O valor digitado é nulo!");
        } else if (number%2 != 0) {
            System.out.println("O número digitado é impar!");
        } else {
            System.out.println("O número é par!");
        }
    }
}