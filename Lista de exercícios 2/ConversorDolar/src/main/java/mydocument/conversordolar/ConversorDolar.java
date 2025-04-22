package mydocument.conversordolar;
import java.util.Scanner;

public class ConversorDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rs, dol, cotacao;

        System.out.print("Informe a cotação do Dolar: ");
        cotacao = scanner.nextDouble();

        System.out.print("Informe a quantia em Dolar: ");
        dol = scanner.nextDouble();

        rs = dol * cotacao;

        System.out.println("A sua quantia em reais é " + String.format("%.2f", rs) + "R$");
        scanner.close();
    }
}
