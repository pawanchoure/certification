package com.pawan.choure.ocjp7.chapter2;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

public class CreateFilesInFolder {

	/**
	 * @param args
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws URISyntaxException {
		String[] fileList = { "/file1.txt", "/subdir/file2.txt", "/file3.txt" };
		File f = new File("c:/text.txt");
		for (String file : fileList) {
			try {
				new File(file).mkdirs();
			} catch (Exception e) {
				System.out.println("file creation failed");
				System.exit(1);
			}
		}
		File file = new File("C:\\Directory1");
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
		}

	}
}
