import java.util.Scanner;

public class ExemploScanner3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um numero");

        int result = s.nextInt();

        if (result > 5){
            System.out.println("Resultado maior que 5");
        }
        else if (result >= 5){
            System.out.println("Resultado igual a 5");
        }
        else {
            System.out.println("Resultado menor que  5");
        }
    }
}
