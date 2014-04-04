package com.proserus.stocks.bo.common;

public interface DBVersion {
	public Integer getDatabaseVersion();
	public void setDatabaseVersion(Integer databaseVersion);
	public void incrementVersion();
}

