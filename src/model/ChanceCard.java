package model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import viewAndController.ChanceController;

import java.io.IOException;
import java.util.ArrayList;
import java.security.SecureRandom;

/**
 * The Chance class contains the unique chance cards, generates the chance card deck, and distributes the chance card deck to players. The class also contains
 * the different functions of the cards through methods.
 */
public class ChanceCard
{
    private String description;
    private int categoryIndex;
    private int localCategoryIndex;
    private boolean isKeepable;
    private Player owner;
    private ArrayList<Space> board;
    private Bank bank;
    private String goToSpace;
    private boolean isGoTo;
    private SecureRandom random;
    private int oldPos;

    /**
     * Initializes a ChanceCard object.
     * @param description The description of how the card is used.
     * @param categoryIndex The index of what category the object belongs to
     * @param localCategoryIndex The index of the object within the category
     * @param board The ArrayList of Space used in the game
     * @param bank The Bank used in the game
     */
    public ChanceCard (String description, int categoryIndex, int localCategoryIndex, ArrayList<Space> board, Bank bank)
    {
        this.description = description;
        this.localCategoryIndex = localCategoryIndex;
        this.categoryIndex = categoryIndex;
        this.board = board;
        this.bank = bank;
        goToSpace = "";
        owner = null;
        isGoTo = false;
        random = new SecureRandom();
        oldPos = 0;


        switch (description)
        {
            case "Get out of jail free.":
            // case "add desc here": to add more keepable cards
                isKeepable = true;
                break;
            default:
                isKeepable = false;
        }
    }

    /**
     * Method called every time a ChanceCard object is activated. This method identifies what function the ChanceCard does based on it's two indices.
     */
    public void activateChance()
    {
        switch (categoryIndex)
        {
            case 0:
                switch (localCategoryIndex)
                {
                    case 0:
                        getOutOfJail();
                        break;
                }
                break;
            case 1:
                switch (localCategoryIndex)
                {
                    case 0:
                        proceedToProperty();
                        break;
                    case 1:
                        proceedToNearestUtility();
                        break;
                    case 2:
                        proceedToNearestRailroad();
                        break;
                }
                break;
            case 2:
                switch (localCategoryIndex)
                {
                    case 0:
                        congrats();
                        break;
                    case 1:
                        taxRefund();
                        break;
                    case 2:
                        toStart();
                        break;
                    case 3:
                        birthday();
                        break;
                    case 4:
                        wonTheCompetition();
                        break;
                }
                break;
            case 3:
                switch (localCategoryIndex)
                {
                    case 0:
                        goToJail();
                        break;
                    case 1:
                        goToPropertyWithStart();
                        break;
                }
                break;
            case 4:
                switch (localCategoryIndex)
                {
                    case 0:
                        useDoubleRent();
                        break;
                    case 1:
                        increaseProperty();
                        break;
                    case 2:
                        decreaseProperty();
                        break;
                    case 3:
                        increaseNonProperty();
                        break;
                    case 4:
                        decreaseNonProperty();
                        break;
                }
                break;
            case 5:
                switch (localCategoryIndex)
                {
                    case 0:
                        donateCommDev();
                        break;
                    case 1:
                        payTax();
                        break;
                }
                break;

        }
        removeOwner();
    }

    /**
     * Getter method for description attribute
     * @return String type of description
     */
    public String getDescription()
    {
        if ((categoryIndex == 1 && localCategoryIndex == 0) || (categoryIndex == 3 && localCategoryIndex == 1))
        {
            return String.format (description, goToSpace);
        }
        else
            return description;
    }

    /**
     * Getter method for isKeepable attribute
     * @return Boolean type of isKeepable
     */
    public boolean getIsKeepable ()
    {
        return isKeepable;
    }

    /**
     * Getter method for isGoTo attribute
     * @return Boolean type of isGoTo
     */
    public boolean getIsGoTo ()
    {
        return isGoTo;
    }

    /**
     * Setter method for owner attribute
     */
    public void setOwner (Player owner)
    {
        this.owner = owner;
        owner.addChanceCard(this);
    }

    /**
     * Removes the Player owner from this object
     */
    public void removeOwner ()
    {
        owner.removeChanceCard(this);
        owner = null;
    }

