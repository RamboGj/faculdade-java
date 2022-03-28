import java.util.Scanner;

public class Un04Ex12 {
    public static void main(String[] args) {
        /*
        Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos lados de um triângulo,
        descreva um algoritmo que verifique se os mesmos podem ser os comprimentos dos lados de um 
        triângulo. Em caso afirmativo, verifique e informe se é "triângulo equilátero", 
        "triângulo isósceles" ou "triângulo escaleno". 
        Em caso negativo, informe que os mesmos não formam um triângulo. Considere que:

        o comprimento de cada lado de um triângulo é menor que a soma dos comprimentos dos outros lados.
        um triângulo equilátero tem três lados iguais
        um triângulo isóscele tem dois lados iguais e um diferente
        um triângulo escaleno tem três lados diferentes
        */
        Scanner input = new Scanner(System.in);
        int lado1, lado2, lado3;
        Boolean isTriangle;

        System.out.println("Informe um lado de um triângulo: ");
        lado1 = input.nextInt();

        System.out.println("Informe um lado de um triângulo: ");
        lado2 = input.nextInt();

        System.out.println("Informe um lado de um triângulo: ");
        lado3 = input.nextInt();

        isTriangle = lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado2 + lado1;

        if (isTriangle) {
            if(lado1 == lado2 && lado1 == lado3) {
                System.out.println("É um triângulo equilátero");
            } else if (
                (lado1 == lado2 && lado1 != lado3) || 
                (lado2 == lado3 && lado2 != lado1) || 
                (lado3 == lado1 && lado3 != lado2)) {
                
                System.out.println("É um triÂngulo isóceles.");
            } else {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Essas medidas não formam um triângulo.");
        }

        input.close();
    }
}

