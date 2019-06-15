package com.adammendak.crosswords.controller;

import com.adammendak.crosswords.utils.AppState;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class MainController {

    @FXML
    private Label author;

    @FXML
    private Label date;

    @FXML
    private Label subject;

    @FXML
    private Label version;

    @FXML
    private Label appInfo;

    @FXML
    private Label user;

    @Value("${application.author}")
    private String authorValue;

    @Value("${application.date}")
    private String dateValue;

    @Value("${application.subject}")
    private String subjectValue;

    @Value("${application.version}")
    private String versionValue;

    @Value("${application.appInfo}")
    private String appInfoValue;

    @FXML
    private Button showCrosswordEntries;

    @FXML
    private Button addCrosswordEntry;

    @FXML
    private Button cleanEntries;

    @FXML
    private Button manageUsers;

    @FXML
    private void initialize() {
        author.setText(authorValue);
        date.setText(dateValue);
        subject.setText(subjectValue);
        version.setText(versionValue);
        appInfo.setText(appInfoValue);

        if(AppState.user != null) {
            user.setText(AppState.user.getUserName());
        }

    }

    @FXML
    private void manageUsers(ActionEvent e) {
        log.info("#### BUTTON CLICKED");
        System.out.println("DUPA ");
    }

}
