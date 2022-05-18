import java.util.Scanner;

public class Uni5Ex01 {
    public static void main(String[] args) {
        /*
        Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, 
        se o mesmo é par ou ímpar.
        */

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 20;  i++) {
            int value = input.nextInt();

            if (value % 2 == 0) {
                System.out.println("par");
            }  else {
                System.out.println("ímpar");
            }
        }

        input.close();
    }
}
