import java.util.Scanner;

public class ExemploAnimal {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome de um animal");
        String testo = s.next();
        String animal = exampleofif(testo);
        System.out.println(animal);
    }

    private static String exampleofif(String animal) {
        String result;
        boolean cat = animal.equals("CAT");
        if (animal.equals("daniel") || animal.equals("CAT"))  {
            result = "Cliente Daniel";

        }
        else if (animal.equals("TIGER")){
            result ="wild animal";
        }
        else {
            result = "unknown animal";
        }
        return result;
    }
}
