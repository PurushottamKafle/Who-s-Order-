package pksoftFX;
import javafx.event.ActionEvent;

import java.util.EventListener;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class first extends Application { // inherits from Application
	
	
	Stage window;
	TextField name;
	
	public static void main(String[]args) {
		launch(args);
		
	}
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Orders - PKSoft");
		// getin Name
	    name = new TextField();
		name.setPromptText("Your Name");
		
		ChoiceBox<String> choicebox = new ChoiceBox<>();
		choicebox.getItems().add("Apple");
		choicebox.getItems().add("Mango");
		choicebox.getItems().addAll("Watermillion","Vegetables","Cake");
		// setuping defaults values
		choicebox.setValue("Apple");
		Button sumbitBtn =new Button("Order");
		// making functional
		sumbitBtn.setOnAction(e-> getChoices(choicebox));
		
		// setup layout
		VBox layout = new VBox(7);
		// making padding
		layout.setPadding(new Insets(20,10,10,40));
		
		layout.getChildren().addAll(name,choicebox, sumbitBtn);
		Scene scene = new Scene(layout, 300, 300);
		window.setScene(scene);
		window.show();
	}
	// getting the value of 
	private void getChoices(ChoiceBox<String> ch) {
		String foods = ch.getValue();
		System.out.println(name.getText().trim()+"'s Order: "+foods);
	}
	
}
