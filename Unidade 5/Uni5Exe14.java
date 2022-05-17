import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /** x < 10% */
        int totalLucro10 = 0;
        /** 10% <= x <= 20% */
        int totalLucroEntre1020 = 0;
        /**  x > 20% */
        int totalLucroMaior20 = 0;

        double totalCompra = 0;
        double totalVenda = 0;

        double totalLucro = 0;

        for (int i = 1; i <= 2; i++) {
            System.out.print("Insira o preço de compra: ");
            double precoDeCompra = scanner.nextDouble();
            totalCompra += precoDeCompra;

            System.out.print("Insira o preço de venda: ");
            double precoDeVenda = scanner.nextDouble();
            totalVenda += precoDeVenda;

            double percentualDeLucro = (precoDeVenda - precoDeCompra) / precoDeCompra * 100;
            totalLucro += percentualDeLucro;

            if (percentualDeLucro < 10)
                totalLucro10++;
            if (percentualDeLucro >= 10 && percentualDeLucro <= 20)
                totalLucroEntre1020++;
            if (percentualDeLucro > 20)
                totalLucroMaior20++;
        }

        System.out.println("Quantidade de mercadoria com lucro menor que 10%: " + totalLucro10);
        System.out.println("Quantidade de mercadoria com lucro entre 10% e 20%: " + totalLucroEntre1020);
        System.out.println("Quantidade de mercadoria com lucro maior que 20%: " + totalLucroMaior20);
        
        System.out.println("Valor total de compra: " + totalCompra);
        System.out.println("Valor total de venda: " + totalVenda);

        System.out.println("Lucro total: " + totalLucro + "%");

        scanner.close();
    }
}
