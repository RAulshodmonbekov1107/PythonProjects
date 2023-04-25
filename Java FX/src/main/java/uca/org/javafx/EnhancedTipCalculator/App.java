package uca.org.javafx.EnhancedTipCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(uca.org.javafx.EnhancedTipCalculator.App.class.getResource("EnhancedTipCalculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 290, 200);
        stage.setTitle("EnhancedTipCalculator!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}