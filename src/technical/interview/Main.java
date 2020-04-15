package technical.interview;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		while(true) {
			
			Scanner scanner = new Scanner(System.in);
			
			try {
				//Collect user input
				System.out.println("Please enter the base: ");
				int base = scanner.nextInt();
				
				System.out.println("Please enter the exponent: ");
				int exp = scanner.nextInt();
				
				//Calculate pow
				Calculator calc = new Calculator();
				System.out.println(calc.calculate_pow(base, exp));
				
			} catch(Exception e) {
				System.out.println("Only enter valid integers (Ex. 0, -1 , 2... )");
			}

			
		} 
		
			
	}
	
	
}



