package com.adammendak.crosswords.controller;

import com.adammendak.crosswords.domain.User;
import com.adammendak.crosswords.service.UserService;
import javafx.collections.ObservableList;
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
    private ChoiceBox<User> choiceBoxUser;

    @FXML
    public void initialize() {
    }

    @FXML
    private Button closeButton;

    private static Dialog dialog;

    @FXML
    public void close(ActionEvent actionEvent) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
