/*
 * programa importa o momento que o pedido foi feito , o numero do pedido 
 * e o ENUM : ordemStatus 
 */




import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {

        pedido pedido = new pedido(1800, new Date(), ordemStatus.PEDING_PAYMENT);

        System.out.println(pedido);

        ordemStatus os1 = ordemStatus.DEVILERED;
        ordemStatus os2 = ordemStatus.valueOf(" DEVILERED ");
    
    
        
        System.out.println(os1); 
        System.out.println(os2); 
    }
    
    
}
