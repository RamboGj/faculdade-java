import java.util.Scanner;

public class Un04Ex13 {
    public static void main(String[] args) {
        /*
        Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as três cartas 
        deste usuário em uma mão de jogo de truco 
        (1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei). 
        O algoritmo deve imprimir na tela a palavra 
        "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), 
        "SEIS" (se APENAS DUAS das três cartas for AS, 2 ou 3) ou 
        "NOVE" (se AS TRÊS cartas forem AS, 2 ou 3). 
        Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada.
        Dica: criar variáveis intermediárias para contar a quantidade de "boas". 
        */

        Scanner input = new Scanner(System.in);
        int AS = 1, dois = 2, tres = 3, sete = 7, valete = 11, dama = 12, rei = 13;
        int card1, card2, card3;

        System.out.println("Insira uma carta em mãos: ");
        card1 = input.nextInt();

        System.out.println("Insira uma carta em mãos: ");
        card2 = input.nextInt();

        System.out.println("Insira uma carta em mãos: ");
        card3 = input.nextInt();

        if ((
            ((card1 == AS || card1 == dois || card1 == tres) || (card2 == AS || card1 == dois || card2 == tres) || (card3 == AS || card3 == dois || card3 == tres))
            && 
            ((card2 != AS && card2 != dois && card3 != tres) && (card3 != AS && card3 != dois && card3 != tres)) || ((card1 != AS && card1 != dois && card1 != tres) && (card3 != AS && card3 != dois && card3 != tres)) || ((card1 != AS && card1 != dois && card1 != tres) && (card2 != AS && card2 != dois && card2 != tres))
            )) {
            System.out.println("TRUCO");
        }  else if (
            ((card1 == AS || card1 == dois || card1 == tres) && (card2 == AS || card2 == dois || card2 == tres) && (card3 == AS || card3 == dois || card3 == tres))
        ) {
            System.out.println("NOVE");
        } else if ((
            ((card1 == AS || card1 == dois || card1 == tres) && (card2 == AS || card2 == dois || card2 == tres)) || ((card1 == AS || card1 == dois || card1 == tres) && (card3 == AS || card3 == dois || card3 == tres)) || ((card2 == AS || card2 == dois || card2 == tres) && (card3 == AS || card3 == dois || card3 == tres))
            &&
            ((card1 != AS && card1 != dois && card1 != tres) || (card2 != AS && card2 != dois && card2 != tres) || (card3 != AS && card3 != dois && card3 != tres))
            )
        ) {
            System.out.println("SEIS");
        }  

        input.close();
    }
}

