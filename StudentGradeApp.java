import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * This class is a student grade application. It allows a teacher to input student names and scores for multiple subjects,
 * then it calculates the total scores, averages, and ranks of the students. It also provides insights such as the hardest 
 * and easiest subjects, the highest and lowest scores, and displays the class summary.
 */
public class StudentGradeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner to read input from the console.
        int numStudents; // Variable to store the number of students
        int numSubjects; // Variable to store the number of subjects

        // Asking teacher for the number of students
        System.out.print("Teacher, please enter the number of students in the class: ");
        numStudents = scanner.nextInt();  // Read the number of students

        // Asking teacher for the number of subjects
        System.out.print("Teacher, please enter the number of subjects for this class: ");
        numSubjects = scanner.nextInt();  // Read the number of subjects

        // 2D array to store student scores and array for storing student names
        int[][] studentScores = new int[numStudents][numSubjects];  // Stores scores for each student in each subject
        String[] studentNames = new String[numStudents];  // Stores names of the students

        // Loop to input student names and their subject scores
        for (int student = 0; student < numStudents; student++) {
            scanner.nextLine();  // Consume newline character after nextInt()

            // Asking for student name with validation
            String studentName;
            do {
                System.out.print("Enter name for Student " + (student + 1) + " (Format: Firstname Lastname): ");
                studentName = scanner.nextLine();  // Read the student's name

                // Validate the name format to ensure it contains only letters and spaces
                if (!Pattern.matches("^[A-Za-z]+(?: [A-Za-z]+)*$", studentName)) {
                    System.out.println("Error: Invalid name format. Please enter a valid name.");
                }
            } while (!Pattern.matches("^[A-Za-z]+(?: [A-Za-z]+)*$", studentName));

            studentNames[student] = studentName;  // Store the student's name

            // Asking for the subject scores for each student
            System.out.println("Enter the scores for " + studentName + ":");
            for (int subject = 0; subject < numSubjects; subject++) {
                int score;
                do {
                    System.out.print(" Score for Subject " + (subject + 1) + ": ");
                    score = scanner.nextInt();  // Read the score for the subject

                    // Validation: score must be between 0 and 100
                    if (score < 0 || score > 100) {
                        System.out.println("Error: Score must be between 0 and 100. Please try again.");
                    }
                } while (score < 0 || score > 100);
                studentScores[student][subject] = score;  // Store the score in the array
            }
        }

        // Arrays to store total scores, averages, and subject averages
        int[] totalScores = new int[numStudents];  // Store total scores for each student
        int[] averages = new int[numStudents];  // Store average scores for each student
        int[] subjectAverages = new int[numSubjects];  // Store average scores for each subject
        int classTotal = 0;  // Total score for the class

        // Calculate total and average scores for each student, and subject averages
        for (int student = 0; student < numStudents; student++) {
            int studentTotal = 0;  // Initialize total score for the student
            for (int subject = 0; subject < numSubjects; subject++) {
                studentTotal += studentScores[student][subject];  // Sum up the scores for each subject
            }
            totalScores[student] = studentTotal;  // Store the total score for the student
            averages[student] = studentTotal / numSubjects;  // Calculate and store the average score
            classTotal += studentTotal;  // Add to the class total

            // Calculate subject averages by summing scores across all students for each subject
            for (int subject = 0; subject < numSubjects; subject++) {
                subjectAverages[subject] += studentScores[student][subject];
            }
        }

        // Calculate overall class average (total score of all students divided by total number of subjects)
        double classAverage = (double) classTotal / (numStudents * numSubjects);

        // Variables to track hardest and easiest subjects, as well as the highest and lowest scores
        int hardestSubject = 0;
        int easiestSubject = 0;
        int highestScore = 0;
        int lowestScore = 100;
        String highestStudent = "";
        String lowestStudent = "";
        int highestSubject = 0;
        int lowestSubject = 0;

        // Loop to calculate hardest/easiest subject and highest/lowest scores
        for (int subject = 0; subject < numSubjects; subject++) {
            int failureCount = 0;  // Counter for number of students failing the subject
            int passCount = 0;  // Counter for number of students passing the subject

            // Loop through each student's score in the subject
            for (int student = 0; student < numStudents; student++) {
                if (studentScores[student][subject] < 40) {
                    failureCount++;  // Count failures
                } else {
                    passCount++;  // Count passes
                }

                // Track the overall highest and lowest scores
                if (studentScores[student][subject] > highestScore) {
                    highestScore = studentScores[student][subject];
                    highestStudent = studentNames[student];
                    highestSubject = subject + 1;
                }
                if (studentScores[student][subject] < lowestScore) {
                    lowestScore = studentScores[student][subject];
                    lowestStudent = studentNames[student];
                    lowestSubject = subject + 1;
                }
            }

            // Determine hardest and easiest subjects based on failure rates
            if (failureCount > passCount) {
                hardestSubject = subject;  // This subject has the most failures
            } else {
                easiestSubject = subject;  // This subject has the least failures
            }
        }

        // Display the first output: Hardest/easiest subjects, highest/lowest scores
        System.out.println("###########################################################################");
        System.out.println("The hardest Subject is Sub" + (hardestSubject + 1) + ", having the highest rate of failures.");
        System.out.println("The easiest subject is Sub" + (easiestSubject + 1) + ", having the lowest rate of failures.");
        System.out.println("The Overall Highest score is scored by " + highestStudent + " in Subject" + highestSubject + " scoring " + highestScore + ".");
        System.out.println("The Overall Lowest score is scored by " + lowestStudent + " in Subject" + lowestSubject + " scoring " + lowestScore + ".");
        System.out.println("###########################################################################");

        // Display the class summary
        System.out.println("CLASS SUMMARY");
        System.out.println("###########################################################################");

        // Find best and worst graduating students based on total scores
        int bestStudentIndex = 0;
        int worstStudentIndex = 0;
        for (int student = 1; student < numStudents; student++) {
            if (totalScores[student] > totalScores[bestStudentIndex]) {
                bestStudentIndex = student;
            }
            if (totalScores[student] < totalScores[worstStudentIndex]) {
                worstStudentIndex = student;
            }
        }

        // Output the best and worst graduating students
        System.out.println("Best Graduating Student Is: " + studentNames[bestStudentIndex] + ", scoring the total of " + totalScores[bestStudentIndex] + ".");
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Lowest Graduating Student Is: " + studentNames[worstStudentIndex] + ", scoring the total of " + totalScores[worstStudentIndex] + ".");
        System.out.println("###########################################################################");
        System.out.println("The Class Total Score: " + classTotal);
        System.out.println("The Class Average Score: " + classAverage);
        System.out.println();

        // Display the second output: Class summary table
        System.out.println("==================================================================================");
        System.out.print("STUDENT  ");
        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("SUB%d   ", i + 1);  // Display subject names
        }
        System.out.print("TOTAL    AVERAGE     POSITION\n");
        System.out.println("==================================================================================");

        // Sorting students by their total scores in descending order
        for (int student = 0; student < numStudents; student++) {
            for (int i = student + 1; i < numStudents; i++) {
                if (totalScores[student] < totalScores[i]) {
                    // Swapping scores and names for sorting
                    int tempTotal = totalScores[student];
                    totalScores[student] = totalScores[i];
                    totalScores[i] = tempTotal;

                    int tempAverage = averages[student];
                    averages[student] = averages[i];
                    averages[i] = tempAverage;

                    String tempName = studentNames[student];
                    studentNames[student] = studentNames[i];
                    studentNames[i] = tempName;
                }
            }
        }

        // Display the student summary table
        for (int student = 0; student < numStudents; student++) {
            System.out.printf("%-10s", studentNames[student]);
            for (int subject = 0; subject < numSubjects; subject++) {
                System.out.printf("%-8d", studentScores[student][subject]);  // Display each student's scores
            }
            System.out.printf("%-8d %-10.2f %-8d\n", totalScores[student], (double) totalScores[student] / numSubjects, student + 1);
        }

        // Final message
        System.out.println("==================================================================================");
        System.out.println("Thank You For Choosing Student Grade App For Your School!");
        System.out.println("==================================================================================");
    }
}