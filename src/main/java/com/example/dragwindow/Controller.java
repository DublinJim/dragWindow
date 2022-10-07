package com.example.dragwindow;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public VBox root;
    public Button btnExit;
    public Pane pneBtnbar;
    private double offsetX = 0.0;
    private double offsetY = 0.0;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }

    public void vboxDragged(MouseEvent mouseEvent) {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setY(mouseEvent.getScreenY() - offsetY);
        stage.setX(mouseEvent.getScreenX() - offsetX);
    }

    public void VboxPressed(MouseEvent mouseEvent) {
        offsetY = mouseEvent.getSceneY();
        offsetX = mouseEvent.getSceneX();

    }

    public void closeApp() {
        Platform.exit();
    }
}
