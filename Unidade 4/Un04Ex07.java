import java.util.Scanner;
import java.text.DecimalFormat;

public class Un04Ex07 {
    public static void main(String[] args) {
        /*
        O custo do selo de uma carta com até 50 gramas é de R$ 0,45. 
        As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas, 
        ou fração, em que excedem aquele peso. 
        Escreva um algoritmo que dado o peso da carta, em gramas, determine o custo do selo.
        Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
        */

        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");
        int weight;
        float price = 0.45f;
        String finalPrice;

        System.out.println("Insira o peso da carta em gramas: ");
        weight = input.nextInt(); 

        if (weight > 50) {
            int extra = (weight - 50) / 20;
            finalPrice = df2.format(price + (extra * price));
            System.out.println("O preço da carta é R$" + finalPrice);
        } else {
            System.out.println("O preço é R$ " + price);
        }

        input.close();
    }
}