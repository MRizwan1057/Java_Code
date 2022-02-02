

import java.security.SecureRandom;
public class DeckOfCards
{
	private Card[] deck ; // array of Card objects
	private int currentCard; // index of next Card to dealt (0-51)
	private static final int NUMBER_OF_CARDS = 52 ;
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	// construction fills deck of cards,
	public DeckOfCards()
	{
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0; // first card dealt will be deck[0]
		//populate deck with Card objects.
		for(int count = 0; count < deck.length; count++)
		{
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
		}
	}	
		// Shuffle deck of cards 
		public void shuffle()
		{
			// next call to method dealCard should start at deck[0] again.
			currentCard = 0;
			//for each card , pick another random Card 0-51 and swap them.
			for(int first = 0; first < deck.length; first++)
			{
				int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
				
				//swap current card with randomly selectd card.
				Card temp = deck[first];
				deck[first] = deck[second];
				deck[second] = temp;
			}
		}
		
		public Card dealCard()
		{
			if(currentCard < deck.length)
				return deck[currentCard++];
			else
				return null;
		}
		
}
