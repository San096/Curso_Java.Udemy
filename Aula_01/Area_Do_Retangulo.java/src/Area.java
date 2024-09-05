import java.util.*;
import java.math.*;

public class Aria {

    public double base;
    public double altura;

    public double area() {
        return this.base * this.altura;
        
    }

    public double perimeter(){
        return (this.base + this.altura) * 2;
    }

    public double diagonal(){
       return Math.sqrt(Math.pow(this.base,2) + Math.pow(this.altura,2));
        
    }

    public String toString(){
        return "Area = " +
                String.format("%.2f",area( )) + ", Perimentro = " +
               String.format("%.2f" ,perimeter() ) + ", diagonal = " +
               String.format("%.2f" ,diagonal() );  

    }
    
}
