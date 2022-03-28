import java.util.Scanner;

public class Exe01 {
    /**
     * Uma imobiliária vende apenas terrenos retangulares. 
     * Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base: ");
        int base = scanner.nextInt();

        System.out.print("Informe a altura: ");
        int height = scanner.nextInt();

        int area = base * height;

        System.out.println("A área total é de: " + String.valueOf(area));

        scanner.close();
    }
}