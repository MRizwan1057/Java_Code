

import java.security.SecureRandom;

public class Craps
{
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	// enum type with constants that represnt the game status.
	private enum Status { Continue, Won, Lost};
	//constants that represnt common rolls of the dice.
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	

	
	//PLAYS ONE GAME OF CRAPS.
	public static void main(String[] args)
	{
		int playerwon1stTime = 0;
		int casinowon1stTime = 0;
		int playerWon = 0;
		int casinoWon = 0;
		int amountPlayerWon = 0;;
		int amountCasinoWon = 0;
		
		
		for(int roll = 1; roll < 6; roll++)
		{
		
		int myPoint = 0;
		Status gameStatus;
		
		int sumOfDice = rollDice();//first roll of dice.
		
		
		//determine gameStatus and point based on first roll.
		switch (sumOfDice)
		{
			case SEVEN: // win with 7 on first roll 
			case YO_LEVEN: // win with 11 on first roll
				gameStatus = Status.Won;
				playerwon1stTime++;
				amountPlayerWon += 100;
				
			case SNAKE_EYES: // lose with 2 on first roll
			case TREY: // lose with 3 on first roll 
			case BOX_CARS: // lose with 12 on first roll 
				gameStatus = Status.Lost;
				casinowon1stTime++;
				amountCasinoWon += 100;
				
			default: // did not win or lose, so remember point
				gameStatus = Status.Continue; // game is not over
				myPoint = sumOfDice; // remember the point
				//System.out.printf("Point is %d%n", myPoint);
				break;
		}
		
		while (gameStatus == Status.Continue)
		{
			sumOfDice = rollDice();//roll dice again.
			
			// determine game status.
			if(sumOfDice == myPoint)
			{
				gameStatus = Status.Won;
				playerWon++;
				amountPlayerWon += 100;
			}	
		
			if(sumOfDice == SEVEN)
				{
					gameStatus = Status.Lost;
					casinoWon++;
					amountCasinoWon += 100;
				}
				
		//display won or lost.
		
		//if(gameStatus == Status.Won)
			//System.out.println("Player Wins");
		//else
			//System.out.println("Player Loses");
		
		
		
		
		
		}
	}
		//int totalPlayerwon = playerWon + playerwon1stTime;
		//int totalCasionWon = casinoWon + casinowon1stTime;
		
		System.out.printf("%nSummary: %n");
		System.out.printf("Player wins with First strike:%d%n",playerwon1stTime);
		System.out.printf("Player wins with point:%d%n%n",playerWon);
		System.out.printf("Casino wins with First strike:%d%n",casinowon1stTime);
		System.out.printf("Casino wins with SEVEN:%d%n%n",casinoWon);
		
		//Totals
	//	System.out.printf("Totals Player wins total:%d%n",totalPlayerwon);
		//System.out.printf("Casino wins total:%d%n",totalCasionWon);
		
		System.out.printf("Total amount won by player :%d%n", amountPlayerWon);
		System.out.printf("Total amount won by casino :%d%n", amountCasinoWon);
	}
	// roll dice , calculate sum and display results.
	public static int rollDice()
	{
			
		// pick random dice values.
		
		
			int die1 = 1 + randomNumbers.nextInt(6);//first die roll.
			int die2 = 1 + randomNumbers.nextInt(6); // second die roll.
		
			int sum = die1 + die2;	
							
		// display results of this roll.
		//System.out.printf("player rolled %d + %d = %d %n", die1, die2, sum);
		return sum;
	}

}
