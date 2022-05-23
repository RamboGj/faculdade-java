package uni5;

import java.util.Scanner;

public class Uni5Exe27 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int ver = 1;
		int diaMes = 0;
		int totalPecasMat = 0;
		int totalPecasVesp = 0;
		
		double valorTotal = 0;
		
		
		while(ver == 1) {
		
			do {	
				
			System.out.println("digite o dia do mes");
			diaMes = scan.nextInt();
			
			if(diaMes <1 || diaMes >30) {
				System.out.println("Dia inválido");
			}
		
			}while(diaMes <1 || diaMes >30);
			
			
				
				
			
			
			System.out.println("Digite o total de peças feitas pela manhã: ");
			totalPecasMat = scan.nextInt();
			
			System.out.println("Digite o total de peças feitas pela tarde: ");
			totalPecasVesp = scan.nextInt();
			
			
			if(diaMes <=15) {
				
				if((totalPecasMat + totalPecasVesp) > 100 && totalPecasMat >=30
						&& totalPecasVesp >=30) {
					
					valorTotal = (totalPecasMat + totalPecasVesp) * 0.8;
				}else {
					
					valorTotal = (totalPecasMat + totalPecasVesp) * 0.5;
				}
				
			}else {
				
				valorTotal = (totalPecasMat* 0.4) + (totalPecasVesp* 0.3);
				
			}
			
			System.out.println("R$"+valorTotal+"(valor recebido)");
			
			System.out.println("Novo Funcionário: 1-sim 2-nao");
			ver = scan.nextInt();
		}
		
		
		
		
		
		
	}

}
