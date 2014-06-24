package com.proserus.stocks.bo.common;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.proserus.stocks.bo.utils.LoggerUtils;

public class DatabasePaths {
	private Set<Database> databases = new HashSet<Database>();
	private Map<Database, File> databaseParentFolder = new HashMap<Database, File>();
	private String binaryCurrentFolder;
	private String osCurrentFolder;
	private Database selectedDatabase;

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

	public Database getSelectedDatabase() {
		return selectedDatabase;
	}

	public void setSelectedDatabase(Database selectedDatabase) {
		this.selectedDatabase = selectedDatabase;
	}

	public void addDb(Database db) {
		databases.add(db);
		databaseParentFolder.put(db, new File(db.getPath()).getParentFile());
	}

	public Set<Database> getDatabases() {
		return databases;
	}

	public Map<Database, File> getDatabaseParentFolder() {
		return databaseParentFolder;
	}

	@Override
	public String toString() {
		assert LoggerUtils.validateCalledFromLogger() : LoggerUtils.callerException();
		return "DatabasePaths [databases=" + databases + ", databaseParentFolder=" + databaseParentFolder + ", binaryCurrentFolder="
				+ binaryCurrentFolder + ", osCurrentFolder=" + osCurrentFolder + ", selectedDatabase=" + selectedDatabase + "]";
	}

}
