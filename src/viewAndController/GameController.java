package viewAndController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.*;

import java.io.IOException;
import java.util.ArrayList;

public class GameController {

    @FXML
    private Pane spaceDisplay1;
    @FXML
    private Pane spaceDisplay2;
    @FXML
    private Pane spaceDisplay3;
    @FXML
    private Pane spaceDisplay4;
    @FXML
    private Pane spaceDisplay5;
    @FXML
    private Pane spaceDisplay6;
    @FXML
    private Pane spaceDisplay7;
    @FXML
    private Pane spaceDisplay8;
    @FXML
    private Pane spaceDisplay9;
    @FXML
    private Pane spaceDisplay10;
    @FXML
    private Pane spaceDisplay11;
    @FXML
    private Pane spaceDisplay12;
    @FXML
    private Pane spaceDisplay13;
    @FXML
    private Pane spaceDisplay14;
    @FXML
    private Pane spaceDisplay15;
    @FXML
    private Pane spaceDisplay16;
    @FXML
    private Pane spaceDisplay17;
    @FXML
    private Pane spaceDisplay18;
    @FXML
    private Pane spaceDisplay19;
    @FXML
    private Pane spaceDisplay20;
    @FXML
    private Pane spaceDisplay21;
    @FXML
    private Pane spaceDisplay22;
    @FXML
    private Pane spaceDisplay23;
    @FXML
    private Pane spaceDisplay24;
    @FXML
    private Pane spaceDisplay25;
    @FXML
    private Pane spaceDisplay26;
    @FXML
    private Pane spaceDisplay27;
    @FXML
    private Pane spaceDisplay28;


    @FXML
    private VBox property_color1;
    @FXML
    private VBox property_color2;
    @FXML
    private VBox property_color3;
    @FXML
    private VBox property_color4;
    @FXML
    private VBox property_color5;
    @FXML
    private VBox property_color6;
    @FXML
    private VBox property_color7;
    @FXML
    private VBox property_color8;
    @FXML
    private VBox property_color9;
    @FXML
    private VBox property_color10;
    @FXML
    private VBox property_color11;
    @FXML
    private VBox property_color12;
    @FXML
    private VBox property_color13;
    @FXML
    private VBox property_color14;
    @FXML
    private VBox property_color15;
    @FXML
    private VBox property_color16;
    @FXML
    private VBox property_color17;
    @FXML
    private VBox property_color18;
    @FXML
    private VBox property_color19;
    @FXML
    private VBox property_color20;
    @FXML
    private VBox property_color21;
    @FXML
    private VBox property_color22;
    @FXML
    private VBox property_color23;
    @FXML
    private VBox property_color24;
    @FXML
    private VBox property_color25;
    @FXML
    private VBox property_color26;
    @FXML
    private VBox property_color27;
    @FXML
    private VBox property_color28;


    @FXML
    private Label property_name1;
    @FXML
    private Label property_name2;
    @FXML
    private Label property_name3;
    @FXML
    private Label property_name4;
    @FXML
    private Label property_name5;
    @FXML
    private Label property_name6;
    @FXML
    private Label property_name7;
    @FXML
    private Label property_name8;
    @FXML
    private Label property_name9;
    @FXML
    private Label property_name10;
    @FXML
    private Label property_name11;
    @FXML
    private Label property_name12;
    @FXML
    private Label property_name13;
    @FXML
    private Label property_name14;
    @FXML
    private Label property_name15;
    @FXML
    private Label property_name16;
    @FXML
    private Label property_name17;
    @FXML
    private Label property_name18;
    @FXML
    private Label property_name19;
    @FXML
    private Label property_name20;
    @FXML
    private Label property_name21;
    @FXML
    private Label property_name22;
    @FXML
    private Label property_name23;
    @FXML
    private Label property_name24;
    @FXML
    private Label property_name25;
    @FXML
    private Label property_name26;
    @FXML
    private Label property_name27;
    @FXML
    private Label property_name28;

    @FXML
    private GridPane corner_players1;
    @FXML
    private GridPane property_players1;
    @FXML
    private GridPane property_players2;
    @FXML
    private GridPane property_players3;
    @FXML
    private GridPane property_players4;
    @FXML
    private GridPane property_players5;
    @FXML
    private GridPane property_players6;
    @FXML
    private GridPane property_players7;
    @FXML
    private GridPane corner_players2;
    @FXML
    private GridPane property_players8;
    @FXML
    private GridPane property_players9;
    @FXML
    private GridPane property_players10;
    @FXML
    private GridPane property_players11;
    @FXML
    private GridPane property_players12;
    @FXML
    private GridPane property_players13;
    @FXML
    private GridPane property_players14;
    @FXML
    private GridPane corner_players3;
    @FXML
    private GridPane property_players15;
    @FXML
    private GridPane property_players16;
    @FXML
    private GridPane property_players17;
    @FXML
    private GridPane property_players18;
    @FXML
    private GridPane property_players19;
    @FXML
    private GridPane property_players20;
    @FXML
    private GridPane property_players21;
    @FXML
    private GridPane corner_players4;
    @FXML
    private GridPane property_players22;
    @FXML
    private GridPane property_players23;
    @FXML
    private GridPane property_players24;
    @FXML
    private GridPane property_players25;
    @FXML
    private GridPane property_players26;
    @FXML
    private GridPane property_players27;
    @FXML
    private GridPane property_players28;

