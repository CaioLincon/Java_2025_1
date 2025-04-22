package mydocument.trocavalores;
import java.util.Scanner;
public class TrocaValores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, aux;
        System.out.println("Digite o valor de A: ");
        A = input.nextInt();
        System.out.println("Digite o valor de B: ");
        B = input.nextInt();
        
        aux = A;
        A = B;
        B = aux;
        
        System.out.println("Os valores invertidos de A e B sao: " + A + " e " + B);
        input.close();
         
    }
}
