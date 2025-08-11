package review;

public class Person {
	private String name;
	private String email;
	
	Person(String name, String email){
		this.name = name;
		this.email = email;
	}
	
	public String getDetails() {
		return String.format("Name:%s, Email:%s", this.name, this.email);
	}
}
