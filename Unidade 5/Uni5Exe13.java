import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Medida do odômetro antes da viagem: ");
        int firstOdometer = scanner.nextInt();

        System.out.print("Medida do odômetro depois da viagem: ");
        int secondOdometer = scanner.nextInt();

        System.out.print("Descreva a quantidade total de paradas: ");
        int totalStops = scanner.nextInt();

        int counter = 1;

        int totalUsedGasoline = 0;

        for (int i = 0; i < totalStops; i++) {
            
            System.out.print("Valor do odômetro na " + counter + "º parada: ");
            int odometer = scanner.nextInt();

            System.out.print("Quantidade de combustível abastecido na " + counter + "º parada (litros): ");
            double gasoline = scanner.nextDouble();
            totalUsedGasoline += gasoline;

            int totalMileage = odometer - firstOdometer;
            double total = totalMileage / gasoline;

            System.out.println("Quilometragem obtida por litro de combustível: " + total);

            counter++;
        }

        System.out.println("Quilometragem média obtida por litro de combustível em toda a viagem: " + secondOdometer / totalUsedGasoline);
        scanner.close();
    }
}
