package uni5;

import java.util.Scanner;

public class Uni5Ex10 {
    public static void main(String[] args) {
        /*
        
        */
        Scanner input = new Scanner(System.in);
        
        for (int i = 1000; i <= 9999; i++) {
        	
               int a = i/100;
               int b = i % 100;
               
               if(Math.pow((a+b),2) == i) {
            	   System.out.println(i);
               }
        
        
        
        }
        
        
    }
}
