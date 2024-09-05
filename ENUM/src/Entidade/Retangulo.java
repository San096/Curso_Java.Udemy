package Entidade;

public class Retangulo extends Shape {
    private  double largura;
    private double haltura;


    public Retangulo(){
        super();
    }

    public Retangulo(Color color ,double haltura , double largura){
        super(color );
        this.haltura = haltura;
        this.largura = largura;
    }
    

    public double getLargura() {
        return largura;
    }


    public void setLargura(double largura) {
        this.largura = largura;
    }


    public double getHaltura() {
        return haltura;
    }


    public void setHaltura(double haltura) {
        this.haltura = haltura;
    }


    @Override
    public double area(){
        return largura * haltura; 
    }
    
}
