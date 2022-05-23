package uni5;

import java.util.Scanner;

public class Uni5Exe29 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o valor: ");
		int val = scan.nextInt();
		int sobra = 0;
		int cedula1=0, cedula2=0, cedula5=0, cedula10=0, cedula20=0;
		
		while(val>0) {
			
			while(val >= 20) {
				cedula20++;
				val = val-20;
			}
			
			while(val >= 10) {
				cedula10++;
				val = val-10;
			}
			
			while(val >= 5) {
				cedula5++;
				val = val-5;
			}
			
			while(val >= 2) {
				cedula2++;
				val = val-2;
			}
			
			while(val >= 1) {
				cedula1++;
				val = val-1;
			}
		}
		
		System.out.println("Cedulas de 1: "+cedula1);
		System.out.println("Cedulas de 2: "+cedula2);
		System.out.println("Cedulas de 5: "+cedula5);	
		System.out.println("Cedulas de 10: "+cedula10);
		System.out.println("Cedulas de 20: "+cedula20);
	}

}
