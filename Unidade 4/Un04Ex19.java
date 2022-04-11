import java.util.Scanner;

public class Un04Ex19 {
    public static void main(String[] args) {
        /*
        Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante 
        ele está localizado.

        0, se os dois valores forem zero
        1, se os dois valores forem positivos
        2, se x for positivo e y, negativo
        3, se os dois valores forem negativos
        4, se x for negativo e y, positivo
        Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
        */

        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.println("Digite o ponto X:");
        x = input.nextInt();

        System.out.println("Digite o ponto Y:");
        y = input.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Quadrantes 0"); 
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrantes 1"); 
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrantes 2"); 
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrantes 3"); 
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrantes 4"); 
        }
    }
}
