import java.util.Scanner;

public class Alg18 {
    public static void main(String[] args) {
        double valInit, valTotal, valCorrigido;
        Scanner input = new Scanner(System.in);
        System.out.print("Coloque um valor para sofrer o reajuste salarial: ");
        valInit = input.nextDouble();
        if (valInit < 500) {
            valCorrigido = (valInit * 0.15) + valInit;
            System.out.printf("O valor do salário reajustado é: R$%.2f", valCorrigido);
        } else if (valInit > 500 && valInit < 1000) {
            valCorrigido = (valInit * 0.10) + valInit;
            System.out.printf("O valor do salário reajsutado é: R$%.2f", valCorrigido);
        } else {
            valCorrigido = (valInit * 0.05) + valInit;
            System.out.printf("O valor do salário reajustado é: R$%.2f", valCorrigido);
        }
    }
}