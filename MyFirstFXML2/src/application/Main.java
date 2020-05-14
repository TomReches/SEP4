package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXML;

public class Main extends Application {
	
	@FXML private TextField text;
	@FXML private Button clickMe;
	@Override
	public void start(Stage window) {
		try {
			window.setTitle("Test");
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Index.fxml"));
			Scene scene= new Scene(loader.load());

			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void handleClickMe(ActionEvent e)
	{
		
		{
			System.out.println("Så fucking ses vi");
		}
	}
	//https://www.youtube.com/watch?v=XCgcQTQCfJQ
	public void changeScreen(ActionEvent e) throws IOException
	{
		Parent newViewParent = FXMLLoader.load(getClass().getResource("NewTab.fxml"));
		Scene changeScreen= new Scene(newViewParent);
		Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
		window.setScene(changeScreen);
		window.show();
}
	
	public void changeScreenBack(ActionEvent e) throws IOException
	{
		Parent newViewParent = FXMLLoader.load(getClass().getResource("First2.fxml"));
		Scene changeScreen= new Scene(newViewParent);
		Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
		window.setScene(changeScreen);
		window.show();
}
	
}
