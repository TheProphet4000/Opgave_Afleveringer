package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
Main game = new Main();
    @FXML
    private Button Draw;

    @FXML
    private Button Keep;

    @FXML
    void acceptButton(ActionEvent event) {
    }

    @FXML
    void drawCardButton(ActionEvent event) {
        game.cardGame();
    }

}
