import java.util.Scanner;

public class AreaCuadrado {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int n;

        System.out.println("Ingrese el primer numero:");
        n = lea.nextInt();

        double Area = Math.pow(n, 2);

        System.out.println("El resultado es:" + Area);

        lea.close();
    }

    private static double Area(int n) {

        return Math.pow(n, 2);
    }
}
