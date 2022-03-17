import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Ex12 {
    public static void main(String[] args) {
        /* 
        Leia os quatro valores correspondentes aos eixos x e y 
        de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, 
        mostrando 4 casas decimais após a vírgula, segundo a fórmula:
        Distancia = https://prnt.sc/jvxvhv
        */

        int x1, x2, y1, y2;
        String formattedDistance;

        Scanner input = new Scanner(System.in);
        DecimalFormat df4 = new DecimalFormat("0.0000");

        System.out.println("Informe o ponto x1");
        x1 = input.nextInt();

        System.out.println("Informe o ponto y1");
        y1 = input.nextInt();

        System.out.println("Informe o ponto x2");
        x2 = input.nextInt();

        System.out.println("Informe o ponto y2");
        y2 = input.nextInt();

        Double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        formattedDistance = df4.format(distance);

        System.out.println("A distânia entre os pontos é aproximadamente " + formattedDistance);
    }
}
