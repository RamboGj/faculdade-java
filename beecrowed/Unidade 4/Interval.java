package src;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float input = scanner.nextFloat();

        String output = "Fora de intervalo";

        if (input >= 25 && input <= 50) output = "Intervalo (25,50]";
        if (input >= 0 && input <= 25) output = "Intervalo (0,25]";
        if (input >= 50 && input <= 75) output = "Intervalo (75,100]";
        if (input >= 75 && input <= 100) output = "Intervalo (75,100]";

        System.out.println(output);
        scanner.close();
    }
}
