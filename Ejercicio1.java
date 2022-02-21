public class CozaLozaWoza {   // Save as "CozaLozaWoza.java"
   public static void main(String[] args) {
      final int LOWERBOUND = 1, UPPERBOUND = 110;
      for (int x = LOWERBOUND; x <= UPPERBOUND; x +=1) {
			boolean regular = true;
			System.out.print (" ");
			if (x % 3 == 0) {
				System.out.print("Coza");
				regular = false;
			}
			if (x % 5 == 0) {
				System.out.print("Loza");
				regular = false;
			}
			if (x % 7 == 0) {
				System.out.print("Woza");
				regular = false;
			}
			if (regular) {
				System.out.print(x);
			}
			if (x % 11 == 0) {
				System.out.println();
			}
		}
      }
   }
   
   public class CheckPassFail {  // Save as "CheckPassFail.java"
   public static void main(String[] args) {  // Program entry point
      int suma = 0;
	  float promedio = 0;
	  int numberInit = 0;
	  int numberEnd = 100;
	  int contador = 0;
	  for(int i=numberInit; i<=numberEnd; i++){
		  suma += i;
			contador++;
	  }
	  promedio = (suma / contador);
      System.out.println("The number is " + suma);
	  System.out.println("The average is " + promedio);
 
      
   }
}

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N;

        System.out.print("Introduzca valor de N: ");
        N = scan.nextInt();
        
        System.out.println("La primera cifra de " + N + " -> " + (N/100));
        System.out.println("La cifra central de " + N + " -> " + (N/10)%10);
        System.out.println("La última cifra  de " + N + " -> " + (N%10));
        
    }  
}
