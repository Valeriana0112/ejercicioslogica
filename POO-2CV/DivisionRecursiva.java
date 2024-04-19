import java.util.Scanner;

public class DivisionRecursiva {
static Scanner entrada = new Scanner(System.in);
 static int DivisionRecursiva(int dividendo, int divisor){
    if(dividendo < divisor)
        
        return 0;
    else
        return 1 + DivisionRecursiva( dividendo-divisor,divisor);  
        
    }
     public static void main (String[]args){



int dividendo, divisor;

System.out.print("Favor ingresar el primer termino : ");

dividendo = entrada.nextInt();

System.out.print("Favor ingresar el segundo termino: ");

divisor = entrada.nextInt();

System.out.print ("Resultado:" + DivisionRecursiva(dividendo, divisor));
     }
 }

