/*
	Preston Libby
	CS 110
	Assignment 10
*/

public class Card
{
	//constants for ranks and suits
	final public static int SPADES = 1;
	final public static int CLUBS = 2;
	final public static int HEARTS = 3;
	final public static int DIAMONDS = 4;
	final public static int JACK = 11;
	final public static int QUEEN = 12;
	final public static int KING = 13;
	final public static int ACE = 1;
	private int rank;
	private int suit;
	
	/**
	Constructor
   @param rank
   @param suit  
   Creates a card object with rank and suit integer values. 
   */
	public Card(int rank, int suit)
	{
		this.suit = suit;
		this.rank = rank;
	}
	//flip method

	//get suit
	/**
	getSuit returns value of suit of card.
	*/
	public int getSuit()
	{
		return suit;
	}
	//get rank
	/**
	Get rank returns rank of card
	*/
	public int getRank()
	{
		return rank;
	}

	/**
	Equals overwrites equals method of Object class. Compares rank of two cards and returns boolean.
	*/
	public boolean equals(Card otherCard)
	{
		if (this.getRank() == otherCard.getRank())
			return true;
		else
			return false;
	}

	//to string method
	/**
	toString overwrites toString method of Object class. Displays rank and suit of card in string form.
	*/
	public String toString()
	{
		String str = "This is a " + rank + " of " + suit;
		return str;
	}
}