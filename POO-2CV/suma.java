import java.util.Scanner;
public class suma {
    
    public static void main (String [] args){
      int numero1;
        int numero2;
        
        System.out.println("Ingresa el primer numero");
        Scanner num1 = new Scanner (System.in);
        numero1 = num1.nextInt();
        System.out.println("Ingresa el segundo numero");
        Scanner num2 = new Scanner(System.in);
        numero2 = num2.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("Resultado: " + resultado);
    }   
}