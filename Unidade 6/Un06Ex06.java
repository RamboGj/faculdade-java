import java.util.Scanner;

public class Un06Ex06 {
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner input = new Scanner(System.in);

        input.close();
=======
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int input = scanner.nextInt();

        int[] vetor = new int[input];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor no vetor: ");
            int value = scanner.nextInt();

            vetor[i] = value;
        }

        System.out.print("Insira um valor à ser encontrado: ");
        int valorASerEncontrado = scanner.nextInt();

        if (valorFoiEncontrado(valorASerEncontrado, vetor))
            System.out.println("O valor foi cadastrado no vetor.");
         else 
            System.out.println("O valor não foi cadastrado no vetor.");

        scanner.close();
    }

    private static boolean valorFoiEncontrado(int valor, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (valor == vetor[i]) return true;
        }

        return false;
>>>>>>> 5310d6dc29e7be63303dcf93477371c7dabd5e46
    }
}
