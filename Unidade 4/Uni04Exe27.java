import java.util.Scanner;

public class Uni04Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a Hora e o Minuto de Chegada: ");
        int hEntrada = sc.nextInt(); int mEntrada = sc.nextInt();
        System.out.println("Insira a Hora e o Minuto de Saída: ");
        int hSaida = sc.nextInt(); int mSaida = sc.nextInt();
        int hTotal;

        if (hEntrada > 0 && hEntrada < 24) {
        } else if (mEntrada > 0 && mEntrada < 60) {
        } else if (hSaida > 0 && hEntrada < 24) {
        } else if (mSaida > 0 && mSaida < 60) {
        } else {
            System.out.println("Erro");
            System.out.println("Horário Inválido");
        } if (mEntrada > 30) {
            hEntrada ++;
        } if (mSaida > 30) {
            hSaida ++;
        } if (hSaida > hEntrada) {
            hTotal = hSaida - hEntrada; 
        } else {
            hTotal = (24 - hEntrada) + hSaida;
        } 

        double valor;

        switch (hTotal) {
            case 1 :
                valor = 5;
                break;
            case 2 :
                valor = 10;
                break;
            case 3: 
                valor = 17.50;
                break;
            case 4 : 
                valor = 25;
                break;
            default :
                valor = 25 + (10 * hTotal - 4);
                break;
        }

        System.out.println(valor);

        sc.close();
    }
}
