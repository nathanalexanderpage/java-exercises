package standalonesNewDefault;

import java.util.*;
import java.io.*;

public class ArrayListWordDisp {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("C:\\Users\\Nathan\\Documents\\Nathan\\code\\resources\\txt\\words.txt"));
		
		ArrayList<String> list = new ArrayList<String>();

		while(file.hasNext()) {
			String word = file.next();
			list.add(word);
		}
		file.close();
		System.out.println(list);
	}
}
