package technical.interview.calculator;


/*	
 * 	Created by: Joshua Bell
 *  Description: Calculator class to perform calculations
 *  Notes: I created a calculator class in-case we want to add future functionality
 */
public class Calculator {

	
	
	//Assuming numbers will be integers + or -
	public float calculate_pow(int base, int exp) {
			
			float result = 1;
			 
			//Positive exponent
			if(exp > 0){
				
				for(int i = 0; i < exp; i++) {
					result = result * base;
				}
				
				return result;
			} 
			//Negative exponent
			else if(exp < 0){
				
				float converted_base = (float) 1 / base;
				
				for(int i = 0; i < -exp; i++) {
					result = result * converted_base;
				}
				return result;
			}
			
			//Case when exp = 0
			return result = (base >= 0) ? result : -result;
			
	}
	
	//Future calculation methods can go here:
	
	
}
