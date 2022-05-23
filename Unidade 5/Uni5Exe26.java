package uni5;

import java.util.Scanner;

public class Uni5Exe26 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de pedágio "
				+ "que Astolfo se nega a pagar:");
		
		double valorNegado = scan.nextDouble();

		int countValorMaior = 0;
		int countTrechos = 0;
		int countDistMaiorAceito = 0;
		double valorPedagio = 0;
		int dist = 0; 
		
		while(valorPedagio >= 0) {

			System.out.println("Digite o valor do pedágio: ");
			 valorPedagio = scan.nextDouble();
			 
			if(valorPedagio< 0) {
				break;
			} 
			 
			System.out.println("Digite a distância em KM do trecho: ");
			dist = scan.nextInt();
			
			if(valorPedagio > valorNegado) {
				
				countValorMaior++;
			}
			
			countTrechos++;
			
			if(dist>150 && valorPedagio < valorNegado) {
				
				countDistMaiorAceito++;
			}
			
				}
	
		
		System.out.println(countValorMaior+" (trechos com valor acima do qual ele nega-se a pagar)");
		
		System.out.println(countTrechos+"(quantidade de trechos informados)");
		
		System.out.println(countDistMaiorAceito+"(trechos acima de 150km com valor aceito por ele)");

	}

}
