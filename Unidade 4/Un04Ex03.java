import java.util.Scanner;

public class Un04Ex03 {
    public static void main(String[] args) {
        /*
        Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.
        */

        Scanner input = new Scanner(System.in);

        int number1, number2;

        number1 = input.nextInt();
        number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " é maior que " + number2);
        } else if (number1 == number2) {
            System.out.println("Ambos são iguais");
        } else {
            System.out.println(number2 + " é maior que " + number1);
        }

        input.close();
    }
}