import java.util.Scanner;

public class Un04Ex08 {
    public static void main(String[] args) {
        /*
        Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
        */

        Scanner input = new Scanner(System.in);
        String letter;

        System.out.println("Insira uma letra: ");
        letter = input.next();
        
        char character = letter.toUpperCase().charAt(0);

        if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println("É vogal");
        } else {
            System.out.println("Não é vogal");
        }

        input.close();
    }
}