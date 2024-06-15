package atividade11;

public class Main {
    public static void main(String[] args) {

        String login;
        String senha;

        login = "usuario";
        System.out.println("Login: " + login + "\n" + Validator.validarLogin(login));
        senha = "senha";
        System.out.println("Senha: " + senha + "\n" + Validator.validarSenha(senha) + "\n");

        login = "UsuarioUsuarioUsuarioUsuarioUsuario";
        System.out.println("Login: " + login + "\n" + Validator.validarLogin(login));
        senha = "senha1";
        System.out.println("Senha: " + senha + "\n" + Validator.validarSenha(senha)+ "\n");

        login = "valid@Login#1";
        System.out.println("Login: " + login + "\n" + Validator.validarLogin(login));
        senha = "P@ssw0rd!";
        System.out.println("Senha: " + senha + "\n" + Validator.validarSenha(senha)+ "\n");

        login = "usuario123";
        System.out.println("Login: " + login + "\n" + Validator.validarLogin(login));
        senha = ".Valida0_123!";
        System.out.println("Senha: " + senha + "\n" + Validator.validarSenha(senha)+ "\n");

    }
}

