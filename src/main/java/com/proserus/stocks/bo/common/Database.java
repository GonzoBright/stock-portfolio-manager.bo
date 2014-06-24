package com.proserus.stocks.bo.common;

import java.io.File;

import com.proserus.stocks.bo.utils.LoggerUtils;

public class Database implements Comparable<Database> {

	private String path;
	private File parentFolder;

	public Database(String path) {
		this.path = path;
		parentFolder = new File(path).getParentFile();
	}

	public String getPath() {
		return path;
	}

	public File getParentFolder() {
		return parentFolder;
	}

	@Override
	public String toString() {
		assert LoggerUtils.validateCalledFromLogger() : LoggerUtils.callerException();
		return "Database [path=" + path + ", parentFolder=" + parentFolder + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Database other = (Database) obj;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		return true;
	}

	@Override
	public int compareTo(Database db2) {
		return this.getPath().compareTo(db2.getPath());
	}

}
