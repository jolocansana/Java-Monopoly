package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.lang.Math;

public class Game
{
    private ArrayList<Player> players;
    private ArrayList<Space> board;
    private int currentPlayerTurn;
    private ChanceDeck chanceDeck;
    private Bank bank;

    /**
     * Initializes the Game object and creates the essentials of the game such as the Player objects, Space objects, ChanceDeck object, and Bank Object.
     * @param players
     * @param idOfSpaces
     */
    public Game (String[] players, int[] idOfSpaces)
    {
        this.players = new ArrayList<>();
        for (int i = 0; i < players.length; i++)
            this.players.add(new Player(players[i], 1500));
        bank = new Bank(this.players.size());

        board = new ArrayList<>();
        double rentSet[];

        for (int i = 0; i < idOfSpaces.length; i++)
        {
            switch (idOfSpaces[i])
            {
                case 1:
                    rentSet = new double[]{2,10,30,90,160,250};
                    board.add(new Property("Agno", i,"brown", 60, 50, rentSet, (int) Math.round(2.5*this.players.size()), bank, chanceDeck));
                    break;
                case 2:
                    rentSet = new double[]{4,20,60,180,320,450};
                    board.add(new Property("TNC", i,"brown", 60, 50, rentSet, (int) Math.round(3*this.players.size()), bank, chanceDeck));
                    break;
                case 3:
                    rentSet = new double[]{6,30,90,270,400,550};
                    board.add(new Property("Potato Corner", i,"skyblue", 100, 50, rentSet, (int) Math.round(3.5*this.players.size()), bank, chanceDeck));
                    break;
                case 4:
                    rentSet = new double[]{6,30,90,270,400,550};
                    board.add(new Property("Zark\'s Burger", i,"skyblue", 100, 50, rentSet, (int) Math.round(4*this.players.size()), bank, chanceDeck));
                    break;
                case 5:
                    rentSet = new double[]{6,40,100,300,450,600};
                    board.add(new Property("Coffee Bean", i,"skyblue", 120, 50, rentSet, (int) Math.round(4*this.players.size()), bank, chanceDeck));
                    break;
                case 6:
                    rentSet = new double[]{10,50,150,450,625,750};
                    board.add(new Property("Gongcha", i,"pink", 140, 100, rentSet, (int) Math.round(4.5*this.players.size()), bank, chanceDeck));
                    break;
                case 7:
                    rentSet = new double[]{10,50,150,450,625,750};
                    board.add(new Property("Coreon Gate", i,"pink", 140, 100, rentSet, (int) Math.round(4.5*this.players.size()), bank, chanceDeck));
                    break;
                case 8:
                    rentSet = new double[]{12,60,180,500,700,900};
                    board.add(new Property("Techtite", i,"pink", 160, 100, rentSet, (int) Math.round(5*this.players.size()), bank, chanceDeck));
                    break;
                case 9:
                    rentSet = new double[]{14,70,200,550,750,950};
                    board.add(new Property("Mercury Drug", i,"orange", 180, 100, rentSet, (int) Math.round(5*this.players.size()), bank, chanceDeck));
                    break;
                case 10:
                    rentSet = new double[]{14,70,200, 550,750,950};
                    board.add(new Property("Mont Albo", i,"orange", 180, 100, rentSet, (int) Math.round(5.5*this.players.size()), bank, chanceDeck));
                    break;
                case 11:
                    rentSet = new double[]{16,80,200,600,800,1000};
                    board.add(new Property("Samgyupsalamat", i,"orange", 200, 100, rentSet, (int) Math.round(5.5*this.players.size()), bank, chanceDeck));
                    break;
                case 12:
                    rentSet = new double[]{18,90,250,700,875,1050};
                    board.add(new Property("Starbucks", i,"maroon", 220, 150, rentSet, (int) Math.round(6*this.players.size()), bank, chanceDeck));
                    break;
                case 13:
                    rentSet = new double[]{18,90,250,700,875,1050};
                    board.add(new Property("Mcdonalds", i,"maroon", 220, 150, rentSet, (int) Math.round(6*this.players.size()), bank, chanceDeck));
                    break;
                case 14:
                    rentSet = new double[]{20,100,300,750,925,1100};
                    board.add(new Property("National Bookstore", i,"maroon", 240, 150, rentSet, (int) Math.round(6.5*this.players.size()), bank, chanceDeck));
                    break;
                case 15:
                    rentSet = new double[]{22,110,330,800,975,1150};
                    board.add(new Property("Shell", i,"yellow", 260, 150, rentSet, (int) Math.round(6.5*this.players.size()), bank, chanceDeck));
                    break;
                case 16:
                    rentSet = new double[]{22,110,330,800,975,1150};
                    board.add(new Property("Savemore", i,"yellow", 260, 150, rentSet, (int) Math.round(6.5*this.players.size()), bank, chanceDeck));
                    break;
                case 17:
                    rentSet = new double[]{26,130,390,900,1100,1275};
                    board.add(new Property("Green Residence", i,"green", 300, 200, rentSet, (int) Math.round(7*this.players.size()), bank, chanceDeck));
                    break;
                case 18:
                    rentSet = new double[]{26,150,450,1000,1200,14000};
                    board.add(new Property("DLSU", i,"green", 320, 200, rentSet, (int) Math.round(8*this.players.size()), bank, chanceDeck));
                    break;
                case 19:
                    board.add(new Railroad("North", i, bank, chanceDeck));
                    break;
                case 20:
                    board.add(new Railroad("South", i, bank, chanceDeck));
                    break;
                case 21:
                    board.add(new Railroad("Metro", i, bank, chanceDeck));
                    break;
                case 22:
                    board.add(new Utilities("Electric", i, bank, chanceDeck));
                    break;
                case 23:
                    board.add(new Utilities("Water", i, bank, chanceDeck));
                    break;
                case 24:
                    board.add(new ChanceSpace("Chance", i, chanceDeck, bank));
                    break;
                case 25:
                    board.add(new Tax("Income Tax", i, bank, chanceDeck));
                    break;
                case 26:
                    board.add(new Tax("Luxury Tax", i, bank, chanceDeck));
                    break;
                case 27:
                    board.add(new Corner("Start", i, 1, bank, chanceDeck));
                    break;
                case 28:
                    board.add(new Corner("Community Service", i, 2, bank, chanceDeck));
                    break;
                case 29:
                    board.add(new Corner("Free Parking", i, 3, bank, chanceDeck));
                    break;
                case 30:
                    board.add(new Corner("Jail", i, 4, bank, chanceDeck));
                    break;
            }
        }

        chanceDeck = new ChanceDeck(28, board, bank);

        currentPlayerTurn = -1;
    }

