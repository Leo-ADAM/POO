public class Wilder {
	private String firstName;
	private boolean Aware;
	
	public Wilder(String firstName, boolean Aware) {
		this.firstName = firstName;
		this.Aware = Aware;
	}
	public String getfirstName() {
		return this.firstName;
	}
	public boolean isAware(){
		return this.Aware;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setAware(boolean Aware) {
		this.Aware = Aware;
	}
	public String whoAmI() {
		if(Aware == true){
			return "Je m'appelle " + this.getfirstName() + " et je suis aware";
		} else {
			return "Je m'appelle " + this.getfirstName() + " et je ne suis pas aware";
		}
	}
}
