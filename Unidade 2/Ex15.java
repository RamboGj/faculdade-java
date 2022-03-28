import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double value;
        int notas, currency;

        System.out.print("Digite um valor com no máximo duas casas decimais: ") ;
        value = input.nextDouble();

        double newValue = value * 100; 
        int intValue = (int)newValue; 

        System.out.println("intValue :" + intValue); 

        notas = (int)intValue / 100;
        currency = (int)intValue - (notas * 100);
        
        
        System.out.println("notas :" + notas); 
        System.out.println("currency :" + currency); 

        int notas100 = notas / 100;
        int resto = notas % 100;

        int notas50 = resto / 50;
        resto %= 50;

        int notas20 = resto / 20;
        resto %= 20;

        int notas10 = resto / 10;
        resto %= 10;

        int notas5 = resto / 5;
        resto %= 5;

        int notas2 = resto / 2;
        resto %= 2;

        int currency100 = resto;

        int currency50 = currency / 50;
        int currencyRest = currency % 50;

        int currency25 = currencyRest / 25;
        currencyRest %= 25;

        int currency10 = currencyRest / 10;
        currencyRest %= 10;

        int currency5 = currencyRest / 5;

        int currency1 = currencyRest % 5;

        System.out.println(
            "NOTAS:" +
            "\n" + notas100 + " nota(s) de R$ 100.00" +
            "\n" + notas50 + " nota(s) de R$ 50.00" +
            "\n" + notas20 + " nota(s) de R$ 25.00" +
            "\n" + notas10 + " nota(s) de R$ 10.00" +
            "\n" + notas5 + " nota(s) de R$ 5.00" +
            "\n" + notas2 + " nota(s) de R$ 2.00" +
            "\nMOEDAS:" +
            "\n" + currency100 + " moeda(s) de R$ 1.00" +
            "\n" + currency50 + " moeda(s) de R$ 0.50" +
            "\n" + currency25 + " moeda(s) de R$ 0.25" +
            "\n" + currency10 + " moeda(s) de R$ 0.10" +
            "\n" + currency5 + " moeda(s) de R$ 0.05" +
            "\n" + currency1 + " moeda(s) de R$ 0.01");
    }
}