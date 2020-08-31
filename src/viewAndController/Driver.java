package viewAndController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Driver extends Application {

    private Stage primaryStage;

    /**
     * Opens the MainMenu
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 622, 350));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
