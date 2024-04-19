
public class DivisionRecursiva {

    public static double divisionRecursiva(double dividendo, double divisor) {

        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }

        if (dividendo < divisor) {
            return 0;
        }

        return 1 + divisionRecursiva(dividendo - divisor, divisor);
    }

    public static void main(String[] args) {
        double dividendo = 20;
        double divisor = 5;

        try {
            double resultado = divisionRecursiva(dividendo, divisor);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}