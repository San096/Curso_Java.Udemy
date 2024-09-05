import java.util.Scanner;

import pacotes.controle;

public class estoque {
    public static void main(String[] args)  {

      Scanner sc = new Scanner(System.in);

     // controle produto = new controle();

      System.out.println("digite o nome do produto:");

     String name = sc.next();

      System.out.println("Digite a quantidade:");

     int quantity = sc.nextInt();

      System.out.println("Digite o valor do produto:");

     double prince = sc.nextDouble();

     

     // System.out.println( produto.toString());

      controle produto = new controle(name, prince, quantity);
      
      produto.setName(name);

      System.out.println("Digite a quantidade de produtos a serem adicionado no estoque");
       quantity = sc.nextInt();
      produto.addproduct(quantity);

      System.out.println();
      System.out.println("aumentar no estoque " + produto);

      System.out.println("Digite a retirada do estoque:");

       quantity = sc.nextInt();
       produto.removeproduct(quantity);
       System.out.println();
      System.out.println("removido do  estoque " + produto);





    

      
  }
}