    @FXML
    private Label diceRollDisplay;

    @FXML
    private Label currentPlayerName;
    @FXML
    private Label currentCash;
    @FXML
    private TextArea currentOwnedSpaces;


    @FXML
    private Pane spaceDisplay;
    @FXML
    private VBox property_color;
    @FXML
    private Label property_name;
    @FXML
    private Label propertyPrice;
    @FXML
    private Label propertyRent;
    @FXML
    private Label propertyFootTraffic;
    @FXML
    private Label propertyHouses;
    @FXML
    private Label propertyHotel;
    @FXML
    private Label propertyOwner;
    @FXML
    private Group nonProperty;
    @FXML
    private Group ownable;

    @FXML
    private Button button0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;


    @FXML
    private TextArea logScreen;

    @FXML
    private Label bankCash;

    private ArrayList<Pane> spaceBlocks;

    private ArrayList<VBox> propertyColors;

    private ArrayList<Label> propertyNames;

    private ArrayList<GridPane> playerIcons;

    Game game;

    private String gameLog;
    private String currentOwned;

    private Label playerOneIcon;
    private Label playerTwoIcon;
    private Label playerThreeIcon;
    private Label playerFourIcon;

    private Stage selfStage;



    private String[][] defaultDesign =
            {
                    {"Agno", "brown", "property"},
                    {"TNC", "brown", "property"},
                    {"Potato Corner", "skyblue", "property"},
                    {"Zark's Burger", "skyblue", "property"},
                    {"Income Tax", "none", "tax"},
                    {"Coffee Bean", "skyblue", "property"},
                    {"Gongcha", "pink", "property"},
                    {"Electric", "none", "utilities"},
                    {"Corean Gate", "pink", "property"},
                    {"Techtite", "pink", "property"},
                    {"Metro", "none", "railroad"},
                    {"Mercury Drug", "orange", "property"},
                    {"Mont Albo", "orange", "property"},
                    {"Samgyupsalamat", "orange", "property"},
                    {"Chance", "none", "chance"},
                    {"Starbucks", "maroon", "property"},
                    {"South", "none", "railroad"},
                    {"McDonalds", "maroon", "property"},
                    {"Water", "none", "utilities"},
                    {"National Bookstore", "maroon", "property"},
                    {"Shell", "yellow", "property"},
                    {"Savemore", "yellow", "property"},
                    {"North", "none", "railroad"},
                    {"Chance", "none", "chance"},
                    {"Green Residences", "green", "property"},
                    {"Luxury Tax", "none", "tax"},
                    {"DLSU", "green", "property"}
            };

