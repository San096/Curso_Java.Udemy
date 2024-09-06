/*
 * programa testa uma variavel x, enquanto x for diferente de senha o sistema ira dara mais uma chance para 
 * o usuario acerta
 */


import java.util.*;
public class App {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);

       int senha = 2022;

        System.out.println("digite a senha:");
       int x = sc.nextInt();

        while (x != senha) {
         x = sc.nextInt();
         if( x == senha ){
         System.out.println("acesso liberado");}
         else{
       System.out.println("acesso negado");}
      }

    
    }
}
