package uni5;

import java.util.Scanner;

public class Uni5Exe32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite em que dia cai o primeiro dia do mes: ");
		int p = scan.nextInt();
		System.out.println("Digite quantos dias possui o mes: ");
		int n = scan.nextInt();
		
		int count = 1;
		int countDiasSemana=0;
		
		String calendario;
		
		while(count <= n) {

			
		if(p==1) {
			System.out.print("Domingo-"+count+"|");
			p++;
		}else if(p==2) {
			
			System.out.print("Segunda-"+count+"|");
			p++;
		}else if(p==3) {
			
			System.out.print("Terça-"+count+"|");
			p++;
		}else if(p==4) {
			
			System.out.print("Quarta-"+count+"|");
			p++;
		}else if(p==5) {
			
			System.out.print("Quinta-"+count+"|");
			p++;
		}else if(p==6) {
			
			System.out.print("Sexta-"+count+"|");
			p++;
		}else if(p==7) {
			
			System.out.print("Sabado-"+count+"|");
			p= 1;
		}
			count++;
		}

	}

}
