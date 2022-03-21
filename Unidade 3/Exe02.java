import java.util.Scanner;

public class Exe02 {
    /**
       Uma loja de calçados está concedendo 12% de desconto nos produtos. Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos e quanto deve custar o produto com o desconto. O preço do par de sapatos deve ser informado pelo usuário. Como resultado, o programa deverá exibir as seguintes mensagens:
       O valor do desconto é de R$ xxx
       O preço do par de sapatos com desconto é R$ xxx
     */

    private static final int DISCOUNT = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do par de sapatos: ");
        double price = scanner.nextFloat();

        double totalValue = price - (DISCOUNT * price) / 100.0;
        double discountValue = price - totalValue;

        System.out.println("O valor do desconto é de R$" + discountValue);
        System.out.println("O preço do par de sapatos com desconto é R$" + totalValue);
    }
}
