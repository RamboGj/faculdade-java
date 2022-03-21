import java.util.Scanner;
import java.text.DecimalFormat; 

public class Un3Ex2 {
    public static void main(String[] args) {
        /*
        Uma loja de calçados está concedendo 12% de desconto nos produtos. 
        Escreva um programa para calcular e exibir o valor de desconto a ser dado
        num par de sapatos e quanto deve custar o produto com o desconto. 
        O preço do par de sapatos deve ser informado pelo usuário. 
        Como resultado, o programa deverá exibir as seguintes mensagens:

        O valor do desconto é de R$ xxx
        O preço do par de sapatos com desconto é R$ xxx
        */

        float originalPrice, newPrice, discount;
        String formattedPrice, formattedDiscount;
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        System.out.println("Qual o preço do par de sapatos?");
        originalPrice = input.nextFloat();

        discount = originalPrice * 0.12f;
        newPrice = originalPrice - discount;

        formattedPrice = df2.format(newPrice);
        formattedDiscount = df2.format(discount); 

        System.out.println("O valor do desconto é de R$" + formattedDiscount);
        System.out.println(" O preço do par de sapatos com desconto é R$" + formattedPrice);

        input.close();
    }
}
