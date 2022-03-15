import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        // Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que a note A tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11), sendo que a nota vai de 0.0 a 10.0.
        System.out.println("Digite a nota 1: ");
        float score1 = input.nextFloat();

        System.out.println("Digite a nota 2: ");
        float score2 = input.nextFloat();
        
        float average = ((score1 * 3.5f) + (score2 * 7.5f)) / 11;

        String formattedAverage = df2.format(average);

        System.out.println("A média final é " + formattedAverage);

        input.close();
    }
}