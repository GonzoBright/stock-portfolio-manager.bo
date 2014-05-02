package com.proserus.stocks.bo.common;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DatabasePaths {
	private Set<String> databases = new HashSet<String>();
	private Map<String, File> databaseParentFolder = new HashMap<String, File>();
	private String binaryCurrentFolder;
	private String osCurrentFolder;
	private String selectedDatabase;

	public String getBinaryCurrentFolder() {
		return binaryCurrentFolder;
	}

	public void setBinaryCurrentFolder(String binaryCurrentFolder) {
		this.binaryCurrentFolder = binaryCurrentFolder;
	}

	public String getOsCurrentFolder() {
		return osCurrentFolder;
	}

	public void setOsCurrentFolder(String osCurrentFolder) {
		this.osCurrentFolder = osCurrentFolder;
	}

	public String getSelectedDatabase() {
		return selectedDatabase;
	}

	public void setSelectedDatabase(String selectedDatabase) {
		this.selectedDatabase = selectedDatabase;
	}

	public void addDb(String db) {
		databases.add(db);
		databaseParentFolder.put(db, new File(db).getParentFile());
	}

	public Set<String> getDatabases() {
		return databases;
	}

	public Map<String, File> getDatabaseParentFolder() {
		return databaseParentFolder;
	}

}
