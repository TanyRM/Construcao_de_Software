package atividade08;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* // Questão 1
        Classe1 classe1 = new Classe1();

        System.out.println("Insira o primeiro numero:");
        int num1 = scan.nextInt();

        System.out.println("Insira o segundo numero:");
        int num2 = scan.nextInt();

        System.out.println(classe1.dividir(num1, num2)); */

        Classe2 classe2 = new Classe2();
        int numero, i=0;

        try {
            do {
                System.out.println("Digite um numero: ");
                numero = scan.nextInt();
                classe2.valores[i] = numero;
                i++;
            } while (numero != 0);

            System.out.println(Arrays.toString(classe2.valores));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico. ");
        }
    }
}
