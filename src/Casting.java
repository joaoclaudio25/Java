import java.util.Scanner;

public class Casting {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua altura em metros (ex: 1,78): ");
        double altura = entrada.nextDouble();

        System.out.printf("Altura em metros: %.2f%n", altura);

        // arredonda para cima antes de converter
        int valorInt = (int) (altura * 100);
        Math.round(altura);

        System.out.println("Valor arredondado para cima em cm: " + valorInt);

        // arredonda para cima antes de converter
        int valorInt2 = (int) Math.floor(altura);
        System.out.println("Valor arredondado para baixo em metros (int): " + valorInt2);

        // arredonda antes de converter
        int valorInt3 = (int) Math.ceil(altura);
        System.out.println("Valor arredondado em metros (int): " + valorInt3);

        entrada.close();
    }
}
