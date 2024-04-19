import java.util.Scanner;
public class modulo {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduza el primer numero");
		int numero1 = entrada.nextInt();
		System.out.println("Introduza el segundo numero");
		int numero2 = entrada.nextInt();
		
		int modulo = numero1 % numero2;
		
		System.out.println("Resultado: " + modulo);
	}

}