import java.util.Scanner;
import java.util.Arrays;

public class Un06Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstArray[] = new int[10], secondArray[] = new int[10], sumArray[] = new int[10], number = 0;

        int[] first = readArray(firstArray, number, input);

        int[] second = readArray(secondArray, number, input);

        int[] result = sumArrays(first, second, sumArray);

        System.out.println(Arrays.toString(result));
        input.close();
    }

    private static int[] readArray(int[] array, int number, Scanner input) {
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            number = input.nextInt();
            array[i] = number;
        }

        return array;
    }

    private static int[] sumArrays(int[] firstArray, int[] secondArray, int[] sumArray) {
        System.out.println("Soma dos arrays: ");
        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = firstArray[i] + secondArray[i];
        }

        return sumArray;
    }
}
