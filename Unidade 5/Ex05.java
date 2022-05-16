import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
            Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:
        */

        int value = 8;
        int operator = 6;

        for (int i = 0; i < 10; i ++) {
            System.out.println(value);

            if ( i % 2 == 0 ) {
                value += 2;
            } else {
                value += operator;
                operator = operator * 2 + 2;
            }
        }

        input.close();
    }
}
