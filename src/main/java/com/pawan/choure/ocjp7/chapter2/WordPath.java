package com.pawan.choure.ocjp7.chapter2;

import java.nio.file.Path;
import java.nio.file.Paths;

@SuppressWarnings("ALL")
public class WordPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Path wordpadPath = Paths.get("C:\\Program Files\\Windows NT\\Accessories\\wordpad.exe");
		System.out.println(wordpadPath.subpath(0, 1));

	}

}
