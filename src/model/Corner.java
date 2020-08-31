package model;

public class Corner extends Space{

    /**
     * Initializes the Corner Object based on it's cornerID
     * @param name
     * @param index
     * @param cornerID
     * @param bank
     * @param chanceDeck
     */
    public Corner (String name, int index, int cornerID, Bank bank, ChanceDeck chanceDeck)
    {
        super (name, index, "corner", bank, chanceDeck);
    }

    /**
     * Performs an action when a player lands on the object
     */
    public void performWhenLand () {}
}
