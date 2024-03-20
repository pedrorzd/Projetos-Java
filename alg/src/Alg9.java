import java.util.Scanner;

public class Alg9 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        float higher, base;
        double area;

        Scanner dados = new Scanner(System.in);

        System.out.print(
                "Para calcularmos a área do triângulo, precisamos das medidas de Áltura e Base. Por favor, digite a altura do triângulo: ");
        higher = dados.nextFloat();

        System.out.print("Agora digite o valor da base: ");
        base = dados.nextFloat();

        area = (base * higher) / 2;

        System.out.println();
        System.out.println("A área do triângulo é: " + area + "cm^2");
    }
}
