package model;

public class Property extends Space
{

    /**
     * It is unique String indentifier of the object. It is also to be used in display.
     */
    private String name;

    private String color;

    /**
     * A Player object of the owner player.
     */
    private Player owner;

    /**
     * A double value that represents how much the property is going to purchased by a player.
     */
    private double price;

    /**
     * A double value that represents how much it is to develop the property by adding a house/hotel.
     */
    private double houseprice;

    /**
     * An integer representation of how much houses the property has.
     */
    private int housecount; // 0 - 4 house 5 hotel


    private double[] rentSet;

    private int footTraffic;

    private int footTrafficLimit;

    /**
     * A double value that is applied to the rent if buffs are triggers (i.e. DoubleRent Chance Card, Multiple Properties per color, etc.)
     */
    private double multiplier;

    private double additionalRent;

    private double collectedRent;

    /**
     * A boolean value that is TRUE if a hotel exists in the property, FALSE if otherwise.
     */
    private boolean fullyDeveloped;

    private boolean full;

    /**
     * A boolean value that is TRUE if an owner exists, FALSE if otherwise.
     */
    private boolean owned;

    /**
     * This initializer gets the name and index of the property that is being called.
     * @param name
     * @param index
     * @param color
     * @param price
     * @param houseprice
     * @param rentSet
     * @param footTrafficLimit
     * @param bank
     * @param chanceDeck
     */
    public Property(String name, int index, String color, double price, double houseprice, double rentSet[], int footTrafficLimit, Bank bank, ChanceDeck chanceDeck)
    {
        super(name, index, "property", bank, chanceDeck);
        this.name = name;
        this.color = color;
        owner = null;
        this.price = price;
        this.houseprice = houseprice;
        housecount = 0;
        this.rentSet = new double[6];
        for (int i = 0; i < 6; i++)
            this.rentSet[i] = rentSet[i];
        footTraffic = 0;
        this.footTrafficLimit = footTrafficLimit;
        multiplier = 1;
        additionalRent = 0;
        collectedRent = 0;
        fullyDeveloped = false;
        owned = false;
    }

    public void performWhenLand () { }

    /**
     * Checks if the property is fully developed.
     * @return Returns a boolean value of TRUE if housecount is equal to 5, FALSE otherwise.
     */
    public boolean isFullyDeveloped()
    {
        return fullyDeveloped;
    }

    /**
     * Getter method to check if the Property object is full
     * @return A boolean value whether it is full or not
     */
    public boolean isFull () {return full;}

    /**
     * Checks if the property is owned by a player.
     * @return Returns a boolean value of TRUE if a player owns the property, FALSE otherwise.
     */
    public boolean isOwned()
    {
        return owned;
    }

    /**
     * Changes the property's owned attribute to true
     */
    public void purchased()
    {
        owned = true;
    }

    /**
     * Getter method for the multiplier attribute
     * @return A double value of the multiplier attribute.
     */
    public double getMultiplier()
    {
        return multiplier;
    }

    /**
     * Setter method for the multiplier attribute
     * @param multiplier
     */
    public void setMultiplier (double multiplier) { this.multiplier = multiplier; }

    /**
     * Getter method for name attribute.
     * @return A String value of name attribute
     */
    public String getName()
    {
        return name;
    }

    /**
     * Getter method for the color atrribute
     * @return A String representation of the color
     */
    public String getColor () {return color;}

    /**
     * Getter nethod for the owner attribute.
     * @return An integer index for the owner attribute.
     */
    public Player getOwner()
    {
        return owner;
    }

    /**
     * Getter method for the price attribute.
     * @return A double value of the price attribute.
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Getter method for the housecount attribute.
     * @return	An integer value of the housecount attribute.
     */
    public int getHouseCount()
    {
        return housecount;
    }

    /**
     * Getter method for the houseprice attribute
     * @return A double value of the houseprice attribute.
     */
    public double getHousePrice()
    {
        return houseprice;
    }

    /**
     * Getter method for the rent attribute.
     * @return A double value of the rent attribute.
     */
    public double getRent()
    {
        return (rentSet[housecount] + additionalRent) * multiplier;
    }

    /**
     * Getter method for the footTrafficLimit attribute
     * @return An integer value of the footTrafficLimit
     */
    public int getFootTrafficLimit () {return footTrafficLimit;}

    /**
     * Increments the footTraffic attribute by 1
     */
    public void addFootTraffic ()
    {
        if (owner != null)
            footTraffic++;
    }

    /**
     * Getter method for the footTraffic attribute
     * @return An integer value of the current foot traffic of the property
     */
    public int getFootTraffic () {return footTraffic;}

    /**
     * Setter method for the additionalRent attribute
     * @param amt
     */
    public void setAdditionalRent (double amt) {additionalRent = amt;}

    /**
     * Getter method for the collectedRent attribute
     * @return
     */
    public double getCollectedRent () {return collectedRent;}

    /**
     * Increments the collectedRent attribute by a value of rent
     * @param rent
     */
    public void addCollectedRent (double rent) {collectedRent += rent;}

    /**
     * Develops the property by incrementing the housecount attribute affecting the properties rent and value
     */
    public void develop ()
    {
        if (housecount < 5)
        {
            housecount++;
            footTraffic = 0;
            collectedRent = 0;
            owner.expense(houseprice);
        }

        if (housecount == 4)
        {
            fullyDeveloped = true;
        }

        if (housecount == 5)
        {
            full = true;
        }
    }

    /**
     * Setter method for the owner attribute
     * @param player
     */
    public void setOwner (Player player)
    {
        owner = player;
    }

}