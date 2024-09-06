package pacotes;

import java.util.*;

public class controle {
    private String name;
    private double prince;
    private int quantity;


    public controle(String name , double prince , int quantity){
        this.name = name;
        this.prince = prince;
        this.quantity = quantity;

    }

    public void  setName (String name ){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public double totalValueStock(){
        return this.quantity * this.prince;
    }
    public void addproduct(int quantity){
        this.quantity += quantity;
    }

    public void  removeproduct(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return this.name +" , $ "
                    + String.format("%.2f", prince) + " , " 
                    + this.quantity + " unidades " + ", $ "+
                    String.format("%.2f",totalValueStock());



    }
    
}
