package core;

import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class authentificationstudent {
	public static final Map<String, String> mapUsers = new HashMap<String, String>();
	   static {
	      initUsers();
	   }
	   private static void initUsers() {
	      Student student1 = new Student("jerrarikhaoula79@gmail.com", "2001", "khaoula jerrari","AMOA"); 
	      Student student2 = new Student("hajarzaini@gmail.com", "2003", "hajar zaini","AMOA");
	      Student student3 = new Student("hindmoutalattif@gmail.com", "2002", "hind moutalattif","AMOA");
	   
	      mapUsers.put(student1.getEmail(),student1.getPassword());
	      mapUsers.put(student2.getEmail(), student2.getPassword());
	      mapUsers.put(student3.getEmail(), student3.getPassword());
	   } 
	   
	public static Scene authentificationstudent()  {
    	
		GridPane g=new GridPane();
		g.setVgap(15);
        g.setHgap(15);
        g.setStyle("-fx-background-color: #F5DEB3;");
        g.setPadding(new javafx.geometry.Insets(15, 12, 15, 12));
        g.setAlignment(Pos.CENTER);
        
        Button Previous=new Button("previous");
        Label userLabel = new Label("Email");
        TextField userField = new TextField();
        Label password = new Label("Password");
        PasswordField passwordField = new PasswordField();
        Button AccountButton = new Button("Connexion");
        
        AccountButton.setStyle("-fx-font: 30 arial;-fx-background-color: #BC8456;");
        Previous.setStyle("-fx-font: 30 Roboto;-fx-background-color: #BC8456;");
        userLabel.setStyle("-fx-font: 30 Roboto;");
        password.setStyle("-fx-font: 30 Roboto;");
        userField.setStyle("-fx-font: 30 Roboto;");
        passwordField.setStyle("-fx-font: 30 Roboto;");
        
        Previous.setOnAction(new EventHandler(){
        	@Override
        	public void handle(Event event) {
        		Acceuil.stage.setScene(Acceuil.HomeScene());
        	}
        	});
        
        AccountButton.setOnAction(new EventHandler(){        
			@Override
			public void handle(Event event) {
				String t=userField.getText();
				String tp=passwordField.getText();
				
			        try {
			        	if(!(mapUsers.containsKey(t))) {
			        		throw new  wrong_email();
			        	}
			        	else {if(!(mapUsers.containsValue(tp))) {    	
			        		throw new wrongPassword();
			        	}
			        	else {Acceuil.stage.setScene(modulesstudent.modulesScenestudent());}}}
			        	
		        	catch(wrong_email we) {
			        	Label label1 = new Label(we.getMessage());
			        	g.add(label1,3,4);
			        	label1.setStyle("-fx-font: 30 Roboto;"); } 
			        catch (wrongPassword wp) {
			        	Label label2 = new Label(wp.getMessage());
			        	g.add(label2,3,5);
			        	label2.setStyle("-fx-font: 30 Roboto;");
					}
	                

				
			}
       });
        g.add(userLabel,1,1);
        g.add(userField,2,1);
        g.add(password,1,2);
        g.add(passwordField,2,2);
        g.add(Previous,1,0);
        g.add(AccountButton,2,3);
        return new Scene(g);
    }
	
}