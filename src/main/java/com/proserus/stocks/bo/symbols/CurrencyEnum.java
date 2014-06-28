package com.proserus.stocks.bo.symbols;

import javax.swing.ImageIcon;

import org.apache.commons.lang3.Validate;

import com.proserus.stocks.bo.common.PersistentEnum;
import com.proserus.stocks.bo.common.Usage;
import com.proserus.stocks.bo.utils.LoggerUtils;

public enum CurrencyEnum implements PersistentEnum<CurrencyEnum> {
	AUSTRALIA("AUD", "AUD", "images/au.png"), //
	BRAZIL("BRL", "BRL", "images/bz.png"), //
	CANADIAN("CAD", "CAD", "images/ca.png"), //
	SWISS("CHF", "CHF", "images/ch.png"), //
	CHINA("CNY", "CNY", "images/cn.png"), //
	CZECH_REPUBLIC("CZK", "CZK", "images/cz.png"), //
	EUROPE("EUR", "EUR", "images/eu.png"), //
	GREAT_BRITAIN("GBP", "GBP", "images/gb.png"), //
	HONG_KONG("HKD", "HKD", "images/hk.png"), //
	ISRAEL("ILS", "ILS", "images/il.png"), //
	INDIA("INR", "INR", "images/in.png"), //
	JAPAN("JPY", "JPY", "images/jp.png"), //
	NEW_ZEALAND("NZD", "NZD", "images/nz.png"), //
	RUSSIA("RUB", "RUB", "images/ru.png"), //
	SWEDEN("SEK", "SEK", "images/se.png"), //
	SAUDI_ARABIA("SAR", "SAR", "images/za.png"), //
	UNITED_STATES("USD", "USD", "images/us.png"), //
	KOREA("WON", "WON", "images/kr.png"), //
	ERROR("ERR", "Error", "Error", Usage.INTERNAL);// s

	private ImageIcon icon = null;
	private Usage usage;
	private String imageName;
	private String id;
	private String title;

	private CurrencyEnum(String id, String title, String image) {
		this(id, title, image, Usage.VISIBLE);
	}

	@Override
	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	private CurrencyEnum(String id, String title, String imageName, Usage usage) {
		this.id = id;
		this.title = title;
		this.imageName = imageName;
		Validate.notNull(usage);
		Validate.notNull(imageName);
		this.usage = usage;
		try {
			icon = new ImageIcon(getClass().getClassLoader().getResource(imageName));
		} catch (RuntimeException e) {

		}
	}

	public boolean isVisible() {
		return Usage.VISIBLE.equals(usage);
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public static CurrencyEnum valueOfById(String id) {
		for (CurrencyEnum enu : values()) {
			if (enu.getId().equals(id)) {
				return enu;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		assert LoggerUtils.validateCalledFromLogger() : LoggerUtils.callerException();
		return "CurrencyEnum: name=" + name() + ", id=" + id + ", imageName=" + imageName + ", usage=" + usage;
	}
}
