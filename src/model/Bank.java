package model;

/**
 * The Bank class contains the money of the bank to be used in the game.
 */
public class Bank
{
    /**
     * 		This stores the bank's money to be distributed to the players during a game.
     */
    public double money;

    /**
     * Initializes a Bank object with money set to 2500 multiplied to the number of players playing.
     * @param NoOfPlayers Takes in the number of players in the game.
     */
    public Bank (int NoOfPlayers)
    {
        this.money = 2500 * NoOfPlayers;
    }

    /**
     * Used to check if the bank no longer has money. This is one of the end game conditions.
     * @return A boolean value where TRUE is returned when money is less than or equal to 0, and FALSE if otherwise.
     */
    public boolean isBankrupt()
    {
        return money <= 0;
    }

    /**
     * Adds double amount of money to the bank object's money attribute.
     * @param amount Type Double amount to add
     */
    public void addMoney (double amount)
    {
        money += amount;
    }

    /**
     * Removes double amount of money to the bank object's money attribute
     * @param amount Type Double amount to remove
     * @return A double amount equal to amount parameter
     */
    public double removeMoney (double amount)
    {
        money -= amount;
        return amount;
    }

    /**
     * Getter method for money variable.
     * @return	A double assigned to the money variable.
     */
    public double getMoney()
    {
        return money;
    }
}