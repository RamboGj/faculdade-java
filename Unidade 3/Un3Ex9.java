import java.util.Scanner;
import java.text.DecimalFormat; 

public class Un3Ex9 {
    public static void main(String[] args) {
        /*
        Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
        */
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        Double pi = 3.14, baseR, height;
        String volume;

        System.out.println("Insira o valor do raio da base da lata: ");
        baseR = input.nextDouble();

        System.out.println("Insira o valor da altura da lata: ");
        height = input.nextDouble();

        volume = df2.format((pi * Math.pow(baseR, 2) * height));

        System.out.println("O voluem da lata é " + volume + "m3");

        input.close();
    }
}