package mydocument.conversortemperatura;
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tc, tf;

        System.out.print("Informe a temperatura em Celsius: ");
        tc = scanner.nextDouble();

        tf = (tc * 9 + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é " + tf);
        scanner.close();
    }
}
