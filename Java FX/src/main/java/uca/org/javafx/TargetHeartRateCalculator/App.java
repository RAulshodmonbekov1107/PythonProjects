package uca.org.javafx.TargetHeartRateCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(uca.org.javafx.TargetHeartRateCalculator.App.class.getResource("TargetHeartRateCalculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("TargetHeartRateCalculator!");
        stage.setScene(scene);
        stage.show();
    }
}
