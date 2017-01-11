
package perimetroarearettangolo;
import java.util.Scanner;

public class Perimetroarearettangolo {

    
    public static void main(String[] args) {
      int lato;
      int altezza;
        Scanner input = new Scanner(System.in);
     
     do{ 
         System.out.println("Inserire valore lato:");
         lato = input.nextInt();
     }while (lato<=0);
     
      
     do{
         System.out.println("Inserire valore altezza:");
         altezza = input.nextInt();
     }while (altezza<=0);
      
      
      int area = lato*altezza;
      int perimetro = (lato*2)+(altezza*2);
      System.out.println("Area="+area);
      System.out.println("Perimetro="+perimetro);
    }
    
}
