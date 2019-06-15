package com.adammendak.crosswords.controller;

import com.adammendak.crosswords.service.UserService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@RequiredArgsConstructor
@Controller
@Setter
@Getter
public class UserController implements Initializable {

    @Autowired
    private UserService userService;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("CHUUUUJ");
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
