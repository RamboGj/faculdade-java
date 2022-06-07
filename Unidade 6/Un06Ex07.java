import java.util.Arrays;
import java.util.Scanner;

public class Un06Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor entre 0 e 20: ");
        int input = scanner.nextInt();

        if (input > 20) {
            System.out.println("Valor inválido");
            System.exit(0);
        }

        int[] vetor = new int[input];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor ao vetor: ");
            int valorASerAdicionado = scanner.nextInt();

            for (int j = 0; j < vetor.length; j++) {
                if (valorASerAdicionado == vetor[j]) {
                    System.out.println("Este valor já foi adicionado ao vetor.");
                    i = i - 1;
                    break;
                }
            }

            adicionaValoresNoVetor(vetor, valorASerAdicionado, i);
        }

        ordenaVetor(vetor);
        retornaResultadoVetor(vetor);

        scanner.close();
    }

    private static void adicionaValoresNoVetor(int[] vetor, int valor, int i) {
        vetor[i] = valor;
    }

    private static void ordenaVetor(int[] vetor) {
        Arrays.sort(vetor);
    }

    private static void retornaResultadoVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
