package calcola;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;

public class App extends Application{
	TextField tOperazione=new TextField();
	public void start(Stage finestra) {
		Button pulsante=new Button("valuta");
		Label eRisultato=new Label();
		
		GridPane griglia= new GridPane();
		
		griglia.add(tOperazione, 0, 0);
		griglia.add(pulsante, 0, 1);
		griglia.add(eRisultato, 0, 2);
		
		pulsante.setOnAction(e -> azione());
		
		Scene scena= new Scene(griglia);
		
		finestra.setTitle("opera");
		finestra.setScene(scena);
		finestra.show();
	}
	
	public void azione(){
		String operazione = tOperazione.getText();
		 JexlEngine jexl = new JexlBuilder().create();
		 JexlExpression e = jexl.createExpression( operazione );
		 System.out.println(e.evaluate(null));
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
