import java.util.Scanner;
import java.text.DecimalFormat; 

public class Un3Ex10 {
    public static void main(String[] args) {
        /*
        Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e
         calcule o comprimento da hipotenusa.
        Fórmula:
        */
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        Double catetoA, catetoB, hipotenusaFirst;
        String hipotenusa;

        System.out.println("Qual a medida do cateto A?");
        catetoA = input.nextDouble();

        System.out.println("Qual a medida do cateto B?");
        catetoB = input.nextDouble();

        hipotenusaFirst = Math.pow(catetoA, 2) + Math.pow(catetoB, 2);

        hipotenusa = df2.format(Math.sqrt(hipotenusaFirst));

        System.out.println("A medida da hipotenusa é " + hipotenusa + "m2");

        input.close();
    }
}
