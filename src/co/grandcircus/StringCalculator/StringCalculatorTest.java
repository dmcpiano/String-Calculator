// Worked with Sienna

package co.grandcircus.StringCalculator;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class StringCalculatorTest {

	
	@Test
	void testNull() {
		
		String actual = StringCalculator.add("");
		String expected = "0";
		assertEquals(expected, actual);
	}
	
	@Test
	void testSingleDigit() {
		
		String actual = StringCalculator.add("54");
		String expected = "54";
		assertEquals(expected, actual);
	}
	
    @Test
    void testMultiDigitSum() {
    	String actual = StringCalculator.add("3,3,3");
    	String expected = "9";
    
        assertEquals(expected, actual);    
        
    }

}
