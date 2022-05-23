package uni5;
import java.util.ArrayList;
import java.util.Scanner;

public class Uni5Exe25 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);




        int qtdE = 17;
        int qtD = 17;

        while (((qtdE <21 || qtD <21) && (Math.abs(qtdE-qtD)< 2)) || (qtdE>=21 && qtD>=21 && (Math.abs(qtdE-qtD)<2))) {
            System.out.println("De quem foi o ponto? 'D' ou 'E': ");
            String ponto = scan.next();

            if(ponto.toUpperCase().trim().equals("D")){
                qtD+=1;


            }else if(ponto.toUpperCase().trim().equals("E")){

                qtdE+=1;

            }else{
                System.out.println("Digitação inválida");
            }
            System.out.println("qtd Esquerda: "+qtdE);

            System.out.println("qtd Direita: "+qtD);

        }

        System.out.println("Acabou!!");






    }
}
