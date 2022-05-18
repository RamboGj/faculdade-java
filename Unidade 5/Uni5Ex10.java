import java.util.Scanner;

public class Uni5Ex10 {
    public static void main(String[] args) {
        /*
        
        */
        Scanner input = new Scanner(System.in);

        String name;
        int age, numberOf20Upper = 0;

        int n = input.nextInt();
        

        for (int i = 0; i < n; i++) {
            age = input.nextInt();
            name = input.next();

            if ( age == 18 ) {
                System.out.println(name);
            }

            if ( age > 20 ) {
                numberOf20Upper++;
            }
        }

        System.out.println(numberOf20Upper);
        input.close();
    }
}
