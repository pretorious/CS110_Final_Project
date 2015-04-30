/*
	Preston Libby
	CS 110
	Assignment 10
*/

import java.util.ArrayList;

public class War
{
	private final int NUM_WAR_DRAWS = 2;	//number of cards each player draws in event of a war
	public static String winner = "none";

	/**
	Constructor
	Default constructor initializes players, main deck, and player decks.
	*/
	public War()
	{
		//create two players
		Player player1 = new Player("Player1");
		Player player2 = new Player("Player2");
		//create main deck
		Deck mainDeck = new Deck();
		//shuffle deck
		mainDeck.shuffle();
		//deal half to each player
		PlayerDeck p1Deck = new PlayerDeck(mainDeck);
		PlayerDeck p2Deck = new PlayerDeck(mainDeck);
		//reshuffle each player's half
		p1Deck.shuffle();
		p2Deck.shuffle();
		//create won cards piles for each player
		WonCardsPile p1Pile = new WonCardsPile();
		WonCardsPile p2Pile = new WonCardsPile();
	}

	//check if either player runs out of cards
	/**
	@param player1
	@param player2
	@param p1Deck
	@param p2Deck
	checkWinner method checks both players for empty player decks. If either player
	has 0 cards, they lose. The other player is marked as winner.
	*/
	public String checkWinner(Player player1, Player player2, PlayerDeck p1Deck, PlayerDeck p2Deck)
	{
		if (p1Deck.cardCount == 0 || p2Deck.cardCount == 0)
		{
			// if so, game over and player with cards wins
			if (p1Deck.cardCount == 0)
			{
				War.winner = player1.getName();
			}

			else
			{
				War.winner = player2.getName();
			}
		}

		else
		{
			War.winner = "none";
		}

		return War.winner;
	}

	//if no loser
	/**
	
	*/
	public void playRound(PlayerDeck p1Deck, PlayerDeck p2Deck, WonCardsPile p1Pile, WonCardsPile p2Pile)
	{
	//deal cards and compare
	Card p1Card = p1Deck.dealCard();
	Card p2Card = p2Deck.dealCard();
		//higher card wins, winning player gets both cards
	if (p1Card.getRank() > p2Card.getRank())
	{
		p1Pile.addCard(p1Card);
		p1Pile.addCard(p2Card);
		//remove cards from player decks
		p1Deck.removeCard(p1Card);
		p2Deck.removeCard(p2Card);
	}

	else if (p1Card.getRank() < p2Card.getRank())
	{
		p2Deck.addCard(p1Card);
		p2Deck.addCard(p2Card);
		//revove cards from player decks
		p1Deck.removeCard(p1Card);
		p2Deck.removeCard(p2Card);
	}

	//if cards are equal, initiate war
	else
	{
		initiateWar(p1Pile, p2Pile, p1Deck, p2Deck);
	}
	
	}

	public void initiateWar(WonCardsPile p1Pile, WonCardsPile p2Pile, PlayerDeck p1Deck, PlayerDeck p2Deck)
	{
		//create piles to hold war cards during war resolution
		WonCardsPile p1WarPile = new WonCardsPile();
		WonCardsPile p2WarPile = new WonCardsPile();
		//create count variable to hold index of every 2rd card in event of multiple consecutive wars
		int battleCount = 2;
		//create accumulator for adding war cards to winner's pile
		int ct = 0;
		
		dealWar(p1Deck, p2Deck, p1WarPile, p2WarPile);

		//if still war, continue again and again until resolved
		while ( (p1WarPile.getCard(battleCount)).equals(p2WarPile.getCard(battleCount)) )
		{
			battleCount += 3;
			dealWar(p1Deck, p2Deck, p1WarPile, p2WarPile);
		}

		if ((p1WarPile.getCard(battleCount)).getRank() > (p2WarPile.getCard(battleCount)).getRank())
		{
			for (int i = 0; i <= p1WarPile.getSize(); i++)
			{
				Card cd = p1WarPile.getCard(ct);
				p1Pile.addCard(cd);
				cd = p2WarPile.getCard(ct);
				p1Pile.addCard(cd);
			}
		}

		else if ((p1WarPile.getCard(battleCount)).getRank() < (p2WarPile.getCard(battleCount)).getRank())
		{
			for (int i = 0; i <= p1WarPile.getSize(); i++)
			{
				Card cd = p1WarPile.getCard(ct);
				p2Pile.addCard(cd);
				cd = p2WarPile.getCard(ct);
				p2Pile.addCard(cd);
			}
		}
	}

	/**
	dealWar() method deals 2 cards to each player in event of war.
	*/
	public void dealWar(PlayerDeck p1Deck, PlayerDeck p2Deck, WonCardsPile p1WarPile, WonCardsPile p2WarPile)
	{
		Card p1WarCard;
		Card p2WarCard;
		for (int i = 0; i <= NUM_WAR_DRAWS; i++)
		{
			p1WarCard = p1Deck.dealCard();
			p1WarPile.addCard(p1WarCard);

			p2WarCard = p2Deck.dealCard();
			p2WarPile.addCard(p2WarCard);
		}
	}
		
	
}