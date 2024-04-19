import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Introduce el radio del círculo: ");
        double radio = Scanner.nextDouble();

        double area = calcularArea(radio);
        System.out.println("El área del círculo es: " + area);
    }

    public static double calcularArea(double radio) {
        if (radio <= 0) {
            return 0; 
        } else {
            return Math.PI * Math.pow(radio, 2);
        }
    }
}
