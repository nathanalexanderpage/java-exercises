package standalonesNewDefault;

import java.io.*;
import java.util.*;

public class ArrayListFromFile {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("C:\\Users\\Nathan\\Documents\\Nathan\\code\\resources\\txt\\sample.txt"));
		ArrayList<String> allWords = new ArrayList<String>();
		while (scan.hasNext()) {
			allWords.add(scan.next());
		}
		scan.close();
		System.out.println(allWords.size());
		
		System.out.println("forwards");
		for (int i = 0; i < allWords.size() - 1; i++) {
			System.out.print("\"" + allWords.get(i) + "\", ");
		}
		System.out.println(allWords.get(allWords.size() - 1));
		
		System.out.println("backwards");
		for (int i = allWords.size() - 1; i > 0; i--) {
			System.out.print("\"" + allWords.get(i) + "\", ");
		}
		System.out.println(allWords.get(0));
		
		System.out.println("plurals capitalized");
		for (int i = 0; i < allWords.size() - 1; i++) {
			String ith = allWords.get(i);
			char last = ith.charAt(ith.length() - 1);
			if (last == 's') {
				ith = ith.substring(0, 1).toUpperCase() + ith.substring(1);
			}
			System.out.print("\"" + ith + "\", ");
		}
		System.out.println(allWords.get(allWords.size() - 1));
	}
}
