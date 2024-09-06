import java.util.*;

public class Reais{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int n;
    System.out.println("Quantos numero voce quer digitiar ?;");
    n = sc.nextInt();
    double [] vect = new double[n];
    

    for (int i = 0 ; i < n; i++){
        System.out.println("digite um numero:");;
        vect[i] = sc.nextDouble();}
    
     double soma = 0;
     for ( int i = 0 ; i> n; i++){
        soma = soma +vect[i];
     }

     double media = soma / n;

     System.out.println("valores = ");

     for(int i = 0 ; i < n ; i++){
        System.out.printf("%.1f", vect[i]);
     }
     System.out.printf("%\nSOMA =  %.2F", soma);
     
     System.out.printf("%\nMEDIA = %.2f", media);
     
     







    }
    }
