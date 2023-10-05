package Task2;

public class Demomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount BaAccount = new SavingsAccount(2345, "Santhosh", 444, 2.5);
		SavingsAccount savAccount =new SavingsAccount(5543, "subash", 245, 4.8);
		savAccount.addInterest();
		savAccount.deposit(100);
		savAccount.displayAccountInfo();
		
		BaAccount.displayAccountInfo();
		BaAccount.getBalance();
		
	}

}
