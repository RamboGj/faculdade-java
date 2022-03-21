import java.util.Scanner;
import java.text.DecimalFormat; 

public class Un3Ex12 {
    public static void main(String[] args) {
        /*
        Uma empresa tem para um funcionário os seguintes dados: 
        o nome, o número de horas trabalhadas mensais e o número de dependentes.
        A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e 
        R$ 60,00 por dependente (valor para cálculo do salário família) e 
        são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário 
        trabalho para o imposto de renda. 
        Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.
        */
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        String name;
        Double pricePerHour = 10.00, pricePerDependent = 60.00, workedHours, liquidSalary, numberOfDependents, bruteSalary, inssTax, irTax;
        String formattedLiquid, formattedBrute;

        System.out.println("Informe o nome do funcionário: ");
        name = input.next();

        System.out.println("Informe a quantidade de horas trabalhadas: ");
        workedHours = input.nextDouble();

        System.out.println("Informe o seu número de dependentes: ");
        numberOfDependents = input.nextDouble();

        liquidSalary = (workedHours * pricePerHour) + (numberOfDependents * pricePerDependent);

        irTax = liquidSalary * 0.05;
        inssTax = liquidSalary * 0.085;

        bruteSalary = liquidSalary - (inssTax + irTax);

        formattedLiquid = df2.format(liquidSalary); 
        formattedBrute = df2.format(bruteSalary); 

        System.out.println("O salário líquido do funcionário" + name + " é de R$" + formattedLiquid + " e o bruto é de R$" + formattedBrute);

        input.close();
    }
}


