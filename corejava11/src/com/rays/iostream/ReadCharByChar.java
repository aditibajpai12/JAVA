package com.rays.iostream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadCharByChar {
	public static void main(String[] args) throws Exception {
		FileReader in = new FileReader("C:\\Users\\eradi\\OneDrive\\Desktop\\IO Stream\\helloaditi.txt");
		int ch = in.read();
		while (ch != -1) {
			System.out.print((char)ch);
			ch = in.read();
		}

	}
}
