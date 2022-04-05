import java.util.Scanner;

public class Un04Ex20 {
    public static void main(String[] args) {
        /* 
        Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, 
        descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno, 
        usando a fórmula:

        A atribuição dos conceitos obedece à tabela abaixo:

        O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e a mensagem 
        "aprovado" caso o conceito seja A, B ou C, e "reprovado" caso o conceito seja D ou E.
        */
        Scanner input = new Scanner(System.in);

        double score1, score2, score3, exercisesScore, averageScore;

        System.out.println("Insira a nota 1: ");
        score1 = input.nextDouble();
        
        System.out.println("Insira a nota 2: ");
        score2 = input.nextDouble();
        
        System.out.println("Insira a nota 3: ");
        score3 = input.nextDouble();

        System.out.println("Insira a nota dos exercícios: ");
        exercisesScore = input.nextDouble();

        averageScore = (score1 + score2 * 2 + score3 * 3 + exercisesScore) / 7;

        if (averageScore >= 9.0) {
            System.out.println("nota A, Aprovado");
        } else if (averageScore >= 7.5 && averageScore < 9.0) {
            System.out.println("nota B, Aprovado");
        } else if (averageScore >= 6.0 && averageScore < 7.5) {
            System.out.println("nota C, Aprovado");
        } else if (averageScore >= 4.0 && averageScore < 6.0) {
            System.out.println("nota D, Reprovado");
        } else if (averageScore < 4.0) {
            System.out.println("nota E, Reprovado");
        } 

        input.close();
    }
}
