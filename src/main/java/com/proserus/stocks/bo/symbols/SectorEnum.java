package com.proserus.stocks.bo.symbols;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.commons.lang3.Validate;

import com.proserus.stocks.bo.utils.PathUtils;

public enum SectorEnum implements Comparable<SectorEnum>{
	UNKNOWN ("unknown"),
	MATERIAL ("basicMaterials"),
	CONGLOMERATES ("conglomerates"),
	GOODS ("consumerGoods"),
	FINANCE ("finance"),
	HEALTHCARE ("healthCare"),
	INDUSTRY ("industrials"),
	SERVICES ("services"),
	ENERGY ("energy"),
	TECHNOLOGY("technology"),
	TELECOMMUNICATION("telecommunication"),
	UTILITIES("utilities"),
	OTHER("other");
	
	private static final ResourceBundle sectors = ResourceBundle.getBundle("sectors", Locale.getDefault());
	private static final List<SectorEnum> sortedSectors; 
	
	static{
		sortedSectors = Arrays.asList(values());
		Collections.sort(sortedSectors, new SectorComparator());
	}
	
	
	
	private String title = null;

	private SectorEnum(String title){
		Validate.notNull(title);
		Validate.notEmpty(title);
		
		this.title = title;
	}
	
	public static List<SectorEnum> retrieveSortedSectors(){
		return sortedSectors;
	}
	
	public String getTitle() {
		return sectors.getString(title);
    }
	
	@Override
	public String toString() {
	    return getTitle();
	}
}

class SectorComparator implements Comparator<SectorEnum>{
	@Override
	public int compare(SectorEnum o1, SectorEnum o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
}
