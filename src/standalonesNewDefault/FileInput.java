package standalonesNewDefault;
import java.io.*;
import java.util.*;

/*
	canRead()
	delete()
	exists()
	getName()
	length()
	renameTo(file)
 */

public class FileInput {
	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "C:\\Users\\Nathan\\Documents\\Nathan\\code\\resources\\txt\\weather.txt";
		Scanner input = new Scanner(new File(filePath));
		double text = input.nextDouble();
		System.out.println(text);
		double prev;
		while (input.hasNextDouble()) {
			prev = text;
			text = input.nextDouble();
			System.out.println("Change = " + (text - prev));
			System.out.println(text);
		}
		input.close();
	}
}
