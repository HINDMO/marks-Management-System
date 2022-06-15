package core;

import java.awt.Component;
import java.awt.Container;
import java.awt.Insets;
import java.awt.desktop.AboutHandler;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Handler;

import javax.swing.JButton;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Acceuil extends Application  {
	
	public static Stage stage;
    @Override
    public void start(Stage primaryStage)  {
        stage = primaryStage;
        Scene scene = HomeScene();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Welcome to inpt_plateform");
        primaryStage.show();
    }
    
    public static Scene HomeScene(){
    	HBox root = new HBox();
    	root.setPadding(new javafx.geometry.Insets(15, 12, 15, 12));
    	root.setSpacing(200);
    	root.setAlignment(Pos.CENTER);
    	root.setStyle("-fx-background-color: #F5DEB3;");
    	
       
       Button TeacherButton = new Button("TEACHER");
       TeacherButton.setMaxWidth(500);
       TeacherButton.setMaxHeight(100);
       TeacherButton.setStyle("-fx-background-color: #BC8456; ");
       TeacherButton.setFont(Font.font ("arial", 40));
       
       Button StudentButton = new Button("STUDENT");
       StudentButton.setMaxWidth(500);
       StudentButton.setMaxHeight(100);
       StudentButton.setStyle("-fx-background-color: #BC8456; ");
       StudentButton.setFont(Font.font ("arial", 40));
       
       TeacherButton.setOnAction(new EventHandler(){
			@Override
			public void handle(Event event) {
				stage.setScene(authentificationprof.authentificationprof());
			}
      });
       
       StudentButton.setOnAction(new EventHandler(){
			@Override
			public void handle(Event event) {
				stage.setScene(authentificationstudent.authentificationstudent());
			}
      });
       
       root.getChildren().add(StudentButton);
       root.getChildren().add(TeacherButton);
       return new Scene(root);
   }
   
   public static void main(String[] args) {
       launch();
   }
    
}

