import java.util.Scanner;

public class Un04Ex15 {
    public static void main(String[] args) {
        /*
        Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu 
        salário. A empresa irá conceder 5% de reajuste para o funcionário que for admitido 
        há menos de 12 meses. Para funcionário admitido entre 13 e 48 meses, irá conceder 
        7% de reajuste. O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que
        o funcionário foi admitido.
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número de meses que o funcionário trabalha na empresa:");
        int months = input.nextInt();

        if (months < 12) {
            System.out.println("Reajuste de 5%");
        } else if (months > 12 && months <= 48) {
            System.out.println("Reajuste de 7%");
        }
    }
}
