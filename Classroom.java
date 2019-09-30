public class Classroom {
	public static void main(String[] args){
		Wilder JeanClaude = new Wilder("Jean-Claude", true);
		System.out.println("$ " + JeanClaude.whoAmI());
		
		Wilder Henry = new Wilder("Henry", true);
		Henry.setAware(false);
		System.out.println("$ " + Henry.whoAmI());
	} 
}
