package model;

public class Tax extends Space{

    private double rent;

    /**
     * Initializes the Tax Object
     * @param name
     * @param index
     * @param bank
     * @param chanceDeck
     */
    public Tax (String name, int index, Bank bank, ChanceDeck chanceDeck)
    {
        super(name, index, "tax", bank, chanceDeck);
    }

    public void performWhenLand () {}

    /**
     * Getter method for the tax attribute
     * @param currentPlayer
     * @param tax
     * @return A type Double amount of the tax of the current Tax object
     */
    public double getTax (Player currentPlayer, String tax)
    {
        if (tax.equals("Income Tax"))
        {
            if (currentPlayer.getMoney() * .1 > 200.0)
            {
                return currentPlayer.getMoney() * .1;
            }
            else
            {
                return 200;
            }
        }
        else
        {
            return 75.0;
        }
    }

}
