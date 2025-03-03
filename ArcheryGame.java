import java.security.SecureRandom;
import java.util.*;
public class ArcheryGame{

    public static void main(String[] args){
		Scanner receiver = new Scanner(System.in);
		
		int maximum = Integer.MIN_VALUE;
	    SecureRandom getRandomNumbers = new SecureRandom();
	
	
	int numberOfPlayers = 4;
	int numberOfChances = 3;
	
	
	int[][] recorder = new int[numberOfPlayers][numberOfChances];
	int[] total = new int[numberOfPlayers];
	
	
	int index = 0;
	for(int counter = 0; counter < numberOfPlayers; counter++){		
		for(int colum = 0; colum < numberOfChances; colum++){
	int randomNumber = 0 + getRandomNumbers.nextInt(10);
    	recorder[counter][colum] = randomNumber;
	total[counter] += recorder[counter][colum];
	if(total[counter] > maximum){
		maximum = total[counter];
		index = counter;
	}
		}
		}
		
		
		System.out.printf("%-10s", " ");
		for(int row = 1; row < numberOfPlayers; row++){
			System.out.printf("%-10s", "Score"+row);
		}
		System.out.printf("%-10s%n", "TOTAL");
		
		for(int row = 0; row < numberOfPlayers; row++){
			System.out.printf("%-10s ", "Player " + (row + 1));
			for(int colum = 0; colum < numberOfChances; colum++){
				System.out.printf("%-10d", recorder[row][colum]);
				
			}
			System.out.printf("%-10d %n", total[row]);
		}
	System.out.println("Player " + (index + 1) +" wins the game, with the highest score of " + maximum);

	}

}