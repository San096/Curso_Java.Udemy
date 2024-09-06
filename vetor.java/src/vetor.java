import java.util.*;

public class vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        produto[] vect = new produto[n];

        for(int i=0; i<vect.length ; i++){ // length define o tamano do vetor ele sabe o tamanho dele
            sc.nextLine();
       String name = sc.nextLine();
       double price = sc.nextDouble();
       vect[i] = new produto(name , price);
        
        }
        double soma = 0;
        for(int i =0; i < vect.length; i++){
            soma += vect[i].getPrice();
        }
        double media = soma / vect.length;

        System.out.println("Media : " + media);
    }
}

