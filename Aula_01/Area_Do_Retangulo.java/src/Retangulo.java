import java.util.Scanner;

public class Retangulo{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Aria area = new Aria();

        System.out.println("Digite a base do retangulo:");
        area.base = sc.nextDouble();
        System.out.println("Digite a altura:");
        area.altura = sc.nextDouble();

        System.out.println(area);
    }
}
