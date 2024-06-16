import java.util.Scanner;

public class Alg58 {
    public static void main(String args[]) {
        int vetFirst[] = new int[10];
        int vetSecond[] = new int[10];
        int vetResult[] = new int[10];
        int i;

        Scanner inputFirst = new Scanner(System.in);
        Scanner inputSecond = new Scanner(System.in);

        for (i = 0; i < vetFirst.length; ++i) {
            System.out.print(
                    "Olá usuário, nosso sistema possui o seguinte funcionamento, é preciso escrever 10 números para preencher a lista,"
                            +
                            " após os mesmos serem digitados, é preciso inserir os valores da segunda lista, no final é apresentado o resultado da soma das duas listas! Digite os valores da primeira lista: ");
            vetFirst[i] = inputFirst.nextInt();
        }
        for (i = 0; i < vetSecond.length; ++i) {
            System.out.print("Agora digite os valores da segunda lista: ");
            vetSecond[i] = inputSecond.nextInt();
        }

        for (i = 0; i < vetResult.length; ++i) {
            vetResult[i] = vetFirst[i] + vetSecond[i];
        }
        for (i = 0; i < vetResult.length; ++i) {
            System.out.print(vetResult[i] + " ");
        }
    }
}
