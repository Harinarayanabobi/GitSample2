package streampack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSimplePack {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("BiniBindu", "Rukku", "Nitya", "Ani");

		// Creating the stream of all names
		Stream<String> allNames = names.stream();

		// Creating another stream by filtering length above 6 using filter()
		Stream<String> longNames = allNames.filter(str -> str.length() > 6);

		// displaying the long names using forEach
		longNames.forEach(str -> System.out.print(str + " "));

		// method chaining

		List<String> filteredList = names.stream() // converting the list to stream
				.filter(s -> s.length() == 5) // filter the stream to create a new stream
				.filter(s -> !s.startsWith("d")).filter(s -> s.contains("R")).collect(Collectors.toList()); 

		System.out.println("\n" + filteredList);
		// or

		filteredList.forEach(System.out::println);
	}
}