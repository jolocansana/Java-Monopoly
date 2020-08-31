package model;

import java.util.ArrayList;

/**
 * This class represents the 32 spaces on the board which can be assigned as a Property, Utility, Railroad, Chance, Tax, Start, Jail, Free Parking, or Community Service.
 */
public abstract class Space
{
    private ArrayList<Player> playersResiding;

    private int currentPlayerTurn;
    /**
     * An integer index that represents where the Space object exists in the linear set of Spaces or the Board.
     */
    private int index; //Space number on board ex. 0, 1, 2
    /**
     * A string representation of the unique name of the Space object.
     */
    private String name; //Name of the space ex. START, Jail, Chance
    /**
     * A string representation of the type of the Space object.
     * TYPE: "corner", "property", "utility", "railroad", "chance", "tax"
     */
    private String type;

    private Bank bank;

    private ChanceDeck chanceDeck;

    /**
     * This gets the name, index, and type of space of what the player initializes.
     * @param name: The name of the space taken
     * @param index: The index or position of the space assigned.
     * @param type: The type of the space.  Ex. Property, Railroad, ...
     */
    public Space(String name, int index, String type, Bank bank, ChanceDeck chanceDeck)
    {
        this.name = name;
        this.index = index;
        this.type = type;
        playersResiding = new ArrayList<Player>();
        this.bank = bank;
        this.chanceDeck = chanceDeck;
    }

    public abstract void performWhenLand();

    /**
     * Adds a Player object to the playersResiding attribute
     * @param player
     */
    public void addPlayersResiding (Player player)
    {
        playersResiding.add(player);
    }

    /**
     * Removes a Player object from the playersResiding attribute
     * @param player
     */
    public void removePlayersResiding (Player player)
    {
        playersResiding.remove(player);
    }

    /**
     * Setter method for the currentPlayerTurn attribute
     * @param curr
     */
    public void setCurrentPlayerTurn (int curr)
    {
        currentPlayerTurn = curr;
    }

    /**
     * Getter method for the playersResiding methd
     * @return An ArrayList of Player that is residing in the space currently
     */
    public ArrayList<Player> getPlayersResiding ()
    {
        return playersResiding;
    }

    /**
     * Getter method for the currentPlayerTurn attribute
     * @return An integer value of the currentPlayerTurn
     */
    public int getCurrentPlayerTurn ()
    {
        return currentPlayerTurn;
    }

    /**
     * Getter method for the index attribute.
     * @return An integer value of the index attribute
     */
    public int getIndex()
    {
        return index;
    }

    /**
     * Getter method for the name attribute.
     * @return A String indentifier of the object.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Getter method for the type attribute
     * @return A String value of the type attribute.
     */
    public String getType()
    {
        return type;
    }

    /**
     * Getter method for the Bank object
     * @return The Bank object used by the Space
     */
    public Bank getBank ()
    {
        return bank;
    }

    /**
     * Getter method for the ChanceDeck object
     * @return The ChanceDeck object used by the Space
     */
    public ChanceDeck getChanceDeck ()
    {
        return chanceDeck;
    }

}