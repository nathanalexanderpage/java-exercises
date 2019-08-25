package standalonesNewDefault;
import java.util.*;

public class LottoTix {
	public static void main(String[] args) {
		Random rand = new Random();
		boolean returnVal = seven(rand);
		System.out.println(returnVal);
	}
	
	public static boolean seven(Random rand) {
		for(int i = 0; i < 10; i++) {
			int drawnNum = (int) rand.nextInt(30) + 1;
			System.out.println(drawnNum);
			if(drawnNum == 7) {
				return true;
			}
		}
		return false;
	}
}
