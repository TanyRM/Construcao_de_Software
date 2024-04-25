package atividade08;

public class LoginInvalidoException extends Exception{

    @Override
    public String getMessage() {
        return "Usuario ou senha invalidos";
    }
}
