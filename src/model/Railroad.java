package model;

public class Railroad extends Space {

    private int typeOfSpace;
    private Player owner;
    private double price;
    private double[] rent;
    private double multiplier;

    /**
     * Initializes the Railroad Object
     * @param name
     * @param index
     * @param bank
     * @param chanceDeck
     */
    public Railroad(String name, int index, Bank bank, ChanceDeck chanceDeck)
    {
        super (name, index, "railroad", bank, chanceDeck);
        typeOfSpace = 1;
        rent = new double[]{25,50,150};
        owner = null;
        price = 200;
        multiplier = 1;
    }

    public void performWhenLand () {}

    /**
     * Getter method for the owner attribute
     * @return A Player object of the owner
     */
    public Player getOwner () { return owner; }

    /**
     * Setter method for the owner attribute
     * @param player
     */
    public void setOwner (Player player)
    {
        owner = player;
    }

    /**
     * Getter method for the price atrtibute
     * @return A type Double amt of the price of the railroad
     */
    public double getPrice() { return price;}

    /**
     * Setter method for the multiplier attribute
     * @param multiplier
     */
    public void setMultiplier (double multiplier)
    {
        this.multiplier = multiplier;
    }

    /**
     * Getter method for the rent attribute
     * @return A type Double amount of the rent of the railroad
     */
    public double getRent ()
    {
        if (owner != null)
        {
            System.out.println(owner.getCountOwnedSpaces()[7]);
            return rent[owner.getCountOwnedSpaces()[7]-1] * multiplier;
        }
        else
            return 0;
    }
}
