package mydocument.menuarquivo;
import java.util.Scanner;

public class MenuArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcao;

        System.out.println("========-MENU-========");
        System.out.println("N: Novo Arquivo");
        System.out.println("A: Abrir Arquivo");
        System.out.println("F: Fechar Arquivo");
        System.out.println("S: Sair");
        System.out.println("====================");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.next().charAt(0); // Lê o primeiro caractere da entrada

        if (opcao == 'N' || opcao == 'n') {
            System.out.println("Novo arquivo criado com sucesso!");
        } else if (opcao == 'A' || opcao == 'a') {
            System.out.println("Abrindo arquivo...");
        } else if (opcao == 'F' || opcao == 'f') {
            System.out.println("Fechando arquivo...");
        } else if (opcao == 'S' || opcao == 's') {
            System.out.println("Obrigado por utilizar o aplicativo!");
        }

        scanner.close();
    }
}