package enumpackage;

import java.util.Scanner;

enum Account {
	SAVINGS, CURRENT, CREDIT;
}

class AccountType {
	Account type;

	public AccountType(Account type) {
		this.type = type;
	}

	public void accountCoverage() {
		switch (type) {
		case SAVINGS:
			System.out.println("Maintain Rs.10000/- in account...");
			break;
		case CURRENT:
			System.out.println("Maintain Rs.15000/- in account...");
			break;
		case CREDIT:
			System.out.println("MIN BALANCE NOT APPLICABLE...");
			break;
		default:
			System.out.println("IDK.........");
			break;
		}
	}

}

public class EnumBanking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AccountType aType;
		char choice;
		
		do {
			System.out.println("ACCOUNT TYPE:");
			System.out.println("1.) SAVINGS.");
			System.out.println("2.) CURRENT.");
			System.out.println("3.) CREDIT.");
			System.out.println("4.) EXIT.");
			
			int ac = sc.nextInt();
			
			switch(ac) {
			case 1:
				aType = new AccountType(Account.SAVINGS);
				aType.accountCoverage();
				break;
			case 2:
				aType = new AccountType(Account.CURRENT);
				aType.accountCoverage();
				break;
			case 3:
				aType = new AccountType(Account.CREDIT);
				aType.accountCoverage();
				break;
			case 4:
				System.out.println("THANK YOU...");
				System.exit(0);
			default:
				System.out.println("INVALID....");
				break;
			}
			
			
		}while(true);

	}

}
