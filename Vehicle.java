public abstract class Vehicle{
	private String brand;
	private int kilometers;
	
	public Vehicle(String brand, int kilometers) {
		this.brand = brand;
		this.kilometers = kilometers;
	}
	public String getbrand() {
		return this.brand;
	}
	public int getkilometers() {
		return this.kilometers;
	}
	public void setbrand(String brand){
		this.brand = brand;
	}
	public void setkilometers(int kilometers){
		this.kilometers = kilometers;
	}
	public abstract String doStuff();

}
