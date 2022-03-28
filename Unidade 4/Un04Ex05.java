import java.util.Scanner;

public class Un04Ex05 {
    public static void main(String[] args) {
        /*
        Dada uma pergunta, “a cor é azul?”, 
        faça um programa que leia uma variável lógica com a resposta e responda “Sim”, 
        caso a resposta seja true, ou “Não”, caso seja false.
        Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
        */

        Scanner input = new Scanner(System.in);
        boolean response;

        System.out.println("A cor é azul? Digite 'true' ou 'false'.");

        response = input.nextBoolean();
        
        if (response) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        input.close();
    }
}