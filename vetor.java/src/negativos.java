import java.util.*;

public class negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
      int n;
      System.out.println("Quantos numeros voce quer digitar?:");
      
       n =sc.nextInt();
      int [] nume = new int[n];

      for(int i =0 ; i<n ; i++){
        System.out.println("Digite um numero :");
        nume[i] = sc.nextInt();
      }

      System.out.println("Numeros negativos:");

      for(int i =0 ; i< n ;i++){
        if (nume[i] <0 ){
            System.out.printf("%d\n" , nume[i]);
        }
      }

      


    }
}

