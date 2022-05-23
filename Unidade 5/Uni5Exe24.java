package uni5;

import java.util.Scanner;

public class Uni5Exe24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o peso limite diário de peixes: ");
		double peso = scan.nextInt();
		double pesoDiario = 0;
		int ver = 1;
		
		
		while(pesoDiario<peso && ver == 1) {
			
			System.out.println("Digite o peso em gramas do peixe: ");
			double pesoGramas = scan.nextDouble();
			
			pesoDiario+= pesoGramas/1000;
			
			System.out.println("Peso total até o momento: "+pesoDiario);
			
			if(pesoDiario>=peso) {
				System.out.println("Limite excedido!");
				break;
			}
			
			System.out.println("Deseja inserir mais um peixe: 1-sim 2-nao");
			ver = scan.nextInt();
		}
		
		System.out.println("Fim da pescaria!");
		
		
	}

}