    /**
     * Creates a new Game object, and creates the board display
     * @param players
     * @param idOfSpace
     */
    public void createGame (String[] players, int[] idOfSpace) {

        spaceBlocks = new ArrayList<>();
        spaceBlocks.add(spaceDisplay1);
        spaceBlocks.add(spaceDisplay2);
        spaceBlocks.add(spaceDisplay3);
        spaceBlocks.add(spaceDisplay4);
        spaceBlocks.add(spaceDisplay5);
        spaceBlocks.add(spaceDisplay6);
        spaceBlocks.add(spaceDisplay7);
        spaceBlocks.add(spaceDisplay8);
        spaceBlocks.add(spaceDisplay9);
        spaceBlocks.add(spaceDisplay10);
        spaceBlocks.add(spaceDisplay11);
        spaceBlocks.add(spaceDisplay12);
        spaceBlocks.add(spaceDisplay13);
        spaceBlocks.add(spaceDisplay14);
        spaceBlocks.add(spaceDisplay15);
        spaceBlocks.add(spaceDisplay16);
        spaceBlocks.add(spaceDisplay17);
        spaceBlocks.add(spaceDisplay18);
        spaceBlocks.add(spaceDisplay19);
        spaceBlocks.add(spaceDisplay20);
        spaceBlocks.add(spaceDisplay21);
        spaceBlocks.add(spaceDisplay22);
        spaceBlocks.add(spaceDisplay23);
        spaceBlocks.add(spaceDisplay24);
        spaceBlocks.add(spaceDisplay25);
        spaceBlocks.add(spaceDisplay26);
        spaceBlocks.add(spaceDisplay27);
        spaceBlocks.add(spaceDisplay28);

        propertyColors = new ArrayList<>();
        propertyColors.add(property_color1);
        propertyColors.add(property_color2);
        propertyColors.add(property_color3);
        propertyColors.add(property_color4);
        propertyColors.add(property_color5);
        propertyColors.add(property_color6);
        propertyColors.add(property_color7);
        propertyColors.add(property_color8);
        propertyColors.add(property_color9);
        propertyColors.add(property_color10);
        propertyColors.add(property_color11);
        propertyColors.add(property_color12);
        propertyColors.add(property_color13);
        propertyColors.add(property_color14);
        propertyColors.add(property_color15);
        propertyColors.add(property_color16);
        propertyColors.add(property_color17);
        propertyColors.add(property_color18);
        propertyColors.add(property_color19);
        propertyColors.add(property_color20);
        propertyColors.add(property_color21);
        propertyColors.add(property_color22);
        propertyColors.add(property_color23);
        propertyColors.add(property_color24);
        propertyColors.add(property_color25);
        propertyColors.add(property_color26);
        propertyColors.add(property_color27);
        propertyColors.add(property_color28);

        propertyNames = new ArrayList<>();
        propertyNames.add(property_name1);
        propertyNames.add(property_name2);
        propertyNames.add(property_name3);
        propertyNames.add(property_name4);
        propertyNames.add(property_name5);
        propertyNames.add(property_name6);
        propertyNames.add(property_name7);
        propertyNames.add(property_name8);
        propertyNames.add(property_name9);
        propertyNames.add(property_name10);
        propertyNames.add(property_name11);
        propertyNames.add(property_name12);
        propertyNames.add(property_name13);
        propertyNames.add(property_name14);
        propertyNames.add(property_name15);
        propertyNames.add(property_name16);
        propertyNames.add(property_name17);
        propertyNames.add(property_name18);
        propertyNames.add(property_name19);
        propertyNames.add(property_name20);
        propertyNames.add(property_name21);
        propertyNames.add(property_name22);
        propertyNames.add(property_name23);
        propertyNames.add(property_name24);
        propertyNames.add(property_name25);
        propertyNames.add(property_name26);
        propertyNames.add(property_name27);
        propertyNames.add(property_name28);

        playerIcons = new ArrayList<>();
        playerIcons.add(corner_players1);
        playerIcons.add(property_players1);
        playerIcons.add(property_players2);
        playerIcons.add(property_players3);
        playerIcons.add(property_players4);
        playerIcons.add(property_players5);
        playerIcons.add(property_players6);
        playerIcons.add(property_players7);
        playerIcons.add(corner_players2);
        playerIcons.add(property_players8);
        playerIcons.add(property_players9);
        playerIcons.add(property_players10);
        playerIcons.add(property_players11);
        playerIcons.add(property_players12);
        playerIcons.add(property_players13);
        playerIcons.add(property_players14);
        playerIcons.add(corner_players3);
        playerIcons.add(property_players15);
        playerIcons.add(property_players16);
        playerIcons.add(property_players17);
        playerIcons.add(property_players18);
        playerIcons.add(property_players19);
        playerIcons.add(property_players20);
        playerIcons.add(property_players21);
        playerIcons.add(corner_players4);
        playerIcons.add(property_players22);
        playerIcons.add(property_players23);
        playerIcons.add(property_players24);
        playerIcons.add(property_players25);
        playerIcons.add(property_players26);
        playerIcons.add(property_players27);
        playerIcons.add(property_players28);


        game = new Game(players, idOfSpace);

        int j = 0;

        for (int i = 0; i < game.getBoard().size(); i++) {
            if (i != 0 && i != 8 && i != 16 && i != 24) {
                if (game.getBoard().get(i).getType() == "property") {
                    switch (((Property) (game.getBoard().get(i))).getColor()) {
                        case "brown":
                            propertyColors.get(j).setStyle("-fx-background-color: #996600;-fx-border-color: black;");
                            propertyNames.get(j).setText(game.getBoard().get(i).getName());
                            break;
                        case "skyblue":
                            propertyColors.get(j).setStyle("-fx-background-color: #00ccff;-fx-border-color: black;");
                            propertyNames.get(j).setText(game.getBoard().get(i).getName());
                            break;
                        case "pink":
                            propertyColors.get(j).setStyle("-fx-background-color: #ff66ff;-fx-border-color: black;");
                            propertyNames.get(j).setText(game.getBoard().get(i).getName());
                            break;
                        case "orange":
                            propertyColors.get(j).setStyle("-fx-background-color: #ff9900;-fx-border-color: black;");
                            propertyNames.get(j).setText(game.getBoard().get(i).getName());
                            break;
                        case "maroon":
                            propertyColors.get(j).setStyle("-fx-background-color: #990000;-fx-border-color: black;");
                            propertyNames.get(j).setText(game.getBoard().get(i).getName());
                            break;
                        case "yellow":
                            propertyColors.get(j).setStyle("-fx-background-color: #ffff00;-fx-border-color: black;");
                            propertyNames.get(j).setText(game.getBoard().get(i).getName());
                            break;
                        case "green":
                            propertyColors.get(j).setStyle("-fx-background-color: #33cc33;-fx-border-color: black;");
                            propertyNames.get(j).setText(game.getBoard().get(i).getName());
                            break;
                    }
                } else {
                    propertyColors.get(j).setStyle("-fx-background-color: white; -fx-border-color: black;");
                    propertyNames.get(j).setText(game.getBoard().get(i).getName());
                }
                j++;
            }
        }


        for (int i = 0; i < game.getPlayers().size(); i++) {
            game.getBoard().get(0).addPlayersResiding(game.getPlayers().get(i));
        }

        switch (game.getPlayers().size())
        {
            case 2:
                playerOneIcon = new Label(game.getPlayers().get(0).getName());
                playerTwoIcon = new Label(game.getPlayers().get(1).getName());
                playerIcons.get(0).add(playerOneIcon, 0, 0);
                playerIcons.get(0).add(playerTwoIcon, 1, 0);
                break;
            case 3:
                playerOneIcon = new Label(game.getPlayers().get(0).getName());
                playerTwoIcon = new Label(game.getPlayers().get(1).getName());
                playerThreeIcon = new Label(game.getPlayers().get(2).getName());
                playerIcons.get(0).add(playerOneIcon, 0, 0);
                playerIcons.get(0).add(playerTwoIcon, 1, 0);
                playerIcons.get(0).add(playerThreeIcon, 0, 1);
                break;
            case 4:
                playerOneIcon = new Label(game.getPlayers().get(0).getName());
                playerTwoIcon = new Label(game.getPlayers().get(1).getName());
                playerThreeIcon = new Label(game.getPlayers().get(2).getName());
                playerFourIcon = new Label(game.getPlayers().get(3).getName());
                playerIcons.get(0).add(playerOneIcon, 0, 0);
                playerIcons.get(0).add(playerTwoIcon, 1, 0);
                playerIcons.get(0).add(playerThreeIcon, 0, 1);
                playerIcons.get(0).add(playerFourIcon, 1, 1);
                break;
        }

    gameLog = String.format("New game created. Players start with %.2f cash. Bank starts with %.2f cash.\n", game.getPlayers().get(1).getMoney(), game.getBank().getMoney());

    logScreen.setText(gameLog);

    }

