package atividade08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            Classe1 classe1 = new Classe1();

            System.out.println("Insira o primeiro numero:");
            int num1 = scan.nextInt();

            System.out.println("Insira o segundo numero:");
            int num2 = scan.nextInt();

            System.out.println(classe1.dividir(num1, num2));
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
