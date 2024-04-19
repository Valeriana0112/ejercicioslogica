import java.util.Scanner;
public class AreaTriangulo {

    public static void main(String[] args) {
       Scanner lea = new Scanner(System.in);
        int a;
        int b;
    
        System.out.println("Ingrese la base:");
b=lea.nextInt();
         System.out.println("Ingrese la altura:");
a=lea.nextInt();
            double Area = (b*a)/2;
            
            System.out.println("El resultado es:"+ Area);

lea.close();
}

    private static double Area (int a ,int b) {

            return  ( b*a)/2 ;
        }
    }
