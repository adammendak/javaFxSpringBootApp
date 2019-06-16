package com.adammendak.crosswords.controller;

import com.adammendak.crosswords.domain.dto.CrosswordTableRepresentationDTO;
import javafx.collections.ObservableList;
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
    public TableView<CrosswordTableRepresentationDTO> crossTable;

    @FXML
    private TableColumn<CrosswordTableRepresentationDTO, Integer> crossNumber;
    @FXML
    private TableColumn<CrosswordTableRepresentationDTO, String> crossValue;
    @FXML
    private TableColumn<CrosswordTableRepresentationDTO, String> crossDescription;

    public void setCrosswordEntries(ObservableList<CrosswordTableRepresentationDTO> crossList) {
        crossTable.getItems().clear();
        crossTable.setItems(crossList);
    }

    @FXML
    private void cancel() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
