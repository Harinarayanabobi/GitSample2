package regexpack;

import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("^[6-9]\\d{9}$", "5075988204"));

	}

}
