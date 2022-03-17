import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex9 {
    public static void main(String[] args) {
        /*
        Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
        Para isto ela entregou um valor em dólares para o atendente. 
        Considerando que o atendente tem a cotação do dólar, 
        calcule quantos reais o atendente deve devolver para a pessoa.
        */
        Scanner input = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        float dollar, cotacaoDollarToReal;
        String reais;

        System.out.println("Insira o valor entregue em Dólares ao atendente: ");
        dollar = input.nextFloat();

        System.out.println("Qual a cotação atual do Dólar?");
        cotacaoDollarToReal = input.nextFloat();

        reais = df2.format(dollar * cotacaoDollarToReal); 

        System.out.println("O valor em reais recebido é de R$" + reais);

        input.close();
    }
}
