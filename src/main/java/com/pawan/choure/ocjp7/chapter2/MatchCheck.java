package com.pawan.choure.ocjp7.chapter2;
public class MatchCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strings = { "Severity 1", "severity 2", "severity3",
				"severity five" };
		for (String str : strings) {
			if (!str.matches("^severity[\\s+][1�5]")) {
				System.out.println(str + " does not match");
			}

		}

	}
}
