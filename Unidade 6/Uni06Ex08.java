import java.util.Iterator;
import java.util.Scanner;

public class Uni06Ex08 {
	
	private int tamanhoVetor(Scanner scan) {
	System.out.println("Digite o tamanho do vetor: (limitado a 20)");	
	
	return scan.nextInt();
	}
	
	private double[] populandoVetor(int tamanho, Scanner scan) {
		
		double[] vetor = new double[tamanho];
		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.println("Popule a posição "+(i+1)+" do vetor: ");
			vetor[i] = scan.nextDouble();
			
		}
		System.out.println("Vetor populado!");
		return vetor;
	}
	
	
	private void impressao (double[] vetor) {

		double[][] valImprimir = new double[vetor.length][2];
		
		
		for (int i = 0; i < vetor.length; i++) {
			
			valImprimir[i][0] = vetor[i];
			
			for (int j = 0; j < vetor.length; j++) {
				
				if(vetor[i] == valImprimir[j][0]) {
					valImprimir[j][1] ++;
				}
			}
		}
		
		double [] valImpressos= new double[vetor.length]; 
		
		for (int i = 0; i < valImprimir.length; i++) {
			boolean ver = true;
			
			for (int j = 0; j < valImpressos.length; j++) {
			
				if(valImprimir[i][0] == valImpressos[j]) {
					ver = false;
					break;
				}
			}
	
			if(ver == true) {
				System.out.println("Valor: "+valImprimir[i][0] + " Freq: "+valImprimir[i][1]);
				valImpressos[i] =  valImprimir[i][0];
			}	
		}
	}
	
	private Uni06Ex08() {
		Scanner scan = new Scanner(System.in);
			
		int tamanhoVetor = tamanhoVetor(scan);
			
		double[] vetor = populandoVetor(tamanhoVetor, scan);
		
		impressao(vetor);
	}
	
	
	
	public static void main(String[] args) {
	
	new Uni06Ex08();
		
		
	}

}
