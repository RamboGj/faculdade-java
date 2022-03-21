import java.util.Scanner;
import java.text.DecimalFormat; 

public class Un3Ex11 {
    public static void main(String[] args) {
        /*
        Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
        °F = (9/5) °C + 32
        */
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        Double tempC, tempF;

        System.out.println("Informe a temperatura em Cº: ");
        tempC = input.nextDouble();

        tempF = 1.8 * tempC + 32;

        System.out.println("A temperatura em Fº é " + tempF);

        input.close();
    }
}

