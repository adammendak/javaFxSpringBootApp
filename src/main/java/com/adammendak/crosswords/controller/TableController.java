package com.adammendak.crosswords.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
@Setter
@Getter
public class TableController {

    @FXML
    private Button cancelButton;

    @FXML
    private Label userTextLabel;

    @FXML
    private void cancel() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
