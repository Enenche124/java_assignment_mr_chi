import java.util.Scanner;
import java.util.*;

public class StudentGrade{

   public static void main(String[] args){
	   
	   Scanner receiver = new Scanner (System.in);
	   
	    int scors;
		int colum = 0;
		int row = 0;
		int i = 0;
		double total = 0;
		int j = 0;
		int teddy;
		
		
	   System.out.print("Enter number of students: ");
	   int numberOfStudent = receiver.nextInt();
	   System.out.print("Enter number of subjects: ");
	   int numberOfSubject = receiver.nextInt();
	   System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>");
	   System.out.println("Saved successfully");
	   
	   
	   int[][] students = new int[numberOfStudent][numberOfSubject];
	   
	   
	   for( row = 0; row < students.length; row++){
		 System.out.println("Entering score for student " + (row +1 ));
		 for( colum = 0; colum < students[row].length; colum++){
		 
			   System.out.println("Enter score for subject " + (colum + 1));
			    students[row][colum] = receiver.nextInt();
				System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Saved successfully");
				
				

		 }        
		        
				
	   }       
         




        		 System.out.println("=====================================================");
	            System.out.print("STUDENT    ");
				for(int k = 0; k < numberOfSubject; k++){
					System.out.printf("   SUB%d   ", k + 1);
				}
				System.out.print(" TOTAL     AVERAGE      POSITION\n");
				System.out.println("=====================================================");
				
                for( i = 0; i < students.length; i++){
					System.out.printf("Student %d     ", (i + 1));
					
					
					for (j = 0; j < students[0].length; j++){
						
					System.out.printf("%-10d%.2f", students[i][j], total);
					
					
					 
				}
				
				System.out.println();	
				
			}
			
	            System.out.println("=====================================================");
				
				System.out.println("=====================================================");
	  
	   
   }

}