package core;

import java.awt.Container;
import java.awt.Desktop;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class modulesprof  {
	 public static Scene modulesSceneprof() {
		  VBox root = new VBox();
		  root.setPadding(new javafx.geometry.Insets(15, 12, 15, 12));
		  root.setSpacing(50);
		  root.setAlignment(Pos.CENTER);
		  root.setStyle("-fx-background-color: #F5DEB3;");
		  
	      Button prev=new Button("Previous");
	      prev.setMaxWidth(200);
	      prev.setMaxHeight(100); 
	      prev.setStyle("-fx-font: 30 arial;");
	      prev.setOnAction(new EventHandler(){
	        	@Override
	        	public void handle(Event event) {
	        		Acceuil.stage.setScene(authentificationprof.authentificationprof());
	        	}
	        	});
	      
	        Button cours1 = new Button("PROGRAMMATION AVEC JAVA");
	        cours1.setMaxWidth(500);
	        cours1.setMaxHeight(100); 
	        cours1.setStyle("-fx-font: 30 arial;-fx-background-color: #BC8456;");
	        
	       Button cours2 = new Button("TESTS LOGICIELS : DÉMARCHE, RÉFÉRENTIELS");
	        cours2.setMaxWidth(500);
	        cours2.setMaxHeight(100); 
	        cours2.setStyle("-fx-font: 30 arial;-fx-background-color: #BC8456;");
	        
	        cours1.setOnAction(new EventHandler(){
				@Override
				public void handle(Event event) {
					Acceuil.stage.setScene(AffichageDeNote.etudiantsceneJAVA());
				}	
	       });
	        
	        cours2.setOnAction(new EventHandler(){
				@Override
				public void handle(Event event) {
					Acceuil.stage.setScene(AffichageDeNote.etudiantsceneTEST());			
				}
	       });
 
	        root.getChildren().addAll(prev,cours1,cours2);
	        return new Scene(root);
	    }
}

