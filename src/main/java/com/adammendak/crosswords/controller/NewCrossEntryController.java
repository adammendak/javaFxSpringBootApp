package com.adammendak.crosswords.controller;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
@Setter
@Getter
public class NewCrossEntryController {

    @FXML
    private Button okButton;

    @FXML
    private Button cancelButton;

    @FXML
    private TextArea descriptionArea;

    @FXML
    private TextField valueField;

    @FXML
    private void close() {
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void save() {
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
    }
}
