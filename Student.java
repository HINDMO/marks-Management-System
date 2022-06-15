package core;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

public class Student {
	private String password;
	private String nom;
	private String filiere;
	private String email;
	private int numcours; //nombre de cours pris jusqu'à présent par l'étudiant 
	private String[] cours; 
	private int[] notes;
	private static final int MAX_cours = 27;
	
	//constructeur
	public Student(String email,String password,String nom,String filiere) {
		this.email = email;
		this.password = password;
		this.nom = nom;
		numcours = 0;
		cours = new String[MAX_cours];
		notes = new int[MAX_cours];
		 }
	
	// Getters
	   public String getPassword() {
	      return password;
	   }

	   public String getEmail() {
		   return email;
	 }

	  public String getFiliere() {
	    return filiere;
	  }
	  public String getNom() {
	    return nom;
	  }
	  
	  public double getmoyenne() {
			 int sum = 0;
			 for (int i = 0; i < numcours; i++ ) {
			 sum += notes[i];
			 }
			 return (double)sum/numcours;
	}
	  //ajouter le cours et la note
	  public void addnotecours(String lecours, int note) {
		  cours[numcours] = lecours;
		  notes[numcours] = note;
		  ++numcours;
	  }
	  public void printNotes() {
		  for (int i = 0; i < numcours; ++i) {
		  System.out.println(" " + cours[i] + ":" + notes[i]);
		  }
	  }
	 
}
