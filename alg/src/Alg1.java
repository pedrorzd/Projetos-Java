import java.util.Scanner;

public class Alg1 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String nome; // string = line
		int idade;
		float peso;

		System.out.print("Digite seu nome aqui:");
		nome = leitor.nextLine();

		System.out.print("Entre com a sua idade:");
		idade = leitor.nextInt();

		System.out.print("Digite seu peso:");
		peso = leitor.nextFloat();

		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.printf("Peso: %.2f ", +peso);
	}
}