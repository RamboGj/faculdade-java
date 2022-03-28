import java.util.Scanner;

public class Un04Ex02 {
    public static void main(String[] args) {
        /*
        Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
        */

        Scanner input = new Scanner(System.in);

        int numberGiven;

        System.out.println("Insira um número inteiro: ");
        numberGiven = input.nextInt();

        if (numberGiven % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        input.close();
    }
}