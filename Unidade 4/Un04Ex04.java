import java.util.Scanner;

public class Un04Ex04 {
    public static void main(String[] args) {
        /*
        Dado um número de ponto flutuante maior do que 0, 
        informe se foram digitadas ou não casas decimais no número.
        */

        Scanner input = new Scanner(System.in);

        float number;

        number = input.nextFloat();

        if (number % 1 == 0) {
            System.out.println("Não há casas decimas");
        } else {
            System.out.println("Há casas decimais");
        }
        

        input.close();
    }
}