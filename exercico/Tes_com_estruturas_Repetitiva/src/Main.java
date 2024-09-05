
/*
 * o programa informa se um numero digitado pelo o usuario  esta dentro de um intervalo de 25 numero 
 */
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

         int n ;

         System.out.println("Digte um nemero:");
         n = sc.nextInt();
         
         if(n > 0 && n < 25){
            System.out.println("[0 , 25]");
         }

          else if ( n > 25  && n < 50){
            System.out.println("[ 25 , 50]");
         }

          else if ( n > 50 && n < 75){
            System.out.println("[ 50 , 75]");
         }
           else if(n > 75 && n < 100){
            System.out.println("[75 , 100 ]");
         }
         else {
            System.out.println("Fora de intervalo;");
         }
    }
}
