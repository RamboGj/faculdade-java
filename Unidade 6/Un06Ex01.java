import java.util.Scanner;
import java.util.Arrays;

public class Un06Ex01 {
    public static void main(String[] args) {
        /*
         Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. 
         Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro para escrever.
        */
        Scanner input = new Scanner(System.in);

        int numeros[] = new int[10], number, inverted[] = new int[10];

        for (int i = 0; i < numeros.length; i ++) {
            number = input.nextInt();
            numeros[i] = number;
        }

        for (int i = 0; i < numeros.length; i++) {
            inverted[i] = numeros[numeros.length - 1 - i];
        }

        System.out.println(Arrays.toString(inverted));
        input.close();
    }
}