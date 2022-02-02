import java.security.SecureRandom;

public class Ludo
{
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status {CONTINUE, WON, LOST};
	
	//constants that represent common rolls of the dice 
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	 		
	public static void main(String[]args)
	{
		int playerWin1stStroke = 0;
		int casinoWin1stStroke = 0;
		int playerWin = 0;
		int casinoWin = 0;
		int totalPlayerWin = 0; 
		int totalCasionWin = 0; 
		int playerAmountwon = 0;
		int casinoAmountWon = 0;
		
		//tally counts for 6000000 rolls 
		for(int roll = 1; roll <= 1000; roll++)
		{
			int myPoint = 0;
			Status gameStatus;
		
			int sumOfDice = rollDice();
		switch (sumOfDice)
		{
			case SEVEN:
			case YO_LEVEN:
				gameStatus = Status.WON;
				playerWin1stStroke += 1;
				break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				casinoWin1stStroke += 1;
				break;
			default:
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice;
				//System.out.printf("Point is %d%n",myPoint);
				break;
		}
		
		//while game is not complete
		while (gameStatus == Status.CONTINUE)//not WON or LOST
		{
			sumOfDice = rollDice();//roll dice again
			
			if(sumOfDice == myPoint)
			{
				gameStatus = Status.WON;
				playerWin += 1;
				
			}else
			{
				
				if(sumOfDice == SEVEN)
				{
					gameStatus = Status.LOST;
					casinoWin += 1;
				}
			}
		}
		// if (gameStatus == Status.WON)
		//	 System.out.printf("Player wins%n%n");
		// else
		//	 System.out.printf("Player loses%n%n");
		
		 totalPlayerWin = playerWin + playerWin1stStroke;
		 totalCasionWin = casinoWin + casinoWin1stStroke;
		 playerAmountwon = 100 * totalPlayerWin;
		 casinoAmountWon = 100 * totalCasionWin;
		
		
		
		//Totals
		//System.out.printf("Totals...%nPlayer wins total:%d%n",totalPlayerWin);
		//System.out.printf("Casino wins total:%d%n",totalCasionWin);
		
		
		
	}	
		System.out.printf("%n Game Results... :%n");
		System.out.printf(" Player wins on 1st roll : %d%n Player wins with point : %d%n%n Casino wins on 1st roll : %d%n Casino wins with SEVEN : %d%n%n", playerWin1stStroke, playerWin, casinoWin1stStroke, casinoWin);
	
		System.out.printf(" Amoount... : %n");
		System.out.printf(" amount won by player:%d%n%n amount won by casino:%d%n%n ",playerAmountwon, casinoAmountWon);
	
		
	
	}
	public static int rollDice()
	{
		// pick random die values

		int die1 = 1 + randomNumbers.nextInt(6);//first roll die
		int die2 = 1 + randomNumbers.nextInt(6);//second roll die1
		
		int sum = die1 + die2;
		
		//display results of this roll
		// System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
	
		return sum;
	}
}//end class Craps