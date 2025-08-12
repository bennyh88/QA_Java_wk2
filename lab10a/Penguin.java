package lab10a;

public class Penguin extends Bird implements Swimmable, Movable {

	Penguin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void makeNest() {
		System.out.println("I dont build a nest");
	}
	
	@Override
	public void swim() {
		System.out.println("Swim Like a Penguin!");
	}
	
	@Override
	public void move() {
		System.out.println("Waddle Like a Penguin!");
	}
	

}
