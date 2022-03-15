import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira um valor inteiro: ");
        int value1 = input.nextInt();

        System.out.println("Insira um valor inteiro: ");
        int value2 = input.nextInt();

        int sum = value1 + value2;

        System.out.println("A soma dos números é: " + sum);

        input.close();
    }
}
