package uni5;

import java.util.Scanner;

public class Uni5Exe31 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
	
		System.out.println("Digite o valor: ");
		int value = scan.nextInt();
		
		while(value >1) {
			
			if(value %2 == 0) {
				
				System.out.println(value + " | "+2);
				value = value/2;
			}else if(value %3 == 0) {
			
				System.out.println(value + " | "+3);
				value = value/3;
			}else if(value %5 == 0) {
			
				System.out.println(value + " | "+5);
				value = value/5;
			}else if(value % 7 == 0) {
				
				System.out.println(value + " | "+7);
				value = value/7;
			}else if(value % 11 == 0) {
				
				System.out.println(value + " | "+11);
				value = value/11;
			}else if(value % 13 == 0) {
				
				System.out.println(value + " | "+13);
				value = value/13;
			}else if(value % 17 == 0) {
				
				System.out.println(value + " | "+17);
				value = value/17;
			}else if(value % 19 == 0) {
				
				System.out.println(value + " | "+19);
				value = value/19;
			}else if(value % 23 == 0) {
				
				System.out.println(value + " | "+23);
				value = value/23;
			}else if(value % 29 == 0) {
				
				System.out.println(value + " | "+29);
				value = value/29;
			}
		}
System.out.println(value);

	}

}
