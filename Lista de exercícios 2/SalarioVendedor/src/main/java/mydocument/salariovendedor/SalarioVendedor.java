package mydocument.salariovendedor;
import java.util.Scanner;
public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        double salarioFixo, vendas, comissao, salarioFinal;
          System.out.println("Digite o nome do vendedor: ");       
          nome = input.nextLine();
          System.out.println("Digite o salario fixo do vendedor: ");
          salarioFixo = input.nextDouble();
          System.out.println("Digite o valor das vendas efetuadas pelo vendedor: ");
          vendas = input.nextDouble();
          
          comissao = vendas*0.15;
          salarioFinal = salarioFixo + comissao;
          
          System.out.println("Nome do vendedor: " + nome);
          System.out.println("Salário fixo: R$ " + salarioFixo);
          System.out.println("Comissão: R$ " + comissao);
          System.out.println("Salário final: R$ " + salarioFinal);
          
        input.close();
                 
    }
}
