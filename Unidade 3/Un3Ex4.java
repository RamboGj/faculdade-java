import java.util.Scanner;
import java.text.DecimalFormat; 

public class Un3Ex4 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler três notas de um aluno em uma disciplina e
        imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
        */
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        Double score1, score2, score3, average;

        System.out.println("Insira a nota 1: ");
        score1 = input.nextDouble();

        System.out.println("Insira a nota 2: ");
        score2 = input.nextDouble();

        System.out.println("Insira a nota 3: ");
        score3 = input.nextDouble();

        average = ((score1 * 5) + (score2 * 3) + (score3 * 2)) / 10;
        
        String formattedAverage = df2.format(average);

        System.out.println("A média é " + formattedAverage);

        input.close();
    }
}
