package standalonesNewDefault;

public class SupOrganism {
	private double size;
	private boolean isAlive;
	private String name;
	
	private static int numOrganisms = 0;
	private static int numOrganismsDead = 0;
	
	public SupOrganism(String nameInput) {
//		static variables
		numOrganisms++;
		
//		object variables
		name = nameInput;
		size = 1; // unit: centimeters
		isAlive = true;
	}
	
//	object mutator methods
	
	public void grow() {
		if (isAlive) {
			size++;
		} else {
			System.out.println("This organism can't grow! It is dead.");
		}
	}
	
	public void grow(double growthFactor) {
		if (isAlive) {
			size += growthFactor;
		} else {
			System.out.println("This organism can't grow! It is dead.");
		}
	}
	
	public void die() {
		if (isAlive) {
			isAlive = false;
			numOrganismsDead++;
		} else {
			System.out.println("This organism is already dead.");
		}
		
	}
	
//	non-mutator, info-returning methods
	
	public static int getTotal() {
		return numOrganisms;
	}
	
	public static int getTotalAlive() {
		return numOrganisms - numOrganismsDead;
	}
	
	public static int getTotalDead() {
		return numOrganismsDead;
	}
	
	public double getSize() {
		return size;
	}
	
	public boolean getIsAlive() {
		return isAlive;
	}
	
	public String getName() {
		return name;
	}
	
	public void printSummary() {
		System.out.println("Organism Summary:\nName - " + name + "\nAlive - " + (isAlive ? "Yes" : "No") + "\nSize - " + size);
	}
}
