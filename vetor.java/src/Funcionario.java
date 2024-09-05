public class Funcionario {
    private Integer Id;
    private String name;
    private double salary;

    public Funcionario(int Id , String name, double salary){
        this.Id = Id;
        this.name = name;
        this.salary = salary;

    }

    public int getId(){
        return this.Id;
    }
    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setId( int Id){
        this.Id = Id;
    }

    public void SetName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void increaseSalary(double porcentage){
        this.salary += this.getSalary() * porcentage  / 100;
    }

    public String toString(){
        return Id  +  ", "   +  name  + ","  +  String.format("%.2f", salary);
    }
    
}
