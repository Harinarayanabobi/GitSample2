package iopackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.TreeSet;

public class FileWordSort {

	public static void main(String[] args) {

		try {
			// Open the file
			FileInputStream fis = new FileInputStream("input.txt");

			StringBuilder content = new StringBuilder();
			int ch;

			// Read the file character by character
			while ((ch = fis.read()) != -1) {
				content.append((char) ch);
			}

			fis.close();

			// Convert to String
			String text = content.toString();

			// Remove special characters
			text = text.replaceAll("[.,;:\"']", "");

			// Ignore case
			text = text.toLowerCase();

			// Split into words
			String[] words = text.split("\\s+");

			
			TreeSet<String> set = new TreeSet<>();

			int totalWords = 0;

			for (String word : words) {
				if (!word.isEmpty()) {
					totalWords++;
					set.add(word);
				}
			}

			// Print sorted words
			System.out.println("Words in Sorted Order Without Duplicates:");
			for (String word : set) {
				System.out.println(word);
			}

			System.out.println("Total Number of Words : " + totalWords);

		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}
