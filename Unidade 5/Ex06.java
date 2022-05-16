import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
        Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.
        */

        double height = 0;

        for (int i = 0; i < 20; i ++) {
            double peopleheight = input.nextDouble();

            height += peopleheight;
        }

        System.out.println(height / 20);

        input.close();
    }
}
