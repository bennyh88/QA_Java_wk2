package lab10a;

public class Duck extends Bird implements Flyable, Movable, Swimmable {

	Duck(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNest() {
		System.out.println("I nest on the river bank");
	}
	
	@Override
	public void fly() {
		System.out.println("I can fly!");
	}
	
	@Override
	public void move() {
		System.out.println("Waddle Like a Duck!");
	}
	
	@Override
	public void swim() {
		System.out.println("Swim Like a Duck!");
	}
}
