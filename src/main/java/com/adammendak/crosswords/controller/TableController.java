package com.adammendak.crosswords.controller;

import com.adammendak.crosswords.domain.CrosswordEntry;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
    private TableView<CrosswordEntry> crossTable;

    @FXML
    private TableColumn<CrosswordEntry, Integer> crossNumber;
    @FXML
    private TableColumn<CrosswordEntry, String> crossValue;
    @FXML
    private TableColumn<CrosswordEntry, String> crossDescription;

    @FXML
    private void cancel() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
