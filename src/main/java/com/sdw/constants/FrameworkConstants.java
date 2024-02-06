package com.sdw.constants;

public final class FrameworkConstants {

	private FrameworkConstants() {
		
	}

	private static final String RESOURCEPATH = System.getProperty("user.dir") + "/src/test/resources";

	private static final String CONFIGFILEPATH = RESOURCEPATH + "/config/config.properties";
	
	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}


}
