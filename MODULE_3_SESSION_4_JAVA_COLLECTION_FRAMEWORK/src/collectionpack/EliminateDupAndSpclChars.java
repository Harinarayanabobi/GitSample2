package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class EliminateDupAndSpclChars {

	public static void main(String[] args) {

		String str = "Hai hello Hai, My name and my friends name, is same;.";

		StringTokenizer st = new StringTokenizer(str, " ,.;:");
		
		ArrayList<String> list = new ArrayList<String>();
		
		while(st.hasMoreTokens()) {
			String word = st.nextToken();
			
			if(!list.contains(word)) {
				list.add(word);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list);
		
		for(String s : list) {
			System.out.println(s);
		}

	}

}
