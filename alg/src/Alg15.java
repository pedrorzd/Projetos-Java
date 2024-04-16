import java.util.Scanner;

public class Alg15 {
    public static void main(String[] args) {

        String timeA, timeB;
        int golsA, golsB;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println(
                "Olá usuário, para saber o resultado de uma partida de futebol, insira os nomes dos times e a quantidade de gols de cada equipe.\nPrimeira equipe: ");
        timeA = input.nextLine();

        System.out.println("Segunda equipe: ");
        timeA = input.nextLine();

        System.out.println("Agora insira a quantidade de gols feitos por" + timeA);
        golsA = input.nextInt();

        System.out.println("Agora insira a quantidade de gols feitos por" + timeB);
        golsB = input.nextInt();

        if (golsA > golsB) {
            System.out.println("O vencedor foi:" + timeA);
        } else if (golsA < golsB) {
            System.out.println("O vencedor foi:" + timeB);
        } else {
            System.out.println("O jogo terminou empatado!");
        }
    }
}