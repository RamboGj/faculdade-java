import java.util.Scanner;

public class Un04Ex09 {
    public static void main(String[] args) {
        /*
        Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.
        */

        Scanner input = new Scanner(System.in);
        int value1, value2, result;

        System.out.println("Informe um valor inteiro: ");
        value1 = input.nextInt();

        System.out.println("Informe outro valor inteiro: ");
        value2 = input.nextInt();

        if (value1 > value2) {
            result = value1 % value2;
        } else {
            result = value2 % value1;
        }

        if (result == 0) {
            System.out.println("Os números são múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        input.close();
    }
}