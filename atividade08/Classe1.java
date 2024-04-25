package atividade08;

import java.util.InputMismatchException;

public class Classe1 {

    public int dividir(int num1, int num2) throws ArithmeticException, InputMismatchException {

        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        } else if (!(eInt(num1)) || !(eInt(num2))) {
            throw new InputMismatchException("Valor informado não é numérico.");
        }
        return num1 / num2;
    }

    private boolean eInt(int valor){
        return valor >= Integer.MIN_VALUE && valor <= Integer.MAX_VALUE;
    }
}
