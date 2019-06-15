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
public class InfoController {

    @FXML
    private Button okButton;

    @FXML
    private Label infoText;

    @FXML
    private void close() {
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
    }

}
