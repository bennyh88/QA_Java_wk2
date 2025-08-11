package lab08;

public class RacingCar extends Car{
	String driver;
	int turboFactor;
	
	RacingCar(String model, String driver, int turboFactor) {
		super(model);
		this.driver = driver;
		this.turboFactor = turboFactor;
	}
	
	@Override
	public void accelerate(int seconds) {
		super.accelerate(seconds);
		this.speed = this.speed * turboFactor;
	}
	
	public String getDriver() {
		return this.driver;
	}
	
	public int getTurboFactor() {
		return this.turboFactor;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
	
	public String toString() {
		return String.format("Type:Racing Car, Model:%s, Speed:%d, Driver:%s, TF:%d", 
				this.model, 
				this.speed,
				this.driver,
				this.turboFactor
				);
	}
	
}
