import java.util.Scanner;

public class Un04Ex10 {
    public static void main(String[] args) {
        /*
        Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. 
        Faça um algoritmo para ler as idades dos filhos e exibir quem é o caçula da família; 
        suponha que não haja empates.
        */

        Scanner input = new Scanner(System.in);
        int Mage, Zage, Lage;

        System.out.println("Informe a idade do Marquinhos: ");
        Mage = input.nextInt();

        System.out.println("Informe a idade do Zezinho: ");
        Zage = input.nextInt();

        System.out.println("Informe a idade do Luluzinha: ");
        Lage = input.nextInt();

        if (Lage < Zage && Lage < Mage) {
            System.out.println("Luluzinha é a caçula"); 
        } else if (Mage < Zage && Mage < Lage) {
            System.out.println("Marquinhos é a caçula");  
        } else {
            System.out.println("Zezinho é a caçula");  
        }

        input.close();
    }
}