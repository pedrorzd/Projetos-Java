import java.util.Scanner;

public class Alg30 {
    public static void main(String[] args) {
        int mes;
        Scanner input = new Scanner(System.in);

        System.out.println(
                "Olá usuário, para saber a quantidade de dias de um més, digite o número dele abaixo: \nExemplo: Março = 3");
        mes = input.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("O mês informado tem 31 dias.");
                break;

            case 2:
                System.out.println("O mês informado tem 28/29 dias.");
                break;

            default:
                System.out.println("O mês informado tem 30 dias.");
        }
    }
}
