package com.adammendak.crosswords.controller;

import com.adammendak.crosswords.utils.AppState;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Dialog;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
@Setter
@Getter
public class UserController {

    @FXML
    private ChoiceBox<String> choiceBoxUser;

    @FXML
    public void initialize() {
    }

    @FXML
    private Button closeButton;

    @FXML
    private Button okButton;

    private static Dialog dialog;

    @FXML
    public void setUser(ActionEvent actionEvent) {
        AppState.setUserName(choiceBoxUser.getValue());
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void close(ActionEvent actionEvent) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
