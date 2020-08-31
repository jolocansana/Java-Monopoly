package model;

import java.util.ArrayList;
import java.util.Random;

public class ChanceDeck
{
    /**
     * An integer index used to indentify what CHANCE description to access in the desired category.
     */
    private int localCategoryIndex; // Used to chanceIndex

    /**
     * An integer index used to identify what CHANCE category to access.
     */
    private int categoryIndex; // Used to be descriptionIndex

    /**
     * 	The integer representation of the number of chance cards there can be.
     */
    private int totalChances;

    /**
     * 	Contains all the descriptions of the available chance cards. It is arranged per category as specified in the MP Specifications.
     */
    private static final String[][] chanceDescription =
            {	    //Jail out
                    {
                            "Get out of jail free."
                    },
                    //proceed to property/utility/railroad
                    {
                            "Proceed to %s, do not collect money when passed START. You may buy the property if unowned, pay rent, or propose trade.",
                            "Go to nearest utility. If unowned, you may buy from the bank; otherwise throw dice and pay owner 10 times the value of the dice.",
                            "Go to nearest railroad. If unowned, you many buy from the bank; otherwise pay rent."
                    },
                    //Bank rewards
                    {
                            "Congratulations! Bank pays dividend of $50.",
                            "Tax refund. Collect $100 from the bank.",
                            "Advance to START, collect $200.",
                            "It's your birthday! Collect $300 gift money.",
                            "You won the competition, collect $150 prize money."
                    },
                    //go to jail & trip to property
                    {
                            "Go to jail. When passing START, do not collect $200.",
                            "Take a trip to %s, collect money when passing START",
                    },
                    //Rent
                    {
                            "Double rent. Appy this card to a property you own, and you can collect double rent from the next player who lands on it. If you do not own any property, discard this card.",
                            "Apply this card to a property you own. Renovation costs $25 per house, or $50 per hotel. From now on, rent is increased by 50%. If you do not own any property, discard this card.",
                            "Apply this card to a property you own. Dilapidated houses. From now on, rent is decreased by 10%. If you do not own any property, discard this card.",
                            "Apply this card to a utility or railroad you own. Increase charge by 10%. If you do not own any utility or railroad, discard this card.",
                            "Apply this card to a utility or railroad you own. Decrease charge by 10%. If you do not own any utility or railroad, discard this card."
                    },
                    //Tax (random amount)
                    {
                            "Donate money for community development",
                            "Pay taxes"
                    }
            };

    /**
     * 	An array of intergers specifying how many CHANCE cards will be generated per category as specified from the MP Specifications.
     */
    private static final int[] COUNT_LIMIT = {2, 6, 6, 4, 7, 3};

    private ArrayList<ChanceCard> chanceDeck;

    private ArrayList<ChanceCard> discardDeck;

    private ArrayList<Space> board;

    private Bank bank;

    /**
     * Initializes a Chance object (card)
     * @param totalChances Indicates how many chance cards there can be in the deck.
     */
    public ChanceDeck (int totalChances, ArrayList<Space> board, Bank bank)
    {
        this.totalChances = totalChances;
        this.board = board;
        this.bank = bank;
        chanceDeck = new ArrayList<>();
        discardDeck = new ArrayList<>();
        shuffleDeck();
    }


    /**
     * Draws a chance card on the deck. Once drawn, the number of possible cards are decremented by 1.
     * @return A string that stores the description of the chance card.
     */
    public void shuffleDeck ()
    {
        int categoryIndex;
        Random rand = new Random();

        for (categoryIndex = 0; categoryIndex < 6; categoryIndex++)
        {
            for (int i = 0; i < COUNT_LIMIT[categoryIndex]; i++)
            {
                int id = rand.nextInt(chanceDescription[categoryIndex].length);

                ChanceCard insert = new ChanceCard(chanceDescription[categoryIndex][id], categoryIndex, id, board, bank);
                chanceDeck.add(insert);
            }
        }
    }


    /**
     * Sets the discardDeck to chanceDeck and clears discardDeck
     */
    public void reshuffleDeck ()
    {
        chanceDeck = discardDeck;

        int i = 0;

        while(!(discardDeck.isEmpty()))
        {
            discardDeck.remove(i);
            i++;
        }
    }

    /**
     * Checks if chanceDeck is empty
     * @return Boolean value of whether it is empty or not
     */
    public boolean isDeckEmpty ()
    {
        return chanceDeck.isEmpty();
    }

    /**
     * Draws a card from the chanceDeck
     * @return The Drawn ChanceCard object
     */
    public ChanceCard getCard ()
    {
        Random rand = new Random();

        ChanceCard releasingCard = chanceDeck.remove(rand.nextInt(COUNT_LIMIT[rand.nextInt(6)]));
        if (!(releasingCard.getIsKeepable()))
            discardDeck.add(releasingCard);
        return releasingCard;
    }

}
