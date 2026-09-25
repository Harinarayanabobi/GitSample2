package collectionpack;

import java.util.ArrayList;
import java.util.List;

public class ForEachImmutable {

	public static void main(String[] args) {
		
		List<String> lst = new ArrayList<String>();
		lst.add("Java");
		lst.add("LUMINAR");
		lst.add("TECHNOLAB");
		
		System.out.println(lst);
		
		for(String str : lst ) {
			str += "kochi";
		}
		
		System.out.println(lst);

	}

}
