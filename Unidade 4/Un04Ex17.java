import java.util.Scanner;

public class Un04Ex17 {
    public static void main(String[] args) {
        /*
        Para realizar o cálculo do Imposto de Renda a ser pago, é solicitado a renda anual e o 
        número de dependentes do contribuinte. A renda líquida é calculada sobre a renda anual 
        com um desconto de 2% para cada dependente do contribuinte. 
        O contribuinte com uma renda líquida de até R$ 2.000,00 não paga imposto. 
        Para aqueles que possuem renda líquida entre R$ 2.000,00 e R$ 5.000,00 o imposto é de 5% 
        sobre o valor da renda líquida; para rendas líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. Rendas superiores a R$ 10.000,00 pagam 15% de imposto.
        */
        Scanner input = new Scanner(System.in);

        int dependents, renda;
        float ir, liquid;

        System.out.println("Informe o número de dependentes: ");
        dependents = input.nextInt();

        System.out.println("Informe sua renda bruta anual: ");
        renda = input.nextInt();

        liquid = renda - (renda * 0.02f * dependents);

        if (liquid <= 2000) {
            System.out.println("Sem imposto");
        } else if (liquid > 2000 && liquid < 5000) {
            ir = liquid * 0.05f;
            System.out.println("Alíquota de R$" + ir); 
        } else if (liquid >= 5000 && liquid < 10000) {
            ir = liquid * 0.1f;
            System.out.println("Alíquota de R$" + ir); 
        }

        input.close();
    }
}
