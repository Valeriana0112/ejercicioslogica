import java.util.Scanner;

public class MultiplicacionRecursiva {

static Scanner entrada= new Scanner(System.in);

static int MultiplicacionRecursiva (int a, int b){

if (b==1)

return a;

else

return a + MultiplicacionRecursiva ( a, b-1);
}
public static void main(String[] args) {


int a, b;

System.out.print("Favor ingresar el primer termino a multiplicar: ");

a = entrada.nextInt();

System.out.print("Favor ingresar el segundo termino: ");

b = entrada.nextInt();

System.out.print("El producto entre los dos numeros es:"+ MultiplicacionRecursiva(a, b));
}
}