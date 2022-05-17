import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;

        double totalAlturaHomens = 0;
        double totalAlturaMulheres = 0;

        while (true) {
            System.out.print("Insira o sexo: ");
            String sexo = scanner.nextLine();

            System.out.print("Insira a altura: ");
            double altura = scanner.nextDouble();

            if (sexo.toLowerCase().equals("m")) {
                quantidadeHomens++;
                totalAlturaHomens =+ altura;
            } else {
                quantidadeMulheres++;
                totalAlturaMulheres += altura;
            } 

            if (altura == 0)
                break;
        }

        System.out.println("Média de altura dos homens: " + totalAlturaHomens / quantidadeHomens);
        System.out.println("Média de altura das mulheres: " + totalAlturaMulheres / quantidadeMulheres);

        scanner.close();
    }
}