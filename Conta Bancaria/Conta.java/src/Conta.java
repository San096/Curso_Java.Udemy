
import java.util.*; 
public class Conta {

    private int numeroDaConta;
    private String cliente;
    private double saldo;


    public Conta(int  numeroDaConta, String cliente){
        this.numeroDaConta = numeroDaConta;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public Conta(int numeroDaConta, String cliente , double inicialDeposito ){
        this.numeroDaConta = numeroDaConta;
        this.cliente = cliente ;
        depoisitar(inicialDeposito);

          System.out.println(this.cliente);  
    }
    

    public String getCliente( ){
        return this.cliente ; 
    }
    
    public void setCliente(String cliente){
        this.cliente = cliente  ;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public int getNumeroDaConta(int numeroDaConta ){
        return this.numeroDaConta;
    }
    
    public void depoisitar(double deposito){
        saldo += deposito;
         
    }
    public void sacar(double saque){
        saldo -= saque + 5.00;
    }

    public String toString(){
        return  "\nConta : "  + this.numeroDaConta +
                "\nCliente: " + this.cliente +
                "\nSaldo:   "  +  
                String.format("%.2f", saldo);
    }

    
}
