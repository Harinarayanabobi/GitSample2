package genericpackage;

//functional interface generic. so that any data type is accepted

@FunctionalInterface
interface GenericMyInterface<T> {

//abstract method
	T method(T t);
}

public class GenericFunctionalLambda {
	public static void main(String[] args) {

//Step 1: declare a reference to GenericInterface
//Step 2: the GenericInterface operates on String data
//Step 3: assign a lambda expression to it

		GenericMyInterface<String> reverseString = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};

		System.out.println("Lambda reversed = " + reverseString.method("luminar"));

		// Step 1: declare another reference to GenericInterface
		// Step 2: the GenericInterface operates on Integer data
		// Step 3: assign a lambda expression to it

		GenericMyInterface<Integer> factorial = (no) -> {
			int result = 1;
			for (int i = 1; i <= no; i++)
				result = i * result;
			return result;
		};

		System.out.println("Lambda reversed = " + factorial.method(5));
	}
}