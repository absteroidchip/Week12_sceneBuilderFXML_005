package bsu.comp152;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args)
    {
        // In the Java class Main, load the fxml file.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Store the location of the user interface (UI) resource.
        var location = getClass().getResource("Main.fxml");
        // Parent is the superclass of Stage
        // Call the load method, passing in the location object, 'location'.
        Parent root = FXMLLoader.load(location);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("A GUI Designed in SceneBuilder");
        primaryStage.show();
    }

}