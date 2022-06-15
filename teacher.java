package core;

public class teacher {

		private String Nom;
		private String Email;
		private String password;
		
		 // Constructeurs
		
		public teacher(String Email, String password,String Nom) 
		{ 
		 this.Nom = Nom;
		 this.Email =Email;
		 this.password =password;

		 }
		 // Getters
		 public String getNom()
		 {
		 return Nom;
		 }
		 public String getPassword()
		 {
		 return password;
		 }
		
		 public String getEmail()
		 {
		 return Email;
		 }
		
}