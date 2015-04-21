

public class Zoo {

	public static void main(String[] args) {
		Lion myLion = new Lion();	//Lions are scary
		Frog myFrog = new Frog();	//Frogs are fun
		Bird myBird = new Bird();	//Birds like to fly
		
		myFrog.makeSound();
		myFrog.hop(3);
		System.out.println();
		
		myBird.makeSound();
		myBird.buildNest("tree");
		System.out.println();
		
		myLion.makeSound();
		myLion.huntForFood("antelope");
		System.out.println();
	}

}
