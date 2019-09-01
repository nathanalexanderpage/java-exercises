package standalonesNewDefault;

public class SupAnimal extends SupOrganism {
	private static int numAnimals = 0;
	private static int numAnimalsDead = 0;
	
	public SupAnimal(String nameInput) {
		super(nameInput);
		
//		static variables
		numAnimals++;
	}
	
//	status printing methods
	public void printSummary() {
		System.out.println("Animal Summary:\nName - " + super.getName() + "\nAlive - " + (super.getIsAlive() ? "Yes" : "No") + "\nSize - " + super.getSize());
	}
	
//	mutator methods
	public void die() {
		super.die();
		numAnimalsDead++;
	}
	
//	non-mutator, info-returning methods
	public static int getTotal() {
		return numAnimals;
	}
	
	public static int getTotalAlive() {
		return numAnimals - numAnimalsDead;
	}
	
	public static int getTotalDead() {
		return numAnimalsDead;
	}
}
