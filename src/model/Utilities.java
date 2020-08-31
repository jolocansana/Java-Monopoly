package model;

public class Utilities extends Space{

    private int typeOfSpace;
    private Player owner;
    private double price;
    private double rent; // Equal to owner's latest dice roll
    private int[] multiplier = {4,10};
    private double multiplierFromChance;

    /**
     * Initializes the Utilities object
     * @param name
     * @param index
     * @param bank
     * @param chanceDeck
     */
    public Utilities (String name, int index, Bank bank, ChanceDeck chanceDeck)
    {
        super(name, index, "utilities", bank, chanceDeck);
        typeOfSpace = 2;
        owner = null;
        price = 150;
        rent = 0;
        multiplierFromChance = 1;
    }

    public void performWhenLand () { }

    /**
     * Setter method for the owner attribute
     * @param player
     */
    public void setOwner (Player player)
    {
        owner = player;
    }

    /**
     * Setter method for the multiplier attribute
     * @param multiplier
     */
    public void setMultiplier (double multiplier)
    {
        multiplierFromChance = multiplier;
    }

    /**
     * Getter method for the owner attribute
     * @return A Player object of the owner attribute
     */
    public Player getOwner () {return owner;}

    /**
     * Getter method for the price attribute
     * @return A type Double amount of the price of the utilities
     */
    public double getPrice () {return price;}

    /**
     * Getter method for the rent attribute
     * @return A type Double amount of the rent of the utilities
     */
    public double getRent () {
        if (owner != null)
            return owner.getDiceRoll() * multiplier[owner.getCountOwnedSpaces()[8]-1] * multiplierFromChance;
        else
            return 0;
    }
}
