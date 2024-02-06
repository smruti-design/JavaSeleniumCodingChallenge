package com.sdw.utils;

import java.io.FileInputStream;
import java.util.Objects;
import java.util.Properties;

import com.sdw.constants.FrameworkConstants;

public final class ReadPropertyFiles {
	
	private ReadPropertyFiles() {

	}
	
	private static Properties prop = new Properties();
	
	static {
		FileInputStream fis;
		try {
			fis = new FileInputStream(FrameworkConstants.getConfigfilepath());
			
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) throws Exception {
		String value = "";
		value = prop.getProperty(key);
		if (Objects.isNull(value) || Objects.isNull(key) ) {
			throw new Exception("Property name : " + key + " is not found. Please check the config file again.");
		}
		return value;		
	}
	
}
