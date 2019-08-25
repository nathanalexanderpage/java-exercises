package standalonesNewDefault;
//import java.util.*;

public class DigitSum {
	public static void main(String[] args) {
		int grandSum = digitSum(29107);
		System.out.println(grandSum);
	}
	
	public static int digitSum(int inputNum) {
		inputNum = Math.abs(inputNum);
		int sum = 0;
		while(inputNum > 0) {
			sum += (inputNum % 10);
			inputNum /= 10;
		}
		return sum;
	}
}
