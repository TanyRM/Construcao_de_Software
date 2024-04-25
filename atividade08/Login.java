package atividade08;

public class Login {

    public String usuario;
    public String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean fazerLogin(String usuario, String senha) throws LoginInvalidoException {
        if (usuario.equals(this.usuario) && senha.equals(this.senha)) {
            return true;
        } else {
            throw new LoginInvalidoException();
        }
    }
}
