/*
 * Programa calcula o valor da menssalidade da conta de telefone 
 */


import java.util.Scanner;

class Mian_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutos;
        double conta = 50.0;

        System.out.println("Digite Quantidade de minutos Ultilizado no  mes: ");
        minutos=sc.nextInt();

        if ( minutos > 100)// cliente tem direito de utiliza 100 minutos no mes , caso ultrapasse tera que pagar o valor de 50,00 + a quantidade de minutos consumidos  * 2
      conta = conta + ( minutos - 100) * 2.0; 
    
    System.out.printf("Valor da conta = R$ %.2f%n", conta ) ;


      }
}