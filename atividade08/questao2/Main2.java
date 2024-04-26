package atividade08.questao2;

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

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice acima do tamanho do array");

        } catch (InputMismatchException e) {
            System.out.println("Valor informado não é numérico. ");

        } finally {
            System.out.println(Arrays.toString(classe2.valores));
        }
    }
}
