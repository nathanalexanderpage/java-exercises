package standalonesNewDefault;

import java.util.*;
import java.io.*;

public class ArrayListNums {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Double> nums = new ArrayList<Double>();
		Scanner file = new Scanner(new File("C:\\Users\\Nathan\\Documents\\Nathan\\code\\resources\\txt\\numbers.txt"));
		while (file.hasNextDouble()) {
			nums.add(file.nextDouble());
		}
		file.close();
		System.out.println(nums);
		if (nums.size() > 0) {
			double low = nums.get(0);
			double high = nums.get(0);
			double sum = 0;
			for (int i = 0; i < nums.size(); i++) {
				if (nums.get(i) < low) {
					low = nums.get(i);
				}
				if (nums.get(i) > high) {
					high = nums.get(i);
				}
				sum += nums.get(i);
			}
			double avg = sum / nums.size();
			System.out.println("Low: " + low);
			System.out.println("High: " + high);
			System.out.println("Avg: " + avg);
			int p = 0;
			while (p < nums.size()) {
				if (nums.get(p) % 2 == 0) {
					nums.remove(p);
				} else {
					p++;
				}
			}
			System.out.println(nums);
		}
	}
	
}
