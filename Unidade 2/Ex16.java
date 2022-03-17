import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        /*
        Uma fábrica de refrigerantes vende seu produto em três formatos: 
        lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. 
        Se um comerciante compra uma determinada quantidade de cada formato, 
        informe quantos litros de refrigerante ele comprou.
        */
        Scanner input = new Scanner(System.in);

        float  ml600 = 0.6f , ml350 = 0.35f, totalLiters;
        int liter2 = 2, bottle350, bottle600, bottle2000;

        System.out.println("Informe a quantidade de garrafas de 350ml: ");
        bottle350 = input.nextInt();

        System.out.println("Informe a quantidade de garrafas de 600ml: ");
        bottle600 = input.nextInt();

        System.out.println("Informe a quantidade de garrafas de 2L: ");
        bottle2000 = input.nextInt();

        totalLiters = (bottle350 * ml350) + (bottle600 * ml600) + (bottle2000 * liter2);

        System.out.println("O comerciante comprou " + totalLiters + " litros.");
    }
}
