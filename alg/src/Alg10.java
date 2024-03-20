import java.util.Scanner;

public class Alg10 {  
    public static void main(String[] args) {
        float consumMedio, distTotal, volComb;

		try (Scanner dados = new Scanner(System.in)) {
            System.out.println("Olá usúario, esse programa serve para calcular o consumo médio de seu veículo. Para começarmos digite o a ditância percorrida abaixo,em quilometros(km): ");
            distTotal = dados.nextFloat();

            System.out.println("Agora digite o volume total de combustível, em litros:");
            volComb = dados.nextFloat();
        }

		consumMedio = distTotal/volComb;

		System.out.printf("O consumo médio do seu veículo é,aproximadamente: %.2f\n",consumMedio);
		System.out.println("Obrigado por usar nosso sistema!");
    }
}