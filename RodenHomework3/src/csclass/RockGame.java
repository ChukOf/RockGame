package csclass;

import java.util.Scanner;

public class RockGame {

	public static void main(String[] args) {
		int computerChoice, userChoice, numWins=0, numLoss=0, numTies=0;
		String playAgain;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Choose (0 = Rock, 1 = Paper, 2 = Scissors): ");
			userChoice = input.nextInt();
			
			//user choice based on number input
			switch (userChoice) {
			case 0: System.out.println("You chose Rock!");
			break;
			case 1: System.out.println("You chose Paper!");
			break;
			case 2: System.out.println("You chose Scissors!");
			break;
			}
			
			//Computer choice of object
			computerChoice = (int) (Math.random() * 3);
			
			switch (computerChoice) {
			case 0: System.out.println("Computer chose Rock!");
			break;
			case 1: System.out.println("Computer chose Paper!");
			break;
			case 2: System.out.println("Computer chose Scissors!");
			break;
			}
			
			//both rock
			if(computerChoice ==0 && userChoice ==0) {
				System.out.println("It was a tie!");
				numTies++;
			}
			
			//both paper
			else if(computerChoice ==1 && userChoice ==1) {
				System.out.println("It was a tie!");
				numTies++;
			}
			
			//both scissors
			else if(computerChoice ==2 && userChoice ==2) {
				System.out.println("It was a tie!");
				numTies++;
			}
			
			//paper beats rock, user wins
			else if(computerChoice == 0 && userChoice == 1) {
				System.out.println("You win!");
				numWins++;
			}
			
			//scissors beats paper, user wins
			else if(computerChoice == 1 && userChoice == 2) {
				System.out.println("You win!");
				numWins++;
			}
			
			//rock beats scissors, user wins
			else if(computerChoice == 2 && userChoice == 0) {
				System.out.println("You win!");
				numWins++;
			}
			
			//paper beats rock, computer wins
			else if(computerChoice == 1 && userChoice == 0) {
				System.out.println("You lose!");
				numLoss++;
			}
			
			//scissors beats paper, computer wins
			else if(computerChoice == 2 && userChoice == 1) {
				System.out.println("You lose!");
				numLoss++;
			}
			
			//rock beats scissors, computer wins
			else if(computerChoice == 0 && userChoice == 2) {
				System.out.println("You lose!");
				numLoss++;
			}
			
			System.out.println("Would you like to play again? (Y/N): ");
			playAgain = input.next();
			System.out.println();
			
		}
		
		while(playAgain.substring(0,1).equalsIgnoreCase("y"));
		
		System.out.println("You won " + numWins + " times.");
		System.out.println("You lost " + numLoss + " times.");
		System.out.println("You tied " + numTies + " times.");

	}

}
