public class Boat extends Vehicle {
	public Boat(String brand, int kilometers){
		super(brand, kilometers);
	}
	public String doStuff(){
		return "Je suis " + this.getbrand() + " et je fais glou glou!";	
	}
}
