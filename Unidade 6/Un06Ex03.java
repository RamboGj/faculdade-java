import java.util.Scanner;
import java.util.Arrays;

public class Un06Ex03 {
    public static void main(String[] args) {
        /*
         Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições 
         do tipo real. Em seguida, modifique o vetor de modo que os valores das posições ímpares 
         sejam aumentados em 5% e os das posições pares sejam aumentados em 2%. 
         Imprima o vetor resultante. Faça um método para ler os valores, outro para ajustar os
         valores dentro do vetor e outro para escrever os valores atualizados do vetor.
        */
        Scanner input = new Scanner(System.in);
        double numbers[] = new double[12], number = 0.0;

        double result[] = readValues(numbers, number);
        double finalResult[] = refactorValues(result);

        printRefactoredArray(finalResult);
        input.close();
    }

    private static double[] refactorValues(double[] array) {
        for (int i = 0; i < array.length; i ++) {
            if (array[i] % 2 != 0) {
                array[i] = array[i] * 0.05;
            } 
            if (i % 2 == 0) {
                array[i] = array[i] * 0.02;
            }
        }
        return array;
    }

    private static void printRefactoredArray(double array[]) {
        System.out.println(Arrays.toString(array));
    }

    private static double[] readValues(double[] array, double number) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i ++) {
            number = input.nextInt();
            array[i] = number; 
        }
        input.close();

        return array;
    } 
}
