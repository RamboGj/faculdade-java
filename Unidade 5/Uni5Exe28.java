package uni5;

import java.util.Scanner;

public class Uni5Exe28 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int ver = 1;
		
		int total1 = 0, percent1 = 0;
		int total2 = 0, percent2 = 0;
		int total3 = 0, percent3 = 0;
		int total4 = 0, percent4 = 0;
		
		int totalVotos = 0;
		
		while(ver == 1) {
			
			System.out.println("Votação: ");
			System.out.println("código	conjunto\r\n"
					+ "1	Nenhum de Nós\r\n"
					+ "2	CPM22\r\n"
					+ "3	Skank\r\n"
					+ "4	Jota Quest");
			
			int voto = scan.nextInt();
			
			
			if(voto == 1) {
				totalVotos++;
				total1 ++;
			}else if(voto == 2) {
				totalVotos++;
				total2 ++;
			}else if(voto == 3) {
				totalVotos++;
				total3 ++;
			}else if(voto == 4) {
				totalVotos++;
				total4 ++;
			}else {
				
				System.out.println("Voto inválido");
			}
			
			System.out.println("Novo voto: 1-sim 2-nao");
			ver = scan.nextInt();
		}
		
		System.out.println("Total de votos = "+totalVotos);
		System.out.println("Total de votos para Nenhum de Nós: "+total1 
				+ " - Porcentagem: "+(total1 * 100)/totalVotos+"%");
		System.out.println("Total de votos para CPM22: "+total2
				+ " - Porcentagem: "+(total2 * 100)/totalVotos+"%");
		System.out.println("Total de votos para Skank: "+total3
				+ " - Porcentagem: "+(total3 * 100)/totalVotos+"%");
		System.out.println("Total de votos para Jota Quest: "+total4
				+ " - Porcentagem: "+(total4 * 100)/totalVotos+"%");

		
		
	}

}
