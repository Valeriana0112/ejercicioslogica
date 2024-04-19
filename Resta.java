
public class Resta {

	public static void main(String args[]) {
		scanner entrada = new scanner(System.in);

		System.out.println("Introduzca el primer numero");
		int numero1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero");
		int numero2 = entrada.nextInt();

		int resta = numero1 - numero2;

		System.out.println("Resultado: " + resta);
	}

}
