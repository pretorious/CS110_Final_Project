import java.util.ArrayList;

public class WonCardsPile
{
	private int cardCount;
	private ArrayList<Card> wonCardsPile;

	public WonCardsPile()
	{
		cardCount = 0;
		wonCardsPile = new ArrayList<Card>();
	}

	public void addCard(Card card)
	{
		wonCardsPile.add(card);
	}

	public void emptyPile(PlayerDeck pDeck)
	{
		Card card;
		for (int i = 0; i <= wonCardsPile.size(); i++)
		{
			card = wonCardsPile.get(i);
			pDeck.addCard(card);
			wonCardsPile.remove(i);
		}
	}

	public Card getCard(int index)
	{
		return wonCardsPile.get(index);
	}

	public int getSize()
	{
		return wonCardsPile.size();
	}
}