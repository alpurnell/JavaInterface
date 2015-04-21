
public class Frog implements Animal{
	public Frog() {}

	@Override
	public void makeSound() {
		System.out.println("The Frog goes RIBBIT RIBBIT!");
	}
	
	public void hop(int numHops) {
		System.out.println("The frog hopped " + numHops + " times.");
	}
}
