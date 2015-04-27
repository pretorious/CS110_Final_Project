/*
	Preston Libby
	CS 110
	Assignment 10
*/

public class Card
{
	//constants
	final public int SPADES = 1;
	final public int CLUBS = 2;
	final public int HEARTS = 3;
	final public int DIAMONDS = 4;
	final public int ACE = 5;
	final public int KING = 6;
	final public int QUEEN = 7;
	final public int JACK = 8;
	private int rank;
	private int suit;
	//constructor
	public Card(int suit, int rank)
	{
		this.suit = suit;
		this.rank = rank;
	}
	//flip method

	//get suit
	public int getSuit()
	{
		return suit;
	}
	//get rank
	public int getRank()
	{
		return rank;
	}
	public boolean equals(Card card, Card otherCard)
	{
		if (card.getRank() == otherCard.getRank() && card.getSuit() == otherCard.getSuit())
			return true;
		else
			return false;
	}
	//to string method
	public String toString()
	{
		String str = "This is a " + rank + " of " + suit;
	}
}