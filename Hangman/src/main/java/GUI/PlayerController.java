package GUI;

import Model.Player;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Optional;

public class PlayerController {


    @FXML
    private StackPane rightPane;

    @FXML
    private AnchorPane playPane;

    @FXML
    private AnchorPane helpPane;

    @FXML
    private AnchorPane trophiesPane;

    @FXML
    private AnchorPane gamesPane;

    @FXML
    private Button playButton;

    @FXML
    private Button helpButton;

    @FXML
    private Button trophiesButton;

    @FXML
    private Button gamesButton;

    @FXML
    private Button startGameButton;

    @FXML
    private Button logOutButton;

    @FXML
    private Label usernameLabel;

    @FXML
    private RadioButton easyBox;

    @FXML
    private RadioButton mediumBox;

    @FXML
    private RadioButton hardBox;

    @FXML
    private RadioButton carsBox;

    @FXML
    private RadioButton plantsBox;

    @FXML
    private RadioButton animalsBox;

    @FXML
    private RadioButton countriesBox;

    @FXML
    private RadioButton jobsBox;

    @FXML
    private RadioButton gamesBox;

    @FXML
    private TableView<?> gamesTable;

    @FXML
    private Button noviceB;

    @FXML
    private Button expertB;

    @FXML
    private Button categoricB;

    @FXML
    private Button masterB;

    @FXML
    private Button easyB;

    @FXML
    private Button intermediateB;

    @FXML
    private Button hardcoreB;

    @FXML
    private Button carExpertB;

    @FXML
    private Button leafyB;

    @FXML
    private Button turistB;

    @FXML
    private Button gamerB;


    Player currentPlayer;

    public void setCurrentPlayer(Player player)
    {
        this.currentPlayer = player;
        usernameLabel.setText(player.getUsername());
    }

    @FXML
    private void clickPlay() {

        playPane.setVisible(true);

        helpPane.setVisible(false);
        trophiesPane.setVisible(false);
        gamesPane.setVisible(false);
    }

    @FXML
    private void clickHelp() {

        playPane.setVisible(false);

        helpPane.setVisible(true);
        trophiesPane.setVisible(false);
        gamesPane.setVisible(false);
    }

    @FXML
    private void clickTrophies() {
        playPane.setVisible(false);

        helpPane.setVisible(false);
        trophiesPane.setVisible(true);
        gamesPane.setVisible(false);

    }

    @FXML
    private void clickGames() {
        playPane.setVisible(false);

        helpPane.setVisible(false);
        trophiesPane.setVisible(false);
        gamesPane.setVisible(true);
    }

    @FXML
    private void clickStartGame()
    {

    }

    @FXML
    private void clickLogOut() throws IOException
    {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Logout");
        alert.setHeaderText("Are you sure you want to log out?");
        alert.setContentText("You will be returned to the sign up screen.");

        Optional<ButtonType> result = alert.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK)
        {
           SceneManager.changeScene("/SceneBuilder/main.fxml",302,505);
        }
        else
        {
            alert.close();
        }
    }

}

