package standalonesNewDefault;

public class BankAccountObj {
	private String accountNumberFull;
	private int accountNumber;
	private static char[] templateAccountPrefix = {'A', 'A', 'A', 'A'};
	private static int templateAccountNumber = 0;
	
	public BankAccountObj() {
		advanceAccountNumber();
		accountNumber = templateAccountNumber;
		accountNumberFull = getAccountPrefix() + accountNumber;
	}
	
	private static void advanceAccountNumber() {
		templateAccountNumber++;
		if (templateAccountNumber > 9) {
			templateAccountNumber = 0;
		}
	}
	
//	Start of non-constructor-related methods
	
	public String getAccountNumber() {
		return accountNumberFull;
	}
	
	public String getAccountPrefix() {
		String fullPrefix = "";
		for (int i = 0; i < templateAccountPrefix.length; i++) {
			fullPrefix += templateAccountPrefix[i];
		}
		return fullPrefix;
	}
}
