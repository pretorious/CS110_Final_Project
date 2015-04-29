/*
	Preston Libby
	CS 110
	Assignment 10
*/

public class Card
{
	//constants
	final public static int SPADES = 1;
	final public static int CLUBS = 2;
	final public static int HEARTS = 3;
	final public static int DIAMONDS = 4;
	final public static int JACK = 11;
	final public static int QUEEN = 12;
	final public static int KING = 13;
	final public static int ACE = 14;
	private int rank;
	private int suit;
	//constructor
	public Card(int rank, int suit)
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
	public boolean equals(Card otherCard)
	{
		if (this.getRank() == otherCard.getRank())
			return true;
		else
			return false;
	}
	//to string method
	public String toString()
	{
		String str = "This is a " + rank + " of " + suit;
		return str;
	}
}