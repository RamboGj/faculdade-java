import java.util.Scanner;

public class Un04Ex16 {
    public static void main(String[] args) {
        /* 
        Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres 
        (considere que a idade entre homens e mulheres sempre serão diferentes). 
        Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, 
        e o produto das idades do homem mais novo com a mulher mais velha.
        */

        Scanner input = new Scanner(System.in);

        int idadeH1, idadeH2, idadeM1, idadeM2;
        int result1, result2;

        System.out.println("Insira a idade do homem 1");
        idadeH1 = input.nextInt();

        System.out.println("Insira a idade do homem 2");
        idadeH2 = input.nextInt();

        System.out.println("Insira a idade da mulher 1");
        idadeM1 = input.nextInt();

        System.out.println("Insira a idade da mulher 2");
        idadeM2 = input.nextInt();

        if (idadeH1 > idadeH2) {
            if (idadeM1 < idadeM2) {
                result1 = idadeH1 + idadeM1; 
                result2 = idadeH2 * idadeM2;
            } else {
                result1 = idadeH1 + idadeM2;
                result2 = idadeH2 * idadeM1;
            } 
        } else {
            if (idadeM1 < idadeM2) {
                result1 = idadeH2 + idadeM1;
                result2 = idadeH1 * idadeM2;
            } else {
                result1 = idadeH2 + idadeM2;
                result2 = idadeH1 * idadeM1;
            }
        }

        System.out.println("result1: " + result1); 
        System.out.println("result2: " + result2); 

        input.close();
    }
}
