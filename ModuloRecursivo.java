import java.util.Scanner;

public class ModuloRecursivo {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int n;

        System.out.println("Ingrese el primer numero:");
        n = lea.nextInt();
        System.out.println("Ingrese el porcentaje a obtener:");
        n = lea.nextInt();

        double Modulo = (n);

        System.out.println("El resultado es:" + Modulo);

        lea.close();

    }

    private static double Modulo(int n) {
        return (n * 100.0) / n;

    }
}
