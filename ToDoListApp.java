import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListApp {

    public static String displayMenu() {
        return "1. Add a task \n 2. View tasks \n 3. Mark task as complete \n 4. Delete a task \n 5. Exit";
    }

    public static void addTasks(List<String> tasks, Scanner scanner) {
        System.out.print("Enter the task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("\nTask added!\n");
    }

    public static void viewTasks(List<String> tasks, List<Integer> completeds) {
        for (int i = 0; i < tasks.size(); i++) {
            if (completeds.contains(i + 1)) {
                System.out.println("\n" + (i + 1) + ". [x] " + tasks.get(i) + "\n");
            } else {
                System.out.println("\n" + (i + 1) + ". [] " + tasks.get(i) + "\n");
            }
        }
    }

    public static void markCompletedTasks(List<Integer> completeds, Scanner scanner) {
        while (true) {
            try {
                System.out.print("Which task do you want to mark as completed task?: ");
                int completed = Integer.parseInt(scanner.nextLine());
                completeds.add(completed);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid, kindly enter a number");
            }
        }
    }

    public static void deleteTask(List<String> tasks, Scanner scanner) {
        System.out.print("Which task do you want to delete?: ");
        int delete = Integer.parseInt(scanner.nextLine());
        tasks.remove(delete - 1);
    }

    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        List<Integer> completeds = new ArrayList<>();
        List<Integer> deletes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nTo-Do list Manager\n");

        while (true) {
            String menu = displayMenu();
            System.out.println(menu);

            while (true) {
                try {
                    System.out.print("Enter your choice: ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    if (choice <= 0 || choice > 5) {
                        System.out.println("\nInvalid input, kindly enter the right input");
                    } else {
                        switch (choice) {
                            case 1:
                                addTasks(tasks, scanner);
                                break;
                            case 2:
                                viewTasks(tasks, completeds);
                                break;
                            case 3:
                                markCompletedTasks(completeds, scanner);
                                break;
                            case 4:
                                deleteTask(tasks, scanner);
                                break;
                            case 5:
                                System.out.println("Exiting the app. Goodbye!🙋‍♂️");
                                return; 
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, please enter a number.");
                }
            }
        }
    }
}