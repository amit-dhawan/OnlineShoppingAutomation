package com.qurateassignment.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Utilities {

	public static String getProperty(String key) {

		Properties prop = new Properties();
		String filePath = System.getProperty("user.dir").concat(File.separator).concat("resources")
				.concat(File.separator).concat("config").concat(File.separator).concat("config.properties");
		FileReader reader = null;
		try {
			reader = new FileReader(filePath);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String value = "";

		try {
			prop.load(reader);
			value = prop.getProperty(key);
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		return value;

	}

}
