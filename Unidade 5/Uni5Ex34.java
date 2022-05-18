import java.util.Scanner;

public class Uni5Ex34 {
    public static void main(String[] args) {
         /*
        Um hotel cobra R$ 50,00 de diária por hóspede e mais uma taxa de serviços. A taxa de serviços é de:

        R$ 7,50 por diária, caso o número de diárias seja menor que 15;
        R$ 6,50 por diária, caso o número de diárias seja igual a 15;
        R$ 5,00 por diária, caso o número de diárias seja maior que 15.

        Descreva um algoritmo que apresente as seguintes opções ao recepcionista:

        (1) encerrar a conta de um hóspede;
        (2) verificar número de contas encerradas;
        (3) sair.

        Caso a opção escolhida seja a primeira, leia o nome e o número de diárias do hóspede e escreva o nome e total a ser pago. 
        Caso a opção escolhida seja a segunda, informe o número de hóspedes que deixaram o hotel (número de contas encerradas). 
        Caso a opção escolhida seja a terceira finalize a execução do algoritmo.
        */

        Scanner input = new Scanner(System.in);

        int daily, action, closedAccounts = 0;
        String name;
        Double totalSpent;

        do {
            System.out.println("Deseja encerrar conta(1), verificar contas encerradas(2) ou sair(3)? ");
            action = input.nextInt();

            switch (action) {
                case 1: {

                    System.out.println("Informe o número de diárias: ");
                    daily = input.nextInt();

                    System.out.println("Informe o nome da pessoa: ");
                    name = input.next();

                    if (daily < 15) {
                        totalSpent = ((double) daily * 50) +  ((double) daily * 7.5);
                    } else if (daily == 15) {
                        totalSpent = ((double) daily * 50) +  ((double) daily * 6.5);
                    } else {
                        totalSpent = ((double) daily * 50) +  ((double) daily * 5);
                    }

                    System.out.println("O valor a ser pago por " + name + " é de R$ " + totalSpent);

                    closedAccounts++;
                    break;
                }
                case 2: {
                    System.out.println("Contas encerradas: " + closedAccounts);
                    break;
                }
                case 3: {
                    System.out.println("Você saiu do sistema.");
                    break;
                }  
            } 
        } while (action != 3);

        input.close();
    }
}

