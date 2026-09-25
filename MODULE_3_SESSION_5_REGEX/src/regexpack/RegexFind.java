package regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFind {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("Luminar", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Visit Luminar");
		boolean isFound = matcher.find();

		if(isFound) {
			System.out.println("MATCH FOUND!");
		}
		else {
			System.out.println("MATCH NOT FOUND!");
		}
	}

}
