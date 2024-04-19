import java.util.*;
public class RestaRecursiva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduzca primer numero: ");                                                           
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("Resultado: " + resta(n1, n2));                                                              

    }
    public static int resta(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        } else {
            return 1 - resta(a, b - 1);
        }
    }
}