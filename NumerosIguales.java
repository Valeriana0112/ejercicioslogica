import java.util.Scanner;
public class NumerosIguales{
    public static void main(String[]args){
        Scanner Teclado = new Scanner (System.in);
        int n1;
        int n2;
        System.out.println("Introduce un numero");
        n1 = Teclado .nextInt();
        System.out.println("Introduce otro numero");
        n2 = Teclado .nextInt();
        if (n1 == n2)
        System.out.println("Son iguales");
        else
        System.out.println("No son iguales");
    
    }
    }
    