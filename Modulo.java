import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        int num;
        int porcentaje;
        double resultado;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        num = scanner.nextInt();
        System.out.println("Ingrese el porcentaje a odtener: ");
        porcentaje = scanner.nextInt();
        resultado = num * porcentaje / 100.0;
        System.out.println("El resultado es:" + resultado);
    }
}