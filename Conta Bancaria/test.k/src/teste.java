import java.util.*;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0; i<n ; i++){
        vect[i] = sc.nextDouble();
        
        }
        double soma = 0;
        for(int i =0; i < n; i++){
            soma += vect[1];
        }
        double media = soma / n;

        System.out.println("Media : " + media);
    }
}
