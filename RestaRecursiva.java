
public class RestaRecursiva {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 3;

        int resultado = restaRecursiva(numero1, numero2);

        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resultado);
    }

    public static int restaRecursiva(int a, int b) {
        if (b == 0) {
            return a; 
        } else {
            return restaRecursiva(a - 1, b - 1); 
        }
    }
}
