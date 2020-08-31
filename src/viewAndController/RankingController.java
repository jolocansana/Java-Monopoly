package viewAndController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.Game;
import model.Property;
import model.Railroad;
import model.Utilities;

public class RankingController {

    @FXML
    private Label first;
    @FXML
    private Label firstCash;

    @FXML
    private Label second;
    @FXML
    private Label secondCash;

    @FXML
    private Label third;
    @FXML
    private Label thirdCash;
    @FXML
    private Group thirdGroup;

    @FXML
    private Label fourth;
    @FXML
    private Label fourthCash;
    @FXML
    private Group fourthGroup;

    private Game game;

    /**
     * Performs Bubble Sort on the Array of type Double containing the value of all players
     * @param playerCash
     * @return
     */
    private double[] bubbleSort(double[] playerCash) {
        int size = playerCash.length;
        double temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (playerCash[j - 1] > playerCash[j]) {
                    temp = playerCash[j - 1];
                    playerCash[j - 1] = playerCash[j];
                    playerCash[j] = temp;
                }

            }
        }

        return playerCash;
    }

    /**
     * Calculates and displays the ranking on the window
     * @param game
     */
    public void createEndGame (Game game)
    {
        this.game = game;

        double[] playerCash;

        if (game.getPlayers().size() >= 4) {
            playerCash = new double[]{0,0,0,0};

            for (int i = 0; i < game.getPlayers().size(); i++)
            {
                playerCash[i] = game.getPlayers().get(i).getMoney();
                for (int j = 0; j < game.getPlayers().get(i).getOwnedSpaces().size(); j++)
                {
                    if (game.getPlayers().get(i).getOwnedSpaces().get(j).getType() == "property")
                    {
                        playerCash[i] += ((Property) game.getPlayers().get(i).getOwnedSpaces().get(j)).getHouseCount() * ((Property) game.getPlayers().get(i).getOwnedSpaces().get(j)).getPrice();
                    }
                    else if (game.getPlayers().get(i).getOwnedSpaces().get(j).getType() == "railroad")
                    {
                        playerCash[i] += ((Railroad) game.getPlayers().get(i).getOwnedSpaces().get(j)).getPrice();
                    }
                    else
                    {
                        playerCash[i] += ((Utilities) game.getPlayers().get(i).getOwnedSpaces().get(j)).getPrice();
                    }
                }
            }

            double[] sortedPlayerCash = bubbleSort(playerCash);

            for (int i = 0; i < game.getPlayers().size(); i++)
            {
                if (sortedPlayerCash[i] == playerCash[0])
                {
                    fourth.setText(game.getPlayers().get(i).getName());
                    fourthCash.setText(Double.toString(sortedPlayerCash[i]));
                    fourthGroup.setVisible(true);
                }
            }

            for (int i = 0; i < game.getPlayers().size(); i++)
            {
                if (sortedPlayerCash[i] == playerCash[1]) {
                    third.setText(game.getPlayers().get(i).getName());
                    thirdCash.setText(Double.toString(sortedPlayerCash[i]));
                    thirdGroup.setVisible(true);
                }
            }
            for (int i = 0; i < game.getPlayers().size(); i++)
            {
                if (sortedPlayerCash[i] == playerCash[2])
                {
                    second.setText(game.getPlayers().get(i).getName());
                    secondCash.setText(Double.toString(sortedPlayerCash[i]));
                }
            }

            for (int i = 0; i < game.getPlayers().size(); i++)
            {
                if (sortedPlayerCash[i] == playerCash[3])
                {
                    first.setText(game.getPlayers().get(i).getName());
                    firstCash.setText(Double.toString(sortedPlayerCash[i]));
                }
            }

        } else if (game.getPlayers().size() >= 3) {
            playerCash = new double[]{0,0,0};

            for (int i = 0; i < game.getPlayers().size(); i++)
            {
                playerCash[i] = game.getPlayers().get(i).getMoney();
                for (int j = 0; j < game.getPlayers().get(i).getOwnedSpaces().size(); j++)
                {
                    if (game.getPlayers().get(i).getOwnedSpaces().get(j).getType() == "property")
                    {
                        playerCash[i] += ((Property) game.getPlayers().get(i).getOwnedSpaces().get(j)).getHouseCount() * ((Property) game.getPlayers().get(i).getOwnedSpaces().get(j)).getPrice();
                    }
                    else if (game.getPlayers().get(i).getOwnedSpaces().get(j).getType() == "railroad")
                    {
                        playerCash[i] += ((Railroad) game.getPlayers().get(i).getOwnedSpaces().get(j)).getPrice();
                    }
                    else
                    {
                        playerCash[i] += ((Utilities) game.getPlayers().get(i).getOwnedSpaces().get(j)).getPrice();
                    }
                }
            }

            double[] sortedPlayerCash = bubbleSort(playerCash);

            for (int i = 0; i < game.getPlayers().size(); i++)
            {
                if (sortedPlayerCash[i] == playerCash[0]) {
                    third.setText(game.getPlayers().get(i).getName());
                    thirdCash.setText(Double.toString(sortedPlayerCash[i]));
                    thirdGroup.setVisible(true);
                }
            }
            for (int i = 0; i < game.getPlayers().size(); i++)
            {
                if (sortedPlayerCash[i] == playerCash[1])
                {
                    second.setText(game.getPlayers().get(i).getName());
                    secondCash.setText(Double.toString(sortedPlayerCash[i]));
                }
            }

            for (int i = 0; i < game.getPlayers().size(); i++)
            {
                if (sortedPlayerCash[i] == playerCash[2])
                {
                    first.setText(game.getPlayers().get(i).getName());
                    firstCash.setText(Double.toString(sortedPlayerCash[i]));
                }
            }


        } else {
            playerCash = new double[]{0,0};

            for (int i = 0; i < game.getPlayers().size(); i++)
            {
                playerCash[i] = game.getPlayers().get(i).getMoney();
                for (int j = 0; j < game.getPlayers().get(i).getOwnedSpaces().size(); j++)
                {
                    if (game.getPlayers().get(i).getOwnedSpaces().get(j).getType() == "property")
                    {
                        playerCash[i] += ((Property) game.getPlayers().get(i).getOwnedSpaces().get(j)).getHouseCount() * ((Property) game.getPlayers().get(i).getOwnedSpaces().get(j)).getPrice();
                    }
                    else if (game.getPlayers().get(i).getOwnedSpaces().get(j).getType() == "railroad")
                    {
                        playerCash[i] += ((Railroad) game.getPlayers().get(i).getOwnedSpaces().get(j)).getPrice();
                    }
                    else
                    {
                        playerCash[i] += ((Utilities) game.getPlayers().get(i).getOwnedSpaces().get(j)).getPrice();
                    }
                }
            }

            double[] sortedPlayerCash = bubbleSort(playerCash);

            for (int i = 0; i < game.getPlayers().size(); i++)
            {
                if (sortedPlayerCash[i] == playerCash[0])
                {
                    second.setText(game.getPlayers().get(i).getName());
                    secondCash.setText(Double.toString(sortedPlayerCash[i]));
                }
            }

            for (int i = 0; i < game.getPlayers().size(); i++)
            {
                if (sortedPlayerCash[i] == playerCash[1])
                {
                    first.setText(game.getPlayers().get(i).getName());
                    firstCash.setText(Double.toString(sortedPlayerCash[i]));
                }
            }


        }

    }

    /**
     * Closes current window and opens the MainMenu FXML
     * @param event
     * @throws Exception
     */
    public void goToMain (ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Stage menuStage = new Stage();
        menuStage.setResizable(false);
        menuStage.setScene(new Scene(root, 622, 350));
        menuStage.show();
        Stage selfWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        selfWindow.close();
    }
}
