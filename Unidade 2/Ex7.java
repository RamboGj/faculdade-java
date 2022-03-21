import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        String name;
        Double standardSalary, sales;
        /*
        Faça um programa que leia o nome de um vendedor, o seu salário fixo e o 
        total de vendas efetuadas por ele no mês (em dinheiro). 
        Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
        informar o total a receber no final do mês, com duas casas decimais. 
        */
        System.out.println("Informe o nome do vendedor: ");
        name = input.next();

        System.out.println("Informe o salário fixo do vendedor: ");
        standardSalary = input.nextDouble();

        System.out.println("Informe as vendas do vendedor em R$: ");
        sales = input.nextDouble();

        String finalSalary = df2.format(sales * (15/100) + standardSalary);

        System.out.println("O salário do vendedor é R$" + finalSalary);

        input.close();
    }
}
