package core;

public class wrong_email extends Exception {
	
	public wrong_email() {
		this("Email is wrong");
	}
	public wrong_email(String message) {
		super(message);
	}
	
}
