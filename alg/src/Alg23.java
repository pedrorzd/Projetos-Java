import java.util.Scanner;

public class Alg23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float L1, L2, L3, X;

        System.out.println(
                "Olá usuário, para saber o tipo de triangulo é preciso entrar com os valores de cada um de seus lados, por favor insira o Lado número um: ");
        L1 = input.nextFloat();

        System.out.println("Agora inisra o valor do segundo Lado: ");
        L2 = input.nextFloat();

        System.out.println("Agora inisra o valor do terceiro Lado: ");
        L3 = input.nextFloat();

        if (L1 > (L2 - L3) && L1 < (L2 + L3)) {
            if (L1 != L2 && L1 != L3 && L2 != L3) {
                System.out.println("As medidas inseridas formam um triángulo Escaleno!");
            } else if (L1 == L2 || L1 == L3 || L3 == L2) {
                System.out.println("As medidas inseridas formam um triángulo Equiátero!");
            } else {
                System.out.println("As medidas inseridas formam um triángulo Isóceles!");
            }
        } else {
            System.out.println("Os valores inseridos não formam um triángulo!!");
        }

    }
}