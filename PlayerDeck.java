
import java.util.ArrayList;

public class PlayerDeck extends Deck
{
	private final int INITIAL_DECK_SIZE = 26;
	private ArrayList<Card> playerDeck = new ArrayList<Card>();
	public int cardCount;

	public PlayerDeck(Deck mainDeck)
	{
		for (int i = 0; i <= INITIAL_DECK_SIZE; i++)
		{
			Card card = mainDeck.dealCard();
			playerDeck.add(card);
			cardCount++;
		}
	}

	public void addCard(Card card)
	{
		playerDeck.add(card);
	}

	public void removeCard(Card card)
	{
		playerDeck.remove(card);
	}
}