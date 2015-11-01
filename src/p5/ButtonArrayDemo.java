package p5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * Created by emailman on 11/1/2015.
 */
public class ButtonArrayDemo extends Application{

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Button Array Demo");
        primaryStage.setScene(new Scene(getPane(), 60, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    protected Pane getPane() {
        Pane pane = new VBox(10);
        pane.setPadding(new Insets(40));
        int numOfButtons = 10;
        Button[] buttonsArray = new Button[numOfButtons];
        for (int i = numOfButtons - 1; i >= 0; i--) {
            buttonsArray[i] = new Button(Integer.toString(i + 1));
            buttonsArray[i].setMinWidth(50);
            pane.getChildren().add(buttonsArray[i]);
        }
        return pane;
    }
}
