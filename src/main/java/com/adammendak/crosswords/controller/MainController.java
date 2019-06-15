package com.adammendak.crosswords.controller;

import com.adammendak.crosswords.domain.User;
import com.adammendak.crosswords.service.UserService;
import com.adammendak.crosswords.utils.AppState;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MainController {

    private final UserService userService;

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
    private void manageUsers(ActionEvent e) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/user.fxml"));
        Parent parent = fxmlLoader.load();
        UserController dialogController = fxmlLoader.<UserController>getController();

        List<User> users = userService.getAllUsers();
        List<String> userNames = users.stream().map(x -> x.getUserName()).collect(Collectors.toList());
        dialogController.getChoiceBoxUser().setItems(FXCollections.observableList(userNames));

        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();

        setUserInState(AppState.userName);

    }

    private void setUserInState(String userName) {
        User userFromDB = userService.getUserByName(userName);
        AppState.setUser(userFromDB);

        if(AppState.user != null) {
            user.setText(AppState.user.getUserName());
        }
    }

}
