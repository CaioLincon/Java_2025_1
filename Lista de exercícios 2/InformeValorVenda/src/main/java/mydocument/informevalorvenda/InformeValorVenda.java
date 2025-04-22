package mydocument.informevalorvenda;
import java.util.Scanner;

public class InformeValorVenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vc, ac, vm, vf;

        System.out.print("Informe o valor de custo: ");
        vc = scanner.nextDouble();

        System.out.print("Informe o percentual de acréscimo: ");
        ac = scanner.nextDouble();

        vm = (vc * ac) / 100;
        vf = vc + vm;

        System.out.println("O valor de venda é de " + String.format("%.2f", vf));
        scanner.close();
    }
}

