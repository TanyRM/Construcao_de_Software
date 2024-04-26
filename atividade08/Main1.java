package atividade08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Classe1 classe1 = new Classe1();

        try {
            System.out.println("Insira o primeiro numero:");
            int num1 = scan.nextInt();

            System.out.println("Insira o segundo numero:");
            int num2 = scan.nextInt();

            System.out.println(classe1.dividir(num1, num2));

        } catch (InputMismatchException e) {
            System.out.println("O valor informado não é numérico");
        }
    }
}
