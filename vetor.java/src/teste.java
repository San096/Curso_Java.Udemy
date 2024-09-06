
import  java.util.*;

public class teste{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List <Funcionario> list = new ArrayList<>();

        System.out.println("Quantos funcionarios vão ser resgistrado:");
        int n = sc.nextInt();

        for (int i =0 ; i < n; i++){
            System.out.println("funcionario#" + (i + 1)+ ":");
            System.out.println("ID:");
            int id = sc.nextInt();
            System.out.println("Nome :");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salary:");
            double salario = sc.nextDouble();

            Funcionario emp = new Funcionario(id,nome,salario);

            list.add(emp); //  add instens na lista 


            }

            System.out.println("Digite o ID do Funcionario que vai ter o salario incrementado :");// ler o id do funcionario 
            int idSalario = sc.nextInt(); // recebe o valor
            Integer pos = position(list, idSalario);  // ler a função que verificar se o id esta na lista 
            if(pos == null){// se a posição for nula 
                System.out.println("esse Id não existe:");
            }
            else {
                System.out.println("informe a porcentagem a ser acresentada :"); //  caso não for nula ela ler a porcentagem  que deve ser icrementada , e ler a função public void increaseSalary(double porcentage)
                double percent = sc.nextDouble();
                list.get(pos).increaseSalary(percent);// icrementa a porcentagem no id informando  
            }
            System.out.println("Lista de funcionario ");
            for(Funcionario emp : list){
                System.out.println(emp );
            }


        }

        public static Integer position (List<Funcionario> List, int id){ // verificar a posição do id na lista 
            for (int i = 0 ; i<List.size() ; i++){
                if(List.get(i).getId()==id){
                    return i;
                }

            } 
              return null; 


        }
        

        
    }

