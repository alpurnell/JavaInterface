
public class Bird implements Animal{
	public Bird() {}

	@Override
	public void makeSound() {
		System.out.println("The Bird goes TWEET TWEET!");
	}
	
	public void buildNest(String location) {
		System.out.println("The bird built a nest in a " + location + ".");
	}
}
