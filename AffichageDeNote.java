package core;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class AffichageDeNote {
	public static Scene etudiantsceneJAVA(){
        VBox rot = new VBox();
        rot.setPadding(new javafx.geometry.Insets(15, 12, 15, 12));
    	rot.setSpacing(50);
    	rot.setAlignment(Pos.CENTER);
    	rot.setStyle("-fx-background-color: #F5DEB3;");
		
        Button prev=new Button("Previous");
        prev.setStyle("-fx-font: 20 arial");
        prev.setOnAction(new EventHandler(){
        	@Override
        	public void handle(Event event) {
        		Acceuil.stage.setScene(modulesprof.modulesSceneprof());
        	}
        	});
        
    	Label student1Label = new Label("khaoula jerrari");
        TextField student1noteField = new TextField();
        Label student2Label = new Label("hind moutalattif");
        TextField student2noteField = new TextField();
        Label student3Label = new Label("hajar zaini");
        TextField student3noteField = new TextField();
        Button button = new Button("Save");
        
        rot.getChildren().add(prev);
        rot.getChildren().add(student1Label);
        rot.getChildren().add(student1noteField);
        rot.getChildren().add(student2Label);
        rot.getChildren().add(student2noteField);
        rot.getChildren().add(student3Label);
        rot.getChildren().add(student3noteField);
        rot.getChildren().add(button);
        
        button.setStyle("-fx-font: 30 arial;-fx-background-color: #BC8456;");
        student1Label.setStyle("-fx-font: 20 arial");
        student2Label.setStyle("-fx-font: 20 arial");
        student3Label.setStyle("-fx-font: 20 arial");
        student1noteField.setMaxWidth(400);
        student2noteField.setMaxWidth(400);
        student3noteField.setMaxWidth(400);
        
        button.setOnAction(new EventHandler(){
			@Override
			public void handle(Event event) {
				String s1=student1Label.getText();
     	        String s2=student2Label.getText();
     	        String s3=student3Label.getText();
     	        String f1=student1noteField.getText();
     	       String f2=student2noteField.getText();
     	      String f3=student3noteField.getText();

				 try {
					 File fr=new File("C:\\Users\\pc\\Desktop\\NEW\\JAVA2\\ListeDesEtudiantsJAVA.txt");
				     FileWriter out = new FileWriter(fr.getAbsoluteFile());							
				     		out.write(s1+":");
							out.write(f1);
							out.write(" \n ");
							out.write(s2+":");
							out.write(f2);
							out.write(" \n ");
							out.write(s3+":");
							out.write(f3);
						out.close();
					
				} catch (IOException e) {
						e.printStackTrace();
					}			    
			}	
       });
       return new Scene(rot);

}
	public static Scene etudiantsceneTEST(){
		 	VBox rot = new VBox();
	        rot.setPadding(new javafx.geometry.Insets(15, 12, 15, 12));
	    	rot.setSpacing(50);
	    	rot.setAlignment(Pos.CENTER);
	    	rot.setStyle("-fx-background-color: #F5DEB3;");
			
	        Button prev=new Button("Previous");
	        prev.setStyle("-fx-font: 20 arial");
	        prev.setOnAction(new EventHandler(){
	        	
	        	@Override
	        	public void handle(Event event) {
	        		Acceuil.stage.setScene(modulesprof.modulesSceneprof());
	        	}
	        	});
	        
	    	Label student1Label = new Label("khaoula jerrari");
	        TextField student1noteField = new TextField();
	        Label student2Label = new Label("hind moutalattif");
	        TextField student2noteField = new TextField();
	        Label student3Label = new Label("hajar zaini");
	        TextField student3noteField = new TextField();
	        Button button = new Button("Save");
	        
	        rot.getChildren().add(prev);
	        rot.getChildren().add(student1Label);
	        rot.getChildren().add(student1noteField);
	        rot.getChildren().add(student2Label);
	        rot.getChildren().add(student2noteField);
	        rot.getChildren().add(student3Label);
	        rot.getChildren().add(student3noteField);
	        rot.getChildren().add(button);
	        
	        button.setStyle("-fx-font: 30 arial;-fx-background-color: #BC8456;");
	        student1Label.setStyle("-fx-font: 20 arial");
	        student2Label.setStyle("-fx-font: 20 arial");
	        student3Label.setStyle("-fx-font: 20 arial");
	        student1noteField.setMaxWidth(400);
	        student2noteField.setMaxWidth(400);
	        student3noteField.setMaxWidth(400);
	        
        button.setOnAction(new EventHandler(){
			@Override
			public void handle(Event event) {
				String s1=student1Label.getText();
     	        String s2=student2Label.getText();
     	        String s3=student3Label.getText();
     	        String f1=student1noteField.getText();
     	       String f2=student2noteField.getText();
     	      String f3=student3noteField.getText();
				 try {
					 File fr=new File("C:\\Users\\pc\\Desktop\\NEW\\JAVA2\\ListeDesEtudiantsTEST.txt");	
				     FileWriter out = new FileWriter(fr.getAbsoluteFile());
							out.write(s1+":");
							out.write(f1);
							out.write(" \n ");
							out.write(s2+":");
							out.write(f2);
							out.write(" \n ");
							out.write(s3+":");
							out.write(f3);
						
						out.close();
								
					} catch (IOException e) {
						e.printStackTrace();
					}	    
			}	
       });
       return new Scene(rot);

}
}
	