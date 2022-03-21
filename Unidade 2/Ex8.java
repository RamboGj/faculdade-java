import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex8 {
    public static void main(String[] args) {
        /*
        Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, 
        o valor unitário de cada peça 1, o código de uma peça 2,
        o número de peças 2 e o valor unitário de cada peça 2. 
        Após, calcule e mostre o valor a ser pago.
        */

        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        int codeProduct1, codeProduct2;
        int quantityProduct1, quantityProduct2; 
        Double priceBy1, priceBy2;
        String totalPrice;

        System.out.println("Informe o código da peça 1: ");
        codeProduct1 = input.nextInt();

        System.out.println("Informe a quantidade de peças 1: ");
        quantityProduct1 = input.nextInt();

        System.out.println("Informe o preço unitário da peça 1: ");
        priceBy1 = input.nextDouble();

        System.out.println("Informe o código da peça 2: ");
        codeProduct2 = input.nextInt();

        System.out.println("Informe a quantidade de peças 2: ");
        quantityProduct2 = input.nextInt();

        System.out.println("Informe o preço unitário da peça 2: ");
        priceBy2 = input.nextDouble();

        totalPrice = df2.format((quantityProduct1 * priceBy1) + (quantityProduct2 * priceBy2));
        System.out.println("O preço final é de R$" + totalPrice);

        input.close();
    }
}