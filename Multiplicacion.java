
public class Multiplicacion {

	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca el primer numero");
		int numero1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero");
		int numero2 = entrada.nextInt();

		int multiplicacion = numero1 * numero2;

		System.out.println("Resultado: " + multiplicacion);
	}

}
