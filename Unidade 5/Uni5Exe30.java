package uni5;

import java.util.Scanner;

public class Uni5Exe30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite valor de N: ");
		int N = scan.nextInt();
		
		System.out.println("Digite valor de K: ");
		int K = scan.nextInt();
		
		int somaMochila = 0;
		int somaResto = 0;
		
		
		int M = 30;
		
		while(M >0 && N > 0 || N > K) {
			
			System.out.println("Adicionando "+N+" na mochila!");
			somaMochila += N;
			N = N-K;
			M--;
		}
		
		while(N > 0 || N > K) {
			System.out.println(N+" Ficou de fora da mochila!");
			somaResto+=N;
			N=N-K;
			
		}
		
		System.out.println("Soma elementos da mochila: "+somaMochila);
		System.out.println("Soma dos elementos que ficaram de fora da mocihla: "+somaResto);
	}

}
