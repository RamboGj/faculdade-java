import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
        Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.
        */

        int n = input.nextInt();
        int highest = 0, lowest = 9999999; 

        for (int i = 0; i < n; i ++) {
            int value = input.nextInt();

            if (value > highest) {
                highest = value;
            }

            if (value < lowest) {
                lowest = value;
            }
        }

        System.out.println("O maior valor é " + highest + " e o menor é " + lowest);

        input.close();
    }
}

