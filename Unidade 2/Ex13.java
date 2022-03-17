import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        /* 
        Dois carros (X e Y) partem em uma mesma direção. 
        O carro X sai com velocidade constante de 60 Km/h e 
        o carro Y sai com velocidade constante de 90 Km/h. 
        Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, 
        ou seja, consegue se afastar um quilômetro a cada 2 minutos. 
        Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y 
        tomar essa distância do outro carro.
        */

        Scanner input = new Scanner(System.in);

        int distance;
        int minutes;

        System.out.println("Qual a distância em Km entre o carro X e Y?");
        distance = input.nextInt();

        minutes = distance * 2;

        System.out.println("O tempo para os carros terem a distância de " + distance + " Km entre eles é de " + minutes + " minutos");
    }
}
