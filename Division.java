import java.util.Scanner;

public class Division {
	public static void main(String[] args) {

		int numero1;
		int numero2;

		System.out.println("Ingresa el primer número:");
		Scanner num1 = new Scanner(System.in);
		numero1 = num1.nextInt();

		System.out.println("Ingresa el segundo número:");
		Scanner num2 = new Scanner(System.in);
		numero2 = num2.nextInt();

		int resultado = numero1 / numero2;
		System.out.println("El resultado es " + resultado);

		num1.close();
		num2.close();
	}
}