    /**
     * Starts the turn of the current player
     */
    public void startTurn ()
    {
        Player currentPlayer = players.get(currentPlayerTurn);
        Space currentSpace = board.get(currentPlayer.getCurrentSpace());

        currentSpace.addPlayersResiding(currentPlayer);
        currentSpace.setCurrentPlayerTurn(currentPlayerTurn);

    } // Check for the space, and do all the necessary things like pushing player to the player's residing attribute, etc.

    /**
     * Getter method of players attribute
     * @return An ArrayList of type Player
     */
    public ArrayList<Player> getPlayers()
    {
        return players;
    }

    /**
     * Getter method for the board attribute
     * @return An ArrayList of type Space
     */
    public ArrayList<Space> getBoard()
    {
        return board;
    }

    /**
     * Getter method for the bank attribute
     * @return The Bank object used in the game
     */
    public Bank getBank ()
    {
        return bank;
    }

    /**
     * Getter method for the chanceDeck attribute
     * @return A ChanceDeck object used in the game
     */
    public ChanceDeck getChanceDeck()
    {
        return chanceDeck;
    }

    /**
     * Getter method of the currentPlayerTurn attribute
     * @return An integer value of the index of the current player
     */
    public int getCurrentPlayerTurn()
    {
        return currentPlayerTurn;
    }

    /**
     * Changes the currentPlayerTurn attribute to the next corresponding player
     */
    public void nextPlayerTurn ()
    {
        if (currentPlayerTurn == players.size()-1)
            currentPlayerTurn = 0;
        else
            currentPlayerTurn++;
    }

    /**
     * Checks if end game conditions are met
     * @return A boolean value whether they are met or not
     */
    public boolean GameOver()
    {
        for(int i = 0; i < players.size(); i++)
            if (players.get(i).isBankrupt() == true)
                return true;

        if(bank.getMoney() <= 0)
            return true;

        String[] colors = {"brown", "skyblue", "pink", "orange", "maroon", "yellow", "green"};

        for (int player = 0; player < players.size(); player++)
        {
            for (int color = 0; color < colors.length; color++)
            {
                int developedCount = 0;
                for (int properties = 0; properties < players.get(player).getOwnedSpaces().size(); properties++)
                {
                    if (players.get(player).getOwnedSpaces().get(properties).getType().equals("property"))
                        if (((Property) (players.get(player).getOwnedSpaces().get(properties))).getColor().equals(colors[color]))
                            if (((Property) (players.get(player).getOwnedSpaces().get(properties))).isFull())
                                developedCount++;
                }

                if (developedCount >= 2)
                    return true;
            }
        }
        return false;
    }

}