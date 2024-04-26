package atividade08;

public class Main3 {
    public static void main(String[] args) throws LoginInvalidoException {

        try {
            Login login = new Login("Taniele", "123456");

            System.out.println(login.fazerLogin("Taniele", "123456"));

            System.out.println(login.fazerLogin("Taniele", "12345"));

        } catch (LoginInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}