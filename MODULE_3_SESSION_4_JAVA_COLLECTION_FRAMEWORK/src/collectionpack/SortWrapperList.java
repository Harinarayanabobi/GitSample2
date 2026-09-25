package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWrapperList {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(23);
        numbers.add(9);

        System.out.println("Before Sorting: " + numbers);

        Collections.sort(numbers);

        System.out.println("After Sorting (Ascending): " + numbers);
        
        Collections.sort(numbers, Collections.reverseOrder());
        
        System.out.println("After Sorting (Decending): " + numbers);

    }
}