import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Un04Ex26 {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("T: calcular triângulo");
        System.out.println("Q: calcular área de um quadrado de um único lado");
        System.out.println("R: calcular área de um retângulo");
        System.out.println("C: calcular área de um círculo");
        System.out.print("Opção: ");

        String input = scanner.nextLine();

        switch (input.toUpperCase()) {
            case "T":
                System.out.print("Escreva a base do triângulo: ");
                int triangleBase = scanner.nextInt();

                System.out.print("Escreva a altura do triângulo: ");
                int triangleHeight = scanner.nextInt();

                System.out.println("Área do triângulo = " + triangleBase * triangleHeight / 2);
                break;
            case "Q":
                System.out.print("Digite o lado: ");
                int side = scanner.nextInt();
                
                System.out.println("Área do quadrado = " + side * side);
                break;
            case "R":
                System.out.print("Digite a base do retângulo: ");
                int rectangleBase = scanner.nextInt();

                System.out.print("Digite a altura do retângulo: ");
                int rectangleHeight = scanner.nextInt();

                System.out.println("Área do retângulo = " + rectangleBase * rectangleHeight);
                break;
            case "C":
                System.out.println("Digite o raio: ");
                int circleRadius = scanner.nextInt();

                System.out.println("Área do círculo = " + Math.PI * Math.pow(circleRadius, 2));
                break;
            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}