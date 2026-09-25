package iopackage;

import java.io.FileInputStream;
import java.io.IOException;

public class CountFileDetails {

	public static void main(String[] args) {

		int characters = 0;
		int words = 0;
		int lines = 1;

		try {
			FileInputStream fis = new FileInputStream("ipjava.txt");

			int ch;
			boolean isWord = false;

			while ((ch = fis.read()) != -1) {

				characters++;

				// Count lines
				if (ch == '\n') {
					lines++;
				}

				// Count words
				if (Character.isWhitespace((char) ch)) {
					if (isWord) {
						words++;
						isWord = false;
					}
				} else {
					isWord = true;
				}
			}

			// Count the last word
			if (isWord) {
				words++;
			}

			fis.close();

			System.out.println("Number of Characters : " + characters);
			System.out.println("Number of Words      : " + words);
			System.out.println("Number of Lines      : " + lines);

		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}
