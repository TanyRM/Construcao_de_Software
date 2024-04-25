package atividade08;

import java.util.InputMismatchException;

public class Classe1 {

    public int dividir(int num1, int num2) throws ArithmeticException, InputMismatchException {

        try {
            if (num2 == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico.");
        }

        return -1;
    }
}
