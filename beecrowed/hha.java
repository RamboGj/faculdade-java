import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class hha {
 
    public static void main(String[] args) throws IOException {
 
       Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.000");

        float a, b, c, pi = 3.14159f;
        String areaA, areaB, areaC, areaD, areaE;

        a = input.nextFloat(); 
        b = input.nextFloat(); 
        c = input.nextFloat(); 

        areaA = df2.format(a * c / 2); // b.h/2

        areaB = df2.format(pi * (c * c)); // possibilidade de usar Math.pow() para exponenciação. pi(R^2).

        areaC = df2.format((a + b) * c / 2); // (b1 + b2).h/2

        areaD = df2.format(Math.pow(b, 2)); // l^2. Math.pow(b, 2) = (b * b)

        areaE = df2.format(a * b); // l1.l2

        System.out.println(
            "TRIANGULO: " + areaA +
            "\nCIRCULO: " + areaB +
            "\nTRAPEZIO: " + areaC +
            "\nQUADRADO: " + areaD +
            "\nRETANGULO: " + areaE 
            );
 
    }
 
}