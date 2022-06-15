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
import javafx.scene.text.Font;

public class authentificationprof {
	public static final Map<String, String> mapprof = new HashMap<String, String>();
	   static {
	      initUsers();
	   }

	   private static void initUsers() {
	      teacher teacher1 = new teacher("laghouaouta@inpt.ac.ma" , "2022","Youness laghouaouta");
	      mapprof.put(teacher1.getEmail(),teacher1.getPassword());
	   } 
	
	public static Scene authentificationprof() {
		
        GridPane root = new GridPane();
    	root.setPadding(new javafx.geometry.Insets(15, 12, 15, 12));
    	root.setHgap(15);
    	root.setVgap(20);
    	root.setAlignment(Pos.CENTER);
    	root.setStyle("-fx-background-color: #F5DEB3;");
       
        Button prev=new Button("Previous");
        prev.setFont(Font.font ("Roboto", 30));
        prev.setStyle("-fx-background-color: #BC8456; ");
        
        prev.setOnAction(new EventHandler(){
        	@Override
        	public void handle(Event event) {
        		Acceuil.stage.setScene(Acceuil.HomeScene());
        	}
        	});
        
        Label userLabel = new Label("Email ");
        userLabel.setFont(Font.font ("Roboto", 30));
        TextField userField = new TextField();
        userField.setFont(Font.font ("Roboto", 30));

        Label password = new Label("Password ");
        password.setFont(Font.font ("Roboto", 30));
        PasswordField passwordd = new PasswordField();
        passwordd.setFont(Font.font ("Roboto", 30));

        Button connect = new Button("Connexion");
        connect.setFont(Font.font ("Roboto", 30));
        connect.setStyle("-fx-background-color: #BC8456; ");
        
        connect.setOnAction(new EventHandler(){
			@Override
			public void handle(Event event) {
				String t=userField.getText();
				String tp=passwordd.getText();
		        try {
		        	if(!(mapprof.containsKey(t))) {
		        		throw new  wrong_email();
		        	}
		        	else {if(!(mapprof.containsValue(tp))) {
		        		throw new wrongPassword();
		        	}
		        	else {Acceuil.stage.setScene(modulesprof.modulesSceneprof());}}}
		        	
		        	catch(wrong_email we) {
		        	Label label1 = new Label(we.getMessage());
		        	root.add(label1,3,4);
		        	label1.setFont(Font.font ("Roboto", 30));
		        } 
		        catch (wrongPassword wp) {
		        	Label label2 = new Label(wp.getMessage());
		        	root.add(label2,3,5);
		        	label2.setFont(Font.font ("Roboto", 30));			
			}
			}
       });
        
        root.add(userLabel,1,1);
        root.add(userField,2,1);
        root.add(password,1,2);
        root.add(passwordd,2,2);
        root.add(prev,1,0);
        root.add(connect,2,3);
        
        return new Scene(root);
    }
}
