import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Ex11 {
    public static void main(String[] args) {
        /*
        Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
        Em seguida, calcule e mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura. 
        b) a área do círculo de raio C. (pi = 3.14159). 
        c) a área do trapézio que tem A e B por bases e C por altura. (b1 + b2).h/2
        d) a área do quadrado que tem lado B. l^2
        e) a área do retângulo que tem lados A e B. l1.l2
        */

        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        float a, b, c, pi = 3.14159f;
        String areaA, areaB, areaC, areaD, areaE;

        System.out.println("Informe o valor flutuante A: ");
        a = input.nextFloat(); 

        System.out.println("Informe o valor flutuante B: ");
        b = input.nextFloat(); 

        System.out.println("Informe o valor flutuante C: ");
        c = input.nextFloat(); 

        areaA = df2.format(a * c / 2); // b.h/2
        System.out.println("A área da letra A é " + areaA + "m2");

        areaB = df2.format(pi * (c * c)); // possibilidade de usar Math.pow() para exponenciação. pi(R^2).
        System.out.println("A área da letra B é " + areaB + "m2");

        areaC = df2.format((a + b) * c / 2); // (b1 + b2).h/2
        System.out.println("A área da letra C é " + areaC + "m2");

        areaD = df2.format(Math.pow(b, 2)); // l^2. Math.pow(b, 2) = (b * b)
        System.out.println("A área da letra D é " + areaD + "m2");

        areaE = df2.format(a * b); // l1.l2
        System.out.println("A área da letra E é " + areaE + "m2");
    }
}
