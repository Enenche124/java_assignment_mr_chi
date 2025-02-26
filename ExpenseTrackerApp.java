import java.text.*;
import java.util.*;

public class ExpenseTrackerApp {

   
    static String dateForm = "yyyy-MM-dd";

    public static String displayMenu() {
        return "\n \n 1. Add an expense \n 2. View all expenses \n 3. Calculate total expense \n 4. Exit";
    }

    public static int getUserChoice(Scanner receiver) {
        while (true) {
            try {
                System.out.print("Enter your choice between 1 to 4: ");
                int choice = Integer.parseInt(receiver.nextLine());
                if (choice < 1 || choice > 4) {
                    throw new NumberFormatException();
                }
                return choice;
            } catch (NumberFormatException e) {
                System.out.println("\n Invalid input");
            }
        }
    }

    public static void getDate(List<String> dates, Scanner receiver) {
        while (true) {
            try {
                System.out.print("Enter the date (YYYY-MM-DD): ");
                String date = receiver.nextLine();
                
                SimpleDateFormat dateFormat = new SimpleDateFormat(dateForm);
                dateFormat.setLenient(false); 
                dateFormat.parse(date); 
                dates.add(date);
                break;
            } catch (ParseException e) {
                System.out.println("Invalid date format, Kindly enter date (YYYY-MM-DD): ");
            }
        }
    }

    public static String getDescription(List<String> descriptions, Scanner receiver) {
        while (true) {
            System.out.print("Enter the description: ");
            String description = receiver.nextLine();
            if (!description.trim().isEmpty()) {
                descriptions.add(description);
                return description;
            } else {
                System.out.println("Invalid description, Kindly enter description");
            }
        }
    }

    public static int getAmount(List<Integer> amounts, Scanner receiver) {
        while (true) {
            try {
                System.out.print("Enter the amount: ");
                int amount = Integer.parseInt(receiver.nextLine());
                if (amount >= 1) {
                    amounts.add(amount);
                    return amount;
                } else {
                    System.out.println("Amount should be at least 1");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid amount");
            }
        }
    }

    public static void viewExpenses(List<String> dates, List<String> descriptions, List<Integer> amounts) {
        int total = 0;
        StringBuilder expenses = new StringBuilder("Expenses: \n");
        for (int i = 0; i < dates.size(); i++) {
            expenses.append(String.format(" %d. Date: %s, Description: %s, Amount: %d\n", i + 1, dates.get(i), descriptions.get(i), amounts.get(i)));
            total += amounts.get(i);
        }
        System.out.println(expenses);
        
    }

    public static void calculateTotal(List<Integer> amounts) {
        int total = 0;
        for (int amount : amounts) {
            total += amount;
        }
        System.out.println("Total Expenses: " + total);
    }

    public static void main(String[] args) {
        List<String> dates = new ArrayList<>();
        List<String> descriptions = new ArrayList<>();
        List<Integer> amounts = new ArrayList<>();

        Scanner receiver = new Scanner(System.in);
        int total = 0;

        System.out.println("Welcome to Semicolon Expense Tracker App");
        System.out.println("=========================================");

        while (true) {
            System.out.println(displayMenu());
            int choice = getUserChoice(receiver);

            switch (choice) {
                case 1:
                    getDate(dates, receiver);
                    getDescription(descriptions, receiver);
                    getAmount(amounts, receiver);
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