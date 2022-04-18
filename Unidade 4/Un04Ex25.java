import java.util.Scanner;

public class Un04Ex25 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e 
        execute a operação correspondente. O algoritmo deve exibir uma mensagem de erro se 
        a opção for inválida. O menu tem as seguintes opções:
        Escolha uma opção:
        1 - Soma de dois números.
        2 - Diferença entre dois números.
        3 - Produto entre dois números.
        4 - Divisão entre dois números (o denominador não pode ser zero).
        */

        Scanner input = new Scanner(System.in);

        int option, value1, value2;

        System.out.println(
            "Escolha a opção: " + "\n" +
            "1 - Soma de dois números." + "\n" +
            "2 - Diferença entre dois números." + "\n" + 
            "3 - Produto entre dois números." + "\n" +
            "4 - Divisão entre dois números (o denominador não pode ser zero)."
        );
        option = input.nextInt();

        if (option != 1 && option != 2 && option != 3 && option != 4) {
            System.out.println("Opção inválida");
        } else {
            System.out.println("Insira um valor: ");
            value1 = input.nextInt();

            System.out.println("Insira um valor: ");
            value2 = input.nextInt();

            switch (option) {
                case 1: 
                    System.out.println(value1 + value2);
                    break;
                case 2: 
                    System.out.println(value1 - value2);
                    break;
                case 3: 
                    System.out.println(value1 * value2);
                    break;
                case 4: 
                    if (value2 != 0) {
                        System.out.println(value1 / value2);
                    } else {
                        System.out.println("O denominador não pode ser 0");
                    }
                    break;
            }
        }

        

        input.close();
    }
}
