import java.util.Scanner;
import java.text.DecimalFormat; 

public class Un3Ex3 {
    public static void main(String[] args) {
        /*
       Um motorista deseja abastecer seu tanque de combustível. 
       Escreva um programa para ler o preço do litro da gasolina e 
       o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.
        */
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        float liters, literPrice;
        String valueSpent;

        System.out.println("Qual o preço do litro?");
        literPrice = input.nextFloat();

        System.out.println("Informe a quantidade de litros que deseja abastecer: ");
        liters = input.nextFloat();

        valueSpent = df2.format(literPrice * liters);

        System.out.println("O valor gasto para abastecer " + liters + " litros é de R$" + valueSpent);

        input.close();
    }
}