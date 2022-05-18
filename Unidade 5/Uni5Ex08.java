import java.util.Scanner;

public class Uni5Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
        Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, 
        descreva um algoritmo que:

        escreva o menor valor negativo;
        escreva a média dos números positivos.

        */

        int n = input.nextInt();
        int lowest = 0, highest = 0, positive = 0;

        for (int i = 0; i < n; i ++) {
            int value = input.nextInt();

            if (value < 0 && value < lowest) {
                lowest = value;
            }

            if (value > 0) {
                positive ++;
                highest += value;
            }
        }

        System.out.println("O menor valor negativo é " + lowest + " e a média dos maiores valores é " + highest / positive);

        input.close();
    }
}

