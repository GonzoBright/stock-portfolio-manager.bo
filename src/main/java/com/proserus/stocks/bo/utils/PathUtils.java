package com.proserus.stocks.bo.utils;

import java.io.File;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;

public class PathUtils {
	private static Logger log = Logger.getLogger(PathUtils.class.getName());

	public static String getInstallationFolder(){
		String folder = PathUtils.class.getClassLoader().getResource(".").getPath();
		folder = StringUtils.removeEnd(folder, "/");
		folder = StringUtils.removeEnd(folder, "\\");
		folder = StringUtils.removeEnd(folder,
				"target/classes");
		folder = StringUtils.removeEnd(folder, "/");
		folder = StringUtils.removeEnd(folder, "\\");
		
		return folder;
	}
	
	public static String getCurrentFolder(){
		String folder = new File("./").getAbsolutePath();
		folder = StringUtils.removeEnd(folder, ".");
		folder = StringUtils.removeEnd(folder, "/");
		folder = StringUtils.removeEnd(folder, "\\");
		
		return folder;
	}
}
