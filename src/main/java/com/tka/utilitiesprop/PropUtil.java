package com.tka.utilitiesprop;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropUtil {
	public static String valueOfAnyKey(String anyKey)  {
	
		FileInputStream file = null;
		try {
			file = new FileInputStream("file.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties pro=new Properties();
		try {
			pro.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pro.getProperty(anyKey);
	}

	}


