import java.util.Scanner;

public class Un04Ex11 {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, 
        escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. 
        Considere que eles são GÊMEOS se dois deles possuem a mesma idade e 
        o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes.
        */

        Scanner input = new Scanner(System.in);
        int birth1, birth2, birth3;

        System.out.println("Insira o ano de nascimento: ");
        birth1 = input.nextInt();

        System.out.println("Insira o ano de nascimento: ");
        birth2 = input.nextInt();

        System.out.println("Insira o ano de nascimento: ");
        birth3 = input.nextInt();

        if (birth1 == birth2 && birth1 == birth3) {
            System.out.println("São trigêmeos");
        } else if (
        (birth1 == birth2 && birth1 != birth3) || 
        (birth2 == birth3 && birth2 != birth1) || 
        (birth3 == birth1 && birth3 != birth2)
        ) {
            System.out.println("São gêmeos e um irmão");
        } else {
            System.out.println("São apenas irmãos");
        }

        input.close();
    }
}

