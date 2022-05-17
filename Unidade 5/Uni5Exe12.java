import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int i, j, k = 1;
 
        for (i = 1; i <= n; i++) {
            
            for (j = 1; j <= i; j++) {
                System.out.print(k + "  ");
                k++;
            }

            System.out.println();
        }
    }
}
