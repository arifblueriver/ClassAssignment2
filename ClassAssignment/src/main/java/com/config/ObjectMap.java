package com.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ObjectMap {
	
	public String getconfig(String object) throws IOException {
	
	String file ="./Config.properties";
	FileInputStream fis = new FileInputStream(file);
	Properties properties = new Properties();
	properties.getProperty("Name");
	properties.load(fis);

	System.out.println(properties.getProperty(object));
	
	return properties.getProperty(object);
	}
 

}
