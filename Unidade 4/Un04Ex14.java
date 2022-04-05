import java.util.Scanner;

public class Un04Ex14 {
    public static void main(String[] args) {
        /*
        Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12, 
        e se o dia existe naquele mês. Note que fevereiro tem 29 dias em anos bissextos, 
        e 28 dias em anos não bissextos.
        Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
        */

        Scanner input = new Scanner(System.in);
        boolean bissexto;
        int day, month, year;

        System.out.println("Insira o dia: ");
        day = input.nextInt();

        System.out.println("Insira o dia: ");
        month = input.nextInt();

        System.out.println("Insira o dia: ");
        year = input.nextInt();

        if (month < 0 && month > 12) {
            System.out.println("Mês inexistente");
        }

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("O mês tem 31 dias");
            if (day < 0) {
                System.out.println("Dia inexistente nesse mês");
            } else if (day > 31) {
                System.out.println("Dia inexistente nesse mês");
            }
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("O mês tem 30 dias");
            if (day < 0) {
                System.out.println("Dia inexistente nesse mês");
            } else if (day > 30) {
                System.out.println("Dia inexistente nesse mês");
            }
        } else if (month == 2) {
            System.out.println("O ano é bissexto? Digite true ou false");
            bissexto = input.nextBoolean();

            if (bissexto) {
                if (day > 29) {
                    System.out.println("Dia inexistente nesse mês"); 
                } else if (day < 0) {
                    System.out.println("Dia inexistente nesse mês");
                } else {
                    System.out.println("Data válida");
                }
            } else {
                if (day > 28) {
                    System.out.println("Dia inexistente nesse mês"); 
                } else {
                    System.out.println("Data válida");
                }
            }
        }

        input.close();
    }
}
