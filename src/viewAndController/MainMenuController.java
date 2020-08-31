package viewAndController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuController {

    /**
     * Listens to a button press and opens a FXML file to setup the game.
     * @param event
     * @throws Exception
     */
    @FXML
    public void startGame (ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("StartGame.fxml"));
        Stage gameStage = new Stage();
        gameStage.setResizable(false);
        gameStage.setScene(new Scene(root, 400, 600));
        gameStage.show();
        Stage selfWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        selfWindow.close();
    }

    /**
     * Closes the window and the program.
     * @param event
     * @throws Exception
     */
    @FXML
    public void quitGame (ActionEvent event) throws Exception
    {
        System.exit(0);
    }
}
