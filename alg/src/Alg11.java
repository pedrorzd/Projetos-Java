import java.util.Scanner;

public class Alg11 {
    @SuppressWarnings({ "resource" })
    public static void main(String[] args) {

        double carroBase, valCarroDist, valCarroTotal;
        Scanner entrada = new Scanner(System.in);

        System.out.print(
                "Olá fabricante, neste programa iremos calcular o valor de um carro para o consumidor final. Será adicionado o importo do distribuidor e do estado.Insira o valor base do carro: ");
        carroBase = entrada.nextFloat();

        valCarroDist = (carroBase / 100) * 12 + carroBase;
        valCarroTotal = (valCarroDist / 100) * 45 + valCarroDist;

        System.out.printf("O valor do carro para o consumidor será de:R$%.2f\n", valCarroTotal);
    }
}
