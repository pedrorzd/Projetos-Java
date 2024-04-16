import java.util.Scanner;

public class Alg12 {
    public static void main(String[] args) {

        float number;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out
                .println("Olá usuário, para saber se um número é positivo ou negativo, favor inserir o mesmo abaixo: ");
        number = input.nextFloat();

        if (number > 0) {
            System.out.println("O número é positivo!");
        } else {
            System.out.println("O número digitado é negativo!");
        }
    }
}
