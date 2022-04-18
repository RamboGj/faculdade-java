package src;

import java.util.Scanner;

public class CoordinatesOfAPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
    
        String output = "";
    
        // Ambos os valores positivos = primeiro quadrante.
        if (x > 0 && y > 0) output = "Q1";
        // X negativo e Y positivo = segundo quadrante.
        if (x < 0 && y > 0) output = "Q2";
        // Ambos os valores negativos = terceiro quadrante.
        if (x < 0 && y < 0) output = "Q3";
        // X positivo e Y negativo = quarto quadrante.
        if (x > 0 && y < 0) output = "Q4";
        // Origem
        if (x == 0 && y == 0) output = "Origem";

        System.out.println(output);
        scanner.close();
    }
}
