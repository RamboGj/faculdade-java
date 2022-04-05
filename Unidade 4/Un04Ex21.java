import java.util.Scanner;
import java.lang.Math;

public class Un04Ex21 {
    public static void main(String[] args) {
        /* 
        O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma 
        pessoa está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo 
        quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, 
        de acordo com a fórmula:

        IMC = Massa / Altura * Altura

        Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, 
        de acordo com a seguinte tabela:
        */
    
        Scanner input = new Scanner(System.in);

        Double weight, height, imc;

        System.out.println("Insira o seu peso: ");
        weight = input.nextDouble();

        System.out.println("Insira a sua altura: ");
        height = input.nextDouble();
        
        imc = weight / (Math.pow(height, 2));

        if (imc >= 40.0) {
            System.out.println("Obesidade Grau III (mórbida)"); 
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade Grau II (severa)"); 
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade Grau I"); 
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso"); 
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Saudável"); 
        } else if (imc < 18.5) {
            System.out.println("Magreza"); 
        }

        input.close();
    }
}
