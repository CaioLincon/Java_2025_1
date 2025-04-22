package mydocument.informerendimento;
import java.util.Scanner;

public class InformeRendimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vi, vf, rendimento;

        System.out.print("Informe o valor inicial: ");
        vi = scanner.nextDouble();

        rendimento = vi * 0.007;
        vf = vi + rendimento;

        System.out.println("O Seu rendimento mensal foi de " + String.format("%.2f", rendimento) + " e seu valor final é de " + String.format("%.2f", vf));
        scanner.close();
    }
}

