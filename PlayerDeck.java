/*
	Preston Libby
	CS 110
	Assignment 10
*/

public class PlayerDeck extends Deck
{
	final public CARDS_IN_PLAYER_DECK = 26;
	private Card[] deck;
	private int cardCount;
	

	public PlayerDeck()
	{
		cutDeck();
		
	}

	
	public void cutDeck(Deck fullDeck)
	{
		for (int i = 0; i <= CARDS_IN_PLAYER_DECK; i++)
		{
			Card card = fullDeck.dealCard();
			deck[i] = card;
			cardCount++;
		}
	}


}