import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Un04Ex24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value1, value2, value3, option;

        value1 = input.nextInt();
        value2 = input.nextInt();
        value3 = input.nextInt();

        ArrayList values = new ArrayList<>();

        values.add(value1);
        values.add(value2);
        values.add(value3);

        System.out.println("Selecione a opção 1, 2 ou 3");
        option = input.nextInt();

        switch (option) {
            case 1: 
                Collections.sort(values);
                System.out.println(values);
            break;

            case 2:
                Collections.sort(values, Collections.reverseOrder());
                System.out.println(values);
            
            break;

            case 3:
                if (value1 > value2 && value1 > value3) {
                    System.out.println(value2 + ", " + value1 + ", " + value3);
                } else if (value2 > value1 && value2 > value3) {
                    System.out.println(value1 + ", " + value2 +  ", " + value3);
                } else if (value3 > value1 && value3 > value2) {
                    System.out.println(value1 + ", " + value3 + ", " + value2);
                }

            break;
        }

        input.close();
    }
}
