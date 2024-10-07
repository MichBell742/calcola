package calcola;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application{
	TextField tOperazione=new TextField();
	public void start(Stage finestra) {
		Button pulsante=new Button("valuta");
		Label eRisultato=new Label();
		
		GridPane griglia= new GridPane();
		
		griglia.add(tOperazione, 0, 0);
		griglia.add(pulsante, 0, 1);
		griglia.add(eRisultato, 0, 2);
		
		Scene scena= new Scene(griglia);
		
		finestra.setTitle("opera");
		finestra.setScene(scena);
		finestra.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
