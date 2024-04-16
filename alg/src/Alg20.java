import java.util.Scanner;

public class Alg20 {
    @SuppressWarnings({ "resource" })
    public static void main(String[] args){
        
        float A,B,C;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá usuário,em nosso programa, caso o valor de A seja igual ao de B, será realizada uma operação de adição, se os valores forem diferentes será realizada uma multiplicação. O resultado irá ser atribuído a C. Por favor insira o valor do número A abaixo:");
        A=entrada.nextFloat();

        System.out.println("Agora digite o valor do número B: ");
        B=entrada.nextFloat();

        if(A==B) {
            C = (A+B);
            System.out.printf("O resultado da operação de adição foi: %.2f.",C);
        }else {
            C = (A*B);
            System.out.printf("O resultado da operação de multiplicação foi: %.2f.",C);
        }

        System.out.println();
        System.out.println();
        System.out.printf("Os valores das váriaveis são: A= %.2f ",A);
        System.out.printf(" B= %.2f ",B);
        System.out.printf(" C= %.2f ",C);
    }
}
