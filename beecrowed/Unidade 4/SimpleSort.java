package src;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] values = new int[] {a, b, c};
        Arrays.sort(values);

        for (int i : values) {
            System.out.println(i);
        }
        
        System.out.println("");
        // Também é possível criar uma variável que contém o valor da lista com a ordem crescente.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
