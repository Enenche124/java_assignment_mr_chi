import java.text.*;
import java.util.*;

public class ExpenseTrackerApp {

    static String dateForm = "yyyy-MM-dd";

    public static String displayMenu() {
        return "\n \n 1. Add an expense \n 2. View all expenses \n 3. Calculate total expense \n 4. Exit";
    }

    public static int getUserChoice(int choice) {
        if (choice < 1 || choice > 4) {
            throw new IllegalArgumentException("Invalid choice");
        }
        return choice;
    }

    public static boolean isValidDate(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(dateForm);
            dateFormat.setLenient(false);
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static String getDescription(String description) {
        if (description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description cannot be empty");
        }
        return description;
    }

    public static double getAmount(double amount) {
        if (amount < 1) {
            throw new IllegalArgumentException("Amount should be at least 1");
        }
        return amount;
    }

    public static void viewExpenses(List<String> dates, List<String> descriptions, List<Double> amounts) {
        int total = 0;
        StringBuilder expenses = new StringBuilder("Expenses: \n");
        for (int i = 0; i < dates.size(); i++) {
            expenses.append(String.format(" %d. Date: %s, Description: %s, Amount: %.2f\n", i + 1, dates.get(i), descriptions.get(i), amounts.get(i)));
            total += amounts.get(i);
        }
        System.out.println(expenses);
    }

    public static void calculateTotal(List<Double> amounts) {
        double total = 0;
        for (double amount : amounts) {
            total += amount;
        }
        System.out.println("Total Expenses: " + total);
    }

    // Testable version of main logic
    public static void addExpense(List<String> dates, List<String> descriptions, List<Double> amounts, String date, String description, double amount) {
        if (isValidDate(date)) {
            dates.add(date);
        } else {
            throw new IllegalArgumentException("Invalid date format");
        }
        descriptions.add(getDescription(description));
        amounts.add(getAmount(amount));
    }

    public static void main(String[] args) {
        List<String> dates = new ArrayList<>();
        List<String> descriptions = new ArrayList<>();
        List<Double> amounts = new ArrayList<>();

        Scanner receiver = new Scanner(System.in);

        System.out.println("Welcome to Semicolon Expense Tracker App");
        System.out.println("=========================================");

        while (true) {
            System.out.println(displayMenu());
            int choice = getUserChoice(receiver.nextInt());

            switch (choice) {
                case 1:
                    receiver.nextLine();  // Consume the newline left by nextInt()
                    System.out.print("Enter the date (YYYY-MM-DD): ");
                    String date = receiver.nextLine();
                    System.out.print("Enter the description: ");
                    String description = receiver.nextLine();
                    System.out.print("Enter the amount: ");
                    int amount = receiver.nextInt();
                    addExpense(dates, descriptions, amounts, date, description, amount);
                    break;
                case 2:
                    viewExpenses(dates, descriptions, amounts);
                    break;
                case 3:
                    calculateTotal(amounts);
                    break;
                case 4:
                    System.out.println("Exiting the app. Goodbye!");
                    receiver.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}