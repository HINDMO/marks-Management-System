package core;

public class wrongPassword extends Exception {
	public wrongPassword() {
		this("Password is wrong");
	}
	
	public wrongPassword(String message) {
		super(message);
	}
	
}
