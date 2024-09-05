/*
 * ultilização do switch case
 */

import java.util.*;

class menu{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Digite o dia correspondente:");
       int opção = sc.nextInt();
       String dia = "";

        switch (opção) {
        case 1:
            dia = "domingo";
                
                break;   
        
        case 2:
            dia = "Segunda";
                
                break;  
    
        case 3:
            dia = "Terça";
                
                break;  
        case 4:
            dia = "Quarta";
                
                break;  

        default:
        dia = "";
        System.out.println("Valor invalido");   
                 break;     
                

    }
    System.out.println("DIA DA SEMANA :" + dia );
   
}
}