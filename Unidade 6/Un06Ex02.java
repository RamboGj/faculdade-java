import java.util.Scanner;

public class Un06Ex02 {
    public static void main(String[] args) {
        /*
        Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições 
        do tipo real. Imprima quais valores desses informados são maiores que a média dos valores. 
        Faça um método para ler os valores, outro para calcular a média e outro para informar 
        os valores maiores que a média.
        */
      
        double number = 0.0;
        double valueToDivide = 0.0;
        double numeros[] = new double[12];

        double average = average(number, valueToDivide, numeros);

        read(numeros);
        readUpperThenAverage(numeros, average);
    }

    private static double average(double number, double valueToDivide, double[] numeros) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            number = input.nextDouble();
            numeros[i] = number;
            valueToDivide += numeros[i];
        }

        input.close();
        return valueToDivide / numeros.length;
    }

    private static void read(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void readUpperThenAverage(double[] array, double average) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                System.out.println("MAIORES QUE A MÉDIA ---" + "\n" + array[i]);
            }
        }
    }
}