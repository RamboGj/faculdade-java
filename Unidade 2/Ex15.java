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
            "Notas de 100: " + notas100 +
            "\nNotas de 50: " + notas50 +
            "\nNotas de 20: " + notas20 +
            "\nNotas de 10: " + notas10 +
            "\nNotas de 5: " + notas5 + 
            "\nNotas de 2: " + notas2 +
            "\nMoedas de 1 real: " + currency100 +
            "\nMoedas de 50 centavos: " + currency50 +
            "\nMoedas de 25 centavos: " + currency25 +
            "\nMoedas de 10 centavos: " + currency10 +
            "\nMoedas de 5 centavos: " + currency5 +
            "\nMoedas de 1 centavo: " + currency1
        );

        input.close();
    }
}