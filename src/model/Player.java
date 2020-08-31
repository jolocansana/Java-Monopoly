package model;

import java.beans.PropertyEditor;
import java.util.ArrayList;
import java.util.Random;

/**
 * The Player class contains all the attributes required by each players. It also contains methods that allow the player to interact with the different
 * functionalities in the game.
 */
public class Player
{
    /**
     * A String representation of the name of the Player object.
     */
    private String name;

    /**
     * String representation of the file path of the Player's Photo
     */
    private String photoURL;

    /**
     * A double amount of the player's money
     */
    private double money;

    private ArrayList<Space> ownedSpaces;

    private int[] countOwnedSpaces; // {brown, skyblue, pink, orange, maroon, yellow, green, railroads, utilities}

    private int[] trueCountOwned; // how many per countOwnedSpaces

    /**
     * An interger index that indicates the current position of the player on the board.
     */
    private int currentSpace;

    private int oldCurrSpaceChanceCard;

    private ArrayList<ChanceCard> chanceCards;

    /**
     * A randomized integer that stores the player's most recent dice roll.
     */
    private int diceroll;

    private boolean inJail;

    /**
     * Initializes a Player object.
     * @param name A string representaiton of the PLayer object to used for display.
     * @param money The starting money given to the player that changes based on the number of players in game.
     */
    public Player(String name, double money)
    {
        this.name = name;
        this.money = money;
        currentSpace = 0; //initialized to 0 means player starts at START
        ownedSpaces = new ArrayList<>();
        countOwnedSpaces = new int[]{0,0,0,0,0,0,0,0,0};
        chanceCards = new ArrayList<>();
        trueCountOwned = new int[]{2,3,3,3,3,2,2,3,2};
        oldCurrSpaceChanceCard = 0;
    }

    /**
     * Moves the players diceroll amount of times. If the players goes over the 31-limit, the value is reseted to 0 and the rest is added to complete the move.
     * @param diceroll An integer representation of how many steps the player will take.
     */
    public void move(int diceroll)
    {
        if(currentSpace + diceroll <= 31)
            currentSpace += diceroll;
        else if(currentSpace + diceroll > 31)
            currentSpace += diceroll - 32;
    }

    /**
     * Checks if the player is bankrupt.
     * @return Returns a boolean value where TRUE shows that the player's money is less than or equal to 0, FALSE if otherwise.
     */
    public boolean isBankrupt()
    {
        return money <= 0;
    }

    /**
     * Rolls the dice.
     * @return An integer of the resulting roll.
     */
    public int rolldice()
    {
        Random random = new Random();
        diceroll = random.nextInt(6) + 1;
        return diceroll;
    }

    /**
     * Add's amount to the player's money.
     * @param amount A double value that will be added to the Player's money
     */
    public void earn(double amount)
    {
        money += amount;
    }

    /**
     * Charges the player with an amount of money.
     * @param amount A double value that will be subtracted to the Player's money
     */
    public void expense(double amount)
    {
        money -= amount;
    }

    /**
     * Setter method that sets the current space of the Player object
     * @param index
     */
    public void setCurrentSpace (int index)
    {
        currentSpace = index;
    }

    /**
     * Setter method that sets the additionalRent attribute used by Property objects
     * @param color
     */
    public void modifyAdditionalRent (String color)
    {
        double additionalRent = 0;
        switch (color)
        {
            case "brown":
                if (countOwnedSpaces[0] == 1)
                {
                    additionalRent = 0;
                }
                else if (countOwnedSpaces[0] == 2)
                {
                    additionalRent = 10;
                }
                else
                {
                    additionalRent = 20;
                }
                break;
            case "skyblue":
                if (countOwnedSpaces[1] == 1)
                {
                    additionalRent = 0;
                }
                else if (countOwnedSpaces[1] == 2)
                {
                    additionalRent = 10;
                }
                else
                {
                    additionalRent = 20;
                }
                break;
            case "pink":
                if (countOwnedSpaces[2] == 1)
                {
                    additionalRent = 0;
                }
                else if (countOwnedSpaces[2] == 2)
                {
                    additionalRent = 10;
                }
                else
                {
                    additionalRent = 20;
                }
                break;
            case "orange":
                if (countOwnedSpaces[3] == 1)
                {
                    additionalRent = 0;
                }
                else if (countOwnedSpaces[3] == 2)
                {
                    additionalRent = 10;
                }
                else
                {
                    additionalRent = 20;
                }
                break;
            case "maroon":
                if (countOwnedSpaces[4] == 1)
                {
                    additionalRent = 0;
                }
                else if (countOwnedSpaces[4] == 2)
                {
                    additionalRent = 10;
                }
                else
                {
                    additionalRent = 20;
                }
                break;
            case "yellow":
                if (countOwnedSpaces[5] == 1)
                {
                    additionalRent = 0;
                }
                else if (countOwnedSpaces[5] == 2)
                {
                    additionalRent = 10;
                }
                else
                {
                    additionalRent = 20;
                }
                break;
            case "green":
                if (countOwnedSpaces[6] == 1)
                {
                    additionalRent = 0;
                }
                else if (countOwnedSpaces[6] == 2)
                {
                    additionalRent = 10;
                }
                else
                {
                    additionalRent = 20;
                }
                break;
        }

        for (int i = 0; i < ownedSpaces.size(); i++)
        {
            if (ownedSpaces.get(i).getType() == "property")
                if (((Property) ownedSpaces.get(i)).getColor() == color)
                    ((Property) ownedSpaces.get(i)).setAdditionalRent(additionalRent);
        }
    }

