import java.util.Scanner;

public class SumaRecursiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Introduzca el primer número: ");
        n1 = sc.nextInt();

        System.out.print("Introduzca el segundo número: ");
        n2 = sc.nextInt();

        System.out.println("La suma es: " + suma(n1, n2));
    }

    public static int suma(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else {
            return 1 + suma(a, b - 1);
        }
    }
}
