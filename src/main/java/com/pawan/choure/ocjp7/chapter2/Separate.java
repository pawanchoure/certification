package com.pawan.choure.ocjp7.chapter2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Separate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String text = "<head>first program </head> <body>hello world</body>";
		Set<String> words = new TreeSet<>();
		try (Scanner tokenizingScanner = new Scanner(text)) {
			tokenizingScanner.useDelimiter("\\W");
			while (tokenizingScanner.hasNext()) {
				String word = tokenizingScanner.next();
				if (!word.trim().equals("")) {
					words.add(word);
				}
			}
		}
		for (String word : words) {
			System.out.print(word + " ");
		}

	}

}
