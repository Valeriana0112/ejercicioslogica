import java.util.Scanner;

public class MainSuma {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int n1 = reader.nextInt();

        System.out.println("Introduce el segundo número:");
        int n2 = reader.nextInt();

        
        Suma2 suma = new Suma2();
        suma.Resultado =(n1+n2);
suma.mostrarResultado();

    }
}
