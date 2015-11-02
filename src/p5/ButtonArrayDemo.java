package p5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

    // Create an array of buttons
    int numOfButtons = 10;
    Button[] buttonsArray = new Button[numOfButtons];

    @Override
    public void start(Stage primaryStage) {
        // Get the pane for the scene
        primaryStage.setScene(new Scene(getPane(), 60, 400));

        // Setup the stage
        primaryStage.setTitle("Button Array Demo");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    protected Pane getPane() {
        Pane pane = new VBox(10);
        pane.setPadding(new Insets(40));

        for (int i = numOfButtons - 1; i >= 0; i--) {

            // Set the button number as text for the button
            buttonsArray[i] = new Button(Integer.toString(i + 1));
            buttonsArray[i].setMinWidth(50);

            // Add the button to the pane and set the handler
            pane.getChildren().add(buttonsArray[i]);
            buttonsArray[i].setOnAction(ButtonHandler);
        }
        return pane;
    }

    // Build an event handler for the buttons
    EventHandler<ActionEvent> ButtonHandler = e -> {
        Button b = (Button)e.getSource();

        int i = Integer.parseInt(b.getText());
        System.out.println(i);

    };
}
