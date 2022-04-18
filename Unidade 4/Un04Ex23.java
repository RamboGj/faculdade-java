import java.util.Scanner;

public class Un04Ex23 {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo que leia um número inteiro positivo representando um determinado mês do 
        ano e escreva o mês por extenso. 
        Para valores maiores do que 12 informe que o valor não é válido.
        */

        Scanner input = new Scanner(System.in);

        int month;

        month = input.nextInt();

        if (month > 12) {
            System.out.println("Valor não é válido");
        }

        switch (month) {
            case 1:
             System.out.println("Janeiro"); 
             break;
            case 2:
             System.out.println("Fevereiro"); 
             break;
            case 3:
             System.out.println("Março"); 
             break;
            case 4:
             System.out.println("Abril"); 
             break;
            case 5:
             System.out.println("Maio"); 
             break;
            case 6:
             System.out.println("Junho"); 
             break;
            case 7:
             System.out.println("Julho"); 
             break;
            case 8:
             System.out.println("Agosto"); 
             break;
            case 9:
             System.out.println("Setembro"); 
             break;
            case 10:
             System.out.println("Outubro"); 
             break;
            case 11:
             System.out.println("Novembro"); 
             break;
            case 12:
             System.out.println("Dezembro"); 
             break; 
        }
        input.close();
    }
}
