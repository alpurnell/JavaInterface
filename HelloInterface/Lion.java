
public class Lion implements Animal{
	public Lion() {}

	@Override
	public void makeSound() {
		System.out.println("The Lion goes ROOOOAAAR!");
	}
	
	public void huntForFood(String prey) {
		System.out.println("The lion is hunting for " + prey + ".");
	}
}
