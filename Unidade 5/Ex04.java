import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
            Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:
        */

        int upper = 3;
        int lower = 2;
        double value = 0;
        int increment = 0;

        for (int i = 0; i < 20; i ++) {
            value += (double) upper / (double) lower; 

            upper += 2;
            lower += 4 + increment;

            increment += 2;
        }

        System.out.println(value);

        input.close();
    }
}
