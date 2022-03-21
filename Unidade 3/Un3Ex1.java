import java.util.Scanner;
import java.text.DecimalFormat; 

public class Un3Ex1 {
    public static void main(String[] args) {
        /*
        Uma imobiliária vende apenas terrenos retangulares. 
        Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.
        */
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        float base, height;
        String area;

        System.out.println("Insira a medida da base: ");
        base = input.nextFloat();

        System.out.println("Insira a medida da altura: ");
        height = input.nextFloat();

        area = df2.format(height * base);

        System.out.println("A área do terreno é " + area + "m2");

        input.close();
    }
}
