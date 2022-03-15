import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor com no máximo duas casas decimais: ") ;
        float value = input.nextFloat();

        float newValue = value * 100; 
        int intValue = (int)newValue; 

        System.out.println("value :" + intValue); 

        int notas = (int)intValue / 100;
        int currency = (int)intValue - (notas * 100);
        
        System.out.println("notas :" + notas); 
        System.out.println("currency :" + currency); 

        int notas100 = notas / 100;
        int resto = notas % 100;

        int notas50 = resto / 50;
        resto = resto % 50;

        int notas20 = resto / 20;
        resto = resto % 20;

        int notas10 = resto / 10;
        resto = resto % 10;

        int notas5 = resto / 5;
        resto = resto % 5;

        int notas2 = resto / 2;
        resto = resto % 2;

        int currency100 = resto;

        int currency50 = currency / 50;
        int currencyRest = currency % 50;

        int currency25 = currencyRest / 25;
        currencyRest = currencyRest % 25;

        int currency10 = currencyRest / 10;
        currencyRest = currencyRest % 10;

        int currency5 = currencyRest / 5;
        currencyRest = currencyRest % 5;

        int currency1 = currencyRest;

        System.out.println(
            "Notas de 100: " + notas100 +
            " Notas de 50: " + notas50 +
            " Notas de 20: " + notas20 +
            " Notas de 10: " + notas10 +
            " Notas de 5: " + notas5 + 
            " Notas de 2: " + notas2 +
            " Moedas de 1 real: " + currency100 +
            " Moedas de 50 centavos: " + currency50 +
            " Moedas de 25 centavos: " + currency25 +
            " Moedas de 10 centavos: " + currency10 +
            " Moedas de 5 centavos: " + currency5 +
            " Moedas de 1 centavo: " + currency1
        );

        System.out.println("sending to github..."); 

        input.close();
    }
}