import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        /*
        Escreva um programa que leia o número de um funcionário, 
        seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
        A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
        */

        System.out.println("Insira o número do funcionário: ");
        int number = input.nextInt();

        System.out.println("Insira a carga horária do funcionário: ");
        int workTime = input.nextInt();

        System.out.println("Insira o valor/hora do funcionário: ");
        float hourlyEarnings = input.nextFloat();

        String salary = df2.format(workTime * hourlyEarnings);
        
        System.out.println(
            "Funcionário: " + number + "\n" +
            "Salário: " + salary
        );
    } 
}

