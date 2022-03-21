import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Leia quatro valores inteiros A, B, C e D. 
        // A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D 
        // segundo a fórmula: DIFERENCA = (A * B - C * D).

        System.out.println("Digite o valor A: ");
        int valueA = input.nextInt();

        System.out.println("Digite o valor B: ");
        int valueB = input.nextInt();

        System.out.println("Digite o valor C: ");
        int valueC = input.nextInt();

        System.out.println("Digite o valor D: ");
        int valueD = input.nextInt();

        int result = (valueA * valueB) - (valueC * valueD);

        System.out.println("O resultado é " + result);

        input.close();
    } 
}
