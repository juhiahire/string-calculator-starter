package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

  /* @Test public void return_0_when_input_is_empty() { assertEquals("0",
	* given("")); }
	 */

 
	// @Test public void return_3_when_input_is_1_2() { assertEquals("3",
	// given("1,2")); }
	 
	 @Test public void sum_floats_and_return_float() { assertEquals("6.6",
			 given("2.2,4.4")); }
			

}
