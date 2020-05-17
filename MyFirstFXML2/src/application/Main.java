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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXML;

public class Main extends Application {
	
	@FXML private TextField username;
	@FXML private TextField password;
	@Override
	
	public void start(Stage window) {
		try {
			window.setTitle("Test");
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Login.fxml"));
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
	public void changeScreenToIndex(ActionEvent e) throws IOException
	{
		Parent newViewParent = FXMLLoader.load(getClass().getResource("Index.fxml"));
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
	
	public void login(ActionEvent e) throws IOException
	{
		if(username.getText().equals("sep4") && password.getText().equals("password")) {
			Parent newViewParent = FXMLLoader.load(getClass().getResource("Index.fxml"));
			Scene changeScreen= new Scene(newViewParent);
			Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
			window.setScene(changeScreen);
			window.show();
		}
		
		else {
			Alert alert = new Alert(AlertType.ERROR,"Wrong username or password");
			alert.showAndWait();

		}
				
	}
	
}
