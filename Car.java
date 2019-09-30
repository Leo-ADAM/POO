public class Car extends Vehicle {
	public Car(String brand, int kilometers) {
		super(brand, kilometers);
	}
	public String doStuff(){
		return "Je suis " + this.getbrand() + " et je fais vroum vroum!";	
	}
}
