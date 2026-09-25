package functionalinterfacelambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaStream {

	// method for preparing our data
	List<String> getPlaces() {
		// create an object of list using ArrayList
		List<String> places = new ArrayList<>();

		// add places and country to the list
		places.add("Australia, Melbourne");
		places.add("Australia, Sydney");
		places.add("India, Kerala");
		places.add("India, Tamil Nadu");
		places.add("India, Delhi");
		places.add("USA, New York");

		return places;
	}

	public static void main(String[] args) {
		LambdaStream ls = new LambdaStream();
		List<String> myPlaces = ls.getPlaces();
		System.out.println("Places from India:\n==========================");
		// Filter places from India
		myPlaces.stream().filter((p) -> p.startsWith("India")).map((p) -> p.toLowerCase()).sorted()
				.forEach((p) -> System.out.println(p));
	}
}
