package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("C");
		list.add("Core Java");
		list.add("Advanced Java");

		System.out.println("Initial Collection Value : " + list);

		Collections.addAll(list, "Servlet", "JSP");
		System.out.println("After adding elements : " + list);

		String[] strArr = { "C#", ".Net" };
		Collections.addAll(list, strArr);
		System.out.println("After adding array collection value:" + list);
		Collections.sort(list);
		System.out.println("After Sort:" + list);

	}

}
