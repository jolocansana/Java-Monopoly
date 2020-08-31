package viewAndController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class StartGameController implements Initializable {

    @FXML
    private Group player1;

    @FXML
    private Group player2;

    @FXML
    private Group player3;

    @FXML
    private Group player4;


    @FXML
    private TextField tfPlayer1;

    @FXML
    private TextField tfPlayer2;

    @FXML
    private TextField tfPlayer3;

    @FXML
    private TextField tfPlayer4;

    @FXML
    private ComboBox<String> boardSetup;

    @FXML
    private Button btnAddNewPlayer;

    @FXML
    private Button btnRemoveNewPlayer;

    private int playerCount = 2;

    ObservableList<String> choices = FXCollections.observableArrayList("Default","Custom");

    /**
     * Based on the given specifications of the player, either opens the Game FXML or CustomGame FXML where the player can customize the board
     * @param event
     * @throws Exception
     */
    public void startGame (ActionEvent event) throws Exception
    {
        FXMLLoader gameFXML = new FXMLLoader(getClass().getResource("Game.fxml"));
        Parent root = gameFXML.load();
        GameController gameController = gameFXML.getController();
        Stage startGameStage = (Stage)((Node)event.getSource()).getScene().getWindow();

        String[] players;

        switch (playerCount)
        {
            case 3:
                players = new String[]{tfPlayer1.getText(), tfPlayer2.getText(), tfPlayer3.getText()};
                break;
            case 4:
                players = new String[]{tfPlayer1.getText(), tfPlayer2.getText(), tfPlayer3.getText(), tfPlayer4.getText()};
                break;
            default:
                players = new String[]{tfPlayer1.getText(), tfPlayer2.getText()};
                break;
        }

        int[] idOfSpaces;

        if (boardSetup.getValue().equals("Default"))
        {
            idOfSpaces = new int[]{27,1,2,24,3,4,25,5,28,6,22,7,8,21,9,10,29,11,24,12,20,13,23,14,30,15,16,19,24,17,26,18};
            Stage gameStage = new Stage();
            gameStage.setScene(new Scene(root, 1250, 850));
            gameStage.show();
            gameController.createGame(players, idOfSpaces);
            startGameStage.close();
        }
        else
        {
            FXMLLoader customFXML = new FXMLLoader(getClass().getResource("CustomGame.fxml"));
            Parent customRoot = customFXML.load();
            CustomGameController customController = customFXML.getController();
            customController.setCustomBoard(players);
            startGameStage.setScene(new Scene(customRoot, 1250, 850));
        }

    }

    /**
     * Adds a new player on the screen
     * @param event
     * @throws Exception
     */
    public void AddNewPlayer (ActionEvent event) throws Exception
    {
        if(playerCount != 4)
            playerCount++;

        switch (playerCount)
        {
            case 3:
                player3.setVisible(true);
                btnRemoveNewPlayer.setVisible(true);
                break;
            case 4:
                player4.setVisible(true);
                btnAddNewPlayer.setVisible(false);
                break;
        }
    }

    /**
     * Removes a player on the screen
     * @param event
     * @throws Exception
     */
    public void RemoveNewPlayer (ActionEvent event) throws Exception
    {

        switch (playerCount)
        {
            case 4:
                player4.setVisible(false);
                btnAddNewPlayer.setVisible(true);
                break;
            case 3:
                player3.setVisible(false);
                btnRemoveNewPlayer.setVisible(false);
                break;
        }

        if (playerCount != 2)
            playerCount--;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        boardSetup.setItems(choices);
    }

}
