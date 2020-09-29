package com.algo.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConversionMatrix {

	String fileName = "matrixcsv";

	public String[][] readFromFile(String type) throws IOException {
		String[][] matrix = new String[12][12];
		String line = "";
		String splitBy = ",";
		BufferedReader br = null;
		try {

			br = new BufferedReader(new FileReader(fileName + "." + type.toLowerCase()));
			int rowCounter = 0;
			while ((line = br.readLine()) != null) // returns a Boolean value
			{

				String[] columns = line.split(splitBy); // use comma as separator
				int columnCounter = 0;
				for (String column : columns) {
					matrix[rowCounter][columnCounter] = column;
					columnCounter++;
				}
				rowCounter++;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			br.close();
		}
		return matrix;
	}

}
