package mydocument.valorfinalveiculo;
import java.util.Scanner;

public class ValorFinalVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vi, imp, pd, vm1, vm2, vf;

        System.out.print("Informe o valor de fábrica do veículo: ");
        vi = scanner.nextDouble();

        System.out.print("Informe o valor da taxa de impostos (%): ");
        imp = scanner.nextDouble();

        System.out.print("Informe o valor da taxa do vendedor (%): ");
        pd = scanner.nextDouble();

        vm1 = vi + (vi * imp / 100);
        vm2 = vm1 + (vm1 * pd / 100);
        vf = vm2; // O valor final já inclui os impostos e a taxa do vendedor

        System.out.println("O Valor final de seu veículo é de " + String.format("%.2f", vf));
        scanner.close();
    }
}