    /**
     * Method that calls a FXML file where owner can select which space from owner properties
     * @param type String type of what kind of Space the desired
     * @return Space type of what was selected
     */
    public Space pickFromOwned (String type)
    {
        Space toReturn = null;

        try
        {
            Stage chanceStage = new Stage();
            FXMLLoader chanceFXML = new FXMLLoader(getClass().getResource("../viewAndController/Chance.fxml"));
            Parent tradeRoot = chanceFXML.load();
            ChanceController chanceFXMLController = chanceFXML.getController();
            chanceFXMLController.activateGetSpace(owner, type, true);
            chanceStage.setScene(new Scene(tradeRoot, 300, 350));
            chanceStage.showAndWait();
            toReturn = chanceFXMLController.getSpace();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return toReturn;
    }

    /**
     * Setter method for owner's oldCurr attribute
     */
    public void setOldPos ()
    {
        owner.setOldCurrSpaceChanceCard(owner.getCurrentSpace());
    }

    /**
     * A ChanceCard method that removes payment when a Player goes to Jail
     */
    public void getOutOfJail ()
    {
        owner.setInJailStatus(false);
    }

    /**
     * A ChanceCard method that moves the player to a random property.
     */
    public void proceedToProperty ()
    {
        Space destination;
        isGoTo = true;
        do
        {
            destination = board.get(random.nextInt(board.size()));
        } while (!(destination.getType().equals("property")));
        goToSpace = destination.getName();
        setOldPos();
        owner.setCurrentSpace(destination.getIndex());
    }
    /**
     * A ChanceCard method that moves the player to the nearest utility.
     */
    public void proceedToNearestUtility ()
    {
        Space destination;

        int[] posOfUtilities = {0,0};
        int j = 0;

        for (int i = 0; i < board.size(); i++)
            if (board.get(i).getType().equals("utilities"))
                posOfUtilities[j] = i;

        int currSpace = owner.getCurrentSpace();

        if (currSpace > posOfUtilities[1])
        {
            if (currSpace - posOfUtilities[1] < posOfUtilities[0] - currSpace)
            {
                destination = board.get(posOfUtilities[1]);
            }
            else
                destination = board.get(posOfUtilities[0]);
        }
        else
        {
            if (currSpace - posOfUtilities[0] < posOfUtilities[1] - currSpace)
            {
                destination = board.get(posOfUtilities[0]);
            }
            else
                destination = board.get(posOfUtilities[1]);
        }

        isGoTo = true;
        goToSpace = destination.getName();
        setOldPos();
        owner.setCurrentSpace(destination.getIndex());
    }

    /**
     * A ChanceCard method that moves the player to the nearest railroad.
     */
    public void proceedToNearestRailroad ()
    {
        Space destination;

        int[] posOfRailroads = {0,0,0};
        int j = 0;

        for (int i = 0; i < board.size(); i++)
            if (board.get(i).getType().equals("railroad"))
                posOfRailroads[j] = i;

        int currSpace = owner.getCurrentSpace();

        if (currSpace > posOfRailroads[2])
        {
            if (currSpace - posOfRailroads[2] < posOfRailroads[0] - currSpace)
            {
                destination = board.get(posOfRailroads[2]);
            }
            else
                destination = board.get(posOfRailroads[0]);
        }
        else if (currSpace > posOfRailroads[1])
        {
            if (currSpace - posOfRailroads[1] < posOfRailroads[2] - currSpace)
            {
                destination = board.get(posOfRailroads[1]);
            }
            else
                destination = board.get(posOfRailroads[2]);
        }
        else
        {
            if (currSpace - posOfRailroads[0] < posOfRailroads[1] - currSpace)
            {
                destination = board.get(posOfRailroads[0]);
            }
            else
                destination = board.get(posOfRailroads[1]);
        }

        isGoTo = true;
        goToSpace = destination.getName();
        setOldPos();
        owner.setCurrentSpace(destination.getIndex());
    }

    /**
     * A ChanceCard method used by the Congratulations Chance Card.
     */
    public void congrats ()
    {
        bank.removeMoney(50);
        owner.earn(50);
    }

    /**
     * A ChanceCard method used by the Tax Refund Chance Card.
     */
    public void taxRefund ()
    {
        bank.removeMoney(100);
        owner.earn(100);
    }

    /**
     * A ChanceCard method that moves the player to the Start Space.
     */
    public void toStart ()
    {
        owner.setCurrentSpace(0);
    }

    /**
     * A ChanceCard method used by the Birthday Chance Card.
     */
    public void birthday ()
    {
        owner.earn(300);
    }

    /**
     * A ChanceCard method used by the Won the Competition Chance Card.
     */
    public void wonTheCompetition ()
    {
        owner.earn (150);
    }

    /**
     * A ChanceCard method that moves the player to Jail Space.
     */
    public void goToJail ()
    {
        setOldPos();
        owner.setCurrentSpace(24);
    }

    /**
     * A ChanceCard method that moves the player to random property with Start Space benefits.
     */
    public void goToPropertyWithStart ()
    {
        Space destination;
        isGoTo = true;
        do
        {
            destination = board.get(random.nextInt(board.size()));
        } while (!(destination.getType().equals("property")));
        goToSpace = destination.getName();
        setOldPos();
        owner.setCurrentSpace(destination.getIndex());
    }

    /**
     * A ChanceCard method that doubles the rent of a chosen property
     */
    public void useDoubleRent()
    {
        Property forDouble = ((Property) pickFromOwned("property"));
        forDouble.setMultiplier(2);
    }

    /**
     * A ChanceCard method that increases the rent of a chosen property
     */
    public void increaseProperty ()
    {
        Property prop = ((Property) pickFromOwned("property"));

        if (prop.getHouseCount() == 5)
        {
            owner.expense(150);
        }
        else
        {
            owner.expense(prop.getHouseCount()*25);
        }

        prop.setMultiplier(1.5);
    }

    /**
     * A ChanceCard method that decreases the rent of a chosen property
     */
    public void decreaseProperty ()
    {
        Property prop = ((Property) pickFromOwned("property"));
        prop.setMultiplier(.9);
    }

    /**
     * A ChanceCard method that increases the rent of a chosen non-property
     */
    public void increaseNonProperty ()
    {
        Space nonProp = pickFromOwned("nonproperty");

        if (nonProp.getType() == "railroad")
        {
            ((Railroad) nonProp).setMultiplier(1.1);
        }
        else
        {
            ((Utilities) nonProp).setMultiplier(1.1);
        }
    }

    /**
     * A ChanceCard method that decreases the rent of a chosen non-property
     */
    public void decreaseNonProperty ()
    {
        Space nonProp = pickFromOwned("nonproperty");

        if (nonProp.getType() == "railroad")
        {
            ((Railroad) nonProp).setMultiplier(.9);
        }
        else
        {
            ((Utilities) nonProp).setMultiplier(.9);
        }
    }

    /**
     * A ChanceCard method used by the Donate to Community Development Chance Card
     */
    public void donateCommDev ()
    {
        owner.expense(random.nextInt(500));
    }

    /**
     * A ChanceCard method used by the Pay Tax Chance Card
     */
    public void payTax ()
    {
        owner.expense(random.nextInt(500));
    }

}
