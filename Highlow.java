
import java.util.Scanner;
import java.util.Random;


public class Highlow {

	
	//generates the random number using java.util.Random integer generater
	static int randomnum(int low, int high) {
		Random rn = new Random();
	    //two lines are used to ensure the integer is generated in proper range
		int rand = rn.nextInt(high - low);
		rand += low;
		return rand;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
//declare a scanner for input called input and generate the random number to be guessed using randomnum()

		Scanner input = new Scanner(System.in);
		
		char again;
		do {
			
		
		int theNumber = randomnum(-100, 1000);
		
		System.out.println(theNumber);
		
		//Intro to user and prompt for fist guess
		System.out.println("We are going to play a game, a diabolical horrible game...");
		Thread.sleep(5000);
		System.out.println("You must pick a number between -100 and 1000...");
		Thread.sleep(5000);
		System.out.println("If you guess correctly all will be well but if you fail, the whole universe will collapse...");
		Thread.sleep(5000);
		
		int guess, numOfGuess = 0;
		
		//here is a loop to check the guessed number against the actual number
		do {
		System.out.println("Please enter your guess now: ");
		guess = input.nextInt();
		numOfGuess++;
		if (guess == theNumber) System.out.println("You guessed the correct number");
		
		else if (guess > theNumber) System.out.println("Too high, try again before it's too late!!!!!!");
		
		else if (guess < theNumber) System.out.println("Too low, come on... we are counting on you!!!!");
		
		Thread.sleep(5000);
		
		}while (guess != theNumber);
		
		System.out.println("Congratulations, you guessed the correct number in " + numOfGuess + " tries!");
		Thread.sleep(5000);
		System.out.println("The universe would have collapsed if you had not guessed within " + (numOfGuess + 2) + " tries!!");
		Thread.sleep(5000);
		System.out.println("Would you care to play another game?");
		again = input.next().charAt(0);
		
		}while(again == 'y' || again == 'Y');
		
	}
	
	
}
