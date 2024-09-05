import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        Conta conta;



        System.out.println("digite o numero da conta");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("digite o nome do cliente");
        String nome = sc.nextLine();
        System.out.println(nome);
        System.out.println("deposito inicial ; s/n?");
        char resposta = sc.next().charAt(0);
        if( resposta == 's'){
            System.out.println("deposite o valor inicial:");
            double valor = sc.nextDouble();
                     
                     conta = new Conta(numero, nome ,valor) ;
        }
        else {
             conta = new Conta (numero , nome);
        }
        System.out.println("");
        System.out.println("informações da conta:");
        System.out.println(conta);

        System.out.println("realizar um deposito:");
        double fazerDeposito = sc.nextDouble();
        conta.depoisitar(fazerDeposito);
        System.out.println("conta atualizado");
        System.out.println(conta);



}
}
