import static org.junit.jupiter.api.Asserttions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest{
	@Test
	public void testThatCalculatorCanAddTwoNumbers(){
		
		//precondition
		
		SimpleCalculator myCalculator = new SimpleCalculator();
		
		//Action
		int sum = myCalculator.add()2,4;
		
		//Check/Assert
		assertEquals(6, sum);
		
	}

}