    /**
     * Calls a new turn and setups the game for the next player
     */
    public void newTurn ()
    {
        try{
            if (game.GameOver())
            {
                FXMLLoader rankingFXML = new FXMLLoader(getClass().getResource("Ranking.fxml"));
                Parent rankingRoot = rankingFXML.load();
                RankingController rankingController = rankingFXML.getController();
                rankingController.createEndGame(game);
                Stage rankingStage = new Stage();
                rankingStage.setResizable(false);
                rankingStage.setScene(new Scene(rankingRoot, 622, 350));
                rankingStage.show();
                selfStage.close();
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }


        button0.setText("End Turn");

        bankCash.setText(Double.toString(game.getBank().getMoney()));
        game.nextPlayerTurn(); // Makes currentPlayerTurn next
        currentPlayerName.setText(game.getPlayers().get(game.getCurrentPlayerTurn()).getName()); // Change the text of CurrentPlayer

        currentOwned = "[Owned Spaces]\n";
        for (int i = 0; i < game.getPlayers().get(game.getCurrentPlayerTurn()).getOwnedSpaces().size(); i++)
        {
            currentOwned += String.format ("%s\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getOwnedSpaces().get(i).getName());
        }
        currentOwnedSpaces.setText(currentOwned);

        if (game.getPlayers().get(game.getCurrentPlayerTurn()).getInJailStatus())
        {
            game.getPlayers().get(game.getCurrentPlayerTurn()).expense(50);
            game.getBank().addMoney(50);
            gameLog += String.format("Player '%s' paid 50 cash to get out of jail!\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName());
            logScreen.setText(gameLog);
            game.getPlayers().get(game.getCurrentPlayerTurn()).setInJailStatus(false);
        }

        game.getBoard().get(game.getPlayers().get(game.getCurrentPlayerTurn()).getCurrentSpace()).removePlayersResiding(game.getPlayers().get(game.getCurrentPlayerTurn())); // Removes player from old space
        movePlayers(); // Change display of Icons
        game.getBoard().get(game.getPlayers().get(game.getCurrentPlayerTurn()).getCurrentSpace()).addPlayersResiding(game.getPlayers().get(game.getCurrentPlayerTurn())); // Add player from new space
        Space currentSpace = game.getBoard().get(game.getPlayers().get(game.getCurrentPlayerTurn()).getCurrentSpace());

        //gameLog += String.format("Player '%s' moves to %s\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), currentSpace.getName());
        logScreen.setText(gameLog);
        logScreen.setScrollTop(Double.MAX_VALUE);

        if (currentSpace.getType() == "property") {
            switch (((Property) (currentSpace)).getColor()) {
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
        } else {
            property_color.setStyle("-fx-background-color: white; -fx-border-color: black;");
            property_name.setText(currentSpace.getName());
        }

        performLand();
    }

    /**
     * Looks on the current space and performs specific actions based on the state of the current space
     */
    public void performLand ()
    {
        // buttons: purchase, trade, do nothing
        // auto: pay rent, and develop are automatic

        button1.setVisible(false);


        if (game.getPlayers().get(game.getCurrentPlayerTurn()).getChanceCards().size() > 0)
        {
            button2.setVisible(true);
            button2.setText("Activate Chance Card");
            button2.setOnAction(event -> {
                openChanceCards();
            });
        } else
        {
            button2.setVisible(false);
        }

        Space currentSpace = game.getBoard().get(game.getPlayers().get(game.getCurrentPlayerTurn()).getCurrentSpace());

        nonProperty.setVisible(false);
        ownable.setVisible(true);
        propertyPrice.setText("");
        propertyRent.setText("");

        switch (currentSpace.getType())
        {
            case "property":

                ((Property) currentSpace).addFootTraffic();

                nonProperty.setVisible(true);
                propertyPrice.setText(Double.toString(((Property) currentSpace).getPrice()));
                propertyRent.setText(Double.toString(((Property) currentSpace).getRent()));

                if (((Property) currentSpace).getHouseCount() < 5)
                {
                    propertyHouses.setText(Integer.toString(((Property) currentSpace).getHouseCount()));
                    propertyHotel.setText("0");
                }
                else
                {
                    propertyHouses.setText(Integer.toString(((Property) currentSpace).getHouseCount()-1));
                    propertyHotel.setText("1");
                }

                propertyFootTraffic.setText(String.format("%d / %d", ((Property) currentSpace).getFootTraffic(), ((Property) currentSpace).getFootTrafficLimit()));
                propertyOwner.setText("Unowned");


                if (((Property) (currentSpace)).getOwner() == null)
                {
                    button1.setText("Purchase");
                    button1.setOnAction((event -> {

                        game.getPlayers().get(game.getCurrentPlayerTurn()).addOwnedSpaces(currentSpace);
                        ((Property) currentSpace).setOwner(game.getPlayers().get(game.getCurrentPlayerTurn()));
                        game.getPlayers().get(game.getCurrentPlayerTurn()).expense(((Property) currentSpace).getPrice());
                        game.getBank().addMoney(((Property) currentSpace).getPrice());
                        ((Property) (currentSpace)).setOwner(game.getPlayers().get(game.getCurrentPlayerTurn()));
                        gameLog += String.format("Player '%s' purchases %s for %.2f. Player now has %.2f cash\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), currentSpace.getName(), ((Property) currentSpace).getPrice(), game.getPlayers().get(game.getCurrentPlayerTurn()).getMoney());
                        newTurn();

                    }));
                    button1.setVisible(true);
                }
                else if (((Property) (currentSpace)).getOwner() != game.getPlayers().get(game.getCurrentPlayerTurn()))
                {
                    button1.setText("Trade for this Property");
                    game.getPlayers().get(game.getCurrentPlayerTurn()).expense(((Property) currentSpace).getRent());
                    ((Property) currentSpace).getOwner().earn(((Property) currentSpace).getRent());
                    gameLog += String.format("Player '%s' has landed on %s and paid %.2f rent\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), currentSpace.getName(), ((Property) currentSpace).getRent());
                    logScreen.setText(gameLog);
                    ((Property) currentSpace).addCollectedRent(((Property) currentSpace).getRent());
                    System.out.println (((Property) currentSpace).getCollectedRent());

                    // IF YOU WANT TO SET FOREVER, COMMENT THIS OUT
                    if (((Property) currentSpace).getMultiplier() == 2)
                        ((Property) currentSpace).setMultiplier(1);

                    propertyOwner.setText(((Property) currentSpace).getOwner().getName());
                    button1.setOnAction((event -> {

                        doTrade();
                        gameLog += String.format("Player '%s' has performed a trade for %s\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), currentSpace.getName());
                        button1.setVisible(false);
                        newTurn();

                    }));
                    button1.setVisible(true);
                }
                else if (game.getPlayers().get(game.getCurrentPlayerTurn()).equals(((Property) currentSpace).getOwner()))
                {
                    propertyOwner.setText(((Property) currentSpace).getOwner().getName());

                    if (game.getPlayers().get(game.getCurrentPlayerTurn()).getMoney() >= ((Property) currentSpace).getHousePrice() && (((Property) currentSpace).getFootTraffic() >= ((Property) currentSpace).getFootTrafficLimit() || ((Property) currentSpace).getCollectedRent() >= ((Property) currentSpace).getHousePrice()))
                    {
                        int colorId = -1;

                        switch (((Property) currentSpace).getColor())
                        {
                            case "brown":
                                colorId = 0;
                                break;
                            case "skyblue":
                                colorId = 1;
                                break;
                            case "pink":
                                colorId = 2;
                                break;
                            case "orange":
                                colorId = 3;
                                break;
                            case "maroon":
                                colorId = 4;
                                break;
                            case "yellow":
                                colorId = 5;
                                break;
                            case "green":
                                colorId = 6;
                                break;
                        }

                        if (((Property) currentSpace).getHouseCount() < 4)
                        {
                            ((Property) currentSpace).develop();
                            gameLog += String.format("Player '%s' has paid %.2f to develop %s. The property now has %d houses\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), ((Property) currentSpace).getHousePrice(), currentSpace.getName(), ((Property) currentSpace).getHouseCount());
                            logScreen.setText(gameLog);
                            logScreen.setScrollTop(Double.MAX_VALUE);
                        }
                        else if (((Property) currentSpace).getHouseCount() == 4 && ((Property) currentSpace).getOwner().getCountOwnedSpaces()[colorId] == ((Property) currentSpace).getOwner().getTrueCountOwned()[colorId])
                        {
                            ((Property) currentSpace).develop();
                            gameLog += String.format("Player '%s' has paid %.2f to develop %s. The property now has %d houses and hotel\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), ((Property) currentSpace).getHousePrice(), currentSpace.getName(), ((Property) currentSpace).getHouseCount() - 1);
                            logScreen.setText(gameLog);
                            logScreen.setScrollTop(Double.MAX_VALUE);
                        }

                    }
                }
                break;
            case "utilities":

                propertyPrice.setText(Double.toString(((Utilities) currentSpace).getPrice()));
                propertyRent.setText(Double.toString(((Utilities) currentSpace).getRent()));

                if (((Utilities) (currentSpace)).getOwner() == null)
                {
                    button1.setText("Purchase");
                    button1.setOnAction((event -> {
                        game.getPlayers().get(game.getCurrentPlayerTurn()).addOwnedSpaces(currentSpace);
                        ((Utilities) currentSpace).setOwner(game.getPlayers().get(game.getCurrentPlayerTurn()));
                        game.getPlayers().get(game.getCurrentPlayerTurn()).expense(((Utilities) currentSpace).getPrice());
                        game.getBank().addMoney(((Utilities) currentSpace).getPrice());
                        gameLog += String.format("Player '%s' purchases %s for %.2f. Player now has %.2f cash\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), currentSpace.getName(), ((Utilities) currentSpace).getPrice(), game.getPlayers().get(game.getCurrentPlayerTurn()).getMoney());
                        newTurn();
                    }));
                    button1.setVisible(true);
                    propertyOwner.setText("Unowned");

                }
                else
                {
                    propertyOwner.setText(((Utilities) currentSpace).getOwner().getName());
                    game.getPlayers().get(game.getCurrentPlayerTurn()).expense(((Utilities) currentSpace).getRent());
                    ((Utilities) currentSpace).getOwner().earn(((Utilities) currentSpace).getRent());
                    gameLog += String.format("Player '%s' has landed on %s and paid %.2f rent\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), currentSpace.getName(), ((Utilities) currentSpace).getRent());
                    logScreen.setText(gameLog);
                }
                break;
            case "railroad":

                propertyPrice.setText(Double.toString(((Railroad) currentSpace).getPrice()));
                propertyRent.setText(Double.toString(((Railroad) currentSpace).getRent()));

                if (((Railroad) (currentSpace)).getOwner() == null)
                {
                    button1.setText("Purchase");
                    button1.setOnAction((event -> {
                        game.getPlayers().get(game.getCurrentPlayerTurn()).addOwnedSpaces(currentSpace);
                        ((Railroad) currentSpace).setOwner(game.getPlayers().get(game.getCurrentPlayerTurn()));
                        game.getPlayers().get(game.getCurrentPlayerTurn()).expense(((Railroad) currentSpace).getPrice());
                        game.getBank().addMoney(((Railroad) currentSpace).getPrice());
                        gameLog += String.format("Player '%s' purchases %s for %.2f. Player now has %.2f cash\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), currentSpace.getName(), ((Railroad) currentSpace).getPrice(), game.getPlayers().get(game.getCurrentPlayerTurn()).getMoney());
                        newTurn();
                    }));
                    button1.setVisible(true);
                    propertyOwner.setText("Unowned");
                }
                else
                {
                    game.getPlayers().get(game.getCurrentPlayerTurn()).expense(((Railroad) currentSpace).getRent());
                    ((Railroad) currentSpace).getOwner().earn(((Railroad) currentSpace).getRent());
                    gameLog += String.format("Player '%s' has landed on %s and paid %.2f rent\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), currentSpace.getName(), ((Railroad) currentSpace).getRent());
                    logScreen.setText(gameLog);
                    propertyOwner.setText(((Railroad) currentSpace).getOwner().getName());
                }
                break;
            case "tax":
                ownable.setVisible(false);
                double tax = ((Tax) currentSpace).getTax(game.getPlayers().get(game.getCurrentPlayerTurn()), currentSpace.getName());
                game.getPlayers().get(game.getCurrentPlayerTurn()).expense(tax);
                game.getBank().addMoney(tax);
                gameLog += String.format("Player '%s' has landed on %s and paid %.2f tax\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), currentSpace.getName(), tax);
                logScreen.setText(gameLog);
                logScreen.setScrollTop(Double.MAX_VALUE);
                break;
            case "corner":
                ownable.setVisible(false);
                switch (currentSpace.getName())
                {
                    case "Jail":
                        game.getPlayers().get(game.getCurrentPlayerTurn()).setInJailStatus(true);
                        gameLog += String.format("Player '%s' has landed on %s. Player will wait for next turn. \n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), currentSpace.getName());
                        logScreen.setText(gameLog);
                        logScreen.setScrollTop(Double.MAX_VALUE);

                        /*
                        for (int i = 0; i < game.getPlayers().get(game.getCurrentPlayerTurn()).getChanceCards().size(); i++)
                        {
                            if (game.getPlayers().get(game.getCurrentPlayerTurn()).getChanceCards().get(i).getDescription() == "Get out of jail free.")
                            {
                                game.getPlayers().get(game.getCurrentPlayerTurn()).getChanceCards().get(i).activateChance();
                            }
                        }
                        */

                        break;
                    case "Free Parking":
                        gameLog += String.format("Player '%s' has landed on %s. Player will wait for next turn. \n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), currentSpace.getName());
                        logScreen.setText(gameLog);
                        logScreen.setScrollTop(Double.MAX_VALUE);
                        break;
                    case "Community Service":
                        game.getPlayers().get(game.getCurrentPlayerTurn()).expense(50);
                        game.getBank().addMoney(50);
                        gameLog += String.format("Player '%s' has landed on %s. Player has paid 50 to the bank\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), currentSpace.getName());
                        logScreen.setText(gameLog);
                        logScreen.setScrollTop(Double.MAX_VALUE);
                    default:
                        break;
                }
                break;
            case "chance":
                ownable.setVisible(false);
                ChanceCard chanceCard = game.getChanceDeck().getCard();
                gameLog += String.format("Player '%s' has landed on %s. Player got '%s' chance card\n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName(), currentSpace.getName(), chanceCard.getDescription());
                logScreen.setText(gameLog);
                logScreen.setScrollTop(Double.MAX_VALUE);
                if (chanceCard.getIsKeepable())
                {
                    chanceCard.setOwner(game.getPlayers().get(game.getCurrentPlayerTurn()));
                    button2.setVisible(true);
                    button2.setText("Activate Chance Card");
                    button2.setOnAction(event -> {
                        openChanceCards();
                    });
                }
                else
                {
                    chanceCard.setOwner(game.getPlayers().get(game.getCurrentPlayerTurn()));
                    chanceCard.activateChance();
                    gameLog += chanceCard.getDescription() + "\n";
                    logScreen.setText(gameLog);
                    logScreen.setScrollTop(Double.MAX_VALUE);
                    if (chanceCard.getIsGoTo())
                    {
                        moveIconChanceCard();
                        performLand();
                    }
                }


                break;
        }

        currentCash.setText(Double.toString(game.getPlayers().get(game.getCurrentPlayerTurn()).getMoney()));
    }

    /**
     * Opens a FXML file where trading of properties between two players occurs.
     */
    public void doTrade ()
    {
        try
        {
            Stage tradeStage = new Stage();
            FXMLLoader tradeFXML = new FXMLLoader(getClass().getResource("Trade.fxml"));
            Parent tradeRoot = tradeFXML.load();
            TradeController tradeFXMLController = tradeFXML.getController();
            tradeFXMLController.startTrade(game);
            tradeStage.setScene(new Scene(tradeRoot, 600, 400));
            tradeStage.showAndWait();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Opens a FXML that displays all owned Chance Cards of the player
     */
    public void openChanceCards ()
    {
        try
        {
            Stage chanceStage = new Stage();
            FXMLLoader chanceFXML = new FXMLLoader(getClass().getResource("../viewAndController/Chance.fxml"));
            Parent tradeRoot = chanceFXML.load();
            ChanceController chanceFXMLController = chanceFXML.getController();
            chanceFXMLController.openChanceCards(game.getPlayers().get(game.getCurrentPlayerTurn()));
            chanceStage.setScene(new Scene(tradeRoot, 300, 350));
            chanceStage.showAndWait();


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    /**
     * Changes the current location index of the player and performs necessary actions
     */
    public void movePlayers () // Checks players residing to check for players
    {

        Label currentPlayer;
        int row, col;
        int diceRoll = game.getPlayers().get(game.getCurrentPlayerTurn()).rolldice();
        diceRoll = 1;

        switch (game.getCurrentPlayerTurn())
        {
            case 0:
                currentPlayer = playerOneIcon;
                row = 0;
                col = 0;
                break;
            case 1:
                currentPlayer = playerTwoIcon;
                row = 0;
                col = 1;
                break;
            case 2:
                currentPlayer = playerThreeIcon;
                row = 1;
                col = 0;
                break;
            default:
                currentPlayer = playerFourIcon;
                row = 1;
                col = 1;
                break;
        }

        playerIcons.get(game.getPlayers().get(game.getCurrentPlayerTurn()).getCurrentSpace()).getChildren().remove(currentPlayer);
        diceRollDisplay.setText(Integer.toString(diceRoll));
        int oldPos = game.getPlayers().get(game.getCurrentPlayerTurn()).getCurrentSpace();
        game.getPlayers().get(game.getCurrentPlayerTurn()).move(diceRoll); // Move player

        if (oldPos > game.getPlayers().get(game.getCurrentPlayerTurn()).getCurrentSpace())
        {
            game.getPlayers().get(game.getCurrentPlayerTurn()).earn(game.getBank().removeMoney(200));
            gameLog += String.format("Player '%s' has passed or is on 'Start'. Player receives 200 cash. \n", game.getPlayers().get(game.getCurrentPlayerTurn()).getName());
            logScreen.setText(gameLog);
        }

        playerIcons.get(game.getPlayers().get(game.getCurrentPlayerTurn()).getCurrentSpace()).add(currentPlayer, col, row);

    }

    /**
     * Reflects the change of location index of the player on the board display
     */
    public void moveIconChanceCard ()
    {
        Label currentPlayer;
        int row, col;

        switch (game.getCurrentPlayerTurn())
        {
            case 0:
                currentPlayer = playerOneIcon;
                row = 0;
                col = 0;
                break;
            case 1:
                currentPlayer = playerTwoIcon;
                row = 0;
                col = 1;
                break;
            case 2:
                currentPlayer = playerThreeIcon;
                row = 1;
                col = 0;
                break;
            default:
                currentPlayer = playerFourIcon;
                row = 1;
                col = 1;
                break;
        }

        playerIcons.get(game.getPlayers().get(game.getCurrentPlayerTurn()).getOldCurrSpaceChanceCard()).getChildren().remove(currentPlayer);
        playerIcons.get(game.getPlayers().get(game.getCurrentPlayerTurn()).getCurrentSpace()).add(currentPlayer, col, row);
    }

    /**
     * Reflects the data of the Space where the mouse cursor is hovering on
     * @param e
     * @throws Exception
     */
    public void onMouseHover (MouseEvent e) throws Exception {
        selfStage = (Stage)((Node)e.getSource()).getScene().getWindow();

        int sourceId = 0;
        for (int i = 0; i < 28; i++) {
            Node source = (Node) e.getSource();
            if (spaceBlocks.get(i).getId().equals(source.getId())) {
                sourceId = i;
            }
        }

        String sourceName = propertyNames.get(sourceId).getText();
        Space toDisplay = null;

        for (int i = 0; i < game.getBoard().size(); i++) {
            if (sourceName.equals(game.getBoard().get(i).getName())) {
                toDisplay = game.getBoard().get(i);
            }
        }

        ownable.setVisible(true);

        for (int i = 0; i < game.getBoard().size(); i++) {
            if (i != 0 && i != 8 && i != 16 && i != 24) {
                if (toDisplay.getType() == "property") {
                    switch (((Property) (toDisplay)).getColor()) {
                        case "brown":
                            property_color.setStyle("-fx-background-color: #996600;-fx-border-color: black;");
                            property_name.setText(toDisplay.getName());
                            break;
                        case "skyblue":
                            property_color.setStyle("-fx-background-color: #00ccff;-fx-border-color: black;");
                            property_name.setText(toDisplay.getName());
                            break;
                        case "pink":
                            property_color.setStyle("-fx-background-color: #ff66ff;-fx-border-color: black;");
                            property_name.setText(toDisplay.getName());
                            break;
                        case "orange":
                            property_color.setStyle("-fx-background-color: #ff9900;-fx-border-color: black;");
                            property_name.setText(toDisplay.getName());
                            break;
                        case "maroon":
                            property_color.setStyle("-fx-background-color: #990000;-fx-border-color: black;");
                            property_name.setText(toDisplay.getName());
                            break;
                        case "yellow":
                            property_color.setStyle("-fx-background-color: #ffff00;-fx-border-color: black;");
                            property_name.setText(toDisplay.getName());
                            break;
                        case "green":
                            property_color.setStyle("-fx-background-color: #33cc33;-fx-border-color: black;");
                            property_name.setText(toDisplay.getName());
                            break;

                    }

                    nonProperty.setVisible(true);
                    propertyPrice.setText(Double.toString(((Property) toDisplay).getPrice()));
                    propertyRent.setText(Double.toString(((Property) toDisplay).getRent()));
                    propertyHouses.setText(Integer.toString(((Property) toDisplay).getHouseCount()));
                    if (((Property) toDisplay).getHouseCount() < 5)
                        propertyHotel.setText("0");
                    else
                        propertyHotel.setText("1");
                    propertyFootTraffic.setText(String.format("%d / %d", ((Property) toDisplay).getFootTraffic(), ((Property) toDisplay).getFootTrafficLimit()));
                    if (((Property) toDisplay).getOwner() == null)
                        propertyOwner.setText("Unowned");
                    else
                        propertyOwner.setText(((Property) toDisplay).getOwner().getName());

                } else if (toDisplay.getType().equals("railroad")) {
                    property_color.setStyle("-fx-background-color: white; -fx-border-color: black;");
                    property_name.setText(toDisplay.getName());

                    nonProperty.setVisible(false);
                    propertyPrice.setText(Double.toString(((Railroad) toDisplay).getPrice()));
                    propertyRent.setText(Double.toString(((Railroad) toDisplay).getRent()));
                    if (((Railroad) toDisplay).getOwner() == null)
                        propertyOwner.setText("Unowned");
                    else
                        propertyOwner.setText(((Railroad) toDisplay).getOwner().getName());
                } else if (toDisplay.getType().equals("utilities"))
                {
                    property_color.setStyle("-fx-background-color: white; -fx-border-color: black;");
                    property_name.setText(toDisplay.getName());

                    nonProperty.setVisible(false);
                    propertyPrice.setText(Double.toString(((Utilities) toDisplay).getPrice()));
                    propertyRent.setText(Double.toString(((Utilities) toDisplay).getRent()));
                    if (((Utilities) toDisplay).getOwner() == null)
                        propertyOwner.setText("Unowned");
                    else
                        propertyOwner.setText(((Utilities) toDisplay).getOwner().getName());
                }
            }

        }

    }


}
