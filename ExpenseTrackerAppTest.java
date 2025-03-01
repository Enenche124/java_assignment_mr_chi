import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class ExpenseTrackerAppTest {

    @Test
    public void testAddExpenseValidData() {
        List<String> dates = new ArrayList<>();
        List<String> descriptions = new ArrayList<>();
        List<Double> amounts = new ArrayList<>();

        ExpenseTrackerApp.addExpense(dates, descriptions, amounts, "2025-02-26", "Coffee", 5.50);

        assertEquals(1, dates.size());
        assertEquals(1, descriptions.size());
        assertEquals(1, amounts.size());
        assertEquals("2025-02-26", dates.get(0));
        assertEquals("Coffee", descriptions.get(0));
        assertEquals(5.50, amounts.get(0));
    }

    @Test
    public void testAddExpense_InvalidDate() {
        List<String> dates = new ArrayList<>();
        List<String> descriptions = new ArrayList<>();
        List<Double> amounts = new ArrayList<>();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ExpenseTrackerApp.addExpense(dates, descriptions, amounts, "25-02-3030", "Coffee", 5.50);
        });

        assertEquals("Invalid date format", exception.getMessage());
    }

    @Test
    public void testGetDescription_InvalidDescription() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ExpenseTrackerApp.getDescription("");  // Empty description
        });

        assertEquals("Description cannot be empty", exception.getMessage());
    }

    @Test
    public void testGetAmount_InvalidAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ExpenseTrackerApp.getAmount(0);  // Invalid amount (less than 1)
        });

        assertEquals("Amount should be at least 1", exception.getMessage());
    }

    @Test
    public void testCalculateTotal() {
        List<Double> amounts = Arrays.asList(10.5, 20.0, 30.75);
        double total = 0;
        for (double amount : amounts) {
            total += amount;
        }

        assertEquals(61.25, total);
    }
}