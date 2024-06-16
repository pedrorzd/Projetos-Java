import java.util.Scanner;

public class Alg43 {
    public static void main(String[] args) {
        int i = 0, aprovados = 0, reprovados = 0, alunos = 10;
        float nota1, nota2, nota3, totalTurma = 0, notaAno = 0, mediaTurma = 0;
        char name;
        Scanner inputName = new Scanner(System.in);
        Scanner inputNota1 = new Scanner(System.in);
        Scanner inputNota2 = new Scanner(System.in);
        Scanner inputNota3 = new Scanner(System.in);

        for (i = 1; i <= alunos; i++) {
            System.out.println(
                    "Olá usuário, nosso algoritmo funciona da seguinte forma, alunos com notas maiores que 60, são aprovados e com notas menores do que 60,são reprovados. É preciso inserir quatro dados, sendo eles: Nome, nota do primeiro trimestre, nota do segundo trimestre e a nota do terceiro trimestre. Vamos começar!\nNome:");
            name = inputName.next().charAt(0);

            System.out.println("Agora insira a nota do primeiro trimestre:");
            nota1 = inputNota1.nextFloat();

            System.out.println("Agora insira a nota do segundo trimestre:");
            nota2 = inputNota2.nextFloat();

            System.out.println("Agora insira a nota do terceiro trimestre:");
            nota3 = inputNota3.nextFloat();

            notaAno = ((nota1 + nota2 + nota3) / 3);

            if (nota1 < 0 || nota2 < 0 || nota3 < 0) {
                System.out.println("As notas inseridas não são válidas, pois uma possui valor negativo!!");
            } else {
                if (notaAno >= 60) {
                    aprovados++;
                } else {
                    reprovados++;
                }
            }

            totalTurma += notaAno;

            mediaTurma = (totalTurma / alunos);
        }

        System.out.printf("A média da classe foi:%.1f", mediaTurma);
        System.out.println();
        System.out.printf("A quantidade de alunos aprovados foi: " + aprovados);
        System.out.println();
        System.out.printf("A quantidade de alunos reprovados foi: " + reprovados);

    }
}
