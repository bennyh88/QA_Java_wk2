package lab08;

public class Car {
	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
		this.speed = 0;
	}
	
	public void accelerate(int seconds) {
		this.speed += 5 * seconds;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public void getToSixty() {
		this.speed = 60;
	}
	
	public void setModel(String model) {
		this.model= model;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String toString() {
		return String.format("Type:Car, Model:%s, Speed:%d", this.model, this.speed);
	}
}
