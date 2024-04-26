package atividade08;

import java.util.InputMismatchException;

public class Classe1 {

    public int dividir(int num1, int num2) throws ArithmeticException, InputMismatchException {

        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }
}
