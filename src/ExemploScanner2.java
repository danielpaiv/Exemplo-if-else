import java.util.Scanner;

public class ExemploScanner2 {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);

        System.out.println("Digite seu naome");
        String nome = s.nextLine();

        System.out.println("\nDigite sua altura:");
        double altura = s.nextDouble();

        System.out.println(nome + " tem " + altura + " de altura");
    }
}
