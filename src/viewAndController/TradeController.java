package viewAndController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Game;
import model.Player;
import model.Property;
import model.Space;

import java.net.URL;
import java.util.ResourceBundle;

public class TradeController implements Initializable {

    @FXML
    private Label propertyOwner;

    @FXML
    private CheckBox approveTradeCheck;

    @FXML
    private Button performTradeButton;

    @FXML
    private ComboBox<String> listOfProperties;

    @FXML
    private VBox property_color;
    @FXML
    private Label property_name;

    @FXML
    private VBox property_color1;
    @FXML
    private Label property_name1;

    private Game game;

    private Property currentSpace;
    private Property forTradeSpace;
    private ObservableList<String> propertyList;

    private Player currPlayer;

    /**
     * Sets the display up for trading for the current space
     * @param game
     */
    public void startTrade (Game game)
    {
        this.game = game;

        currPlayer = game.getPlayers().get(game.getCurrentPlayerTurn());

        currentSpace = (Property) game.getBoard().get(game.getPlayers().get(game.getCurrentPlayerTurn()).getCurrentSpace());

        switch (currentSpace.getColor()) {
            case "brown":
                property_color.setStyle("-fx-background-color: #996600;-fx-border-color: black;");
                property_name.setText(currentSpace.getName());
                break;
            case "skyblue":
                property_color.setStyle("-fx-background-color: #00ccff;-fx-border-color: black;");
                property_name.setText(currentSpace.getName());
                break;
            case "pink":
                property_color.setStyle("-fx-background-color: #ff66ff;-fx-border-color: black;");
                property_name.setText(currentSpace.getName());
                break;
            case "orange":
                property_color.setStyle("-fx-background-color: #ff9900;-fx-border-color: black;");
                property_name.setText(currentSpace.getName());
                break;
            case "maroon":
                property_color.setStyle("-fx-background-color: #990000;-fx-border-color: black;");
                property_name.setText(currentSpace.getName());
                break;
            case "yellow":
                property_color.setStyle("-fx-background-color: #ffff00;-fx-border-color: black;");
                property_name.setText(currentSpace.getName());
                break;
            case "green":
                property_color.setStyle("-fx-background-color: #33cc33;-fx-border-color: black;");
                property_name.setText(currentSpace.getName());
                break;
        }

        propertyList = FXCollections.observableArrayList();
        propertyOwner.setText(((Property) game.getBoard().get(game.getPlayers().get(game.getCurrentPlayerTurn()).getCurrentSpace())).getOwner().getName());

        for (int i = 0; i < game.getPlayers().get(game.getCurrentPlayerTurn()).getOwnedSpaces().size(); i++)
        {
            String addProperty = game.getPlayers().get(game.getCurrentPlayerTurn()).getOwnedSpaces().get(i).getName();
            propertyList.add(addProperty);
        }

        for (String node : propertyList)
            System.out.println (node);

        listOfProperties.setItems(propertyList);
    }

    /**
     * Checks for the approval of the owner of the Space up for trading
     * @param e
     * @throws Exception
     */
    public void checkTick (ActionEvent e) throws Exception
    {
        if (approveTradeCheck.isSelected() && forTradeSpace != null)
            performTradeButton.setVisible(true);
        else
            performTradeButton.setVisible(false);
    }

    /**
     * Reflects the desired space to be traded for the space up for trading
     * @param e
     * @throws Exception
     */
    public void updateForTrade (ActionEvent e) throws Exception
    {
        String forTradeSpaceName = listOfProperties.getValue();

        for (int i = 0; i < currPlayer.getOwnedSpaces().size(); i++)
        {
            if (currPlayer.getOwnedSpaces().get(i).getName().equals(forTradeSpaceName))
            {
                forTradeSpace = (Property) currPlayer.getOwnedSpaces().get(i);
            }
        }

        switch (forTradeSpace.getColor()) {
            case "brown":
                property_color1.setStyle("-fx-background-color: #996600;-fx-border-color: black;");
                property_name1.setText(forTradeSpace.getName());
                break;
            case "skyblue":
                property_color1.setStyle("-fx-background-color: #00ccff;-fx-border-color: black;");
                property_name1.setText(forTradeSpace.getName());
                break;
            case "pink":
                property_color1.setStyle("-fx-background-color: #ff66ff;-fx-border-color: black;");
                property_name1.setText(forTradeSpace.getName());
                break;
            case "orange":
                property_color1.setStyle("-fx-background-color: #ff9900;-fx-border-color: black;");
                property_name1.setText(forTradeSpace.getName());
                break;
            case "maroon":
                property_color1.setStyle("-fx-background-color: #990000;-fx-border-color: black;");
                property_name1.setText(forTradeSpace.getName());
                break;
            case "yellow":
                property_color1.setStyle("-fx-background-color: #ffff00;-fx-border-color: black;");
                property_name1.setText(forTradeSpace.getName());
                break;
            case "green":
                property_color1.setStyle("-fx-background-color: #33cc33;-fx-border-color: black;");
                property_name1.setText(forTradeSpace.getName());
                break;
        }

    }

    /**
     * Swaps the ownership, and moves the space to the new owner
     * @param e
     * @throws Exception
     */
    public void performTrade (ActionEvent e) throws Exception
    {
        Player ownerPlayer = currentSpace.getOwner();
        currentSpace.getOwner().removeOwnedSpaces(currentSpace);
        forTradeSpace.getOwner().removeOwnedSpaces(forTradeSpace);
        currentSpace.setOwner(currPlayer);
        forTradeSpace.setOwner(ownerPlayer);
        currPlayer.addOwnedSpaces(currentSpace);
        ownerPlayer.addOwnedSpaces(forTradeSpace);

        Stage currStage = (Stage)((Node)e.getSource()).getScene().getWindow();
        currStage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        listOfProperties.setItems(propertyList);
    }
}
