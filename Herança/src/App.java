import java.util.*;

import Class.Funcionario;
import Class.Tercerizado;
public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List <Funcionario> list  = new ArrayList<>();
         


        System.out.println("qual a quantidade de funcionario ");
        int fun = sc.nextInt();


        for (int i = 0 ; i < fun ; i++){
           System.out.println("Dados do Funcionario # " + i + " 1"); 

           System.out.println("ele é tercerisado?(s/n)");
           char ch = sc.next().charAt(0);
           System.out.print("nome :");
           sc.nextLine();
           String nome = sc.nextLine();
           System.out.println("Quantidade de horas trabalhada :");
           int horas = sc.nextInt();
           System.out.println("Qual o valor da Hora:");
           Double valor = sc.nextDouble();

           if( ch == 's'){
            System.out.println("Taxa ADicional:");
            double add2 = sc.nextDouble();
           Funcionario emp = new Tercerizado(nome, horas, valor,  add2);
            list.add(emp);
           }

           else {
            Funcionario emp = new Funcionario(nome , horas, valor );
            list.add(emp);
           }

           System.out.println();

           for(Funcionario emp : list){

            System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.salariototal()));
            // System.out.printf("%s %.2f \n", emp.getNome(), emp.salariototal());
           }


        }

    }
}
