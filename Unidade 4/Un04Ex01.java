import java.util.Scanner;

public class Un04Ex01 {
    public static void main(String[] args) {
        /*
        A jornada de trabalho semanal de um funcionário é de 40 horas. 
        O funcionário que trabalhar mais de 40 horas receberá hora extra, 
        cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
        Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
        o valor por hora e escreva o salário total do funcionário, 
        que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
        (considere que o mês possua 4 semanas exatas).
        */

        Scanner input = new Scanner(System.in);

        int hours, perHour;
        float salary;

        System.out.println("Qual o número de horas trabalhadas por mês?");
        hours = input.nextInt();

        System.out.println("Qual o valor/hora do funcionário?");
        perHour = input.nextInt();

        if (hours > 160) {
            salary = (160 * perHour) + ((hours - 160) * perHour * 1.5f);
        } else {
            salary = hours * perHour;
        }

        System.out.println("O salário do funcionário é R$ " + salary);

        input.close();
    }
}