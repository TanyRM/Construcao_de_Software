package atividade11;
import java.util.regex.Pattern;

public class Validator {
    // expressões
    private static final String LOGIN_PATTERN = "^[a-zA-Z0-9!@#$%^&*()_+{}\\[\\]:;\"'<>,.?/\\\\|`~\\-]{5,30}$";
    private static final String SENHA_PATTERN = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+{}\\[\\]:;\"'<>,.?/\\\\|`~\\-])[a-zA-Z0-9!@#$%^&*()_+{}\\[\\]:;\"'<>,.?/\\\\|`~\\-]{8,12}$";

    // Métodos de validação
    public static boolean validarLogin(String login) {
        return Pattern.matches(LOGIN_PATTERN, login);
    }

    public static boolean validarSenha(String senha) {
        return Pattern.matches(SENHA_PATTERN, senha);
    }
}
