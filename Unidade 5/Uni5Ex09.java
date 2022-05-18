import java.util.Scanner;

public class Uni5Ex09 {
    public static void main(String[] args) {
        /*
        Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:

        escreva os nomes dos alunos que tem 18 anos;
        escreva a quantidade de alunos que tem idade acima de 20 anos.
        */

        Scanner input = new Scanner(System.in);

        String name;
        int age, numberOf20Upper = 0;

        int n = input.nextInt();
        

        for (int i = 0; i < n; i++) {
            age = input.nextInt();
            name = input.next();

            if ( age == 18 ) {
                System.out.println(name);
            }

            if ( age > 20 ) {
                numberOf20Upper++;
            }
        }

        System.out.println(numberOf20Upper);
        input.close();
    }     
}
