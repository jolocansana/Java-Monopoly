package model;

import java.util.Random;

public class ChanceSpace extends Space{

    /**
     * Initilizes the ChanceSpace object.
     * @param name
     * @param index
     * @param chanceDeck
     * @param bank
     */
    public ChanceSpace (String name, int index, ChanceDeck chanceDeck, Bank bank)
    {
        super (name, index, "chance", bank, chanceDeck);
    }

    /**
     * Method called when a player lands on the ChanceSpace Object
     */
    public void performWhenLand ()
    {
        drawChanceCard();
    }

    /**
     * Gives the player the drawn ChanceCard object and makes the Player object the owner
     */
    public void drawChanceCard ()
    {
        if (!(super.getChanceDeck().isDeckEmpty()))
        {
            Player currentPlayer = super.getPlayersResiding().get(getCurrentPlayerTurn());
            currentPlayer.addChanceCard(super.getChanceDeck().getCard());
        }
    }
}
