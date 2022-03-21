import java.util.Scanner;
import java.text.DecimalFormat; 

public class Un3Ex5 {
    public static void main(String[] args) {
        /*
        Uma granja possui um controle automatizado de cada frango da sua produção.
        No pé direito do frango há um anel com um chip de identificação; 
        no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
        Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, 
        faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.
        */
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        int rightFoot = 2 * 4, numberOfChicken;
        float leftFoot = 2 * 3.5f, pricePerChicken = rightFoot + leftFoot, totalSpent;


        System.out.println("Qual o número de frangos na granja?");
        numberOfChicken = input.nextInt();

        totalSpent = pricePerChicken * numberOfChicken;

        System.out.println("O valor total gasto é de R$" + totalSpent);

        input.close();
    }
}
