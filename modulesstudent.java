package core;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class modulesstudent {
	public static Scene modulesScenestudent() {
		
		VBox root = new VBox();
    	root.setPadding(new javafx.geometry.Insets(15, 12, 15, 12));
    	root.setSpacing(50);
    	root.setAlignment(Pos.CENTER);
    	root.setStyle("-fx-background-color: #F5DEB3;");
		
        
        Button prev=new Button("Previous");
        prev.setMaxWidth(200);
        prev.setMaxHeight(100); 
        prev.setOnAction(new EventHandler(){
        	
        	@Override
        	public void handle(Event event) {
        		Acceuil.stage.setScene(authentificationstudent.authentificationstudent());
        	}
        	});
        Button cours1 = new Button("PROGRAMMATION AVEC JAVA");
        Button cours2 = new Button("TESTS LOGICIELS : DÉMARCHE, RÉFÉRENTIELS");
        Button cours3 = new Button("ANALYSE DE DONNEES");
        Button cours4 = new Button("DIAGNOSTIC FINANCIER DE L ENTREPRISE");
        Button cours5 = new Button("CLOUD COMPUTING DEVELOPMENT AND VIRTUALIZATION");
        
        
        prev.setStyle("-fx-font: 30 arial;");
        cours1.setMaxWidth(500);
        cours1.setMaxHeight(100); 
        cours1.setStyle("-fx-font: 30 arial;-fx-background-color: #BC8456;");
        cours2.setMaxWidth(500);
        cours2.setMaxHeight(100); 
        cours2.setStyle("-fx-font: 30 arial;-fx-background-color: #BC8456;");
        cours3.setMaxWidth(500);
        cours3.setMaxHeight(100); 
        cours3.setStyle("-fx-font: 30 arial;-fx-background-color: #BC8456;");
        cours4.setMaxWidth(500);
        cours4.setMaxHeight(100); 
        cours4.setStyle("-fx-font: 30 arial;-fx-background-color: #BC8456;");
        cours5.setMaxWidth(500);
        cours5.setMaxHeight(100); 
        cours5.setStyle("-fx-font: 30 arial;-fx-background-color: #BC8456;");
        
        
        cours1.setOnAction(new EventHandler(){
			@Override
			public void handle(Event event) {
				   try {
				    	File fr=new File("C:\\Users\\pc\\Desktop\\NEW\\JAVA2\\ListeDesEtudiantsJAVA.txt");
				    	Desktop desktop = Desktop.getDesktop(); 
						desktop.open(fr);             
					} catch (IOException e) {
						e.printStackTrace();
					}			
				}			
       });
        
        cours2.setOnAction(new EventHandler(){
    				@Override
    				public void handle(Event event) {
    				    try {
    				    	File fr=new File("C:\\Users\\pc\\Desktop\\NEW\\JAVA2\\ListeDesEtudiantsTEST.txt");			   
    				    	Desktop desktop = Desktop.getDesktop(); 
    						desktop.open(fr); 
    					} catch (IOException e) {
    						e.printStackTrace();
    					} 					
    				}             
       });
       
        root.getChildren().addAll(prev,cours1,cours2,cours3,cours4,cours5);
        return new Scene(root);
    }


}
