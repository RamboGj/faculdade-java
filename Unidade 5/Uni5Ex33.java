import java.util.Scanner;

public class Uni5Ex33 {
    public static void main(String[] args) {
        /*
        Em uma eleição para presidência, existem 4 candidatos. Os votos são informados através de código. 
        Os dados utilizados para votação obedecem a seguinte codificação:

        1, 2, 3, 4 = voto para o respectivo candidato;
        5 = voto nulo;
        6 = voto em branco.

        Elabore um programa que calcule e escreva:

        total de votos para cada candidato;
        total de votos nulos;
        total de votos em branco;
        percentual dos votos em branco e nulos sobre o total.

        Se o usuário informar um número de operação incorreto, emitir a mensagem “Opção incorreta” e persistir solicitando um número de
         opção correto. Para interromper a operação, o usuário poderá fornecer o número 0.
        */

        Scanner input = new Scanner(System.in);

        int vote, candidate1 = 0, candidate2 = 0, candidate3 = 0, candidate4 = 0, nullVotes = 0, whiteVotes = 0;

        do {
            System.out.println("Em qual cadidato irá votar ?");
            vote = input.nextInt();

            if (vote != 0 && vote != 1 && vote != 2 && vote != 3 && vote != 4 && vote != 5 && vote != 6) {
                System.out.println("Informe um voto correto.");
            } else {
                switch (vote) {
                    case 1: {
                        candidate1++;
                        break;
                    }
                    case 2: {
                        candidate2++;
                        break;
                    }
                    case 3: {
                        candidate3++;
                        break;
                    }
                    case 4: {
                        candidate4++;
                        break;
                    }
                    case 5: {
                        nullVotes++;
                        break;
                    }
                    case 6: {
                        whiteVotes++;
                        break;
                    }
                }
            }  
        } while (vote != 0);

        System.out.println(
            "candidate1: " + candidate1 + "\n" +
            "candidate2: " + candidate2 + "\n" +
            "candidate3: " + candidate3 + "\n" +
            "candidate4: " + candidate4 + "\n" +
            "nullVotes: " + nullVotes + "\n" +
            "whiteVotes: " + whiteVotes + "\n"
        );

        input.close();
    }
}
