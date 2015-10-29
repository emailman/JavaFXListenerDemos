package p3;

// A lambda expression is used to define the button handler
 
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ButtonListenerDemo3 extends Application {

	public void start(Stage primaryStage) {

		// These objects must be visible to the inner class
		TextField tfFirstName = new TextField();
		TextField tfMI = new TextField();
		TextField tfLastName = new TextField();
		Label lbName = new Label();

		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		
		// Set horizontal and vertical gaps between elements
		pane.setHgap(5);
		pane.setVgap(5);
		
		// Add first name label and field
		pane.add(new Label("First Name"), 0, 0);
		pane.add(tfFirstName, 1, 0);
		
		// Add middle initial label and field
		pane.add(new Label("MI:"), 0, 1);		
		pane.add(tfMI, 1, 1);
				
		// Add last name label and field
		pane.add(new Label("Last Name:"), 0, 2);
		pane.add(tfLastName, 1, 2);
		
		// Add a button centered in the middle of the third row
		Button btAdd = new Button("Add Full Name");
		pane.add(btAdd, 0, 3, 2, 1);
		GridPane.setHalignment(btAdd, HPos.CENTER);

		// Create a handler for the button using a lambda expression
		btAdd.setOnAction((e) -> {
				// Build a string from the three text fields
				String name =	tfFirstName.getText() + " " +
						tfMI.getText() + " " +
						tfLastName.getText();
				// Display the name in a label field
				lbName.setText("Added: " + name);
		});

		// Add the name label field at the bottom,
		// spanning two columns
		pane.add(lbName, 0, 4, 2, 1);

		// Put the pane in the scene
		Scene scene = new Scene(pane, 400, 200);
		
		// Set the stage up, put the scene on the stage and show it
		primaryStage.setTitle("Button Listener Demo 3");
		primaryStage.setScene(scene);
		primaryStage.show();	
	}
}