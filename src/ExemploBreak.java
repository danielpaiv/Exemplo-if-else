public class ExemploBreak {
    public static void main(String args[]){
        for (int contador=1; contador<=1000; contador++){
            System.out.println("Essa é a repetição nr: " + contador);
            if (contador==10) break;
        }
    }
}
