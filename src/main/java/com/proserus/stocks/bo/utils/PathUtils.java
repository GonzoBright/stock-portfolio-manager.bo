package com.proserus.stocks.bo.utils;

import java.io.File;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class PathUtils {
	private static Logger LOGGER = Logger
			.getLogger(PathUtils.class.getName());

	public static String getInstallationFolder(){
		String folder = PathUtils.class.getClassLoader().getResource(".").getPath();
		folder = StringUtils.removeEnd(folder, "/");
		folder = StringUtils.removeEnd(folder, "\\");
		folder = StringUtils.removeEnd(folder,
				"target/classes");
		folder = StringUtils.removeEnd(folder, "/");
		folder = StringUtils.removeEnd(folder, "\\");
		
		LOGGER.log(Level.INFO, "Installation folder: " + folder);
		return folder;
	}
	
	public static String getCurrentFolder(){
		String folder = new File("./").getAbsolutePath();
		folder = StringUtils.removeEnd(folder, ".");
		folder = StringUtils.removeEnd(folder, "/");
		folder = StringUtils.removeEnd(folder, "\\");
		
		LOGGER.log(Level.INFO, "Current folder: " + folder);
		
		return folder;
	}
}
