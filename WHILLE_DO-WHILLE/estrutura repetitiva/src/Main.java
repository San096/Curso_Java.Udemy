import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

  char resp;

       do {
            System.out.println("Digite a temperatura em celsius:");
            double c = sc.nextDouble();
            double f = 9.0 * c /5.0+ 32.00;
            System.out.printf("Equivalente a fahrenheit: %.1f%n", f);
            System.out.println("Deseja continuar ? (s/n)");
            resp = sc.next().charAt(0);
  
        }while (resp != 'n');
    }
}