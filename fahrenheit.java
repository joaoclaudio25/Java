import java.util.Scanner;

public class fahrenheit {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius ");
        double celsius = entrada.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("%.2f%n Temperatura em Farenheit: " + fahrenheit);
    }
}
