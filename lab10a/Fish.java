package lab10a;

public class Fish extends Animal implements Swimmable {

	String name;
	String type;
	
	Fish(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void swim() {
		System.out.println("Swim Like a fish!");
	}

}
