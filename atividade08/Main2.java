package atividade08;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
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
        } catch (
        InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico. ");
        }
    }
}
