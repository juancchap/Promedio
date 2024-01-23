
package promedios;
import java.util.Scanner;
public class Promedios {

   
    public static void main(String[] args) {
       double cal1,cal2,cal3,promedio,RedCall;
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digita la calificacion 1: ");
        cal1=entrada.nextDouble();
        
        System.out.println("Digita la calificacion 2: ");
        cal2=entrada.nextDouble();
        
        System.out.println("Digita la calificacion 3: ");
        cal3=entrada.nextDouble();
        
        promedio= (cal1+cal2+cal3)/3;
        
        RedCall=Math.round(promedio);
        
        System.out.println("El promedio  final es : "+RedCall);
    }
    
}
