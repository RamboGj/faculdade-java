import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
            Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:
        */

        double value = 0;

        for (int i = 1; i <= 100; i ++) {
            
            value += 1/ (double) i;
        }

        System.out.println(value);

        input.close();
    }
}
