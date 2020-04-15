package technical.interview.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import technical.interview.calculator.Calculator;

/**
 * Unit test for Calculator.
 */
public class CalculatorTest 
{
	@Test
	public void testExponent0() {
		
		Calculator calc = new Calculator();
		float result_0_0 = calc.calculate_pow(0, 0);
		float result_5_0 = calc.calculate_pow(5, 0);
		float result_neg5_0 = calc.calculate_pow(-5, 0);
		
		// 	1 = 0 ^ 0
		assertEquals(1, result_0_0,0);
		// 	1 = 5 ^ 0
		assertEquals(1, result_5_0,0);
		// -1 = -5 ^ 0
		assertEquals(-1, result_neg5_0,0);
		
	}
	
	@Test
	public void testPositiveExponent() {
		
		Calculator calc = new Calculator();
		float result_5_5 = calc.calculate_pow(5, 5);
		
		// 	3125 = 5 ^ 5
		assertEquals(3125, result_5_5,0);		
	}
	
	@Test
	public void testNegativeExponent() {
		
		Calculator calc = new Calculator();
		float result_5_neg5 = calc.calculate_pow(5, -5);
		
		// 	3125 = 5 ^ 5
		assertEquals(0.00032, result_5_neg5,0.000001);		
	}

}
