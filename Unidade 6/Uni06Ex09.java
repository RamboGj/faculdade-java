import java.util.Iterator;
import java.util.Scanner;

public class Uni06Ex09 {

	
	private int[][] popularMatriz(int[][] matriz){

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Popule a matriz: ");
		
		for (int i = 0; i < matriz.length; i++) {
			
			System.out.println("Digite o sexo (1-feminino 2-masculino): ");
			matriz[i][0] = scan.nextInt();

			System.out.println("Digite a nota: ");
			matriz[i][1] = scan.nextInt();

			System.out.println("Digite a idade: ");
			matriz[i][2] = scan.nextInt();
		}
		
		return matriz;
		
	}
	
	private double notaMediaCinema(int[][] matriz) {
		int soma = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			 soma += matriz[i][1];	
		}
		return soma/matriz.length;
	}
	
	private double notaMediaHomens(int[][] matriz) {
		int soma = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			 
			if(matriz[i][0] == 2) {
			soma += matriz[i][1];	
			}
		}
		return soma/matriz.length;
	}
	
	private int notaMulherJovem(int[][] matriz) {
		int idade = 100;
		int nota = 0;
		for (int i = 0; i < matriz.length; i++) {
			
			if(matriz[i][2] < idade) {
				
				idade = matriz[i][2];
				nota = matriz[i][1];
			}
		}
		
		return nota;
	}
	
	private int qtdMulheres(int[][] matriz) {
		int qtd = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			
			if(matriz[i][2] > 50) {
				
				if(matriz[i][1] > notaMediaCinema(matriz)) {
					qtd++;
				}
			}
		}
		return qtd;
		
	}
	
	private Uni06Ex09() {
		
		int[][] matriz = new int[4][3];
		matriz = popularMatriz(matriz);
		
		System.out.println("Nota media do cinema: "+notaMediaCinema(matriz));
		System.out.println("Nota media de homens: "+notaMediaHomens(matriz));
		System.out.println("Nota da mulher mais jovem "+ notaMulherJovem(matriz));
		System.out.println("Quantidade de mulheres com mais de 50 que deram nota acima da media: "+qtdMulheres(matriz));
		
	}
	
	
	
	public static void main(String[] args) {
		new Uni06Ex09();
	}
	

}
