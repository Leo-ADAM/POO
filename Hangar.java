public class Hangar {
	public static void main(String[] args){
		Car clio = new Car ("Clio", 0);
		System.out.println("$ " + clio.doStuff());

		Boat titanic = new Boat ("Titanic", 0);
		System.out.println("$ " + titanic.doStuff());
	}
}
