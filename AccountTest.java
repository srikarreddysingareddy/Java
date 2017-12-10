import java.util.Scanner;
public class AccountTest{
	public static void main(String [] args){
		Account account1 = new Account("Srikar",500.00);
		Account account2 = new Account("Sam",-7.00);
		//initial balance
		System.out.printf(" %s initial balnce : $%.2f%n",account1.getName(),account1.getBalance());
		System.out.printf(" %s initial balnce : $%.2f%n",account2.getName(),account2.getBalance());
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter Deposit Amount for Account1:");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding $%.2f to account1 balance%n",depositAmount);
		account1.deposit(depositAmount);
		//updated balance
		System.out.printf(" %s balnce : $%.2f%n",account1.getName(),account1.getBalance());
		System.out.printf(" %s balnce : $%.2f%n",account2.getName(),account2.getBalance());

		System.out.println(" Enter Deposit Amount for Account2:");
		 depositAmount = input.nextDouble();
		 System.out.printf("%nadding $%.2f to account2 balance%n",depositAmount);
			account2.deposit(depositAmount);
		 System.out.println(" Enter Withdrawl Amount for Account2:");
		 double withdrawlAmount = input.nextDouble();
		 account2.withdrawl(withdrawlAmount);
		 System.out.printf("%ndeducting  $%.2f from account2 balance%n",withdrawlAmount);
		
		System.out.printf(" %s balnce : $%.2f%n",account1.getName(),account1.getBalance());
		System.out.printf(" %s balnce : $%.2f%n",account2.getName(),account2.getBalance());




	}
}
