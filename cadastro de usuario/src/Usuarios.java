public class Usuarios {
     private String senha;
     private String email;
    

public void atribuirEmail(String email){
    this.email = email;

}

public String pegarEmail(){
    return email;
}

public String pegarSenha(){
    return senha;
}
public void atribuirSenha(String senha){
    this.senha = senha;

}

    
}


