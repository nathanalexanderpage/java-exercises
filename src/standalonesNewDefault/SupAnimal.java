package standalonesNewDefault;

public class SupAnimal extends SupOrganism {
	private static int numAnimals = 0;
	
	public SupAnimal(String nameInput) {
		super(nameInput);
		
//		static variables
		numAnimals++;
	}
	
//	public double getSize() {
//		return super.getSize();
//	}
	
	
}
