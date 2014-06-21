package com.proserus.stocks.bo.symbols;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Currency;
import java.util.Locale;
import java.util.Properties;

import com.proserus.stocks.bo.utils.PathUtils;

public class DefaultCurrency {
	private static final String EMPTY_STR = "";
	private static final String CONFIG_PROPERTIES = PathUtils.getInstallationFolder()+"./config.properties";
	private static final String DEFAULT = "Default";
	private Properties ptrans = new Properties();

	public static CurrencyEnum DEFAULT_CURRENCY;

	static {
		try {
			DEFAULT_CURRENCY = CurrencyEnum.valueOf(Currency.getInstance(Locale.getDefault()).getCurrencyCode());
		} catch (IllegalArgumentException e) {
			DEFAULT_CURRENCY = CurrencyEnum.USD;
		}
	}

	public DefaultCurrency() {
		init();
	}

	void init() {
		try {
			ptrans.load(new FileInputStream(CONFIG_PROPERTIES));
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		String cur = ptrans.getProperty(DEFAULT);
		if (cur != null) {
			setDefault(CurrencyEnum.valueOf(cur));
		} else {
			setDefault(DEFAULT_CURRENCY);
		}
	}

	public void setDefault(CurrencyEnum cur) {
		ptrans.setProperty(DEFAULT, cur.name());
		DEFAULT_CURRENCY = cur;
	}

	public CurrencyEnum getDefault() {
		return DEFAULT_CURRENCY;
	}

	public void save() {
		try {
			ptrans.store(new FileOutputStream(CONFIG_PROPERTIES), EMPTY_STR);
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
}
