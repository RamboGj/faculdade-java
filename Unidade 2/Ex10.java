import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex10 {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro, que é o tempo de duração em segundos 
        de um determinado evento em uma fábrica, 
        e informe-o expresso no formato horas:minutos:segundos.
        */
        Scanner input = new Scanner(System.in);
        DecimalFormat dfTime = new DecimalFormat("00"); 
        
        int secondsGiven, hours, minutes, seconds, rest;

        System.out.println("Informe o número de segundos: ");
        secondsGiven = input.nextInt();

        hours = secondsGiven / 3600;
        rest = secondsGiven % 3600;

        minutes = rest / 60;
        rest %= 60;

        seconds = rest;

        System.out.println("O evento teve duração de " + dfTime.format(hours) + ":" + dfTime.format(minutes) + ":" + dfTime.format(seconds));
    }
}
