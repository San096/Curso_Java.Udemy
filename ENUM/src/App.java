import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidade.Shape;
import Entidade.Circulo;
import Entidade.Color;
import Entidade.Retangulo;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       List <Shape> list = new ArrayList<>();

       System.out.println("Quantas formas geometricas ?");
       int n = sc.nextInt();

       for(int i = 1 ; i <= n ; i++){
        System.out.println("Digite os dados" + i + "#1 ");
        System.out.print("sua figura é retangulo ou circulo (r/c)");
        char ch = sc.next().charAt(0);
        System.out.println("Qual a cor ( RED/BLACK/BLUE)");
        Color color = Color.valueOf(sc.next());

        if ( ch == 'r'){
            System.out.println("Digite largura");
            double largura = sc.nextDouble();
            System.out.println("Digite haltura");
            double haltura = sc.nextDouble();
            
         
           list.add(new Retangulo(color, haltura, largura));
            
        }
        else {
            System.out.println("Digite o raio ");
            double raio = sc.nextDouble();

            list.add(new Circulo(color, raio));
        }

        for(Shape shape : list){
            System.out.println(String.format( "%.2f" ,shape.area()));
        }

       }


    }
}
