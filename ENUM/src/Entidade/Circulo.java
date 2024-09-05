package Entidade;

public class Circulo extends Shape {


 private double raio;
 
 
 public Circulo(){
    super();
 }

 public Circulo(Color color, double raio ){
        super(color);
        this.raio = raio;
       

 }

    public double getRaio(){
    return raio;
}


public void setRaio(double raio) {
    this.raio = raio;
}

    @Override
    public double area(){
        return Math.PI * getRaio() * getRaio();  
    }
}

    

