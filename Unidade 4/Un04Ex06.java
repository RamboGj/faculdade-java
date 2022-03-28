import java.util.Scanner;

public class Un04Ex06 {
    public static void main(String[] args) {
        /*
        Faça um algoritmo que leia um caractere. 
        Caso seja digitada a letra 'M' escreva “Masculino”. 
        Se for digitada a letra 'F' escreva “Feminino”. 
        Se for informado 'I' escreva “Não Informado”. 
        Qualquer outra letra digitada escreva “Entrada Incorreta”. 
        Atenção: antes de testar a letra, converta-a para maiúscula.
        */

        Scanner input = new Scanner(System.in);
        String letter;

        System.out.println("Informe uma letra entre M, F ou I: ");
        letter = input.next();

        char upperCase = letter.toUpperCase().charAt(0);

        if(upperCase == 'M') {
            System.out.println("Masculino"); 
        } else if (upperCase == 'F') {
            System.out.println("Feminino"); 
        } else if (upperCase == 'I') {
            System.out.println("Não informado"); 
        } else {
            System.out.println("Entrada incorreta.");
        }

        input.close();
    }
}