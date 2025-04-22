package mydocument.informeprestacoes;
import java.util.Scanner;

public class InformePrestacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vc, vp;

        System.out.print("Informe o valor da compra: ");
        vc = scanner.nextDouble();

        vp = vc / 5;

        System.out.println("O Valor de suas prestações é " + String.format("%.2f", vp) + "R$");
        scanner.close();
    }
}
