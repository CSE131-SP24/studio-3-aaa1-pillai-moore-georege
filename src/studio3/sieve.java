package studio3;

import java.util.Scanner;

public class sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Value greater than 2");
		int n = in.nextInt();
		int[] prime = new int [n];
		

		
		for (int i = 2; i <= prime.length; i++) {
			
			prime[i] = 2 * i; 
			prime [2 * i] = 0; 
			
		}
		for (int i = 3; i <= prime.length; i++) {
			
			prime [i] = 3 * i;
			prime[3 * i] = 0;
		}
		
		for (int i = 5; i <= prime.length; i++) {
			
			prime [i] = 5 * i;
			prime [5 * i] = 0; 
		}
		
			for (int i = 0; i <= prime.length; i++) {
				while (prime[i]>0) {
				System.out.println(prime[i]);
				
			}
		}
		
}
		
}
	


