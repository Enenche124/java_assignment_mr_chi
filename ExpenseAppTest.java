
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ExpenseAppTest {
	ExpenseApp expenses = new ExpenseApp();
    @Test 
	public void testToValidateDate_successful(){
		
		assertTrue(expenses.validateDateFormat("2020-03-23"));
		
	}
	
	@Test
	public void validateDateFormat_InvalidFormat(){
		assertFalse(expenses.validateDateFormat("2020/03/25"));
	}
	
	@Test
	public void validateDateFormat_InvalidDate(){
		assertFalse(expenses.validateDateFormat(" "));
	}
	
	@Test
	public void validateDateFormat_greaterThan(){
		assertFalse(expenses.validateDateFormat("2020-35-40 "));
	}
	
	@Test
	public void validateDateFormat_lessThan(){
		assertFalse(expenses.validateDateFormat("0-0-0"));
	}
	
	
	//TESTING FOR DESCRIPTION👇
	@Test
	public void validateDescriptionIsNotEmty(){
		
		assertFalse(expenses.validateDescription(" "));
	}
	
	@Test
	public void validateDescriptionIsEmty(){
		assertTrue(expenses.validateDescription("buy me"));
	}


//TESTING FOR AMOUNT👇
  @Test
  public void validateForAmount_successful(){
	  
	  assertTrue(expenses.validateAmount(800.00));
  } 
  
  @Test
  public void validateForAmount_invalid(){
	  
	  assertFalse(expenses.validateAmount(0.00));
  } 

  @Test
  public void validateForAmount_negative(){
	  
	  assertFalse(expenses.validateAmount(-60.00));
  }


}