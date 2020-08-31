package viewAndController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.*;

import java.net.URL;
import java.util.ResourceBundle;

public class ChanceController implements Initializable {

    @FXML
    private Label cardDesc;

    @FXML
    private Button performDone;

    @FXML
    private ComboBox<String> applicableSpaces;

    @FXML
    private ComboBox<String> chanceCards;

    @FXML
    private Group getSpaceGroup;

    private ObservableList<String> contents;

    private ObservableList<String> chanceCardContents;

    private Space space;

    private Player currPlayer;

    private ChanceCard currentCard;

    private boolean isCardActivated;

    /**
     * Opens the FXML file that displays all owned ChanceCard objects of the player
     * @param player
     */
    public void openChanceCards (Player player)
    {
        currPlayer = player;
        isCardActivated = false;
        chanceCardContents = FXCollections.observableArrayList();

        for (int i = 0; i < currPlayer.getChanceCards().size(); i++)
        {
            chanceCardContents.add(currPlayer.getChanceCards().get(i).getDescription());
        }
        
        getSpaceGroup.setVisible(false);
        chanceCards.setItems(chanceCardContents);
    }

    /**
     * Listens for a new change to the value selected in the cardDesc ComboBox
     * @param e
     */
    public void changeCard (ActionEvent e)
    {
        cardDesc.setText(chanceCards.getValue());

        for (int i = 0; i < currPlayer.getChanceCards().size(); i++)
        {
            if (currPlayer.getChanceCards().get(i).getDescription().equals(chanceCards.getValue()))
            {
                currentCard = currPlayer.getChanceCards().get(i);
            }
        }
    }

    /**
     * Opens the FXML in the Get Space mode for ChanceCard objects that require application to a Space
     * @param player
     * @param type
     * @param activateFirst
     */
    public void activateGetSpace(Player player, String type, boolean activateFirst)
    {
        this.isCardActivated = activateFirst;
        chanceCards.setVisible(false);
        currPlayer = player;
        switch (type)
        {
            case "property":
                for (int i = 0; i < currPlayer.getOwnedSpaces().size(); i++)
                {
                    if (currPlayer.getOwnedSpaces().get(i).getType() == "property")
                    {
                        contents.add(currPlayer.getOwnedSpaces().get(i).getName());
                    }
                }
                break;
            default:
                for (int i = 0; i < currPlayer.getOwnedSpaces().size(); i++)
                {
                    if (currPlayer.getOwnedSpaces().get(i).getType() != "property")
                    {
                        contents.add(currPlayer.getOwnedSpaces().get(i).getName());
                    }
                }
                break;
        }

        applicableSpaces.setItems(contents);
    }

    /**
     * Closes the FXML
     * @param e
     * @throws Exception
     */
    public void closeScreen (ActionEvent e) throws Exception
    {
        if (isCardActivated)
        {
            for (int i = 0; i < currPlayer.getOwnedSpaces().size(); i++)
            {
                if (currPlayer.getOwnedSpaces().get(i).getName() == applicableSpaces.getValue())
                {
                    space = currPlayer.getOwnedSpaces().get(i);
                    Stage currStage = (Stage)((Node)e.getSource()).getScene().getWindow();
                    currStage.close();
                }
            }
        }
        else
        {
            currentCard.activateChance();
            Stage currStage = (Stage)((Node)e.getSource()).getScene().getWindow();
            currStage.close();

        }

    }

    /**
     * Getter method for the space attribute
     * @return A Space object of the selected space from activateGetSpace
     */
    public Space getSpace ()
    {
        return space;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        applicableSpaces.setItems(contents);
        chanceCards.setItems(chanceCardContents);
    }
}
