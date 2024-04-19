import java.util.Scanner;

public class ValidarNumero {
    public static void main(String[] args) {
        int n;
        Scanner Teclado = new Scanner(System.in);
        System.out.printf("Introduzca un numero");
        n = Teclado.nextInt();
        if (n % 2 == 0) {
            System.out.printf("Es par");
        } else {
            System.out.printf("Es impar");

        }

    }

}