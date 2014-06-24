package com.proserus.stocks.bo.symbols;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.commons.lang3.Validate;

import com.proserus.stocks.bo.common.PersistentEnum;
import com.proserus.stocks.bo.utils.LoggerUtils;

public enum SectorEnum implements Comparable<SectorEnum>, PersistentEnum<SectorEnum> {
	UNKNOWN("UNKNOWN", "unknown"), //
	MATERIAL("MATERIAL", "basicMaterials"), //
	CONGLOMERATES("CONGLOMERATES", "conglomerates"), //
	GOODS("GOODS", "consumerGoods"), //
	FINANCE("FINANCE", "finance"), //
	HEALTHCARE("HEALTHCARE", "healthCare"), //
	INDUSTRY("INDUSTRY", "industrials"), //
	SERVICES("SERVICES", "services"), //
	ENERGY("ENERGY", "energy"), //
	TECHNOLOGY("TECHNOLOGY", "technology"), //
	TELECOMMUNICATION("TELECOMMUNICATION", "telecommunication"), //
	UTILITIES("UTILITIES", "utilities"), //
	OTHER("OTHER", "other");//

	private static final ResourceBundle sectors = ResourceBundle.getBundle("sectors");
	private static final List<SectorEnum> sortedSectors;

	static {
		sortedSectors = Arrays.asList(values());
		Collections.sort(sortedSectors, new SectorComparator());
	}

	private String title = null;
	private String id;

	private SectorEnum(String id, String title) {
		this.id = id;
		Validate.notNull(title);
		Validate.notEmpty(title);

		this.title = title;
	}

	public String getId() {
		return id;
	}

	public static List<SectorEnum> retrieveSortedSectors() {
		return sortedSectors;
	}

	public String getTitle() {
		return sectors.getString(title);
	}

	@Override
	public String toString() {
		assert LoggerUtils.validateCalledFromLogger() : LoggerUtils.callerException();
		return "SectorEnum: name=" + name() + ", id=" + id + ", title=" + title;
	}

	public static SectorEnum valueOfById(String id) {
		for (SectorEnum sector : values()) {
			if (sector.getId().equals(id)) {
				return sector;
			}
		}
		return null;
	}
}

class SectorComparator implements Comparator<SectorEnum> {
	@Override
	public int compare(SectorEnum o1, SectorEnum o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
}
