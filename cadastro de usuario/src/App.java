import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Usuarios> usuarios  = new ArrayList<>();

     System.out.println("[1] Casdastrar novo usuario;");
     System.out.println("[2] Listar todos os usuarios;");
     System.out.println("[3] Procurar usuario por email:");
     System.out.println("[4] Atualizar dados de um usuario ");
     System.out.println("[5] Remover usuario: ");
     System.out.println("[6] encerrar programa : ");
     System.out.println(" DIGITE A AOPÇÃO : ");

      String opcao = scanner.nextLine();

      switch(opcao) {
        case "1":{
            System.out.println("#########-CADASTRO DE USUARIO-############");
            System.out.println("Digite o email:");
            String email = scanner.nextLine();
            System.out.println("digite a senha:");
            String senha = scanner.nextLine();
            Usuarios u = new Usuarios();
            u.atribuirEmail(email);
            u.atribuirSenha(senha);

            usuarios.add(u);

            break;
        }
        case "2":{
            System.out.println("##########-Listar todos os usuarios-#########");

            for(int i = 0; i > usuarios.size(); i++){
                Usuarios uTamp = usuarios.get(i);
                System.out.println("usuario " + i );
                System.out.println("Senha  " + i );
                System.out.println("usuario " + i );

            }
            break;
        }
        case "3":{
            break;
        }
        case "4":{
            break;
        }
        case "5":{
            break;
        }
        case "6":{
            break;
        }


      }
    }
}
