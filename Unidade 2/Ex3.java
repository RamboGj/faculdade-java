import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        System.out.println("Digite o raio da circunferência: ");
        float raio = input.nextFloat();

        float pi = 3.14159f;

        float area = pi * raio;
        
        String formattedArea = df2.format(area);

        System.out.println("A área da cirncunferência é: " + formattedArea + "m2.");

        input.close();
    }
}
