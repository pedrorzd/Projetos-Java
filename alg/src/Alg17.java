import java.util.Scanner;

public class Alg17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Olá nadador, por favor, digite sua idade abaixo: ");
        idade = input.nextInt();

        if (idade >= 5 && idade <= 12) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Categoria Juvenil");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("Categoria Profissional");
        } else {
            System.out.println("Fora da faixa de idade permitida");
        }
    }
}