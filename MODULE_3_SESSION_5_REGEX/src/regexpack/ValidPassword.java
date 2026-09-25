package regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {

	public static void main(String[] args) {
		
		String password = "Hari@1234";
		
		boolean upper = Pattern.compile("[A-Z]").matcher(password).find();
		boolean lower = Pattern.compile("[a-z]").matcher(password).find();
		boolean digit = Pattern.compile("[0-9]").matcher(password).find();
		boolean special = Pattern.compile("[@#$%&]").matcher(password).find();
		
		if(upper && lower && digit && special && password.length()>=8) {
			System.out.println("STRONG PASSWORD!");
		}
		else {
			System.out.println("WEAK PASSWORD!");
		}
	}

}
