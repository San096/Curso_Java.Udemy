package Class;

public class Tercerizado extends Funcionario {
    private double add;

    public Tercerizado(){
        super();
    }

    public Tercerizado(String nome , int horasTrabalhada, double valorDaHora , double add){

        super(nome, horasTrabalhada, valorDaHora);
        this.add = add;
    }

    public double getAdd() {
        return add;
    }

    public void setAdd(double add){
        this.add = add;
    }

    @Override
    public double salariototal(){
        double salario = getHorasTrabalhada() * this.getValorDaHora();
        return salario /100 * this.add + (salario);
    }
    
}
