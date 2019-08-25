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

public class FileReadVoteCount {
	public static void main(String[] args) throws FileNotFoundException {
		PrintStream toConsole = System.out;
		PrintStream fileOutput = new PrintStream(new File("C:\\Users\\Nathan\\Documents\\Nathan\\code\\resources\\txt_output\\employee_hours_summary.txt"));
		String filePath = "C:\\Users\\Nathan\\Documents\\Nathan\\code\\resources\\txt\\employee_hours_log.txt";
		Scanner input = new Scanner(new File(filePath));
		while (input.hasNextLine()) {
			String line = input.nextLine();
			Scanner lineScan = new Scanner(line);
			while (lineScan.hasNext()) {
				int employeeId = lineScan.nextInt();
				String employeeName = lineScan.next();
				double totalHours = 0;
				int daysCount = 0;
				while (lineScan.hasNextDouble()) {
					totalHours += lineScan.nextDouble();
					daysCount++;
				}
				toConsole.printf("%s (ID#%d) worked %.2f hours (%.2f hours/day)", employeeName, employeeId, totalHours, (totalHours / daysCount));
				toConsole.println();
				fileOutput.printf("%s (ID#%d) worked %.2f hours (%.2f hours/day)", employeeName, employeeId, totalHours, (totalHours / daysCount));
				fileOutput.println();
			}
			lineScan.close();
		}
		input.close();
	}
}
