package lab09;

public class Duck extends Bird {

	Duck(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNest() {
		System.out.println("I nest on the river bank");
	}
}
