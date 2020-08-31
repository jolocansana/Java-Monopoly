package viewAndController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Property;

import java.io.IOException;
import java.util.ArrayList;

public class CustomGameController {

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
    private Label property_name;

    @FXML
    private VBox property_color;

    private ArrayList<Pane> spaceBlocks;

    private ArrayList<VBox> propertyColors;

    private ArrayList<Label> propertyNames;

    private int[] idOfSpaces;

    private String[] spaceName;

    private String[] spaceColor;

    private String[] players;

    private int j, k;

    private int destIndex;

    private Stage customStage;

    /**
     * Creates a custom board filled with empty spaces for assignment by the Player
     * @param players
     */
    public void setCustomBoard (String[] players){
        idOfSpaces = new int[]{0, 0, 0, 0, 0, 0, 0,0, 0, 0, 0, 0, 0, 0,0, 0, 0, 0, 0, 0, 0,0, 0, 0, 0, 0, 0, 0};

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

        spaceName = new String[]{
                "Agno",
                "TNC",
                "Potato Corner",
                "Zark's Burger",
                "Coffee Bean",
                "Gongcha",
                "Coreon Gate",
                "Techtite",
                "Mercury Drug",
                "Mont Albo",
                "Samgyupsalamat",
                "Starbucks",
                "Mcdonalds",
                "National Bookstore",
                "Shell",
                "Savemore",
                "Green Residence",
                "DLSU",
                "North",
                "South",
                "Metro",
                "Electric",
                "Water",
                "Chance",
                "Income Tax",
                "Luxury Tax"
        };

        spaceColor = new String[]{
                "brown",
                "brown",
                "skyblue",
                "skyblue",
                "skyblue",
                "pink",
                "pink",
                "pink",
                "orange",
                "orange",
                "orange",
                "maroon",
                "maroon",
                "maroon",
                "yellow",
                "yellow",
                "green",
                "green",
                "none",
                "none",
                "none",
                "none",
                "none",
                "none",
                "none",
                "none"
        };

        j = 0;
        k = 0;

        this.players = players;

        displayWhatToPut();
    }

    /**
     * Listens to any Mouse Event and retrieves which Pane object was selected
     * @param e
     * @throws Exception
     */
    public void getSourceClick (MouseEvent e) throws Exception
    {
        for (int i = 0; i < 28; i++)
        {
            Node source = (Node)e.getSource();
            if (spaceBlocks.get(i).getId().equals(source.getId()))
            {
                if ((propertyNames.get(i).getText().equals("Property Name")))
                {
                    displayOnBoard(i,j);
                    if (j == 23)
                    {
                        displayWhatToPut();
                        k++;
                        if (k == 3)
                        {
                            j++;
                            displayWhatToPut();
                        }
                    }
                    else
                    {
                        j++;
                        checkIfComplete();
                        displayWhatToPut();
                    }
                }
            }
        }

        customStage = (Stage)((Node)e.getSource()).getScene().getWindow();

    }

    /**
     * Displays the next Space object that needs to be assigned to the game board
     */
    public void displayWhatToPut ()
    {
        property_name.setText(spaceName[j]);
        switch (spaceColor[j]) {
            case "brown":
                property_color.setStyle("-fx-background-color: #996600;-fx-border-color: black;");
                break;
            case "skyblue":
                property_color.setStyle("-fx-background-color: #00ccff;-fx-border-color: black;");
                break;
            case "pink":
                property_color.setStyle("-fx-background-color: #ff66ff;-fx-border-color: black;");
                break;
            case "orange":
                property_color.setStyle("-fx-background-color: #ff9900;-fx-border-color: black;");
                break;
            case "maroon":
                property_color.setStyle("-fx-background-color: #990000;-fx-border-color: black;");
                break;
            case "yellow":
                property_color.setStyle("-fx-background-color: #ffff00;-fx-border-color: black;");
                break;
            case "green":
                property_color.setStyle("-fx-background-color: #33cc33;-fx-border-color: black;");
                break;
            case "none":
                property_color.setStyle("-fx-background-color: white; -fx-border-color: black;");
                break;
        }

    }

    /**
     * Displays the SSpace object on the assigned place in the game board
     * @param i
     * @param j
     */
    public void displayOnBoard (int i, int j)
    {
        propertyNames.get(i).setText(spaceName[j]);

        switch (spaceColor[j]) {
            case "brown":
                propertyColors.get(i).setStyle("-fx-background-color: #996600;-fx-border-color: black;");
                break;
            case "skyblue":
                propertyColors.get(i).setStyle("-fx-background-color: #00ccff;-fx-border-color: black;");
                break;
            case "pink":
                propertyColors.get(i).setStyle("-fx-background-color: #ff66ff;-fx-border-color: black;");
                break;
            case "orange":
                propertyColors.get(i).setStyle("-fx-background-color: #ff9900;-fx-border-color: black;");
                break;
            case "maroon":
                propertyColors.get(i).setStyle("-fx-background-color: #990000;-fx-border-color: black;");
                break;
            case "yellow":
                propertyColors.get(i).setStyle("-fx-background-color: #ffff00;-fx-border-color: black;");
                break;
            case "green":
                propertyColors.get(i).setStyle("-fx-background-color: #33cc33;-fx-border-color: black;");
                break;
            case "none":
                propertyColors.get(i).setStyle("-fx-background-color: white; -fx-border-color: black;");
                break;
        }

        if (spaceName[j].equals("Chance Space"))
            idOfSpaces[i] = 24;
        else
            idOfSpaces[i] = j + 1;

    }

    /**
     * Checks if the customized game board is complete and has no empty spaces
     * @return
     */
    public boolean checkIfComplete ()
    {
        if (j == 26)
        {
            getCustomIDs();
            return true;
        }
        return false;
    }

    public void getCustomIDs (){
        int[] outIdOfSpaces = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int cornerInt = 0;
        int j = 0;

        for (int i = 0; i < 32; i++)
        {
            if (i == 0 || i == 8 || i == 16 || i == 24)
            {
                outIdOfSpaces[i] = 27 + cornerInt;
                cornerInt++;
            }
            else
            {
                outIdOfSpaces[i] = idOfSpaces[j];
                j++;
            }
        }

        System.out.print("{");
        for(int i : outIdOfSpaces)
            System.out.print(i + ",");
        System.out.print("}");

        System.out.print("{");
        for(int i : idOfSpaces)
            System.out.print(i + ",");
        System.out.print("}");

        try {
            FXMLLoader gameFXML = new FXMLLoader(getClass().getResource("Game.fxml"));
            Parent root = gameFXML.load();
            GameController gameController = gameFXML.getController();
            customStage.close();
            Stage gameStage = new Stage();
            gameStage.setScene(new Scene(root, 1250, 850));
            gameStage.show();
            gameController.createGame(players, outIdOfSpaces);
        } catch (IOException e)
        {
            e.printStackTrace();
        }


    }

}
