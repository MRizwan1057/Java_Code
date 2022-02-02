// card = tash
public class Card
{
	private final String face; // face of card
	private final String suit; // color fo card
	
	//contructor initialazing card's face and suit
	public Card(String cardFace, String cardSuit)
	{
		this.face = cardFace;
		this.suit = cardSuit;
	}
	
	//return string representation of card
	public String toString()
	{
		return face + " " + "of" + " " + suit;	
	}	
		
}