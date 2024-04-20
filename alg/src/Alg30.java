import java.util.Scanner;

public class Alg30 {

    public static void main(String[] args) {

    	int funcao;
    	double reajuste, salarioCorrigido,salarioBase;
    	Scanner input = new Scanner(System.in);

    	System.out.println("Olá usúario, para saber seu reajuste, favor insira o código da sua função:\n1 = Gerente\n2 = Vendedor\n3 = Programador\n4 = Motorista\n5 = Vereador\n6 = Deputado.\n\n");
    	funcao = input.nextInt();

    	System.out.print("Agora, por favor digite o valor do seu Salário: R$");
		salarioBase = input.nextFloat();


		switch(funcao){
			case 1:
				reajuste=0.3;
				salarioCorrigido=((salarioBase*reajuste)+ salarioBase);
				System.out.println("O valor do salário corrigido é:\nR$"+salarioCorrigido);
				break;

			case 2:
				reajuste=0.4;
				salarioCorrigido=((salarioBase*reajuste)+ salarioBase);
				System.out.println("O valor do salário corrigido é:\nR$"+salarioCorrigido);
				break;

			case 3:
				reajuste=0.5;
				salarioCorrigido=((salarioBase*reajuste)+ salarioBase);
				System.out.println("O valor do salário corrigido é:\nR$"+salarioCorrigido);
				break;

			case 4:
				reajuste=0.6;
				salarioCorrigido=((salarioBase*reajuste)+ salarioBase);
				System.out.println("O valor do salário corrigido é:\nR$"+salarioCorrigido);
				break;

			default:
				System.out.print("Seu salário não terá reajuste.");
		}
    }
}