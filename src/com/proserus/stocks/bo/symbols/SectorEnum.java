package com.proserus.stocks.bo.symbols;

import org.apache.commons.lang3.Validate;

public enum SectorEnum {
	UNKNOWN ("Unknown"),
	MATERIAL ("Basic Materials"),
	CONGLOMERATES ("Conglomerates"),
	GOODS ("Consumer Goods"),
	FINANCE ("Finance"),
	HEALTHCARE ("Healthcare"),
	INDUSTRY ("Industrial Goods"),
	SERVICES ("Services"),
	TECHNOLOGY("Technology"),
	UTILITIES("Utilities"),
	OTHER("Other");
	
	private String title = null;

	private SectorEnum(String title){
		Validate.notNull(title);
		Validate.notEmpty(title);
		
		this.title = title;
	}
	
	public String getTitle() {
    	return title;
    }
	
	@Override
	public String toString() {
	    return title;
	}
}
