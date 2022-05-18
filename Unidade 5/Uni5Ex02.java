import java.util.Scanner;

public class Uni5Ex02 {
    public static void main(String[] args) {
        /*
        Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, 
        se o mesmo é par ou ímpar.
        */

        Scanner input = new Scanner(System.in);

        /*
        Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números 
        ímpares entre 1 e 100.
        */

        int par = 0, impar = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                par += i;
            } else {
                impar += i;
            }
        }

        System.out.println("par: " + par + "\n" + "impar: " + impar);

        input.close();
    }
}
