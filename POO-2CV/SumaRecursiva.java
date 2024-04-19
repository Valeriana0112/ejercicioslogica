public class SumaArregloRecursiva {
    public static void main(String[] args) {
        int[] arreglo = { 2, 4, 6, 8, 10 }; // Cambia los valores según tu arreglo
        System.out.println("Suma del arreglo: " + SumaArreglo(arreglo, 0));
    }

    private static int SumaArreglo(int[] array, int indice) {
        if (indice == array.length - 1)
            return array[indice];
        else
            return array[indice] + SumaArreglo(array, indice + 1);
    }
}