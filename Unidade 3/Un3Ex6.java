import java.util.Scanner;
import java.text.DecimalFormat; 

public class Un3Ex6 {
    public static void main(String[] args) {
        /*
        Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
        Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e
        imprima o valor a pagar. O peso do prato é de 750 gramas.
        */
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        Double plateWeight = 0.75, plateWeightDone, pricePerKg = 25.00;
        String finalPrice;

        System.out.println("Insira o peso do prato do cliente em Kg: ");
        plateWeightDone = input.nextDouble();

        finalPrice = df2.format(plateWeightDone * pricePerKg);

        System.out.println("O preço da refeição é de R$" + finalPrice);

        input.close();
    }
}
