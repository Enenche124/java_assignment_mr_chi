import java.util.*;

public class Ternary{
	public static void main(String[] args){
		Scanner value = new Scanner(System.in);
		
		System.out.println("How many student do you have?");
		int numOfStudent = value.nextInt();
		
		System.out.println("How many subject do they offer?");
		int numOfSubject = value.nextInt();
		
		int[][] scores = new int[numOfStudent][numOfSubject];
		
		
		
		for(int i = 0; i < numOfStudent; i++){
			System.out.println("Entering score for students " + (i + 1)+":");
			for(int k = 0; k < numOfSubject; k++){
				System.out.println("Enter score for subject " + (k + 1)+ ":");
				scores[i][k] = value.nextInt();
				
			}
			
		}
		
		int[] total = new int[numOfStudent]; 
		double[] average = new double[numOfStudent]; 
		for(int i = 0; i < numOfStudent; i++){
			for(int k = 0; k < numOfSubject; k++){
				total[i] += scores[i][k];
				
			}
			average[i] = (double)total[i] / numOfSubject;
		}
		
		int[] positioned = new int[numOfStudent];
		for(int pos = 0; pos < numOfStudent; pos++){
			int position = 1;
			for(int posi = 0; posi < numOfStudent; posi++){
				if(average[pos] < average[posi]){
					position++;
				}
			}
			positioned[pos] = position;
		}
		
		
		
		System.out.println("=========================================================================");
		System.out.printf("%-10s","STUDENT ");
		for(int i = 1; i <= numOfSubject; i++){
			System.out.printf("%-10s", "SUB" + i );
		}
		System.out.printf("%-10s %-10s %-10s\n", "TOT", "AVE", "POS");
	    System.out.println("=========================================================================");

     for(int i = 0; i < numOfStudent; i++){
		 System.out.printf("%-10s", "Student" + (i + 1));
	 
		for(int k = 0; k < numOfSubject; k++){
		System.out.printf("%-10d %s", scores[i][k]);

		}
		System.out.printf("%-10d %-10.2f %-10d\n", total[i], average[i], positioned[i]);
	 }
	}
	
	
	 
}