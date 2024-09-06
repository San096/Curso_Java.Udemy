import java.util.*;

public class Cadastro{
    public static void main(String[] args) {

        List <String> list = new ArrayList<>();  // instaciamento da lista 
        Scanner sc = new Scanner(System.in);

        list.add("Maria");// add um elemento na lista 
        list.add("Alex");
        list.add("anna");
        list.add("tiago");

        list.add(2,"san" ); // add em determinada posição 

        list.remove(4);// remover intem da lista 

        for(String x: list){
              System.out.println(list.size());
            System.out.println(x);  
        }
         System.out.println("-----------------------------"); //remoção por predicado 
         
         
         list.removeIf(x -> x.charAt(0) == 'M');
         for(String x: list){
            System.out.println(list.size());
          System.out.println(x);  

        }
}
}