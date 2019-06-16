package com.adammendak.crosswords;

import com.adammendak.crosswords.utils.AlertMessage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CrosswordsApplication extends Application {

    private ConfigurableApplicationContext springContext;
    private Parent rootNode;
    private FXMLLoader fxmlLoader;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        springContext = SpringApplication.run(CrosswordsApplication.class);
        fxmlLoader = new FXMLLoader();
        fxmlLoader.setControllerFactory(springContext::getBean);
    }

    @Override
    public void stop() throws Exception {
        springContext.stop();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        fxmlLoader.setLocation(getClass().getResource("/fxml/main.fxml"));
        rootNode = fxmlLoader.load();

        primaryStage.setTitle("Crosswords Application");
        Scene scene = new Scene(rootNode, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(
                (e -> closeApplication(e)));
        primaryStage.show();
    }

    void closeApplication(WindowEvent e) {
        AlertMessage.show(
                Alert.AlertType.CONFIRMATION,
                "Kończenie pracy",
                "Czy chcesz zamknąć aplikację?");
    }
}
