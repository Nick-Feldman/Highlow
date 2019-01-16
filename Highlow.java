
import java.util.Scanner;
import java.util.Random;


public class Highlow {

	private static int num1, num2;
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
		
		num1 = -100;
		num2 = 1000;
		
		char again;
		do {
		
		
		int theNumber = randomnum(num1, num2);
		
		
		//Intro to user and prompt for fist guess
		System.out.println("We are going to play a game, a diabolical horrible game...");
		Thread.sleep(5000);
		System.out.println("You must pick a number between " + num1 + " and " + num2+ "...");
		Thread.sleep(5000);
		System.out.println("If you guess correctly all will be well but if you fail, the whole universe will collapse...");
		Thread.sleep(5000);
		
		int guess = 0, numOfGuess = 0;
		String guessText = "";
		String numText = "";
		
		//here is a loop to check the guessed number against the actual number
		do {
		System.out.println("Please enter your guess now: ");
		guessText = input.next();
		try {
			
		guess = Integer.parseInt(guessText);
		
		numOfGuess++;
		if (guess == theNumber) System.out.println("You guessed the correct number");
		
		else if (guess > theNumber) System.out.println("Too high, try again before it's too late!!!!!!");
		
		else if (guess < theNumber) System.out.println("Too low, come on... we are counting on you!!!!");
		}catch (Exception e) {
			System.out.println("Invalid entry, please enter an integer within range.");
		}
		
		Thread.sleep(5000);
		
		}while (guess != theNumber);
		
		System.out.println("Congratulations, you guessed the correct number in " + numOfGuess + " tries!");
		Thread.sleep(5000);
		System.out.println("The universe would have collapsed if you had not guessed within " + (numOfGuess + 2) + " tries!!");
		Thread.sleep(5000);
		System.out.println("Would you care to play another game?Please enter (Y)es or (N)o");
		again = input.next().charAt(0);
		
		if (again == 'y' || again == 'Y') {
			System.out.println("Now you may change the range of numbers...");
			Thread.sleep(5000);
		//A do loop using try to attempt to get valid integer numbers and check that a valid range is entered 
			do {
				num1 = 0;								// set default value of zero for both lower and higher bounds
				num2 = 0;
				System.out.println("Please enter a lower range integer number: ");
				numText = input.next();
				try {
					num1 = Integer.parseInt(numText);							
																// checks that first user entry is a valid integer
				}catch(Exception e) {
					System.out.println("Invalid entry! Default value zero will be used.");
				}
				
				System.out.println("Now please enter a upper range integer number");
				numText = input.next();
				try {
					num2 = Integer.parseInt(numText);				//checks second user entry is a valid integer
				}catch( Exception e) {
					System.out.println("Invalid entry! Default value zero will be used.");
				}
				if(num1 >= num2) {									//checks that range is valid (lower number first than higher)
					System.out.println("Invalid combination, lower bound must be lower than higher bound!!!");
				}
			}while(num1 >= num2);			
		}
		
		}while(again == 'y' || again == 'Y');
		
	}
	
	
}
