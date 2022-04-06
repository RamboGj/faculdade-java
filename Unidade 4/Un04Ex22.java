import java.util.Scanner;

public class Un04Ex22 {
    public static void main(String[] args) {
        /* 
        Um aluno está em dúvida sobre o título que vai receber após concluir seu curso de graduação. 
        Considerando que o sistema apresenta 3 cursos disponíveis 
        (1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação) 
        descreva um algoritmo para ler a opção do aluno e escrever uma mensagem informando
         o título que o aluno vai receber caso opte por aquele curso. 
         As titulações são respectivamente: "Bacharel em Ciência da Computação", 
         "Licenciado em Computação" e "Bacharel em Sistemas de Informação".
        */
        Scanner input = new Scanner(System.in);

        int course;
        
        System.out.println("Insira o id do curso(1, 2 ou 3): ");
        course = input.nextInt();

        if (course == 1) {
            System.out.println("Bacharel em Ciência da Computação");
        } else if (course == 2) {
            System.out.println("Licenciado em Computação");
        } else if (course == 3) {
            System.out.println("Bacharel em Sistemas de Informação");
        }

        input.close();
    }
}
