import java.sql.Time;
import java.util.*;

public class cadastro {

    public String nome;
    public double salarioBruto;
    public double imposto;


    public double salarioLiquido(){
        return salarioBruto - imposto;
    }
    public double aumento(double bonificação){
        
        return salarioBruto/100 + salarioLiquido();
    }

    public String toString(){
        return "Nome : " + nome + " , impostos do mes " +
               imposto + " salario liquido :" +
               String.format("%.2f",salarioLiquido());

    }
    
}
