import java.util.Scanner;

public class Un04Ex18 {
    public static void main(String[] args) {
        /*
        Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até 
        o dia do vencimento, o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. 
        Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto, 
        e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. 
        Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e 
        calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens. Suponha que todo 
        vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês 
        seguinte.
        */
        Scanner input = new Scanner(System.in);

        String paymentDate, validityDate;
        int value;
        float value2;

        System.out.println("Insira a data de vencimento do boleto no modelo dd/mm: ");
        validityDate = input.next();

        System.out.println("Insira a data de pagamento do boleto no modelo dd/mm: ");
        paymentDate = input.next();

        System.out.println("Insira o valor do boleto: ");
        value = input.nextInt();

        int validityDataInt = Integer.valueOf(validityDate.substring(0, 2)); 
        int paymentDateInt = Integer.valueOf(paymentDate.substring(0, 2)); 

        System.out.println("O resultado é " + 100 * 0.02f * 5);

        if (paymentDateInt <= validityDataInt) {
            value2 = value - (value * 0.1f);
            System.out.println("O valor pago foi de R$" + value2 + "e está em dia");
        } else if (paymentDateInt - validityDataInt == 5) {
            System.out.println("O valor pago será R$" + value + ", sem desconto");
        } else if (paymentDateInt - validityDataInt > 5) {
            value2 = value + (value * 0.02f * (paymentDateInt - validityDataInt - 5));
            System.out.println("O valor com a multa será de R$" + value2);
        }
    }
}
