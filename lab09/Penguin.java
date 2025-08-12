package lab09;

public class Penguin extends Bird {

	Penguin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void makeNest() {
		System.out.println("I dont build a nest");
	}

}
