import java.util.Scanner;

public class ModuloRecursivo {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int n;

        System.out.print("Indica la cantidad de numeros: ");
        n = lea.nextInt();

        if (n <= 0) {
            System.out.println("El valor no es válido.");
        } else {
            int bajo = contarNumerosBajos(n);
            int inviable = contarNumerosInviables(n);

            double porcentajeBajo = calcularPorcentaje(bajo, n);
            double porcentajeInviable = calcularPorcentaje(inviable, n);

            System.out.println("Porcentaje de numeros bajos: " + porcentajeBajo + "%");
            System.out.println("Porcentaje de numeros inviables: " + porcentajeInviable + "%");
        }

        lea.close();
    }

    
    private static int contarNumerosBajos(int n) {
        
        return 2; 
    }

    
    private static int contarNumerosInviables(int n) {
    
        return 1; 
    }

    
    private static double calcularPorcentaje(int cantidad, int total) {
        return (cantidad * 100.0) / total;
    }
}