    /**
     * Method that adds Space objects to the owner
     * @param space
     */
    public void addOwnedSpaces (Space space)
    {
        ownedSpaces.add(space);

        switch (space.getType())
        {
            case "property":
                switch (((Property) space).getColor())
                {
                    case "brown":
                        countOwnedSpaces[0]++;
                        modifyAdditionalRent("brown");
                        break;
                    case "skyblue":
                        countOwnedSpaces[1]++;
                        modifyAdditionalRent("skyblue");
                        break;
                    case "pink":
                        countOwnedSpaces[2]++;
                        modifyAdditionalRent("pink");
                        break;
                    case "orange":
                        countOwnedSpaces[3]++;
                        modifyAdditionalRent("orange");
                        break;
                    case "maroon":
                        countOwnedSpaces[4]++;
                        modifyAdditionalRent("maroon");
                        break;
                    case "yellow":
                        countOwnedSpaces[5]++;
                        modifyAdditionalRent("yellow");
                        break;
                    case "green":
                        countOwnedSpaces[6]++;
                        modifyAdditionalRent("green");
                        break;
                }
                break;
            case "railroad":
                countOwnedSpaces[7]++;
                break;
            case "utilities":
                countOwnedSpaces[8]++;
                break;
        }
    }

    /**
     * Method that removes Space objects from the owner
     * @param space
     * @return The Space object removed
     */
    public Space removeOwnedSpaces (Space space)
    {
        ownedSpaces.remove(space);

        switch (space.getType())
        {
            case "property":
                switch (((Property) space).getColor())
                {
                    case "brown":
                        countOwnedSpaces[0]--;
                        modifyAdditionalRent("brown");
                        break;
                    case "skyblue":
                        countOwnedSpaces[1]--;
                        modifyAdditionalRent("skyblue");
                        break;
                    case "pink":
                        countOwnedSpaces[2]--;
                        modifyAdditionalRent("pink");
                        break;
                    case "orange":
                        countOwnedSpaces[3]--;
                        modifyAdditionalRent("orange");
                        break;
                    case "maroon":
                        countOwnedSpaces[4]--;
                        modifyAdditionalRent("maroon");
                        break;
                    case "yellow":
                        countOwnedSpaces[5]--;
                        modifyAdditionalRent("yellow");
                        break;
                    case "green":
                        countOwnedSpaces[6]--;
                        modifyAdditionalRent("green");
                        break;
                }
                break;
            case "railroad":
                countOwnedSpaces[7]--;
                break;
            case "utilities":
                countOwnedSpaces[8]--;
                break;
        }

        return space;
    }

    /**
     * Method that adds ChanceCard objects to the player
     * @param chanceCard
     */
    public void addChanceCard (ChanceCard chanceCard)
    {
        chanceCards.add(chanceCard);
    }

    /**
     * Method that removes ChanceCard objects from the player
     * @param chanceCard
     * @return The ChanceCard object removed
     */
    public ChanceCard removeChanceCard (ChanceCard chanceCard)
    {
        chanceCards.remove(chanceCard);
        return chanceCard;
    }

    /**
     * Getter method for the name varilable.
     * @return	A string value of the given name of the player.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Getter method for the money variable.
     * @return A double value of the current amount of money the player has.
     */
    public double getMoney()
    {
        return money;
    }

    /**
     * Getter method for the ownedSpaces attribute
     * @return An ArrayList of type Space
     */
    public ArrayList<Space> getOwnedSpaces()
    {
        return ownedSpaces;
    }

    /**
     * Getter method for the oldCurrSpaceChanceCard attribute
     * @return
     */
    public int getOldCurrSpaceChanceCard ()
    {
        return oldCurrSpaceChanceCard;
    }

    /**
     * Setter method for the oldCurrSpaceChanceCard attribute
     * @param oldPos
     */
    public void setOldCurrSpaceChanceCard (int oldPos)
    {
        oldCurrSpaceChanceCard = oldPos;
    }

    /**
     * Getter method for the countOwnedSpaces attribute
     * @return An array of Integers
     */
    public int[] getCountOwnedSpaces()
    {
        return countOwnedSpaces;
    }

    /**
     * Getter method for the trueCountOwned attribute
     * @return An array of Integers
     */
    public int[] getTrueCountOwned()
    {
        return trueCountOwned;
    }

    /**
     * Getter method for the currentSpace variable
     * @return	An integer value of the current index of the player on the board.
     */
    public int getCurrentSpace()
    {
        return currentSpace;
    }

    /**
     * Getter method for the chanceCards attribute
     * @return An ArrayList of type ChanceCard of the player
     */
    public ArrayList<ChanceCard> getChanceCards()
    {
        return chanceCards;
    }

    /**
     * Getter method for the diceroll attribute
     * @return An integer value of the diceroll
     */
    public int getDiceRoll()
    {
        return diceroll;
    }

    /**
     * Getter method for the inJailStatus attribute
     * @return A Boolean value whether the player is in jail or note
     */
    public boolean getInJailStatus()
    {
        return inJail;
    }

    /**
     * Setter method for the inJailStatus attribute
     * @param setter
     */
    public void setInJailStatus(boolean setter)
    {
        inJail = setter;
    }
}
