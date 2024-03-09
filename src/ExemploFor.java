import java.util.Scanner;

public class ExemploFor {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Didite um número para gerar a taboada");
        int num = s.nextInt();
        for (int i = 0; i <= 10; i++){

            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
