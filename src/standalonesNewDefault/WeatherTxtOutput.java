package standalonesNewDefault;
import java.io.*;
import java.util.*;

public class WeatherTxtOutput {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		PrintStream weatherOutput = new PrintStream(new File("C:\\\\Users\\\\Nathan\\\\Documents\\\\Nathan\\\\code\\\\resources\\\\txt_output\\\\weather_report.txt"));
		weatherOutput.print("How many days\' temperatures? ");
		System.out.print("How many days\' temperatures? ");
		int days = console.nextInt();
		int[] temps = new int[days];
		int sum = 0;
		for (int i = 0; i < days; i++) {
			weatherOutput.printf("Day %d\'s high temp: ", i + 1);
			System.out.printf("Day %d\'s high temp: ", i + 1);
			temps[i] = console.nextInt();
			sum += temps[i];
		}
		console.close();
		double avg = sum / days;
		weatherOutput.printf("Average temp = %.1f", avg);
		weatherOutput.println();
		System.out.printf("Average temp = %.1f", avg);
		System.out.println();
		int daysOverAvgSum = 0;
		for (int i = 0; i < days; i++) {
			if (temps[i] > avg) {
				daysOverAvgSum++;
			}
		}
		weatherOutput.print("Days over average: ");
		weatherOutput.println(daysOverAvgSum);
		System.out.print("Days over average: ");
		System.out.println(daysOverAvgSum);
	}
}
