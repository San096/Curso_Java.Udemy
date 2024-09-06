import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       cadastro funcionario = new cadastro();

       System.out.println("Digite o nome do colaborador :");
       funcionario.nome = sc.next();
       System.out.println("Digite o salario bruto do mes :");
       funcionario.salarioBruto = sc.nextDouble();
       System.out.println("digite os impostos do mes :");
       funcionario.imposto = sc.nextDouble();

       System.out.println(funcionario);

       System.out.println("Bonificação do mes:");
       double bonificação = sc.nextDouble();
      double salarioFinal = funcionario.aumento(bonificação);


       System.out.println();
       System.out.println("Salario final: " + salarioFinal );
    }
}
