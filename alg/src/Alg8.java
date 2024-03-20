import java.util.Scanner;

public class Alg8{

	@SuppressWarnings("resource")
    public static void main (String[] args){

		Scanner notaUsuario = new Scanner(System.in);

		int notaUm, notaDois, notaTres;
		float notaMedia;

		System.out.println("Olá Aluno, para calcular sua média de nota favor digite as mesmas abaixo: ");

		notaUm = notaUsuario.nextInt();
		notaDois = notaUsuario.nextInt();
		notaTres = notaUsuario.nextInt();

		notaMedia = (notaUm + notaDois + notaTres)/3;

		System.out.println("Aluno, sua média esse semestre foi: "+ notaMedia);

		if (notaMedia >= 60){
			System.out.println("Você está aprovado, parabéns!");
			}

			else {
				System.out.println("Sua nota foi menor que a esperado, infelizmente está reprovado.");
			}
	}
}